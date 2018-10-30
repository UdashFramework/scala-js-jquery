name := "jquery-demo"

inThisBuild(Seq(
  version := "3.0.0",
  organization := "io.udash",
  scalaVersion := "2.12.7",
  crossScalaVersions := Seq("2.11.12", "2.12.7"),
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-language:implicitConversions",
    "-language:existentials",
    "-language:dynamics",
    "-language:postfixOps",
    "-Xfuture",
    "-Xfatal-warnings",
    "-Xlint:_",
  ),
  scalacOptions ++= {
    if (scalaBinaryVersion.value == "2.12") Seq(
      "-Ywarn-unused:_,-explicits,-implicits",
      "-Ybackend-parallelism", "4",
      "-Ycache-plugin-class-loader:last-modified",
      "-Ycache-macro-class-loader:last-modified"
    ) else Seq.empty
  },
))

val generatedDir = file("generated")
val compileStatics = taskKey[Unit]("Compiles all static files.")
val copyAssets = taskKey[Unit]("Copies all assets to the target directory.")
val `jquery-demo` = project.in(file(".")).enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= Dependencies.deps.value,
    jsDependencies ++= Dependencies.jsDeps.value,

    /* move these files out of target/. */
    Compile / fullOptJS / crossTarget := generatedDir,
    Compile / fastOptJS / crossTarget := generatedDir,
    Compile / packageJSDependencies / crossTarget := generatedDir,
    Compile / packageMinifiedJSDependencies / crossTarget := generatedDir,

    Compile / fastOptJS := (Compile / fastOptJS).dependsOn(copyAssets).value,
    Compile / fullOptJS := (Compile / fullOptJS).dependsOn(copyAssets).value,

    scalaJSUseMainModuleInitializer := true,

    copyAssets := {
      IO.copyFile(
        sourceDirectory.value / "main/assets/index-global.html",
        generatedDir / "index.html"
      )
    },

    Compile / fastOptJS / artifactPath :=
      (Compile / fastOptJS / crossTarget).value / "scripts" / "frontend-impl.js",
    Compile / fullOptJS / artifactPath :=
      (Compile / fullOptJS / crossTarget).value / "scripts" / "frontend-impl.js",
    Compile / packageJSDependencies / artifactPath :=
      (Compile / packageJSDependencies / crossTarget).value / "scripts" / "frontend-deps.js",
    Compile / packageMinifiedJSDependencies / artifactPath :=
      (Compile / packageMinifiedJSDependencies / crossTarget).value / "scripts" / "frontend-deps.js"
  )

val `jquery-bundler-demo` = project.in(file("."))
  .enablePlugins(ScalaJSBundlerPlugin)
  .settings(
    libraryDependencies ++= Dependencies.deps.value,

    Compile / scalaJSUseMainModuleInitializer := true,

    copyAssets := {
      IO.copyFile(
        sourceDirectory.value / "main/assets/index-bundler.html",
        generatedDir / "index.html"
      )
    },

    compileStatics := {
      val sjsFileName = (Compile / fastOptJS).value.data.name.stripSuffix(".js")
      IO.copyFile(
        (Compile / npmUpdate / crossTarget).value / s"$sjsFileName-bundle.js",
        generatedDir / "scripts/frontend.js"
      )
      IO.copyFile(
        (Compile / npmUpdate / crossTarget).value / s"$sjsFileName-bundle.js.map",
        generatedDir / "scripts/frontend.js.map"
      )
    },
    compileStatics := compileStatics.dependsOn(Compile / fastOptJS / webpack, copyAssets).value,
  )
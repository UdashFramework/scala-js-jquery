name := "jquery-demo"

inThisBuild(Seq(
  version := "2.0.0",
  organization := "io.udash",
  scalaVersion := "2.12.6",
  crossScalaVersions := Seq("2.11.12", "2.12.6"),
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
    if (CrossVersion.partialVersion((`jquery-demo` / scalaVersion).value).contains((2, 12))) Seq(
      "-Ywarn-unused:_,-explicits,-implicits",
      "-Ybackend-parallelism", "4",
      "-Ycache-plugin-class-loader:last-modified",
      "-Ycache-macro-class-loader:last-modified"
    ) else Seq.empty
  },
))

val generatedDir = file("generated")
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
        sourceDirectory.value / "main/assets/index.html",
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
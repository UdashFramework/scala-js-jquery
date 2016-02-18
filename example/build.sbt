name := "jquery-demo"

version in ThisBuild := "1.0.0-SNAPSHOT"
scalaVersion in ThisBuild := "2.11.8"
organization in ThisBuild := "io.udash"
crossPaths in ThisBuild := false
scalacOptions in ThisBuild ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions",
  "-language:existentials",
  "-language:dynamics",
  "-Xfuture",
  "-Xfatal-warnings",
  "-Xlint:_,-missing-interpolator,-adapted-args"
)

//TODO: remove it after scala-js-jquery 1.0 release
externalResolvers in ThisBuild := Seq(
  DefaultMavenRepository,
  Resolver.file("local", file(System.getProperty("user.home") + "/.ivy2/local"))(Resolver.ivyStylePatterns)
)

val generatedDir = file("generated")
val `jquery-demo` = project.in(file(".")).enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= deps.value,
    persistLauncher in Compile := true,

    /* move these files out of target/. */
    crossTarget  in (Compile, fullOptJS) := generatedDir,
    crossTarget  in (Compile, fastOptJS) := generatedDir,
    crossTarget  in (Compile, packageJSDependencies) := generatedDir,
    crossTarget  in (Compile, packageScalaJSLauncher) := generatedDir,
    crossTarget  in (Compile, packageMinifiedJSDependencies) := generatedDir,

    compile <<= (compile in Compile).dependsOn(compileStatics),
    compileStatics := {
      compileStaticsForRelease.value
      (crossTarget.value / StaticFilesDir).***.get
    },

    artifactPath in(Compile, fastOptJS) :=
      (crossTarget in(Compile, fastOptJS)).value / StaticFilesDir / WebContent / "scripts" / "frontend-impl-fast.js",
    artifactPath in(Compile, fullOptJS) :=
      (crossTarget in(Compile, fullOptJS)).value / StaticFilesDir / WebContent / "scripts" / "frontend-impl.js",
    artifactPath in(Compile, packageJSDependencies) :=
      (crossTarget in(Compile, packageJSDependencies)).value / StaticFilesDir / WebContent / "scripts" / "frontend-deps-fast.js",
    artifactPath in(Compile, packageMinifiedJSDependencies) :=
      (crossTarget in(Compile, packageMinifiedJSDependencies)).value / StaticFilesDir / WebContent / "scripts" / "frontend-deps.js",
    artifactPath in(Compile, packageScalaJSLauncher) :=
      (crossTarget in(Compile, packageScalaJSLauncher)).value / StaticFilesDir / WebContent / "scripts" / "frontend-init.js"
  )
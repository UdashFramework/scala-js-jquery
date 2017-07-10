import UdashBuild._
import Dependencies._

name := "jquery-demo"

version in ThisBuild := "1.1.0"
scalaVersion in ThisBuild := "2.12.2"
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
  "-Xfatal-warnings"
)

val generatedDir = file("generated")
val `jquery-demo` = project.in(file(".")).enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= deps.value,

    /* move these files out of target/. */
    crossTarget  in (Compile, fullOptJS) := generatedDir,
    crossTarget  in (Compile, fastOptJS) := generatedDir,
    crossTarget  in (Compile, packageJSDependencies) := generatedDir,
    crossTarget  in (Compile, packageMinifiedJSDependencies) := generatedDir,

    compile := (compile in Compile).dependsOn(compileStatics).value,
    compileStatics := {
      compileStaticsForRelease.value
      (crossTarget.value / StaticFilesDir).***.get
    },

    scalaJSUseMainModuleInitializer := true,

    artifactPath in(Compile, fastOptJS) :=
      (crossTarget in(Compile, fastOptJS)).value / StaticFilesDir / WebContent / "scripts" / "frontend-impl-fast.js",
    artifactPath in(Compile, fullOptJS) :=
      (crossTarget in(Compile, fullOptJS)).value / StaticFilesDir / WebContent / "scripts" / "frontend-impl.js",
    artifactPath in(Compile, packageJSDependencies) :=
      (crossTarget in(Compile, packageJSDependencies)).value / StaticFilesDir / WebContent / "scripts" / "frontend-deps-fast.js",
    artifactPath in(Compile, packageMinifiedJSDependencies) :=
      (crossTarget in(Compile, packageMinifiedJSDependencies)).value / StaticFilesDir / WebContent / "scripts" / "frontend-deps.js"
  )
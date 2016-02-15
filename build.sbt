name := "udash-jquery"

version := "0.2.0"
organization := "io.udash"
scalaVersion := "2.11.7"
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

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "org.scalatest" %%% "scalatest" % "3.0.0-M15" % Test,
  "com.lihaoyi" %%% "scalatags" % "0.5.4" % Test
)

jsDependencies +=
  "org.webjars" % "jquery" % "2.2.0" / "2.2.0/jquery.js" minified "2.2.0/jquery.min.js"

requiresDOM in Test := true
persistLauncher in Test := false
scalaJSUseRhino in Test := false

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
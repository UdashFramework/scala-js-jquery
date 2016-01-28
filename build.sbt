name := "udash-jquery"

version := "0.2.0-SNAPSHOT"
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

libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "0.8.2"

jsDependencies +=
  "org.webjars" % "jquery" % "2.2.0" / "2.2.0/jquery.js" minified "2.2.0/jquery.min.js"

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
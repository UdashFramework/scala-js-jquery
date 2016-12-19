
name := "udash-jquery"

version := "1.0.1"
organization := "io.udash"
scalaVersion := "2.12.1"
crossScalaVersions := Seq("2.11.8", "2.12.1")
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

jsEnv in Test := new org.scalajs.jsenv.selenium.SeleniumJSEnv(org.scalajs.jsenv.selenium.Firefox)

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "org.scalatest" %%% "scalatest" % "3.0.1" % Test,
  "com.lihaoyi" %%% "scalatags" % "0.6.2" % Test
)

jsDependencies +=
  "org.webjars" % "jquery" % "2.2.4" / "2.2.4/jquery.js" minified "2.2.4/jquery.min.js"

requiresDOM in Test := true
persistLauncher in Test := false
scalaJSUseRhino in Test := false

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)


name := "udash-jquery"

version := "1.1.1"
organization := "io.udash"
scalaVersion := "2.12.3"
crossScalaVersions := Seq("2.11.11", "2.12.3")
scalacOptions in ThisBuild ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions",
  "-language:existentials",
  "-language:dynamics",
  "-Xfuture",
  "-Xfatal-warnings",
  CrossVersion.partialVersion(scalaVersion.value).collect {
    // WORKAROUND https://github.com/scala/scala/pull/5402
    case (2, 12) => "-Xlint:-unused,_"
  }.getOrElse("-Xlint:_")
)

jsEnv in Test := new org.scalajs.jsenv.selenium.SeleniumJSEnv(org.openqa.selenium.remote.DesiredCapabilities.chrome())

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.3",
  "org.scalatest" %%% "scalatest" % "3.0.3" % Test,
  "com.lihaoyi" %%% "scalatags" % "0.6.5" % Test
)

jsDependencies += "org.webjars" % "jquery" % "3.2.1" / "3.2.1/jquery.js" minified "3.2.1/jquery.min.js"

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(JSDependenciesPlugin)

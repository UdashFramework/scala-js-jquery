

name := "udash-jquery"

inThisBuild(Seq(
  version := "3.0.3",
  organization := "io.udash",
))

val commonSettings = Seq(
  scalaVersion := "2.13.1",
  crossScalaVersions := Seq("2.12.11", "2.13.1"),
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-language:implicitConversions",
    "-language:existentials",
    "-language:dynamics",
    "-language:postfixOps",
    "-language:experimental.macros",
    "-Xfatal-warnings",
    "-Xlint:_",
    "-Ywarn-unused:_,-explicits,-implicits",
    "-Ybackend-parallelism", "4",
    "-Ycache-plugin-class-loader:last-modified",
    "-Ycache-macro-class-loader:last-modified",
  ),
)

val commonJSSettings = Seq(
  Test / parallelExecution := false,
  Test / scalaJSStage := FastOptStage,
  // ScalaJSBundlerPlugin does not work with scalajs-env-selenium:
  // https://github.com/scalacenter/scalajs-bundler/issues/89
  // Test / jsEnv := new SeleniumJSEnv(browserCapabilities),
  scalacOptions += {
    val localDir = (ThisBuild / baseDirectory).value.toURI.toString
    val githubDir = "https://raw.githubusercontent.com/UdashFramework/scala-js-jquery"
    s"-P:scalajs:mapSourceURI:$localDir->$githubDir/v${version.value}/"
  },
)

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSBundlerPlugin)
  .settings(
    commonSettings,
    commonJSSettings,

    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.8",
      "org.scalatest" %%% "scalatest" % "3.1.1" % Test,
      "com.lihaoyi" %%% "scalatags" % "0.8.6" % Test
    ),

    Compile / npmDependencies += "jquery" -> "3.3.1",
    Test / requireJsDomEnv := true
  )

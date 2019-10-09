

name := "udash-jquery"

inThisBuild(Seq(
  version := "3.0.0",
  organization := "io.udash",
))

val commonSettings = Seq(
  scalaVersion := "2.12.10",
  crossScalaVersions := Seq("2.11.12", "2.12.10"),
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-language:implicitConversions",
    "-language:existentials",
    "-language:dynamics",
    "-language:postfixOps",
    "-language:experimental.macros",
    "-Xfuture",
    "-Xfatal-warnings",
    "-Xlint:_"
  ),
  scalacOptions ++= {
    if (scalaBinaryVersion.value == "2.12") Seq(
      "-Ywarn-unused:_,-explicits,-implicits",
      "-Ybackend-parallelism", "4",
      "-Ycache-plugin-class-loader:last-modified",
      "-Ycache-macro-class-loader:last-modified"
    ) else Seq.empty
  }
)

val commonJSSettings = Seq(
  //Compile / emitSourceMaps := true,
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
  scalacOptions += "-P:scalajs:sjsDefinedByDefault",
)

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSBundlerPlugin)
  .settings(
    commonSettings,
    commonJSSettings,

    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.7",
      "org.scalatest" %%% "scalatest" % "3.0.8" % Test,
      "com.lihaoyi" %%% "scalatags" % "0.7.0" % Test
    ),

    Compile / npmDependencies += "jquery" -> "3.3.1",
    Test / requireJsDomEnv := true
  )

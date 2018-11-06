import org.openqa.selenium.chrome.ChromeOptions

name := "udash-jquery"

inThisBuild(Seq(
  version := "3.0.0",
  organization := "io.udash",
))

val commonSettings = Seq(
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
  Compile / emitSourceMaps := true,
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
      "org.scala-js" %%% "scalajs-dom" % "0.9.6",
      "org.scalatest" %%% "scalatest" % "3.0.5" % Test,
      "com.lihaoyi" %%% "scalatags" % "0.6.7" % Test
    ),

    Compile / npmDependencies += "jquery" -> "3.3.1",
    Test / requireJsDomEnv := true
  )

// Deployment configuration
publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := { _ => false }

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := {
  <url>https://github.com/UdashFramework/scala-js-jquery</url>
  <licenses>
    <license>
      <name>Apache v.2 License</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:UdashFramework/scala-js-jquery.git</url>
    <connection>scm:git@github.com:UdashFramework/scala-js-jquery.git</connection>
  </scm>
  <developers>
    <developer>
      <id>avsystem</id>
      <name>AVSystem</name>
      <url>http://www.avsystem.com/</url>
    </developer>
  </developers>
}

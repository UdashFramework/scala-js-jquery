import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.scalajs.jsenv.selenium.SeleniumJSEnv

name := "udash-jquery"

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
    "-language:experimental.macros",
    "-Xfuture",
    "-Xfatal-warnings",
    "-Xlint:_",
  ),
  scalacOptions ++= {
    if (CrossVersion.partialVersion((root / scalaVersion).value).contains((2, 12))) Seq(
      "-Ywarn-unused:_,-explicits,-implicits",
      "-Ybackend-parallelism", "4",
      "-Ycache-plugin-class-loader:last-modified",
      "-Ycache-macro-class-loader:last-modified"
    ) else Seq.empty
  },
))

// Settings for JS tests run in browser
val browserCapabilities: DesiredCapabilities = {
  // requires ChromeDriver: https://sites.google.com/a/chromium.org/chromedriver/
  val capabilities = DesiredCapabilities.chrome()
  capabilities.setCapability(ChromeOptions.CAPABILITY, {
    val options = new ChromeOptions()
    options.addArguments("--headless", "--disable-gpu")
    options
  })
  capabilities
}

val commonJSSettings = Seq(
  Compile / emitSourceMaps := true,
  Test / parallelExecution := false,
  Test / scalaJSStage := FastOptStage,
  Test / jsEnv := new SeleniumJSEnv(browserCapabilities),
  scalacOptions += {
    val localDir = (ThisBuild / baseDirectory).value.toURI.toString
    val githubDir = "https://raw.githubusercontent.com/UdashFramework/scala-js-jquery"
    s"-P:scalajs:mapSourceURI:$localDir->$githubDir/v${version.value}/"
  },
  scalacOptions += "-P:scalajs:sjsDefinedByDefault",
)

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalatest" %%% "scalatest" % "3.0.5" % Test,
  "com.lihaoyi" %%% "scalatags" % "0.6.7" % Test
)

jsDependencies +=
  "org.webjars" % "jquery" % "3.3.1" % Test / "3.3.1/jquery.js" minified "3.3.1/jquery.min.js"

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonJSSettings)

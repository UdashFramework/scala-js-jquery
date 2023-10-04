name := "udash-jquery"

inThisBuild(Seq(
  version := "3.3.0-SNAPSHOT",
  organization := "io.udash",
))

val commonSettings = Seq(
  scalaVersion := "2.13.12",
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-language:implicitConversions",
    "-language:existentials",
    "-language:dynamics",
    "-language:experimental.macros",
    "-Xfatal-warnings",
    "-Xlint:_",
    "-Ybackend-parallelism", "8",
    "-Ycache-plugin-class-loader:last-modified",
    "-Ycache-macro-class-loader:last-modified",
  ),
)

val commonJSSettings = Seq(
  Test / scalaJSStage := FastOptStage,
  Test / requireJsDomEnv := true,
  npmExtraArgs += "--silent",
  scalacOptions += {
    val localDir = (ThisBuild / baseDirectory).value.toURI.toString
    val githubDir = "https://raw.githubusercontent.com/UdashFramework/scala-js-jquery"
    s"-P:scalajs:mapSourceURI:$localDir->$githubDir/v${version.value}/"
  },
  webpack / version := "5.75.0", // TODO: can be removed when sbt-scalajs-bundler > 0.21.1
)

val deploymentConfiguration = Seq(
  publishMavenStyle := true,
  Test / publishArtifact := false,
  pomIncludeRepository := { _ => false },

  publishTo := sonatypePublishToBundle.value,

  credentials in Global += Credentials(
    "Sonatype Nexus Repository Manager",
    "oss.sonatype.org",
    sys.env.getOrElse("SONATYPE_USERNAME", ""),
    sys.env.getOrElse("SONATYPE_PASSWORD", "")
  ),

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
)

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSBundlerPlugin, JSDependenciesPlugin)
  .settings(
    commonSettings,
    commonJSSettings,
    deploymentConfiguration,

    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.7.0",
      "org.scalatest" %%% "scalatest" % "3.2.9" % Test,
      "com.lihaoyi" %%% "scalatags" % "0.10.0" % Test
    ),

    Compile / npmDependencies += "jquery" -> "3.6.4",
    jsDependencies += "org.webjars" % "jquery" % "3.6.4" / "3.6.4/jquery.js" minified s"3.6.4/jquery.min.js",
  )

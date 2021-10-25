name := "udash-jquery"

inThisBuild(Seq(
  version := "3.2.0",
  organization := "io.udash",
))

val commonSettings = Seq(
  scalaVersion := "2.13.6",
  crossScalaVersions := Seq("2.13.6", "2.12.15"),
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
      "org.scala-js" %%% "scalajs-dom" % "2.0.0",
      "org.scalatest" %%% "scalatest" % "3.2.9" % Test,
      "com.lihaoyi" %%% "scalatags" % "0.10.0" % Test
    ),

    Compile / npmDependencies += "jquery" -> "3.4.1",
    jsDependencies += "org.webjars" % "jquery" % "3.4.1" / "3.4.1/jquery.js" minified s"3.4.1/jquery.min.js",
  )

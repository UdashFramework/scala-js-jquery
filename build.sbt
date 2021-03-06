name := "udash-jquery"

inThisBuild(Seq(
  version := sys.env.get("TRAVIS_TAG").filter(_.startsWith("v")).map(_.drop(1)).getOrElse("3.0.0-SNAPSHOT"),
  organization := "io.udash",
  cancelable := true,
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
  autoAPIMappings := true,
  publishMavenStyle := true,
  publishArtifact in Test := false,
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

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSBundlerPlugin, JSDependenciesPlugin)
  .settings(
    commonSettings,
    commonJSSettings,

    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.8",
      "org.scalatest" %%% "scalatest" % "3.1.1" % Test,
      "com.lihaoyi" %%% "scalatags" % "0.8.6" % Test
    ),

    Compile / npmDependencies += "jquery" -> "3.4.1",
    jsDependencies += "org.webjars" % "jquery" % "3.4.1" / "3.4.1/jquery.js",
  )

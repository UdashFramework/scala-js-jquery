
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

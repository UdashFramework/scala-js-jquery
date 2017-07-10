
name := "udash-jquery"

version := "1.1.0"
organization := "io.udash"
scalaVersion := "2.12.2"
crossScalaVersions := Seq("2.11.11", "2.12.2")
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

jsEnv in Test := new org.scalajs.jsenv.selenium.SeleniumJSEnv(org.scalajs.jsenv.selenium.Firefox())

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.2",
  "org.scalatest" %%% "scalatest" % "3.0.3" % Test,
  "com.lihaoyi" %%% "scalatags" % "0.6.5" % Test
)

jsDependencies +=
  "org.webjars" % "jquery" % "3.2.1" / "3.2.1/jquery.js" minified "3.2.1/jquery.min.js"

requiresDOM in Test := true

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

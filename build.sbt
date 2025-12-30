name := "udash-jquery"

inThisBuild(Seq(
  version := "3.3.0-SNAPSHOT",
  scalaVersion := "2.13.18",
  organization := "io.udash",
  homepage := Some(url("https://udash.io")),
  licenses := Seq(License.Apache2),
  scmInfo := Some(ScmInfo(
    browseUrl = url("https://github.com/UdashFramework/scala-js-jquery"),
    connection = "scm:git:git@github.com:UdashFramework/scala-js-jquery.git",
    devConnection = Some("scm:git:git@github.com:UdashFramework/scala-js-jquery.git"),
  )),
  developers := List(
    Developer("ddworak", "Dawid Dworak", "d.dworak@avsystem.com", url("https://github.com/ddworak")),
  ),
  githubWorkflowTargetTags ++= Seq("v*"),
  githubWorkflowArtifactUpload := false,
  githubWorkflowJavaVersions := Seq(JavaSpec.temurin("17"), JavaSpec.temurin("21"), JavaSpec.temurin("25")),
  githubWorkflowPublishTargetBranches := Seq(RefPredicate.StartsWith(Ref.Tag("v"))),
  githubWorkflowEnv += "JAVA_OPTS" -> "-Dfile.encoding=UTF-8 -Xmx4G",
  githubWorkflowBuildMatrixFailFast := Some(false),
  githubWorkflowPublish := Seq(WorkflowStep.Sbt(
    List("ci-release"),
    env = Map(
      "PGP_PASSPHRASE" -> "${{ secrets.PGP_PASSPHRASE }}",
      "PGP_SECRET" -> "${{ secrets.PGP_SECRET }}",
      "SONATYPE_PASSWORD" -> "${{ secrets.SONATYPE_PASSWORD }}",
      "SONATYPE_USERNAME" -> "${{ secrets.SONATYPE_USERNAME }}"
    )
  )),
))

val commonSettings = Seq(
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

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSBundlerPlugin, JSDependenciesPlugin)
  .settings(
    commonSettings,
    commonJSSettings,

    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.8.1",
      "org.scalatest" %%% "scalatest" % "3.2.19" % Test,
      "com.lihaoyi" %%% "scalatags" % "0.13.1" % Test
    ),

    Compile / npmDependencies += "jquery" -> "3.7.1",
    jsDependencies += "org.webjars" % "jquery" % "3.7.1" / "3.7.1/jquery.js" minified s"3.7.1/jquery.min.js",
  )

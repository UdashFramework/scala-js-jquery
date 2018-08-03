logLevel := Level.Warn

libraryDependencies += "org.scala-js" %% "scalajs-env-selenium" % "0.2.0"

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.24")

// Deployment configuration
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
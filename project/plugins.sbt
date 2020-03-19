logLevel := Level.Warn

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.1")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.17.0")

// Deployment configuration
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.8.1")
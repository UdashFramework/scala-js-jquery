logLevel := Level.Warn

libraryDependencies += "org.scala-js" %% "scalajs-env-selenium" % "0.3.0"

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.29")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.15.0-0.6")

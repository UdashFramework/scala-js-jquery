logLevel := Level.Warn

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.20.1")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.21.1")
addSbtPlugin("org.scala-js" % "sbt-jsdependencies" % "1.0.2")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.11.2")
addSbtPlugin("com.github.sbt" % "sbt-github-actions" % "0.29.0")
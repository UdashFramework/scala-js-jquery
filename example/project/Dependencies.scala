import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Dependencies {
  val scalatagsVersion = "0.8.6"
  val udashJQueryVersion = "3.0.0-SNAPSHOT"

  val deps = Def.setting(Seq[ModuleID](
    "com.lihaoyi" %%% "scalatags" % scalatagsVersion,
    "io.udash" %%% "udash-jquery" % udashJQueryVersion
  ))
}
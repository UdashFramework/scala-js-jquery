import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Dependencies {
  val udashCoreVersion = "0.8.3"
  val udashJQueryVersion = "3.0.0-SNAPSHOT"

  val deps = Def.setting(Seq[ModuleID](
    "io.udash" %%% "udash-core" % udashCoreVersion,
    "io.udash" %%% "udash-jquery" % udashJQueryVersion
  ))
}
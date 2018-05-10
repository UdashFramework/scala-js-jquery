import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._

object Dependencies {
  val udashCoreVersion = "0.6.1"
  val udashJQueryVersion = "1.2.0"

  val deps = Def.setting(Seq[ModuleID](
    "io.udash" %%% "udash-core-frontend" % udashCoreVersion,
    "io.udash" %%% "udash-jquery" % udashJQueryVersion
  ))
}
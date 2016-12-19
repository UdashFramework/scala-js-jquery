import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._

object Dependencies extends Build {
  val udashCoreVersion = "0.4.0"
  val udashJQueryVersion = "1.0.1"

  val deps = Def.setting(Seq[ModuleID](
    "io.udash" %%% "udash-core-frontend" % udashCoreVersion,
    "io.udash" %%% "udash-jquery" % udashJQueryVersion
  ))

  val depsJS = Def.setting(Seq[org.scalajs.sbtplugin.JSModuleID](
  ))
}
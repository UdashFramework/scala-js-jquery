import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._

object Dependencies {
  val udashCoreVersion = "0.6.1"
  val udashJQueryVersion = "2.0.0"

  val deps = Def.setting(Seq[ModuleID](
    "io.udash" %%% "udash-core-frontend" % udashCoreVersion,
    "io.udash" %%% "udash-jquery" % udashJQueryVersion
  ))

  val jsDeps = Def.setting(Seq[JSModuleID](
    "org.webjars" % "jquery" % "3.3.1" / "3.3.1/jquery.js" minified "3.3.1/jquery.min.js"
  ))
}
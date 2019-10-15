

object Dependencies {
  val udashCoreVersion = "0.8.1"
  val udashJQueryVersion = "3.0.2"

  val deps = Def.setting(Seq[ModuleID](
    "io.udash" %%% "udash-core" % udashCoreVersion,
    "io.udash" %%% "udash-jquery" % udashJQueryVersion
  ))

  val jsDeps = Def.setting(Seq[org.scalajs.sbtplugin.JSModuleID](
    "org.webjars" % "jquery" % "3.3.1" / "3.3.1/jquery.js" minified "3.3.1/jquery.min.js"
  ))
}
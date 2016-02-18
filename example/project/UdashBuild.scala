import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

object UdashBuild extends Build {
  val StaticFilesDir = "UdashStatic"
  val WebContent = "WebContent"

  def copyIndex(file: File, to: File) = {
    val newFile = Path(to.toPath.toString + "/index.html")
    IO.copyFile(file, newFile.asFile)
  }

  val compileStatics = taskKey[Seq[File]]("Frontend static files manager.")

  val compileStaticsForRelease = Def.taskDyn {
    def outDir(target: File) = target / StaticFilesDir / WebContent
    if (!isSnapshot.value) {
      Def.task {
        val indexFile = sourceDirectory.value / "main/assets/index.prod.html"
        copyIndex(indexFile, outDir((crossTarget in (Compile, fullOptJS)).value))
        (fullOptJS in Compile).value
        (packageMinifiedJSDependencies in Compile).value
        (packageScalaJSLauncher in Compile).value
      }
    } else {
      Def.task {
        val indexFile = sourceDirectory.value / "main/assets/index.dev.html"
        copyIndex(indexFile, outDir((crossTarget in (Compile, fastOptJS)).value))
        (fastOptJS in Compile).value
        (packageJSDependencies in Compile).value
        (packageScalaJSLauncher in Compile).value
      }
    }
  }
}
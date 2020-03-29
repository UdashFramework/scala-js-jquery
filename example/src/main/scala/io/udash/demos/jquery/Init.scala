package io.udash.demos.jquery

import io.udash.wrappers.jquery._
import org.scalajs.dom
import org.scalajs.dom.Element

import scala.scalajs.js.annotation.JSExport

object Init {

  @JSExport
  def main(args: Array[String]): Unit = {
    jQ((_: Element) => {
      val appRoot = jQ("#application").get(0)
      if (appRoot.isEmpty) {
        dom.console.error("Application root element not found! Check you index.html file!")
      } else {
        //applicationInstance.run(appRoot.get)
      }
    })
  }
}
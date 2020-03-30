package io.udash.demos.jquery

import io.udash.demos.jquery.views.IndexView
import org.scalajs.dom

import scala.scalajs.js.annotation.JSExport

object Init {

  @JSExport
  def main(args: Array[String]): Unit =
    dom.document.querySelector("#application").appendChild(IndexView.content.render)
}
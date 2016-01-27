package io.udash.wrappers.jquery

import org.scalajs.dom.Element

import scala.scalajs.js
import scala.scalajs.js.Dictionary

object JQueryHelpers {

  implicit class JQueryExt(element: JQuery) {
    def animateThen(property: String, value: js.Any)(callback: => Unit) =
      element.animate(Dictionary((property, value)), 300, "easeInOutQuint", (e: Element) => callback)

    def animate(property: String, value: Double) = animateThen(property, value)(())

    def animate(property: String, value: String) = animateThen(property, value)(())
  }


}

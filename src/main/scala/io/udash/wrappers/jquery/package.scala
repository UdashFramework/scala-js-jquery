package io.udash.wrappers

import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** All docs are quoted from <a href="http://api.jquery.com/">jQuery API docs</a>. */
package object jquery {
  /** See: <a href="http://api.jquery.com/category/selectors/">jQuery Docs</a> */
  type Selector = String
  type EasingFunction = String
  type JQueryCallback = (Element, JQueryEvent) => Any

  def jQ: JQueryStatic = js.Dynamic.global.jQuery.asInstanceOf[JQueryStatic]
}

package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.Element

/** Based on examples from: <a href="http://api.jquery.com/each/">jQuery Docs</a>. */
object EachView extends FunctionView {

  import scalatags.JsDom.all._

  override protected val content = div(
    h3(".each()"),
    div("Click button"),
    div("to iterate through"),
    div("these divs.")
  ).render

  override protected def script = () => {
    jQ("div", content).each((el: Element, idx: Int) => {
      jQ(el).replaceWith(span(s"${el.textContent} ").render)
    })
  }
}
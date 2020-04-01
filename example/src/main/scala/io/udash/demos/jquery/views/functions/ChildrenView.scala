package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

/** Based on examples from: <a href="http://api.jquery.com/children/">jQuery Docs</a>. */
object ChildrenView extends FunctionView {

  import scalatags.JsDom.all._

  override protected val content = div(
    h3(".children()"),
    div(
      span("Hello"),
      p(cls := "selected")("Hello again"),
      div(cls := "selected")("and again"),
      p("and one last time.")
    )
  ).render

  override protected def script = () => {
    jQ("div", content).children().css("color", "blue")
    jQ("div", content).children(".selected").css("border-bottom", "3px double red")
    jQ("div", content).children("div.selected").css("border-top", "1px dashed green")
  }
}
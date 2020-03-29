package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

/** Based on examples from: <a href="http://api.jquery.com/children/">jQuery Docs</a>. */
object ChildrenView extends FunctionView {

  import scalatags.JsDom.all._

  override protected def content = div(cls := "demo")(
    h3(".children()"),
    div(
      span("Hello"),
      p(cls := "selected")("Hello again"),
      div(cls := "selected")("and again"),
      p("and one last time.")
    )
  )

  override protected def script = () => {
    jQ(".demo div").children().css("color", "blue")
    jQ(".demo div").children(".selected").css("border-bottom", "3px double red")
    jQ(".demo div").children("div.selected").css("border-top", "1px dashed green")
  }
}
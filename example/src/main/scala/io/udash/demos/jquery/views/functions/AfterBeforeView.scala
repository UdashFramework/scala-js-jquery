package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

/** Based on examples from: <a href="http://api.jquery.com/after/">jQuery Docs</a>. */
object AfterBeforeView extends FunctionView {

  import scalatags.JsDom.all._

  override protected val content = div(
    h3(".after()"),
    div(
      p(cls := "after")("I would like to say: ")
    ),
    h3(".before()"),
    div(
      p(cls := "before")("is what I said...")
    )
  ).render

  override protected def script = () => {
    jQ(".after", content).after("<b>Hello</b>")
    jQ(".before", content).before("<b>Hello</b>")
  }
}
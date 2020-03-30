package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

/** Based on examples from: <a href="http://api.jquery.com/animate/">jQuery Docs</a>. */
object AppendPrependView extends FunctionView {

  import scalatags.JsDom.all._

  override protected val content = div(
    h3(".append()"),
    p(id := "append")("I would like to say: "),
    h3(".prepend()"),
    p(id := "prepend")("amigo!")
  ).render

  override protected def script = () => {
    jQ("#append", content).append("<b>hello</b>")
    jQ("#prepend", content).prepend("<i>Hello</i> ")
  }
}
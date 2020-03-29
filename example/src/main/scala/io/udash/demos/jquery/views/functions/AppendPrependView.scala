package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

/** Based on examples from: <a href="http://api.jquery.com/animate/">jQuery Docs</a>. */
object AppendPrependView extends FunctionView {

  import scalatags.JsDom.all._

  override protected def content = div(cls := "demo")(
    h3(".append()"),
    p(id := "append")("I would like to say: "),
    h3(".prepend()"),
    p(id := "prepend")("amigo!")
  )

  override protected def script = () => {
    jQ("#append").append("<b>hello</b>")
    jQ("#prepend").prepend("<i>Hello</i> ")
  }
}
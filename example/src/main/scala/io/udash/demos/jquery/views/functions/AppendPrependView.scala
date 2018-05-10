package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

object AppendPrependViewPresenter extends StaticViewFactory[IndexState.type](() => new AppendPrependView)

/** Based on examples from: <a href="http://api.jquery.com/animate/">jQuery Docs</a>. */
class AppendPrependView extends FunctionView {
  import scalatags.JsDom.all._

  override protected val content = div(cls := "demo")(
    h3(".append()"),
    p(id := "append")("I would like to say: "),
    h3(".prepend()"),
    p(id := "prepend")("amigo!")
  ).render

  override protected val script = () => {
    jQ("#append").append("<b>hello</b>")
    jQ("#prepend").prepend("<i>Hello</i> ")
  }
}
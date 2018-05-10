package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

object AfterBeforeViewPresenter extends StaticViewFactory[IndexState.type](() => new AfterBeforeView)

/** Based on examples from: <a href="http://api.jquery.com/after/">jQuery Docs</a>. */
class AfterBeforeView extends FunctionView {
  import scalatags.JsDom.all._

  override protected val content = div(cls := "demo")(
    h3(".after()"),
    div(
      p(cls := "after")("I would like to say: ")
    ),
    h3(".before()"),
    div(
      p(cls := "before")("is what I said...")
    )
  ).render

  override protected val script = () => {
    jQ(".after").after("<b>Hello</b>")
    jQ(".before").before("<b>Hello</b>")
  }
}
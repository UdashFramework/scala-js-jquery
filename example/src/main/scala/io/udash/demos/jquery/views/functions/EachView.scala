package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.Element

object EachViewPresenter extends StaticViewFactory[IndexState.type](() => new EachView)

/** Based on examples from: <a href="http://api.jquery.com/each/">jQuery Docs</a>. */
class EachView extends FunctionView {
  import scalatags.JsDom.all._

  override protected val content = div(cls := "demo")(
    h3(".each()"),
    div("Click button"),
    div("to iterate through"),
    div("these divs.")
  ).render

  override protected val script = () => {
    jQ(".demo div").each((el: Element, idx: Int) => {
      jQ(el).replaceWith(span(s"${el.textContent} ").render)
    })
  }
}
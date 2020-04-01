package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.html.Div
import org.scalajs.dom.{Element, Event}

/** Based on examples from: <a href="http://api.jquery.com/on/">jQuery Docs</a>. */
object OnOneOffView extends FunctionView {

  import scalatags.JsDom.all._

  val onCallback = (_: Element, _: JQueryEvent) =>
    jQ("ul", content).append(li("This will be added on every click").render)
  val oneCallback = (_: Element, _: JQueryEvent) =>
    jQ("ul", content).append(li("This will be added only once").render)

  override protected val content: Div = div(
    h3(".on() & .one() & .off()"),
    button(id := "click", disabled := "disabled")("Click me"),
    ul(),
    button(
      id := "off",
      disabled := "disabled",
      onclick := ((_: Event) => {
        jQ("#click", content)
          .off(EventName.click, onCallback)
          .off(EventName.click, oneCallback)
        false
      })
    )("Off")
  ).render

  override protected def script = () => {
    jQ("#click", content)
      .on(EventName.click, onCallback)
      .one(EventName.click, oneCallback)

    jQ("button", content)
      .prop("disabled", "")
  }
}
package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.{Element, Event}

/** Based on examples from: <a href="http://api.jquery.com/on/">jQuery Docs</a>. */
object OnOneOffView extends FunctionView {

  import scalatags.JsDom.all._

  val onCallback = (_: Element, _: JQueryEvent) =>
    jQ(".demo ul").append(li("This will be added on every click").render)
  val oneCallback = (_: Element, _: JQueryEvent) =>
    jQ(".demo ul").append(li("This will be added only once").render)

  override protected def content = div(cls := "demo")(
    h3(".on() & .one() & .off()"),
    button(id := "click", disabled := "disabled")("Click me"),
    ul(),
    button(
      id := "off",
      disabled := "disabled",
      onclick := ((_: Event) => {
        jQ(".demo #click")
          .off(EventName.click, onCallback)
          .off(EventName.click, oneCallback)
        false
      })
    )("Off")
  )

  override protected def script = () => {
    jQ(".demo #click")
      .on(EventName.click, onCallback)
      .one(EventName.click, oneCallback)

    jQ(".demo button")
      .prop("disabled", "")
  }
}
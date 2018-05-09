package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.{Element, Event}

object OnOneOffViewPresenter extends StaticViewFactory[IndexState.type](() => new OnOneOffView)

/** Based on examples from: <a href="http://api.jquery.com/on/">jQuery Docs</a>. */
class OnOneOffView extends FunctionView {
  import scalatags.JsDom.all._

  val onCallback = (_: Element, _: JQueryEvent) =>
    jQ(".demo ul").append(li("This will be added on every click").render)
  val oneCallback = (_: Element, _: JQueryEvent) =>
    jQ(".demo ul").append(li("This will be added only once").render)

  override protected val content = div(cls := "demo")(
    h3(".on() & .one() & .off()"),
    button(id := "click", disabled := "disabled")("Click me"),
    ul(),
    button(
      id := "off",
      disabled := "disabled",
      onclick :+= ((_: Event) => {
        jQ(".demo #click")
          .off("click", onCallback)
          .off("click", oneCallback)
        false
      })
    )("Off")
  ).render

  override protected val script = () => {
    jQ(".demo #click")
      .on("click", onCallback)
      .one("click", oneCallback)

    jQ(".demo button")
      .prop("disabled", "")
  }
}
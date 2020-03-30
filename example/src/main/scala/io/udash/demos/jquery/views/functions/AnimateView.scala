package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.Element
import scalatags.JsDom.tags2

/** Based on examples from: <a href="http://api.jquery.com/animate/">jQuery Docs</a>. */
object AnimateView extends FunctionView {

  import scalatags.JsDom.all._

  override protected val content = div(cls := "animate")(
    h3(".animate() & .click()"),
    tags2.style(
      """.animate div {
        |  background-color: #bca;
        |  width: 200px;
        |  height: 1.1em;
        |  text-align: center;
        |  border: 2px solid green;
        |  margin: 3px;
        |  font-size: 14px;
        |}
        |.animate button {
        |  font-size: 14px;
        |}""".stripMargin
    ),
    button(id := "go1", disabled := "disabled")("» Animate Block1"),
    button(id := "go2", disabled := "disabled")("» Animate Block2"),
    button(id := "go3", disabled := "disabled")("» Animate Both"),
    button(id := "go4", disabled := "disabled")("» Reset"),
    div(id := "block1")("Block1"),
    div(id := "block2")("Block2")
  ).render

  override protected def script = () => {
    jQ("#go1", content).on(EventName.click, (_: Element, _: JQueryEvent) => {
      jQ("#block1", content)
        .animate(Map(
          "width" -> "90%"
        ), AnimationOptions(
          queue = Some(false),
          duration = Some(3000)
        ))
        .animate(Map("fontSize" -> "24px"), 1500)
        .animate(Map("borderRightWidth" -> "15px"), 1500)
    })

    jQ("#go2", content).on(EventName.click, (_: Element, _: JQueryEvent) => {
      jQ("#block2", content)
        .animate(Map("width" -> "90%"), 1000)
        .animate(Map("fontSize" -> "24px"), 1000)
        .animate(Map("borderLeftWidth" -> "15px"), 1000)
    })

    jQ("#go3", content).on(EventName.click, (_: Element, _: JQueryEvent) => {
      jQ("#go1", content).add("#go2", content).trigger("click")
    })

    jQ("#go4", content).on(EventName.click, (_: Element, _: JQueryEvent) => {
      // TODO: It does not work without explicit Map elements type
      import scala.scalajs.js.`|`
      jQ("div", content).css(Map[String, String | Int | Double | Boolean](
        "width" -> "",
        "fontSize" -> "",
        "borderWidth" -> ""
      ))
    })

    jQ("button", content).prop("disabled", "")
  }
}
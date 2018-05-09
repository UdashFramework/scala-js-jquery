package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.Element

import scalatags.JsDom.tags2

object AnimateViewPresenter extends StaticViewFactory[IndexState.type](() => new AnimateView)

/** Based on examples from: <a href="http://api.jquery.com/animate/">jQuery Docs</a>. */
class AnimateView extends FunctionView {
  import scalatags.JsDom.all._

  override protected val content = div(cls := "demo")(
    h3(".animate() & .click()"),
    tags2.style(
      """.demo div {
        |  background-color: #bca;
        |  width: 200px;
        |  height: 1.1em;
        |  text-align: center;
        |  border: 2px solid green;
        |  margin: 3px;
        |  font-size: 14px;
        |}
        |.demo button {
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

  override protected val script = () => {
    jQ("#go1").on("click", (_: Element, _: JQueryEvent) => {
      jQ( "#block1" )
        .animate(Map(
          "width" -> "90%"
        ), AnimationOptions(
          queue = Some(false),
          duration = Some(3000)
        ))
        .animate(Map("fontSize" -> "24px"), 1500)
        .animate(Map("borderRightWidth" -> "15px"), 1500)
    })

    jQ("#go2").on("click", (_: Element, _: JQueryEvent) => {
      jQ("#block2")
        .animate(Map("width" -> "90%"), 1000)
        .animate(Map("fontSize" -> "24px"), 1000)
        .animate(Map("borderLeftWidth" -> "15px"), 1000)
    })

    jQ("#go3").on("click", (_: Element, _: JQueryEvent) => {
      jQ("#go1").add("#go2").trigger("click")
    })

    jQ("#go4").on("click", (_: Element, _: JQueryEvent) => {
      // TODO: It does not work without explicit Map elements type
      import scala.scalajs.js.`|`
      jQ("div").css(Map[String, String | Int | Double | Boolean](
        "width" -> "",
        "fontSize" -> "",
        "borderWidth" -> ""
      ))
    })

    jQ(".demo button").prop("disabled", "")
  }
}
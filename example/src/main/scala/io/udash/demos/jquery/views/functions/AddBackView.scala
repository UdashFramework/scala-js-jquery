package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import scalatags.JsDom.tags2

/** Based on examples from: <a href="http://api.jquery.com/addBack/">jQuery Docs</a>. */
object AddBackView extends FunctionView {

  import scalatags.JsDom.all._

  override protected val content = div(cls := "addback")(
    h3(".addBack() & .addClass()"),
    tags2.style(
      """
        |.addback .border {
        |  border: 2px solid red;
        |}
        |.addback .background {
        |  background: yellow;
        |}""".stripMargin
    ),
    div(cls := "left")(
      p(strong("Before ", code("addBack()"))),
      div(cls := "before-addback")(
        p("First Paragraph"),
        p("Second Paragraph")
      )
    ),
    div(cls := "right")(
      p(strong("After ", code("addBack()"))),
      div(cls := "after-addback")(
        p("First Paragraph"),
        p("Second Paragraph")
      )
    )
  ).render

  override protected def script = () => {
    jQ("div.left, div.right", content).find("div, div > p").addClass("border")

    // First Example
    jQ("div.before-addback", content).find("p").addClass("background")

    // Second Example
    jQ("div.after-addback", content).find("p").addBack().addClass("background")
  }
}
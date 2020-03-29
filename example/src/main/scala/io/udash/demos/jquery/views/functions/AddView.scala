package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import scalatags.JsDom.tags2

/** Based on examples from: <a href="http://api.jquery.com/add/">jQuery Docs</a>. */
object AddView extends FunctionView {

  import scalatags.JsDom.all._

  override protected def content = div(cls := "demo")(
    h3(".add() & .css()"),
    tags2.style(
      """.demo div {
        |  width: 60px;
        |  height: 60px;
        |  margin: 10px;
        |  float: left;
        |}
        |.demo p {
        |  clear: left;
        |  font-weight: bold;
        |  font-size: 16px;
        |  color: blue;
        |  margin: 0 10px;
        |  padding: 2px;
        |}""".stripMargin
    ),
    div(),
    div(),
    div(),
    div(),
    div(),
    div(),
    p("Added this... (notice no border)")
  )

  override protected def script = () => {
    jQ(".demo div").css("border", "2px solid red")
      .add(".demo p")
      .css("background", "yellow")
  }
}
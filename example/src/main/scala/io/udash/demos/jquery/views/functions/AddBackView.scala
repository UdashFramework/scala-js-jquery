package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

import scalatags.JsDom.tags2

object AddBackViewPresenter extends StaticViewFactory[IndexState.type](() => new AddBackView)

/** Based on examples from: <a href="http://api.jquery.com/addBack/">jQuery Docs</a>. */
class AddBackView extends FunctionView {
  import scalatags.JsDom.all._

  override protected val content = div(cls := "demo")(
    h3(".addBack() & .addClass()"),
    tags2.style(
      """.demo p, .demo div {
        |  margin: 5px;
        |  padding: 5px;
        |}
        |.border {
        |  border: 2px solid red;
        |}
        |.background {
        |  background: yellow;
        |}
        |.left, .right {
        |  width: 45%;
        |  float: left;
        |}
        |.right {
        |  margin-left: 3%;
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

  override protected val script = () => {
    jQ( ".demo div.left, .demo div.right" ).find( "div, div > p" ).addClass( "border" )

    // First Example
    jQ( ".demo div.before-addback" ).find( "p" ).addClass( "background" )

    // Second Example
    jQ( ".demo div.after-addback" ).find( "p" ).addBack().addClass( "background" )
  }
}
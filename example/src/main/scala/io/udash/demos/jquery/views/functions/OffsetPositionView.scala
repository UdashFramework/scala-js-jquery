package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

/** Based on examples from: <a href="http://api.jquery.com/position/">jQuery Docs</a>. */
object OffsetPositionView extends FunctionView {

  import scalatags.JsDom.all._

  override protected def content = div(cls := "demo")(
    h3(".offset() & .position()"),
    div(style := "padding: 12px; border: 1px red solid;")(
      p(style := "margin-left: 10px; border: 1px blue solid;")("Hello world!")
    ),
    p(id := "results")("")
  )

  override protected def script = () => {
    val div = jQ(".demo div")
    val p = jQ(".demo div p")
    jQ("#results").html(
      s"""Div offset: (${div.offset().top}, ${div.offset().left})<br/>
         |Div position: (${div.position().top}, ${div.position().left})<br/>
         |Paragraph offset: (${p.offset().top}, ${p.offset().left})<br/>
         |Paragraph position: (${p.position().top}, ${p.position().left})
       """.stripMargin
    )
  }
}
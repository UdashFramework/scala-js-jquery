package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

/** Based on examples from: <a href="http://api.jquery.com/data/">jQuery Docs</a>. */
object DataView extends FunctionView {

  import scalatags.JsDom.all._

  override protected def content = div(cls := "demo")(
    h3(".data()"),
    div(
      "The values stored were ",
      span("_"),
      " and ",
      span("_")
    )
  )

  override protected def script = () => {
    jQ(".demo div").data("test", Map("first" -> 16, "last" -> "pizza!"))
    val data: Map[String, Any] = jQ(".demo div").data("test").get.asInstanceOf[Map[String, Any]]
    jQ(".demo div span:first").text(data.get("first").get.toString)
    jQ(".demo div span:last").text(data.get("last").get.toString)
  }
}
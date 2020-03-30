package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

/** Based on examples from: <a href="http://api.jquery.com/data/">jQuery Docs</a>. */
object DataView extends FunctionView {

  import scalatags.JsDom.all._

  override protected val content = div(
    h3(".data()"),
    div(
      "The values stored were ",
      span("_"),
      " and ",
      span("_")
    )
  ).render

  override protected def script = () => {
    jQ("div", content).data("test", Map("first" -> 16, "last" -> "pizza!"))
    val data: Map[String, Any] = jQ("div", content).data("test").get.asInstanceOf[Map[String, Any]]
    jQ("div span:first", content).text(data.get("first").get.toString)
    jQ("div span:last", content).text(data.get("last").get.toString)
  }
}
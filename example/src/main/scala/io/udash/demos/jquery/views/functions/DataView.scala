package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

object DataViewPresenter extends DefaultViewPresenterFactory[IndexState.type](() => new DataView)

/** Based on examples from: <a href="http://api.jquery.com/data/">jQuery Docs</a>. */
class DataView extends FunctionView {
  import scalatags.JsDom.all._

  override protected val content = div(cls := "demo")(
    h3(".data()"),
    div(
      "The values stored were ",
      span("_"),
      " and ",
      span("_")
    )
  ).render

  override protected val script = () => {
    jQ(".demo div").data("test", Map("first" -> 16, "last" -> "pizza!"))
    val data: Map[String, Any] = jQ(".demo div").data("test").get.asInstanceOf[Map[String, Any]]
    jQ(".demo div span:first").text(data.get("first").get.toString)
    jQ(".demo div span:last").text(data.get("last").get.toString)
  }
}
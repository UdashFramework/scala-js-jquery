package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.Event

import scala.scalajs.js

/** Based on examples from: <a href="http://api.jquery.com/deferred/">jQuery Docs</a>. */
object DeferredView extends FunctionView {

  import scalatags.JsDom.all._

  var deferred: JQueryDeferred[js.Function1[Int, js.Any], Int] = null

  override protected val content = div(
    h3("Deferred"),
    div(
      div(id := "deferred")("???"),
      button(
        id := "resolve",
        disabled := "disabled",
        onclick := ((ev: Event) => {
          deferred.resolve(5)
        })
      )("Resolve(5)"),
      button(
        id := "reject",
        disabled := "disabled",
        onclick := ((ev: Event) => {
          deferred.reject(-5)
        })
      )("Reject(-5)"),
      button(
        id := "notify",
        disabled := "disabled",
        onclick := ((ev: Event) => {
          deferred.notify(1)
        })
      )("Notify(1)")
    )
  ).render

  override protected def script = () => {
    jQ("button", content).prop("disabled", "")
    deferred = jQ.deferred[js.Function1[Int, js.Any], Int]()
    jQ("#deferred", content).text(s"Waiting...")
    deferred.done((i: Int) => jQ("#deferred", content).text(s"Done: $i"))
    deferred.fail((i: Int) => jQ("#deferred", content).text(s"Fail: $i"))
    deferred.progress((i: Int) => jQ("#deferred", content).text(s"Progress: $i"))
  }
}
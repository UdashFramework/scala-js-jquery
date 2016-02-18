package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.Event

import scala.scalajs.js

object DeferredViewPresenter extends DefaultViewPresenterFactory[IndexState.type](() => new DeferredView)

/** Based on examples from: <a href="http://api.jquery.com/deferred/">jQuery Docs</a>. */
class DeferredView extends FunctionView {
  import scalatags.JsDom.all._

  var deferred: JQueryDeferred[js.Function1[Int, js.Any], Int] = null

  override protected val content = div(cls := "demo")(
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

  override protected val script = () => {
    jQ(".demo button").prop("disabled", "")
    deferred = jQ.deferred[js.Function1[Int, js.Any], Int]()
    jQ("#deferred").text(s"Waiting...")
    deferred.done((i: Int) => jQ("#deferred").text(s"Done: $i"))
    deferred.fail((i: Int) => jQ("#deferred").text(s"Fail: $i"))
    deferred.progress((i: Int) => jQ("#deferred").text(s"Progress: $i"))
  }
}
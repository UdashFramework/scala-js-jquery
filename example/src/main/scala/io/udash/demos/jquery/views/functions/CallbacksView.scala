package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

import scala.scalajs.js

/** Based on examples from: <a href="http://api.jquery.com/callbacks.add/">jQuery Docs</a>. */
object CallbacksView extends FunctionView {

  import scalatags.JsDom.all._

  override protected def content = div(cls := "demo")(
    h3("Callbacks"),
    ul(id := "plus"),
    ul(id := "minus"),
    ul(id := "mul"),
    ul(id := "div")
  )

  override protected def script = () => {
    val callbacks = jQ.callbacks[js.Function1[(Int, Int), js.Any], (Int, Int)]()
    callbacks.add((t: (Int, Int)) => {
      val (a, b) = t
      jQ("#plus").append(li(s"$a + $b = ${a + b}").render)
    })
    callbacks.add((t: (Int, Int)) => {
      val (a, b) = t
      jQ("#minus").append(li(s"$a - $b = ${a - b}").render)
    })
    callbacks.add((t: (Int, Int)) => {
      val (a, b) = t
      jQ("#mul").append(li(s"$a * $b = ${a*b}").render)
    })
    callbacks.add((t: (Int, Int)) => {
      val (a, b) = t
      jQ("#div").append(li(s"$a / $b = ${a/b}").render)
    })

    callbacks.fire((1, 1))
    callbacks.fire((3, 3))
    callbacks.fire((7, 4))

    callbacks.disable()
    callbacks.fire((1, 2))
  }
}
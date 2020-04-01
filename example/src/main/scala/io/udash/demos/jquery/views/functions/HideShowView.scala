package io.udash.demos.jquery.views.functions

import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

/** Based on examples from: <a href="http://api.jquery.com/hide/">jQuery Docs</a>. */
object HideShowView extends FunctionView {

  import scalatags.JsDom.all._

  override protected val content = div(
    h3(".hide() & .show()"),
    div("Click button to hide me")
  ).render

  override protected def script = () => {
    jQ("div", content)
      .hide(AnimationOptions(
        duration = Some(3000),
        easing = Some(EasingFunction.linear)
      ))
      .show(1500, EasingFunction.swing)
  }
}
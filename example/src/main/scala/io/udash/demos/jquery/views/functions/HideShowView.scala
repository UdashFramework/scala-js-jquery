package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._

object HideShowViewPresenter extends DefaultViewPresenterFactory[IndexState.type](() => new HideShowView)

/** Based on examples from: <a href="http://api.jquery.com/hide/">jQuery Docs</a>. */
class HideShowView extends FunctionView {
  import scalatags.JsDom.all._

  override protected val content = div(cls := "demo")(
    h3(".hide() & .show()"),
    div("Click button to hide me")
  ).render

  override protected val script = () => {
    jQ(".demo div")
      .hide(AnimationOptions(
        duration = Some(3000),
        easing = Some(EasingFunction.linear)
      ))
      .show(1500, EasingFunction.swing)
  }
}
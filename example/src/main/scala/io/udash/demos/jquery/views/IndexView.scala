package io.udash.demos.jquery.views

import io.udash.demos.jquery.views.functions._

object IndexView {

  import scalatags.JsDom.all._

  private val demos = Seq(
    AddBackView,
    AddView,
    AfterBeforeView,
    AnimateView,
    AppendPrependView,
    AttrView,
    CallbacksView,
    ChildrenView,
    DataView,
    DeferredView,
    EachView,
    HideShowView,
    OffsetPositionView,
    OnOneOffView,
  )

  final val content = div(
    "Take a look at following demos:",
    demos.map(demo => div(demo.getTemplate)),
  )
}
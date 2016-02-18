package io.udash.demos.jquery

import io.udash._

sealed abstract class RoutingState(val parentState: RoutingState) extends State {
  def url(implicit application: Application[RoutingState]): String = s"#${application.matchState(this).value}"
}

case object RootState extends RoutingState(null)

case object ErrorState extends RoutingState(RootState)

case object IndexState extends RoutingState(RootState)

case object AddState extends RoutingState(RootState)

case object AddBackState extends RoutingState(RootState)

case object AfterBeforeState extends RoutingState(RootState)

case object AnimateState extends RoutingState(RootState)

case object AppendPrependState extends RoutingState(RootState)

case object AttrState extends RoutingState(RootState)

case object CallbacksState extends RoutingState(RootState)

case object ChildrenState extends RoutingState(RootState)

case object DataState extends RoutingState(RootState)

case object DeferredState extends RoutingState(RootState)

case object EachState extends RoutingState(RootState)

case object HideShowState extends RoutingState(RootState)

case object OffsetPositionState extends RoutingState(RootState)

case object OnOneOffState extends RoutingState(RootState)
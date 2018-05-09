package io.udash.demos.jquery

import io.udash._

sealed abstract class RoutingState(val parentState: Option[ContainerRoutingState]) extends State {
  type HierarchyRoot = RoutingState

  def url(implicit application: Application[RoutingState]): String =
    s"#${application.matchState(this).value}"
}

sealed abstract class ContainerRoutingState(parentState: Option[ContainerRoutingState]) extends RoutingState(parentState) with ContainerState
sealed abstract class FinalRoutingState(parentState: ContainerRoutingState) extends RoutingState(Option(parentState)) with FinalState


case object RootState extends ContainerRoutingState(None)
case object ErrorState extends FinalRoutingState(RootState)
case object IndexState extends FinalRoutingState(RootState)
case object AddState extends FinalRoutingState(RootState)
case object AddBackState extends FinalRoutingState(RootState)
case object AfterBeforeState extends FinalRoutingState(RootState)
case object AnimateState extends FinalRoutingState(RootState)
case object AppendPrependState extends FinalRoutingState(RootState)
case object AttrState extends FinalRoutingState(RootState)
case object CallbacksState extends FinalRoutingState(RootState)
case object ChildrenState extends FinalRoutingState(RootState)
case object DataState extends FinalRoutingState(RootState)
case object DeferredState extends FinalRoutingState(RootState)
case object EachState extends FinalRoutingState(RootState)
case object HideShowState extends FinalRoutingState(RootState)
case object OffsetPositionState extends FinalRoutingState(RootState)
case object OnOneOffState extends FinalRoutingState(RootState)
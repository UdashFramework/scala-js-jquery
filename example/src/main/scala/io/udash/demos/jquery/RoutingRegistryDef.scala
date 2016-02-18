package io.udash.demos.jquery

import io.udash._
import io.udash.utils.Bidirectional

class RoutingRegistryDef extends RoutingRegistry[RoutingState] {
  def matchUrl(url: Url): RoutingState =
    url2State.applyOrElse(url.value.stripSuffix("/"), (x: String) => ErrorState)

  def matchState(state: RoutingState): Url =
    Url(state2Url.apply(state))

  private val (url2State, state2Url) = Bidirectional[String, RoutingState] {
    case "" => IndexState
    case "/add" => AddState
    case "/addBack" => AddBackState
    case "/after" => AfterBeforeState
    case "/animate" => AnimateState
    case "/append" => AppendPrependState
    case "/attr" => AttrState
    case "/callbacks" => CallbacksState
    case "/children" => ChildrenState
    case "/data" => DataState
    case "/deferred" => DeferredState
    case "/each" => EachState
    case "/hide" => HideShowState
    case "/offset" => OffsetPositionState
    case "/on" => OnOneOffState
  }
}
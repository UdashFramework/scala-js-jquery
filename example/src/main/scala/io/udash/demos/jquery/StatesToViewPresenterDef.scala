package io.udash.demos.jquery

import io.udash._
import io.udash.demos.jquery.views.functions._
import io.udash.demos.jquery.views.{ErrorViewPresenter, IndexViewPresenter, RootViewPresenter}

class StatesToViewPresenterDef extends ViewPresenterRegistry[RoutingState] {
  def matchStateToResolver(state: RoutingState): ViewPresenter[_ <: RoutingState] = state match {
    case RootState => RootViewPresenter
    case IndexState => IndexViewPresenter
    case AddState => AddViewPresenter
    case AddBackState => AddBackViewPresenter
    case AfterBeforeState => AfterBeforeViewPresenter
    case AnimateState => AnimateViewPresenter
    case AppendPrependState => AppendPrependViewPresenter
    case AttrState => AttrViewPresenter
    case CallbacksState => CallbacksViewPresenter
    case ChildrenState => ChildrenViewPresenter
    case DataState => DataViewPresenter
    case DeferredState => DeferredViewPresenter
    case EachState => EachViewPresenter
    case HideShowState => HideShowViewPresenter
    case OnOneOffState => OnOneOffViewPresenter
    case OffsetPositionState => OffsetPositionViewPresenter
    case _ => ErrorViewPresenter
  }
}
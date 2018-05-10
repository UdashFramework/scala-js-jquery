package io.udash.demos.jquery.views

import io.udash._
import io.udash.demos.jquery.{Context, IndexState, RootState}

object RootViewPresenter extends StaticViewFactory[RootState.type](() => new RootView)

class RootView extends ContainerView {
  import Context._
  import scalatags.JsDom.all._

  override def getTemplate: Modifier = div(
    a(href := IndexState.url)(h1("jquery-demo")),
    childViewContainer
  )
}
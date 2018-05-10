package io.udash.demos.jquery.views

import io.udash._
import io.udash.demos.jquery.IndexState

object ErrorViewPresenter extends StaticViewFactory[IndexState.type](() => new ErrorView)

class ErrorView extends FinalView {
  import scalatags.JsDom.all._

  override def getTemplate: Modifier =
    h3("URL not found!")
}
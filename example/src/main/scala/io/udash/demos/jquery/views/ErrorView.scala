package io.udash.demos.jquery.views

import io.udash._
import io.udash.demos.jquery.IndexState
import org.scalajs.dom.Element

object ErrorViewPresenter extends DefaultViewPresenterFactory[IndexState.type](() => new ErrorView)

class ErrorView extends FinalView {
  import scalatags.JsDom.all._

  override def getTemplate: Modifier =
    h3("URL not found!")
}
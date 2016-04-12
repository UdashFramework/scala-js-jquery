package io.udash.demos.jquery.views

import io.udash._
import io.udash.demos.jquery.IndexState
import org.scalajs.dom.Element

object ErrorViewPresenter extends DefaultViewPresenterFactory[IndexState.type](() => new ErrorView)

class ErrorView extends View {
  import scalatags.JsDom.all._

  private val content = h3(
    "URL not found!"
  ).render

  override def getTemplate: Element = content

  override def renderChild(view: View): Unit = {}
}
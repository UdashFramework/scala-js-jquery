package io.udash.demos.jquery.views

import io.udash._
import org.scalajs.dom.{Element, Event}

abstract class FunctionView extends FinalView {
  import scalatags.JsDom.all._

  protected val content: Element
  protected val script: () => Any

  override def getTemplate: Modifier =
    div(
      content,
      button(
        onclick :+= ((_: Event) => {
          script()
          false
        })
      )("Run script")
    )
}
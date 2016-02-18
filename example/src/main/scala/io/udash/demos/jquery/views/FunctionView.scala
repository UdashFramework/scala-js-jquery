package io.udash.demos.jquery.views

import io.udash._
import org.scalajs.dom.{Element, Event}

abstract class FunctionView extends View {
  import scalatags.JsDom.all._

  protected val content: Element
  protected val script: () => Any

  override def getTemplate: Element = {
    div(
      content,
      button(
        onclick :+= ((_: Event) => {
          script()
          false
        })
      )("Run script")
    ).render
  }

  override def renderChild(view: View): Unit = {}
}
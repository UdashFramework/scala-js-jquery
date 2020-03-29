package io.udash.demos.jquery.views

import org.scalajs.dom.Event

abstract class FunctionView {

  import scalatags.JsDom.all._

  protected def content: Modifier

  protected def script: () => Any

  final def getTemplate: Modifier =
    div(
      content,
      button(
        onclick := ((_: Event) => {
          script()
          false
        })
      )("Run script")
    )
}
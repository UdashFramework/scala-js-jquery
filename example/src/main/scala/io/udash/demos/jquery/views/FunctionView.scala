package io.udash.demos.jquery.views

import org.scalajs.dom.{Element, Event}

abstract class FunctionView {

  import scalatags.JsDom.all._

  protected val content: Element

  protected def script: () => Any

  final def getTemplate: Modifier =
    div(
      content,
      h3(button(
        marginTop := 10.px,
        onclick := ((_: Event) => {
          script()
          false
        })
      )("Run script"))
    )
}
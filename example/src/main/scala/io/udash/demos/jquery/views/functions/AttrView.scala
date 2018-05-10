package io.udash.demos.jquery.views.functions

import io.udash._
import io.udash.demos.jquery.IndexState
import io.udash.demos.jquery.views.FunctionView
import io.udash.wrappers.jquery._
import org.scalajs.dom.{Element, Event}

object AttrViewPresenter extends StaticViewFactory[IndexState.type](() => new AttrView)

/** Based on examples from: <a href="http://api.jquery.com/animate/">jQuery Docs</a>. */
class AttrView extends FunctionView {
  import scalatags.JsDom.all._

  override protected val content = div(cls := "demo")(
    h3(".attr() & .prop()"),
    input(id := "check1", tpe := "checkbox", checked := "checked"),
    label(`for` := "check1")("Check me"),
    p(),
    button(onclick :+= ((_: Event) => {
      jQ(".demo input").attr("data-checked", "checked").trigger("change")
      false
    }))(".attr(\"data-checked\", \"checked\")"),
    button(onclick :+= ((_: Event) => {
      jQ(".demo input").attr("data-checked", "").trigger("change")
      false
    }))(".attr(\"data-checked\", \"\")"),
    button(onclick :+= ((_: Event) => {
      jQ(".demo input").attr("data-checked", null).trigger("change")
      false
    }))(".attr(\"data-checked\", null)"), br(),
    button(onclick :+= ((_: Event) => {
      jQ(".demo input").prop("checked", true).trigger("change")
      false
    }))(".prop(\"checked\", true)"),
    button(onclick :+= ((_: Event) => {
      jQ(".demo input").prop("checked", false).trigger("change")
      false
    }))(".prop(\"checked\", false)")
  ).render

  override protected val script = () => {
    jQ(".demo input").on(EventName.change, (input: Element, _: JQueryEvent) => {
      jQ(".demo p").html(
        s""".attr('data-checked'): ${jQ(input).attr("data-checked")}<br/>
           |.prop('checked'): ${jQ(input).prop("checked")}<br/>
           |.is(':checked'): ${jQ(input).is(":checked")}""".stripMargin
      )
    }).trigger("change")
  }
}
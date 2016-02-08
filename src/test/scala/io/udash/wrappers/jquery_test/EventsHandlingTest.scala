import org.scalajs.dom.Element
import org.scalajs.dom.html.Input
import org.scalatest.{Matchers, WordSpec}

class EventsHandlingTest extends WordSpec with Matchers {
  import io.udash.wrappers.jquery._

  import scalatags.JsDom.all._

  class C(i: Int)

  "jQuery" should {
    "handle JS events" in {
      val i = jQ(input().render)

      var event: JQueryEvent = null

      val callback: (Element, JQueryEvent) => Unit =
        (el: Element, ev: JQueryEvent) =>
          event = ev

      i.on("change", callback)

      i.trigger("change")
      event shouldNot be(null)

      i.off("change", callback)

      event = null
      i.trigger("change")
      event should be(null)
    }

    "handle JS events (inlined)" in {
      val i: Input = input().render
      var event: JQueryEvent = null

      val callback: (Element, JQueryEvent) => Unit =
        (el: Element, ev: JQueryEvent) =>
          event = ev

      jQ(i).on("change", callback)

      jQ(i).trigger("change")
      event shouldNot be(null)

      jQ(i).off("change", callback)

      event = null
      jQ(i).trigger("change")
      event should be(null)
    }

    "handle JS events (one)" in {
      val i: Input = input().render
      var event: JQueryEvent = null

      val callback: (Element, JQueryEvent) => Unit =
        (el: Element, ev: JQueryEvent) =>
          event = ev

      jQ(i).one("change", callback)

      jQ(i).trigger("change")
      event shouldNot be(null)

      event = null
      jQ(i).trigger("change")
      event should be(null)
    }
  }

}

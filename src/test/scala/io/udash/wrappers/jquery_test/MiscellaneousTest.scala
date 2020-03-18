package io.udash.wrappers.jquery_test

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MiscellaneousTest extends AnyWordSpec with Matchers {

  import io.udash.wrappers.jquery._
  import scalatags.JsDom.all._

  class C(i: Int)

  "jQuery" should {
    "keep data in DOM elements" in {
      val c = new C(5)
      val f = (i: Int) => i + 1

      val dom = div().render
      val selection = jQ(dom)
      selection.data(Map("key" -> "value", "int" -> 1, "cls" -> c, "func" -> f))

      selection.data().key should be("value")
      selection.data("key") should be(Some("value"))
      selection.data().int should be(1)
      selection.data("int") should be(Some(1))
      selection.data().cls should be(c)
      selection.data("cls") should be(Some(c))
      selection.data().func should be(f)
      selection.data("func") should be(Some(f))

      selection.data("nothing") should be(None)
    }

    "find element index in selection" in {
      val el1 = span.render
      val el2 = span(id := "id").render
      val el3 = h1.render
      val el4 = h1(cls := "lolzy").render
      val dom = div(el1, el2, el3).render

      val selection = jQ(dom).children()
      selection.index(el1) should be(0)
      selection.index(el2) should be(1)
      selection.index(jQ(el3)) should be(2)
      selection.index(el4) should be(-1)
    }

    "serialize objects to URL query string" in {
      import scala.scalajs.js
      import js.JSConverters._
      jQ.param(js.Dynamic.literal("a" -> Seq(1, 2, 3).toJSArray, "b" -> "c")) should be("a%5B%5D=1&a%5B%5D=2&a%5B%5D=3&b=c")
    }
  }

}

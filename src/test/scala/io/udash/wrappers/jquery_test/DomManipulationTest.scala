package io.udash.wrappers.jquery_test

import org.scalatest.{Matchers, WordSpec}

class DomManipulationTest extends WordSpec with Matchers {
  import io.udash.wrappers.jquery._
  import scalatags.JsDom.all._

  "jQuery" should {
    "set text content of DOM element" in {
      val text = "test 123"
      val dom = div().render

      jQ(dom).text() should be("")
      dom.textContent should be("")

      jQ(dom).text(text)

      jQ(dom).text() should be(text)
      dom.textContent should be(text)
    }

    "set content of DOM element" in {
      val text = "test 123"
      val dom = div().render
      val content = span(ul(li(text))).render

      jQ(dom).html() should be("")
      dom.textContent should be("")

      jQ(dom).html(content)

      jQ(dom).html() should be(s"<span><ul><li>$text</li></ul></span>")
      jQ(dom).text() should be(text)
      dom.textContent should be(text)
    }

    "set DOM element attribute" in {
      val attrName = "attr"
      val attrValue = "val"
      val dom = div().render

      jQ(dom).attr(attrName) should be(None)

      jQ(dom).attr(attrName, attrValue)

      jQ(dom).attr(attrName) should be(Some(attrValue))
      dom.getAttribute(attrName) should be(attrValue)
    }

    "manage DOM element CSS classes" in {
      val c1 = "c1"
      val c2 = "c2"
      val dom = div().render

      jQ(dom).addClass(c1)
      jQ(dom).addClass(c2)

      dom.className.split(" ") should contain(c1)
      dom.className.split(" ") should contain(c2)

      jQ(dom).removeClass(c2)

      dom.className.split(" ") should contain(c1)
      dom.className.split(" ") shouldNot contain(c2)

      jQ(dom).toggleClass(c1)
      jQ(dom).toggleClass(c2)

      dom.className.split(" ") shouldNot contain(c1)
      dom.className.split(" ") should contain(c2)

      jQ(dom).toggleClass(c1)
      jQ(dom).toggleClass(c2)

      dom.className.split(" ") should contain(c1)
      dom.className.split(" ") shouldNot contain(c2)
    }

    "show/hide DOM elements" in {
      val dom = div(
        h1("a"),
        span("b")
      ).render

      val h = jQ(dom).find("h1")
      val s = jQ(dom).find("span")

      h.hide()
      h.css("display") should be("none")
      s.css("display") shouldNot be("none")

      s.hide()
      h.css("display") should be("none")
      s.css("display") should be("none")

      h.show()
      s.show()
      h.css("display") shouldNot be("none")
      s.css("display") shouldNot be("none")
    }

    "remove DOM elements" in {
      val dom = div(
        h1("a"),
        span(cls :="c1")("b"),
        h1("a"),
        span("c"),
        h1("a"),
        span(cls :="c1")("d"),
        h1("a"),
        span("e", span("f"), "g")
      ).render

      val h = jQ(dom).find("h1")
      val s = jQ(dom).find("span")
      val c = jQ(dom).find(".c1")

      dom.childElementCount should be(8)
      dom.textContent should be("abacadaefg")

      h.remove()

      dom.childElementCount should be(4)
      dom.textContent should be("bcdefg")

      c.remove()

      dom.childElementCount should be(2)
      dom.textContent should be("cefg")

      s.remove()

      dom.childElementCount should be(0)
      dom.textContent should be("")
    }

    "remove childrens of DOM elements" in {
      val dom = div(
        h1("a"),
        span(cls :="c1")("b"),
        h1("a"),
        span("c"),
        h1("a"),
        span(cls :="c1")("d"),
        h1("a"),
        span("e", span("f"), "g")
      ).render

      val h = jQ(dom).find("h1")
      val s = jQ(dom).find("span")
      val c = jQ(dom).find(".c1")

      dom.childElementCount should be(8)
      dom.textContent should be("abacadaefg")

      h.empty()

      dom.childElementCount should be(8)
      dom.textContent should be("bcdefg")

      c.empty()

      dom.childElementCount should be(8)
      dom.textContent should be("cefg")

      s.empty()

      dom.childElementCount should be(8)
      dom.textContent should be("")
    }

    "append/prepend DOM elements" in {
      val dom = div(
        span(), span(), span(), span()
      ).render

      val s = jQ(dom).find("span")

      dom.childElementCount should be(4)
      dom.textContent should be("")

      s.append("a")

      dom.childElementCount should be(4)
      dom.textContent should be("aaaa")

      s.prepend("b")

      dom.childElementCount should be(4)
      dom.textContent should be("babababa")

      s.filter(":nth-child(2n)").append("c")

      dom.childElementCount should be(4)
      dom.textContent should be("babacbabac")

      s.filter(":nth-child(2n+1)").prepend("d")

      dom.childElementCount should be(4)
      dom.textContent should be("dbabacdbabac")
    }

    "append/prepend DOM element into another element" in {
      val dom = div().render

      jQ(span("a").render).appendTo(dom)

      dom.childElementCount should be(1)
      dom.textContent should be("a")

      jQ(span("b").render).appendTo(jQ(dom))

      dom.childElementCount should be(2)
      dom.textContent should be("ab")

      jQ(span("x").render).prependTo(jQ(dom))

      dom.childElementCount should be(3)
      dom.textContent should be("xab")

      jQ(span("y").render).prependTo(dom)

      dom.childElementCount should be(4)
      dom.textContent should be("yxab")
    }

    "manage input values" in {
      val dom = input().render

      jQ(dom).value("abc")
      jQ(dom).value() should be("abc")
      dom.value should be("abc")

      jQ(dom).value("cba")
      jQ(dom).value() should be("cba")
      dom.value should be("cba")
    }
  }

}

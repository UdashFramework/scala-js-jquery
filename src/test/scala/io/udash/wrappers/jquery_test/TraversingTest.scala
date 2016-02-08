package io.udash.wrappers.jquery_test

import org.scalatest.{Matchers, WordSpec}

class TraversingTest extends WordSpec with Matchers {
  import io.udash.wrappers.jquery._

  import scalatags.JsDom.all._

  "jQuery" should {
    "add elements to selection" in {
      val el1 = span.render
      val el2 = span.render
      val el3 = h1.render

      val j1 = jQ(el1)
      j1.each((el, _, _) => jQ(el).attr("a1", 1))
      val j2 = j1.add(el2)
      j2.each((el, _, _) => jQ(el).attr("a2", 1))
      val j3 = j2.add(el3)
      j3.each((el, _, _) => jQ(el).attr("a3", 1))

      jQ(el1).attr("a1") should be(Some("1"))
      jQ(el1).attr("a2") should be(Some("1"))
      jQ(el1).attr("a3") should be(Some("1"))

      jQ(el2).attr("a1") should be(None)
      jQ(el2).attr("a2") should be(Some("1"))
      jQ(el2).attr("a3") should be(Some("1"))

      jQ(el3).attr("a1") should be(None)
      jQ(el3).attr("a2") should be(None)
      jQ(el3).attr("a3") should be(Some("1"))
    }

    "iterate over a selection" in {
      val el1 = span.render
      val el2 = span.render
      val el3 = h1.render

      val selection = jQ(el1, el2, el3)
      selection.each((el, _, _) => jQ(el).attr("a", 1))

      jQ(el1).attr("a") should be(Some("1"))
      jQ(el2).attr("a") should be(Some("1"))
      jQ(el3).attr("a") should be(Some("1"))
    }

    "filter a selection" in {
      val el1 = span.render
      val el2 = span.render
      val el3 = h1.render

      val selection = jQ(el1, el2, el3)
      selection.filter("h1").each((el, _, _) => jQ(el).attr("a", 1))

      jQ(el1).attr("a") should be(None)
      jQ(el2).attr("a") should be(None)
      jQ(el3).attr("a") should be(Some("1"))
    }

    "find elements parent" in {
      val el1 = span.render
      val el2 = span.render
      val el3 = h1.render
      val p1 = div(el1).render
      val p2 = div(el2).render
      val p3 = div(el3).render

      val selection = jQ(el1, el2, el3)
      selection.parent().filter("div").length should be(3)
    }

    "find descendants" in {
      val el1 = span.render
      val el2 = span.render
      val el3 = h1.render
      val p1 = div(el1).render
      val p2 = div(el2).render
      val p3 = div(el3).render
      val p = div(p1, p2, p3).render

      jQ(p).find("span").length should be(2)
      jQ(p).find("div").length should be(3)
      jQ(p).find("h1").length should be(1)
    }

    "find elements parent (should be unique)" in {
      val el1 = span.render
      val el2 = span.render
      val el3 = h1.render
      val d = div(el1, el2, el3).render

      val selection = jQ(el1, el2, el3)
      selection.parent().filter("div").length should be(1)
    }

    "slice elements" in {
      val el1 = span.render
      val el2 = span.render
      val el3 = h1.render

      val selection = jQ(el1, el2, el3)
      selection.slice(1).get() should be(Seq(el2, el3))
      selection.slice(1, 2).get() should be(Seq(el2))
      selection.slice(0, 2).get() should be(Seq(el1, el2))
      selection.slice(0, 10).get() should be(Seq(el1, el2, el3))
      intercept[Exception](selection.slice(-2, 1).get() should be(Seq(el1)))
      intercept[Exception](selection.slice(1, 1).get() should be(Seq(el1)))
    }

    "find closest matching parent" in {
      val dom = div(
        div(cls := "a")(
          div(cls := "b")(
            span(cls := "d")
          ),
          div(cls := "b c")(
            span(cls := "e")
          )
        )
      ).render

      val root = jQ(dom)
      root.find("span").closest(".a").length should be(1)
      root.find("span").closest(".b").length should be(2)
      root.find("span").closest(".c").length should be(1)
      root.find("span").closest(".d").length should be(1)
      root.find("span").closest(".d").get(0).get.tagName.toLowerCase should be("span")
    }

    "find prev/next matching element" in {
      val dom = div(
        span("a"),
        span("b"),
        span(cls := "start")("c"),
        span("d"),
        span("e")
      ).render

      val root = jQ(dom).children(".start")
      root.prev().text() should be("b")
      root.prev("span").prev().text() should be("a")
      root.prev().prev().prev().length should be(0)
      root.next().text() should be("d")
      root.next().next().text() should be("e")
      root.next().next().next().length should be(0)
      root.prev("a").length should be(0)
    }

    "find first/last matching element" in {
      val dom = div(
        span("a"),
        span("b"),
        span(cls := "start")("c"),
        span("d"),
        span("e")
      ).render

      val root = jQ(dom)
      root.children("span").first().text() should be("a")
      root.children("span").last().text() should be("e")
      root.children(".start").first().text() should be("c")
      root.children(".start").last().text() should be("c")
      root.children("a").first().length should be(0)
      root.children("a").last().length should be(0)
    }
  }
}

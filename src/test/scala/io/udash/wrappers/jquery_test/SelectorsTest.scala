package io.udash.wrappers.jquery_test

import org.scalatest.{Matchers, WordSpec}

class SelectorsTest extends WordSpec with Matchers {
  import io.udash.wrappers.jquery._
  import scalatags.JsDom.all._

  "jQuery" should {
    "select elements by class" in {
      val el1 = span(cls := "c1").render
      val el2 = span(cls := "c1 c2").render
      val el3 = h1(cls := "c3").render
      val dom = div(el1, el2, el3).render

      jQ(dom).children(".c1").each((el, _) => jQ(el).attr("a1", 1))
      jQ(dom).children(".c2").each((el, _) => jQ(el).attr("a2", 1))
      jQ(dom).children(".c3").each((el, _) => jQ(el).attr("a3", 1))

      jQ(el1).attr("a1") should be(Some("1"))
      jQ(el1).attr("a2") should be(None)
      jQ(el1).attr("a3") should be(None)

      jQ(el2).attr("a1") should be(Some("1"))
      jQ(el2).attr("a2") should be(Some("1"))
      jQ(el2).attr("a3") should be(None)

      jQ(el3).attr("a1") should be(None)
      jQ(el3).attr("a2") should be(None)
      jQ(el3).attr("a3") should be(Some("1"))
    }

    "select elements by id" in {
      val el1 = span(id := "el1").render
      val el2 = span(id := "el2").render
      val el3 = h1(id := "el3").render
      val dom = div(el1, el2, el3).render

      jQ(dom).children("#el1").each((el, _) => jQ(el).attr("a1", 1))
      jQ(dom).children("#el2").each((el, _) => jQ(el).attr("a2", 1))
      jQ(dom).children("#el3").each((el, _) => jQ(el).attr("a3", 1))

      jQ(el1).attr("a1") should be(Some("1"))
      jQ(el1).attr("a2") should be(None)
      jQ(el1).attr("a3") should be(None)

      jQ(el2).attr("a1") should be(None)
      jQ(el2).attr("a2") should be(Some("1"))
      jQ(el2).attr("a3") should be(None)

      jQ(el3).attr("a1") should be(None)
      jQ(el3).attr("a2") should be(None)
      jQ(el3).attr("a3") should be(Some("1"))
    }
  }

}

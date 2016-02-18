package io.udash.wrappers.jquery

import scala.scalajs.js
import scala.scalajs.js.|

sealed trait TopLeftCoords {
  def top: Double
  def left: Double
  def toJSDictionary: js.Dictionary[Int | Double] =
    js.Dictionary[Int | Double]("top" -> top, "left" -> left)
}
case class Position(override val top: Double, override val left: Double) extends TopLeftCoords
case class Offset(override val top: Double, override val left: Double) extends TopLeftCoords

case class AnimationOptions(duration: Option[Int] = None, easing: Option[EasingFunction] = None, queue: Option[Boolean] = None,
                            step: (Int, js.Dynamic) => Any = null, progress: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Int, Int) => Any = null,
                            complete: () => Any = null, start: JQueryPromise[js.Function1[js.Any, js.Any], js.Any] => Any = null,
                            done: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Boolean) => Any = null,
                            fail: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Boolean) => Any = null,
                            always: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Boolean) => Any = null) {
  def toJSDictionary: js.Dictionary[Any] = {
    val r = js.Dictionary[Any]()
    if (duration.isDefined) r.update("duration", duration.get)
    if (easing.isDefined) r.update("easing", easing.get)
    if (queue.isDefined) r.update("queue", queue.get)
    if (step != null) r.update("step", step)
    if (progress != null) r.update("progress", progress)
    if (complete != null) r.update("complete", complete)
    if (start != null) r.update("start", start)
    if (done != null) r.update("done", done)
    if (fail != null) r.update("fail", fail)
    if (always != null) r.update("always", always)
    r
  }
}

/** Easing functions specify the speed at which an animation progresses at different points within the animation. <br/>
  * See: <a href="https://api.jqueryui.com/easings/">jQuery Docs</a> */
object EasingFunction {
  val linear = "linear"
  val swing = "swing"

  /* Require jQuery UI */
  val easeInQuad = "easeInQuad"
  val easeOutQuad = "easeOutQuad"
  val easeInOutQuad = "easeInOutQuad"
  val easeInCubic = "easeInCubic"
  val easeOutCubic = "easeOutCubic"
  val easeInOutCubic = "easeInOutCubic"
  val easeInQuart = "easeInQuart"
  val easeOutQuart = "easeOutQuart"
  val easeInOutQuart = "easeInOutQuart"
  val easeInQuint = "easeInQuint"
  val easeOutQuint = "easeOutQuint"
  val easeInOutQuint = "easeInOutQuint"
  val easeInExpo = "easeInExpo"
  val easeOutExpo = "easeOutExpo"
  val easeInOutExpo = "easeInOutExpo"
  val easeInSine = "easeInSine"
  val easeOutSine = "easeOutSine"
  val easeInOutSine = "easeInOutSine"
  val easeInCirc = "easeInCirc"
  val easeOutCirc = "easeOutCirc"
  val easeInOutCirc = "easeInOutCirc"
  val easeInElastic = "easeInElastic"
  val easeOutElastic = "easeOutElastic"
  val easeInOutElastic = "easeInOutElastic"
  val easeInBack = "easeInBack"
  val easeOutBack = "easeOutBack"
  val easeInOutBack = "easeInOutBack"
  val easeInBounce = "easeInBounce"
  val easeOutBounce = "easeOutBounce"
  val easeInOutBounce = "easeInOutBounce"
}

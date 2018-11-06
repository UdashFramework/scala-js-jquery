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

case class AnimationOptions(
  duration: Option[Int] = None,
  easing: Option[EasingFunction] = None,
  queue: Option[Boolean] = None,
  step: (Int, js.Dynamic) => Any = null,
  progress: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Int, Int) => Any = null,
  complete: () => Any = null,
  start: JQueryPromise[js.Function1[js.Any, js.Any], js.Any] => Any = null,
  done: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Boolean) => Any = null,
  fail: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Boolean) => Any = null,
  always: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Boolean) => Any = null
) {
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
  val linear: EasingFunction = "linear"
  val swing: EasingFunction = "swing"

  /* Require jQuery UI */
  val easeInQuad: EasingFunction = "easeInQuad"
  val easeOutQuad: EasingFunction = "easeOutQuad"
  val easeInOutQuad: EasingFunction = "easeInOutQuad"
  val easeInCubic: EasingFunction = "easeInCubic"
  val easeOutCubic: EasingFunction = "easeOutCubic"
  val easeInOutCubic: EasingFunction = "easeInOutCubic"
  val easeInQuart: EasingFunction = "easeInQuart"
  val easeOutQuart: EasingFunction = "easeOutQuart"
  val easeInOutQuart: EasingFunction = "easeInOutQuart"
  val easeInQuint: EasingFunction = "easeInQuint"
  val easeOutQuint: EasingFunction = "easeOutQuint"
  val easeInOutQuint: EasingFunction = "easeInOutQuint"
  val easeInExpo: EasingFunction = "easeInExpo"
  val easeOutExpo: EasingFunction = "easeOutExpo"
  val easeInOutExpo: EasingFunction = "easeInOutExpo"
  val easeInSine: EasingFunction = "easeInSine"
  val easeOutSine: EasingFunction = "easeOutSine"
  val easeInOutSine: EasingFunction = "easeInOutSine"
  val easeInCirc: EasingFunction = "easeInCirc"
  val easeOutCirc: EasingFunction = "easeOutCirc"
  val easeInOutCirc: EasingFunction = "easeInOutCirc"
  val easeInElastic: EasingFunction = "easeInElastic"
  val easeOutElastic: EasingFunction = "easeOutElastic"
  val easeInOutElastic: EasingFunction = "easeInOutElastic"
  val easeInBack: EasingFunction = "easeInBack"
  val easeOutBack: EasingFunction = "easeOutBack"
  val easeInOutBack: EasingFunction = "easeInOutBack"
  val easeInBounce: EasingFunction = "easeInBounce"
  val easeOutBounce: EasingFunction = "easeOutBounce"
  val easeInOutBounce: EasingFunction = "easeInOutBounce"
}

object EventName {
  val blur: EventName = "blur"
  val change: EventName = "change"
  val click: EventName = "click"
  val contextMenu: EventName = "contextmenu"
  val dblClick: EventName = "dblclick"
  val focus: EventName = "focus"
  val focusIn: EventName = "focusin"
  val focusOut: EventName = "focusout"
  val keyDown: EventName = "keydown"
  val keyPress: EventName = "keypress"
  val keyUp: EventName = "keyup"
  val mouseDown: EventName = "mousedown"
  val mouseEnter: EventName = "mouseenter"
  val mouseLeave: EventName = "mouseleave"
  val mouseMove: EventName = "mousemove"
  val mouseOut: EventName = "mouseout"
  val mouseover: EventName = "mouseover"
  val mouseUp: EventName = "mouseup"
  val resize: EventName = "resize"
  val scroll: EventName = "scroll"
  val select: EventName = "select"
  val submit: EventName = "submit"
}
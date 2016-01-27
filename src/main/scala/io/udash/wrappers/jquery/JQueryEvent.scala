package io.udash.wrappers.jquery

import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait JQueryEvent extends Event {
  /** The current DOM element within the event bubbling phase.<br/>
    * See: <a href="http://api.jquery.com/event.currentTarget/">jQuery Docs</a> */
  override def currentTarget: EventTarget = js.native

  /** An optional object of data passed to an event method when the current executing handler is bound.<br/>
    * See: <a href="http://api.jquery.com/event.data/">jQuery Docs</a> */
  def data: js.Any = js.native

  /** The element where the currently-called jQuery event handler was attached.<br/>
    * See: <a href="http://api.jquery.com/event.delegateTarget/">jQuery Docs</a> */
  def delegateTarget: Element = js.native

  /** Returns whether event.preventDefault() was ever called on this event object.<br/>
    * See: <a href="http://api.jquery.com/event.isDefaultPrevented/">jQuery Docs</a> */
  def isDefaultPrevented: Boolean = js.native

  /** Returns whether event.stopImmediatePropagation() was ever called on this event object.<br/>
    * See: <a href="http://api.jquery.com/event.isImmediatePropagationStopped/">jQuery Docs</a> */
  def isImmediatePropagationStopped: Boolean = js.native

  /** Returns whether event.stopPropagation() was ever called on this event object.<br/>
    * See: <a href="http://api.jquery.com/event.isPropagationStopped/">jQuery Docs</a> */
  def isPropagationStopped: Boolean = js.native

  /** Indicates whether the META key was pressed when the event fired.<br/>
    * See: <a href="http://api.jquery.com/event.metaKey/">jQuery Docs</a> */
  def metaKey: js.Any = js.native

  /** The namespace specified when the event was triggered.<br/>
    * See: <a href="http://api.jquery.com/event.namespace/">jQuery Docs</a> */
  def namespace: String = js.native

  /** The mouse position relative to the left edge of the document.<br/>
    * See: <a href="http://api.jquery.com/event.pageX/">jQuery Docs</a> */
  def pageX: Double = js.native

  /** The mouse position relative to the top edge of the document.<br/>
    * See: <a href="http://api.jquery.com/event.pageY/">jQuery Docs</a> */
  def pageY: Double = js.native

  /** If this method is called, the default action of the event will not be triggered.<br/>
    * See: <a href="http://api.jquery.com/event.preventDefault/">jQuery Docs</a> */
  override def preventDefault(): Unit = js.native

  /** The other DOM element involved in the event, if any.<br/>
    * See: <a href="http://api.jquery.com/event.relatedTarget/">jQuery Docs</a> */
  def relatedTarget: Element = js.native

  /** The last value returned by an event handler that was triggered by this event, unless the value was undefined.<br/>
    * See: <a href="http://api.jquery.com/event.result/">jQuery Docs</a> */
  def result: js.Any = js.native

  /** Keeps the rest of the handlers from being executed and prevents the event from bubbling up the DOM tree.<br/>
    * See: <a href="http://api.jquery.com/event.stopImmediatePropagation/">jQuery Docs</a> */
  override def stopImmediatePropagation(): Unit = js.native

  /** Prevents the event from bubbling up the DOM tree, preventing any parent handlers from being notified of the event.<br/>
    * See: <a href="http://api.jquery.com/event.stopPropagation/">jQuery Docs</a> */
  override def stopPropagation(): Unit = js.native

  /** The DOM element that initiated the event.<br/>
    * See: <a href="http://api.jquery.com/event.target/">jQuery Docs</a> */
  override def target: EventTarget = js.native

  /** The difference in milliseconds between the time the browser created the event and January 1, 1970.<br/>
    * See: <a href="http://api.jquery.com/event.timeStamp/">jQuery Docs</a> */
  override def timeStamp: Double = js.native

  /** Describes the nature of the event.<br/>
    * See: <a href="http://api.jquery.com/event.type/">jQuery Docs</a> */
  override def `type`: String = js.native

  /** Describes the nature of the event.<br/>
    * See: <a href="http://api.jquery.com/event.type/">jQuery Docs</a> */
  @JSName("type")
  def tpe: String = js.native

  /** For key or mouse events, this property indicates the specific key or button that was pressed.<br/>
    * See: <a href="http://api.jquery.com/event.which/">jQuery Docs</a> */
  def which: Int = js.native
}

package io.udash.wrappers.jquery

import org.scalajs.dom._

import scala.collection.mutable
import scala.concurrent.duration.Duration
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{Dictionary, ThisFunction1, UndefOr}

@js.native
trait JQuery extends js.Object {
  import scala.scalajs.js.`|`

  /** Create a new jQuery object with elements added to the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/add/">jQuery Docs</a> */
  def add(selectorOrHtml: Selector): JQuery = js.native

  /** Create a new jQuery object with elements added to the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/add/">jQuery Docs</a> */
  def add(elements: Element*): JQuery = js.native

  /** Create a new jQuery object with elements added to the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/add/">jQuery Docs</a> */
  def add(selection: JQuery): JQuery = js.native

  /** Create a new jQuery object with elements added to the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/add/">jQuery Docs</a> */
  def add(selectorOrHtml: Selector, context: Element): JQuery = js.native

  /** Add the previous set of elements on the stack to the current set, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/addBack/">jQuery Docs</a> */
  def addBack(selector: Selector*): JQuery = js.native

  /** Adds the specified class(es) to each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/addClass/">jQuery Docs</a> */
  def addClass(className: String): JQuery = js.native

  /** Adds the specified class(es) to each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/addClass/">jQuery Docs</a> */
  private[jquery] def addClass(function: js.Function1[Int, String]): JQuery = js.native

  /** Adds the specified class(es) to each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/addClass/">jQuery Docs</a> */
  private[jquery] def addClass(function: js.Function2[Int, String, String]): JQuery = js.native

  /** Insert content, specified by the parameter, after each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/after/">jQuery Docs</a> */
  def after(content: (Selector | Element | JQuery)*): JQuery = js.native

  /** Insert content, specified by the parameter, after each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/after/">jQuery Docs</a> */
  def after(function: js.Function2[Int, String, String | Element | JQuery]): JQuery = js.native

  /** Perform a custom animation of a set of CSS properties. <br/>
    * See: <a href="http://api.jquery.com/animate/">jQuery Docs</a> */
  private[jquery] def animate(properties: js.Dictionary[Any], duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Perform a custom animation of a set of CSS properties. <br/>
    * See: <a href="http://api.jquery.com/animate/">jQuery Docs</a> */
  private[jquery] def animate(properties: js.Dictionary[Any], options: js.Dictionary[Any]): JQuery = js.native

  /** Insert content, specified by the parameter, to the end of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/append/">jQuery Docs</a> */
  def append(content: (String | Element | JQuery)*): JQuery = js.native

  /** Insert content, specified by the parameter, to the end of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/append/">jQuery Docs</a> */
  private[jquery] def append(function: js.ThisFunction2[Element, Int, String, Any]): JQuery = js.native

  /** Insert every element in the set of matched elements to the end of the target. <br/>
    * See: <a href="http://api.jquery.com/appendTo/">jQuery Docs</a> */
  def appendTo(target: (Selector | Element | JQuery)*): JQuery = js.native

  /** Get the value of an attribute for the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/attr/#attr-attributeName">jQuery Docs</a> */
  private[jquery] def attr(attributeName: String): UndefOr[String] = js.native

  /** Set one or more attributes for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/attr/#attr-attributeName-value">jQuery Docs</a> */
  private[jquery] def attr(attributes: js.Dictionary[String | Double]): JQuery = js.native

  /** Set one or more attributes for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/attr/#attr-attributeName-value">jQuery Docs</a> */
  private[jquery] def attr(attributeName: String, attributeValue: String | Double): JQuery = js.native

  /** Set one or more attributes for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/attr/#attr-attributeName-value">jQuery Docs</a> */
  private[jquery] def attr(attributeName: String, function: js.Function2[Int, String, String | Double]): JQuery = js.native

  /** Insert content, specified by the parameter, before each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/before/">jQuery Docs</a> */
  def before(content: (String | Element | JQuery)*): JQuery = js.native

  /** Insert content, specified by the parameter, before each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/before/">jQuery Docs</a> */
  private[jquery] def before(content: js.Function2[Int, String, String | Element | JQuery]): JQuery = js.native

  /** Trigger blur event on an element. <br/>
    * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
  def blur(): JQuery = js.native

  /** Trigger change event on an element. <br/>
    * See: <a href="http://api.jquery.com/change/">jQuery Docs</a> */
  def change(): JQuery = js.native

  /** Get the children of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/children/">jQuery Docs</a> */
  def children(): JQuery = js.native

  /** Get the children of each element in the set of matched elements filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/children/">jQuery Docs</a> */
  def children(selector: Selector): JQuery = js.native

  /** Remove from the queue all items that have not yet been run. <br/>
    * See: <a href="http://api.jquery.com/clearQueue/">jQuery Docs</a> */
  def clearQueue(): JQuery = js.native

  /** Remove from the queue all items that have not yet been run. <br/>
    * See: <a href="http://api.jquery.com/clearQueue/">jQuery Docs</a> */
  def clearQueue(queueName: String): JQuery = js.native

  /** Trigger click event on an element. <br/>
    * See: <a href="http://api.jquery.com/click/">jQuery Docs</a> */
  def click(): JQuery = js.native

  /** Create a deep copy of the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/clone/">jQuery Docs</a> */
  def clone(withDataAndEvent: Boolean = js.native, deepWithDataAndEvents: Boolean = js.native): JQuery = js.native

  /** For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree. <br/>
    * See: <a href="http://api.jquery.com/closest/">jQuery Docs</a> */
  def closest(selector: String | Element | JQuery): JQuery = js.native

  /** For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree. <br/>
    * See: <a href="http://api.jquery.com/closest/">jQuery Docs</a> */
  def closest(selector: String, context: Element): JQuery = js.native

  /** Get the children of each element in the set of matched elements, including text and comment nodes. <br/>
    * See: <a href="http://api.jquery.com/contents/">jQuery Docs</a> */
  def contents(): JQuery = js.native

  /** Trigger contextmenu event on an element. <br/>
    * See: <a href="http://api.jquery.com/contextmenu/">jQuery Docs</a> */
  @JSName("contextmenu")
  def contextMenu(): JQuery = js.native

  /** Get the computed style properties for the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/css/#css-propertyName">jQuery Docs</a> */
  def css(propertyNames: String*): JQuery = js.native

  /** Set one or more CSS properties for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/css/#css-propertyName-value">jQuery Docs</a> */
  private[jquery] def css(attributeName: String, attributeValue: String | Int): JQuery = js.native

  /** Set one or more CSS properties for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/css/#css-propertyName-value">jQuery Docs</a> */
  private[jquery] def css(attributeName: String, attributeFun: js.Function2[Int, String, String | Int]): JQuery = js.native

  /** Set one or more CSS properties for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/css/#css-propertyName-value">jQuery Docs</a> */
  private[jquery] def css(properties: js.Dictionary[String | Int]): JQuery = js.native

  /** Store arbitrary data associated with the matched elements. <br/>
    * See: <a href="http://api.jquery.com/data/#data-key-value">jQuery Docs</a> */
  def data(key: String, value: Any): JQuery = js.native

  /** Store arbitrary data associated with the matched elements. <br/>
    * See: <a href="http://api.jquery.com/data/#data-key-value">jQuery Docs</a> */
  private[jquery] def data(obj: js.Dictionary[Any]): JQuery = js.native

  /** Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute. <br/>
    * See: <a href="http://api.jquery.com/data/#data-key">jQuery Docs</a> */
  def data(): js.Dynamic = js.native

  /** Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute. <br/>
    * See: <a href="http://api.jquery.com/data/#data-key">jQuery Docs</a> */
  private[jquery] def data(key: String): UndefOr[Any] = js.native

  /** Trigger dblclick event on an element. <br/>
    * See: <a href="http://api.jquery.com/dblclick/">jQuery Docs</a> */
  @JSName("dblclick")
  def dblClick(): JQuery = js.native

  /** Set a timer to delay execution of subsequent items in the queue. <br/>
    * See: <a href="http://api.jquery.com/delay/">jQuery Docs</a> */
  def delay(duration: Int, queueName: String = js.native): JQuery = js.native

  /** Execute the next function on the queue for the matched elements. <br/>
    * See: <a href="http://api.jquery.com/dequeue/">jQuery Docs</a> */
  def dequeue(queueName: String = js.native): JQuery = js.native

  /** Remove the set of matched elements from the DOM. <br/>
    * See: <a href="http://api.jquery.com/detach/">jQuery Docs</a> */
  def detach(selector: Selector): JQuery = js.native

  /** Iterate over a jQuery object, executing a function for each matched element. <br/>
    * See: <a href="http://api.jquery.com/each/">jQuery Docs</a> */
  private[jquery] def each(function: js.ThisFunction2[Element, Int, Element, Any]): JQuery = js.native

  /** Remove all child nodes of the set of matched elements from the DOM. <br/>
    * See: <a href="http://api.jquery.com/empty/">jQuery Docs</a> */
  def empty(): JQuery = js.native

  /** End the most recent filtering operation in the current chain and return the set of matched elements to its previous state. <br/>
    * See: <a href="http://api.jquery.com/end/">jQuery Docs</a> */
  def end(): JQuery = js.native

  /** Reduce the set of matched elements to the one at the specified index. <br/>
    * See: <a href="http://api.jquery.com/eq/">jQuery Docs</a> */
  @deprecated("Use `at(Int)` instead.", "0.1.0")
  def eq(index: Int): JQuery = js.native

  /** Reduce the set of matched elements to the one at the specified index. <br/>
    * See: <a href="http://api.jquery.com/eq/">jQuery Docs</a> */
  @JSName("eq")
  def at(index: Int): JQuery = js.native

  /** Display the matched elements by fading them to opaque. <br/>
    * See: <a href="http://api.jquery.com/fadeIn/">jQuery Docs</a> */
  def fadeIn(duration: Int = js.native, easing: String = js.native): JQuery = js.native

  /** Display the matched elements by fading them to opaque. <br/>
    * See: <a href="http://api.jquery.com/fadeIn/">jQuery Docs</a> */
  private[jquery] def fadeIn(duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Display the matched elements by fading them to opaque. <br/>
    * See: <a href="http://api.jquery.com/fadeIn/">jQuery Docs</a> */
  private[jquery] def fadeIn(options: js.Dictionary[Any]): JQuery = js.native

  /** Hide the matched elements by fading them to transparent. <br/>
    * See: <a href="http://api.jquery.com/fadeOut/">jQuery Docs</a> */
  def fadeOut(duration: Int = js.native, easing: String = js.native): JQuery = js.native

  /** Hide the matched elements by fading them to transparent. <br/>
    * See: <a href="http://api.jquery.com/fadeOut/">jQuery Docs</a> */
  private[jquery] def fadeOut(duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Hide the matched elements by fading them to transparent. <br/>
    * See: <a href="http://api.jquery.com/fadeOut/">jQuery Docs</a> */
  private[jquery] def fadeOut(options: js.Dictionary[Any]): JQuery = js.native

  /** Adjust the opacity of the matched elements. <br/>
    * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
  def fadeTo(duration: Int, opacity: Double): JQuery = js.native

  /** Adjust the opacity of the matched elements. <br/>
    * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
  private[jquery] def fadeTo(duration: Int, opacity: Double, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Adjust the opacity of the matched elements. <br/>
    * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
  def fadeTo(duration: Int, opacity: Double, easing: String): JQuery = js.native

  /** Adjust the opacity of the matched elements. <br/>
    * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
  private[jquery] def fadeTo(duration: Int, opacity: Double, easing:String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Display or hide the matched elements by animating their opacity. <br/>
    * See: <a href="http://api.jquery.com/fadeToggle/">jQuery Docs</a> */
  def fadeToggle(duration: Int = js.native, easing: String = js.native): JQuery = js.native

  /** Display or hide the matched elements by animating their opacity. <br/>
    * See: <a href="http://api.jquery.com/fadeToggle/">jQuery Docs</a> */
  private[jquery] def fadeToggle(duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Display or hide the matched elements by animating their opacity. <br/>
    * See: <a href="http://api.jquery.com/fadeToggle/">jQuery Docs</a> */
  private[jquery] def fadeToggle(options: js.Dictionary[Any]): JQuery = js.native

  /** Reduce the set of matched elements to those that match the selector or pass the function's test. <br/>
    * See: <a href="http://api.jquery.com/filter/">jQuery Docs</a> */
  def filter(selector: Selector | JQuery): JQuery = js.native

  /** Reduce the set of matched elements to those that match the selector or pass the function's test. <br/>
    * See: <a href="http://api.jquery.com/filter/">jQuery Docs</a> */
  def filter(elements: Element*): JQuery = js.native

  /** Reduce the set of matched elements to those that match the selector or pass the function's test. <br/>
    * See: <a href="http://api.jquery.com/filter/">jQuery Docs</a> */
  private[jquery] def filter(function: js.ThisFunction2[Element, Int, Element, Boolean]): JQuery = js.native

  /** Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element. <br/>
    * See: <a href="http://api.jquery.com/find/">jQuery Docs</a> */
  def find(selector: String | Element | JQuery): JQuery = js.native

  /** Stop the currently-running animation, remove all queued animations, and complete all animations for the matched elements. <br/>
    * See: <a href="http://api.jquery.com/finish/">jQuery Docs</a> */
  def finish(queue: String = js.native): JQuery = js.native

  /** Reduce the set of matched elements to the first in the set. <br/>
    * See: <a href="http://api.jquery.com/first/">jQuery Docs</a> */
  def first(): JQuery = js.native

  /** Trigger focus event on an element. <br/>
    * See: <a href="http://api.jquery.com/focus/">jQuery Docs</a> */
  def focus(): JQuery = js.native

  /** Trigger focusin event on an element. <br/>
    * See: <a href="http://api.jquery.com/focusin/">jQuery Docs</a> */
  @JSName("focusin")
  def focusIn(): JQuery = js.native

  /** Trigger focusout event on an element. <br/>
    * See: <a href="http://api.jquery.com/focusout/">jQuery Docs</a> */
  @JSName("focusout")
  def focusOut(): JQuery = js.native

  /** Retrieve one of the elements matched by the jQuery object. <br/>
    * See: <a href="http://api.jquery.com/get/#get-index">jQuery Docs</a> */
  private[jquery] def get(index: Int): UndefOr[Element] = js.native

  /** Retrieve the elements matched by the jQuery object. <br/>
    * See: <a href="http://api.jquery.com/get/#get">jQuery Docs</a> */
  private[jquery] def get(): js.Array[Element] = js.native

  /** Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element. <br/>
    * See: <a href="http://api.jquery.com/has/">jQuery Docs</a> */
  def has(selector: String | Element): JQuery = js.native

  /** Determine whether any of the matched elements are assigned the given class. <br/>
    * See: <a href="http://api.jquery.com/hasClass/">jQuery Docs</a> */
  def hasClass(className: String):Boolean = js.native

  /** Get the current computed height for the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/height/">jQuery Docs</a> */
  def height(): Double = js.native

  /** Set the CSS height of every matched element. <br/>
    * See: <a href="http://api.jquery.com/height/#height-value">jQuery Docs</a> */
  def height(value: String | Double): JQuery = js.native

  /** Set the CSS height of every matched element. <br/>
    * See: <a href="http://api.jquery.com/height/#height-value">jQuery Docs</a> */
  private[jquery] def height(function: js.ThisFunction2[Element, Int, Int, String | Double]): JQuery = js.native

  /** Hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
  def hide(duration: Int = js.native, easing: String = js.native): JQuery = js.native

  /** Hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
  private[jquery] def hide(duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
  private[jquery] def hide(options: js.Dictionary[Any]): JQuery = js.native

  /** Get the HTML contents of the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/html/">jQuery Docs</a> */
  def html(): String = js.native

  /** Set the HTML contents of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/html/">jQuery Docs</a> */
  def html(content: String | Element): JQuery = js.native

  /** Search for a given element from among the matched elements. <br/>
    * See: <a href="http://api.jquery.com/index/">jQuery Docs</a> */
  def index(): Int = js.native

  /** Search for a given element from among the matched elements. If the element is not found, this method will return -1. <br/>
    * See: <a href="http://api.jquery.com/index/">jQuery Docs</a> */
  def index(selector: Selector | Element | JQuery): Int = js.native

  /** Get the current computed height for the first element in the set of matched elements, including padding but not border. <br/>
    * See: <a href="http://api.jquery.com/innerHeight/">jQuery Docs</a> */
  def innerHeight(): Double = js.native

  /** Set the CSS inner height of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/innerHeight/#innerHeight-value">jQuery Docs</a> */
  def innerHeight(value: Double | String): JQuery = js.native

  /** Set the CSS inner height of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/innerHeight/#innerHeight-value">jQuery Docs</a> */
  private[jquery] def innerHeight(function: js.ThisFunction2[Element, Int, Double, Double | String]): JQuery = js.native

  /** Get the current computed inner width for the first element in the set of matched elements, including padding but not border. <br/>
    * See: <a href="http://api.jquery.com/innerWidth/">jQuery Docs</a> */
  def innerWidth(): Double = js.native

  /** Set the CSS inner width of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/innerWidth/#innerWidth-value">jQuery Docs</a> */
  def innerWidth(value: Double | String): JQuery = js.native

  /** Set the CSS inner width of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/innerWidth/#innerWidth-value">jQuery Docs</a> */
  private[jquery] def innerWidth(function: js.ThisFunction2[Element, Int, Double, Double | String]): JQuery = js.native

  /** Insert every element in the set of matched elements after the target. <br/>
    * See: <a href="http://api.jquery.com/insertAfter/">jQuery Docs</a> */
  def insertAfter(selector: String | Element | JQuery): JQuery = js.native

  /** Insert every element in the set of matched elements before the target. <br/>
    * See: <a href="http://api.jquery.com/insertBefore/">jQuery Docs</a> */
  def insertBefore(selector: String | Element | JQuery): JQuery = js.native

  /** Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments. <br/>
    * See: <a href="http://api.jquery.com/is/">jQuery Docs</a> */
  def is(selector: String | Element | JQuery): Boolean = js.native

  /** Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments. <br/>
    * See: <a href="http://api.jquery.com/is/">jQuery Docs</a> */
  private[jquery] def is(function: js.ThisFunction2[Element, Int, Element, Boolean]): Boolean = js.native

  /** A string containing the jQuery version number. <br/>
    * See: <a href="http://api.jquery.com/jquery/">jQuery Docs</a> */
  def jquery: String = js.native

  /** Trigger keydown event on an element. <br/>
    * See: <a href="http://api.jquery.com/keydown/">jQuery Docs</a> */
  @JSName("keydown")
  def keyDown(): JQuery = js.native

  /** Trigger keypress event on an element. <br/>
    * See: <a href="http://api.jquery.com/keypress/">jQuery Docs</a> */
  @JSName("keypress")
  def keyPress(): JQuery = js.native

  /** Trigger keyup event on an element. <br/>
    * See: <a href="http://api.jquery.com/keyup/">jQuery Docs</a> */
  @JSName("keyup")
  def keyUp(): JQuery = js.native

  /** Reduce the set of matched elements to the final one in the set. <br/>
    * See: <a href="http://api.jquery.com/last/">jQuery Docs</a> */
  def last(): JQuery = js.native

  /** The number of elements in the jQuery object. <br/>
    * See: <a href="http://api.jquery.com/length/">jQuery Docs</a> */
  def length: Int = js.native

  /** Load data from the server and place the returned HTML into the matched element. <br/>
    * See: <a href="http://api.jquery.com/load/">jQuery Docs</a> */
  def load(url: String, data: js.Any = js.native): JQuery = js.native

  /** Load data from the server and place the returned HTML into the matched element. <br/>
    * See: <a href="http://api.jquery.com/load/">jQuery Docs</a> */
  private[jquery] def load(url: String, data: js.Any, callback: js.ThisFunction3[Element, String, String, JQueryXHR, Any]): JQuery = js.native

  /** Pass each element in the current matched set through a function, producing a new jQuery object containing the return values. <br/>
    * See: <a href="http://api.jquery.com/map/">jQuery Docs</a> */
  private[jquery] def map(callback: js.Function2[Int, Element, Any]): JQuery = js.native

  /** Trigger mousedown event on an element. <br/>
    * See: <a href="http://api.jquery.com/mousedown/">jQuery Docs</a> */
  @JSName("mousedown")
  def mouseDown(): JQuery = js.native

  /** Trigger mouseenter event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseenter/">jQuery Docs</a> */
  @JSName("mouseenter")
  def mouseEnter(): JQuery = js.native

  /** Trigger mouseleave event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseleave/">jQuery Docs</a> */
  @JSName("mouseleave")
  def mouseLeave(): JQuery = js.native

  /** Trigger mousemove event on an element. <br/>
    * See: <a href="http://api.jquery.com/mousemove/">jQuery Docs</a> */
  @JSName("mousemove")
  def mouseMove(): JQuery = js.native

  /** Trigger mouseout event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseout/">jQuery Docs</a> */
  @JSName("mouseout")
  def mouseOut(): JQuery = js.native

  /** Trigger mouseover event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseover/">jQuery Docs</a> */
  @JSName("mouseover")
  def mouseOver(): JQuery = js.native

  /** Trigger mouseup event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseup/">jQuery Docs</a> */
  @JSName("mouseup")
  def mouseUp(): JQuery = js.native

  /** Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector. <br/>
    * See: <a href="http://api.jquery.com/next/">jQuery Docs</a> */
  def next(selector: Selector = js.native): JQuery = js.native

  /** Get all following siblings of each element in the set of matched elements, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/nextAll/">jQuery Docs</a> */
  def nextAll(selector: Selector = js.native): JQuery = js.native

  /** Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed. <br/>
    * See: <a href="http://api.jquery.com/nextUntil/">jQuery Docs</a> */
  def nextUntil(selector: Selector | Element | JQuery = js.native, filter: Selector = js.native): JQuery = js.native

  /** Remove elements from the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/not/">jQuery Docs</a> */
  def not(selector: String | JQuery): JQuery = js.native

  /** Remove elements from the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/not/">jQuery Docs</a> */
  def not(el: Element*): JQuery = js.native

  /** Remove elements from the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/not/">jQuery Docs</a> */
  private[jquery] def not(function: js.ThisFunction2[Element, Int, Element, Boolean]): JQuery = js.native

  /** Remove an event handler. <br/>
    * See: <a href="http://api.jquery.com/off/">jQuery Docs</a> */
  def off(): JQuery = js.native

  /** Remove an event handler. <br/>
    * See: <a href="http://api.jquery.com/off/">jQuery Docs</a> */
  def off(events: String): JQuery = js.native

  /** Remove an event handler. <br/>
    * See: <a href="http://api.jquery.com/off/">jQuery Docs</a> */
  def off(jEvent: JQueryEvent, selector: String = js.native): JQuery = js.native

  // Don't use this method directly. Use CallbackRegistration::unregister() returned from on() instead
  private[jquery] def off(events: String, callback: js.ThisFunction1[Element, JQueryEvent, Any]): JQuery = js.native

  /** Get the current coordinates of the first element in the set of matched elements, relative to the document. <br/>
    * See: <a href="http://api.jquery.com/offset/">jQuery Docs</a> */
  private[jquery] def offset(): js.Dictionary[Double] = js.native

  /** Get the current coordinates of the first element in the set of matched elements, relative to the document. <br/>
    * See: <a href="http://api.jquery.com/offset/">jQuery Docs</a> */
  private[jquery] def offset(coordinates: js.Dictionary[Double]): JQuery = js.native

  /** Get the closest ancestor element that is positioned. <br/>
    * See: <a href="http://api.jquery.com/offsetParent/">jQuery Docs</a> */
  def offsetParent(): JQuery = js.native

  /** Attach an event handler function for one or more events to the selected elements. <br/>
    * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
  private[jquery] def on(events: String, callback: js.ThisFunction1[Element, JQueryEvent, Any]): JQuery = js.native

  /** Attach an event handler function for one or more events to the selected elements. <br/>
    * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
  private[jquery] def on(events: String, data: js.Any, callback: js.ThisFunction1[Element, JQueryEvent, Any]): JQuery = js.native

  /** Attach an event handler function for one or more events to the selected elements. <br/>
    * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
  private[jquery] def on(events: String, selector: String, callback: js.ThisFunction1[Element, JQueryEvent, Any]): JQuery = js.native

  /** Attach an event handler function for one or more events to the selected elements. <br/>
    * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
  private[jquery] def on(events: String, selector: String, data: js.Any, callback: js.ThisFunction1[Element, JQueryEvent, Any]): JQuery = js.native

  /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
    * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
  private[jquery] def one(events: String, callback: js.ThisFunction1[Element, JQueryEvent, Any]): JQuery = js.native

  /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
    * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
  private[jquery] def one(events: String, data: js.Any, callback: js.ThisFunction1[Element, JQueryEvent, Any]): JQuery = js.native

  /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
    * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
  private[jquery] def one(events: String, selector: String, callback: js.ThisFunction1[Element, JQueryEvent, Any]): JQuery = js.native

  /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
    * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
  private[jquery] def one(events: String, selector: String, data: js.Any, callback: js.ThisFunction1[Element, JQueryEvent, Any]): JQuery = js.native

  /** Get the current computed height for the first element in the set of matched elements, including padding, border, and optionally margin. Returns a number (without "px") representation of the value or null if called on an empty set of elements. <br/>
    * See: <a href="http://api.jquery.com/outerHeight/">jQuery Docs</a> */
  def outerHeight(includeMargin: Boolean = js.native): Double = js.native

  /** Set the CSS outer Height of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/outerHeight/">jQuery Docs</a> */
  def outerHeight(value: Double | String): JQuery = js.native

  /** Set the CSS outer Height of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/outerHeight/">jQuery Docs</a> */
  private[jquery] def outerHeight(function: js.ThisFunction2[Element, Int, Double, Double]): JQuery = js.native

  /** Get the current computed width for the first element in the set of matched elements, including padding and border. <br/>
    * See: <a href="http://api.jquery.com/outerWidth/">jQuery Docs</a> */
  def outerWidth(includeMargin: Boolean = js.native): Double = js.native

  /** Set the CSS outer width of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/outerWidth/">jQuery Docs</a> */
  def outerWidth(value: Double | String): JQuery = js.native

  /** Set the CSS outer width of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/outerWidth/">jQuery Docs</a> */
  private[jquery] def outerWidth(function: js.ThisFunction2[Element, Int, Double, Double]): JQuery = js.native

  /** Get the parent of each element in the current set of matched elements, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/parent/">jQuery Docs</a> */
  def parent(selector: Selector = js.native): JQuery = js.native

  /** Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/parents/">jQuery Docs</a> */
  def parents(selector: Selector = js.native): JQuery = js.native

  /** Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object. <br/>
    * See: <a href="http://api.jquery.com/parentsUntil/">jQuery Docs</a> */
  def parentsUntil(selector: Selector | Element | JQuery = js.native, filter: Selector = js.native): JQuery = js.native

  /** Get the current coordinates of the first element in the set of matched elements, relative to the offset parent. <br/>
    * See: <a href="http://api.jquery.com/position/">jQuery Docs</a> */
  private[jquery] def position(): js.Dictionary[Double] = js.native

  /** Insert content, specified by the parameter, to the beginning of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/prepend/">jQuery Docs</a> */
  def prepend(content: (String | Element | JQuery)*): JQuery = js.native

  /** Insert content, specified by the parameter, to the beginning of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/prepend/">jQuery Docs</a> */
  private[jquery] def prepend(function: js.ThisFunction2[Element, Int, String, Any]): JQuery = js.native

  /** Insert every element in the set of matched elements to the beginning of the target. <br/>
    * See: <a href="http://api.jquery.com/prependTo/">jQuery Docs</a> */
  def prependTo(target: (Selector | Element | JQuery)*): JQuery = js.native

  /** Get the immediately preceding sibling of each element in the set of matched elements, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/prev/">jQuery Docs</a> */
  def prev(selector: Selector = js.native): JQuery = js.native

  /** Get all preceding siblings of each element in the set of matched elements, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/prevAll/">jQuery Docs</a> */
  def prevAll(selector: Selector = js.native): JQuery = js.native

  /** Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object. <br/>
    * See: <a href="http://api.jquery.com/prevUntil/">jQuery Docs</a> */
  def prevUntil(selector: Selector | Element | JQuery = js.native, filter: Selector = js.native): JQuery = js.native

  /** Return a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished. <br/>
    * See: <a href="http://api.jquery.com/promise/">jQuery Docs</a> */
  def promise[FunType <: js.Function1[ArgType, js.Any], ArgType](tpe: String = js.native, target: js.Any = js.native): JQueryPromise[FunType, ArgType] = js.native

  /** Get the value of a property for the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/prop/">jQuery Docs</a> */
  def prop(propertyName: String): js.Any = js.native

  /** Set one or more properties for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/prop/">jQuery Docs</a> */
  def prop(propertyName: String, value: js.Any): JQuery = js.native

  /** Set one or more properties for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/prop/">jQuery Docs</a> */
  private[jquery] def prop(propertyName: String, function: js.ThisFunction2[Element, Int, js.Any, Any]): JQuery = js.native

  /** Set one or more properties for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/prop/">jQuery Docs</a> */
  private[jquery] def prop(properties: js.Dictionary[Any]): JQuery = js.native

  /** Add a collection of DOM elements onto the jQuery stack. <br/>
    * See: <a href="http://api.jquery.com/pushStack/">jQuery Docs</a> */
  private[jquery] def pushStack(elements: js.Array[Any]): JQuery = js.native

  /** Add a collection of DOM elements onto the jQuery stack. <br/>
    * See: <a href="http://api.jquery.com/pushStack/">jQuery Docs</a> */
  private[jquery] def pushStack(elements: js.Array[Any], name: String, arguments: js.Array[Any]): JQuery = js.native

  /** Specify a function to execute when the DOM is fully loaded. <br/>
    * See: <a href="http://api.jquery.com/ready/">jQuery Docs</a> */
  private[jquery] def ready(callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Remove the set of matched elements from the DOM. <br/>
    * See: <a href="http://api.jquery.com/remove/">jQuery Docs</a> */
  def remove(selector: String = js.native): JQuery = js.native

  /** Remove an attribute from each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/removeAttr/">jQuery Docs</a> */
  def removeAttr(attributeName:String): JQuery = js.native

  /** Remove a single class, multiple classes, or all classes from each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/removeClass/">jQuery Docs</a> */
  def removeClass(className: String*): JQuery = js.native

  /** Remove a single class, multiple classes, or all classes from each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/removeClass/">jQuery Docs</a> */
  private[jquery] def removeClass(function: js.Function2[Int, String, String]): JQuery = js.native

  /** Remove a previously-stored piece of data. <br/>
    * See: <a href="http://api.jquery.com/removeData/">jQuery Docs</a> */
  def removeData(name: String = js.native): JQuery = js.native

  /** Remove a previously-stored piece of data. <br/>
    * See: <a href="http://api.jquery.com/removeData/">jQuery Docs</a> */
  private[jquery] def removeData(list: js.Array[String]): JQuery = js.native

  /** Remove a property for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/removeProp/">jQuery Docs</a> */
  def removeProp(propertyName: String): JQuery = js.native

  /** Replace each target element with the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/replaceAll/">jQuery Docs</a> */
  def replaceAll(target: (Selector | Element | JQuery)*): JQuery = js.native

  /** Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed. <br/>
    * See: <a href="http://api.jquery.com/replaceWith/">jQuery Docs</a> */
  def replaceWith(content: (Selector | Element | JQuery)*): JQuery = js.native

  /** Trigger resize event on an element. <br/>
    * See: <a href="http://api.jquery.com/resize/">jQuery Docs</a> */
  def resize(): JQuery = js.native

  /** Trigger scroll event on an element. <br/>
    * See: <a href="http://api.jquery.com/scroll/">jQuery Docs</a> */
  def scroll(): JQuery = js.native

  /** Get the current horizontal position of the scroll bar for the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/scrollLeft/">jQuery Docs</a> */
  def scrollLeft(): Int = js.native

  /** Set the current horizontal position of the scroll bar for each of the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/scrollLeft/">jQuery Docs</a> */
  def scrollLeft(left: Int): JQuery = js.native

  /** Get the current vertical position of the scroll bar for the first element in the set of matched elements or set the vertical position of the scroll bar for every matched element. <br/>
    * See: <a href="http://api.jquery.com/scrollTop/">jQuery Docs</a> */
  def scrollTop(): Int = js.native

  /** Set the current vertical position of the scroll bar for each of the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/scrollTop/">jQuery Docs</a> */
  def scrollTop(top: Int): JQuery = js.native

  /** Trigger select event on an element. <br/>
    * See: <a href="http://api.jquery.com/select/">jQuery Docs</a> */
  def select(): JQuery = js.native

  /** Encode a set of form elements as a string for submission. <br/>
    * See: <a href="http://api.jquery.com/serialize/">jQuery Docs</a> */
  def serialize(): String = js.native

  /** Encode a set of form elements as an array of names and values. <br/>
    * See: <a href="http://api.jquery.com/serializeArray/">jQuery Docs</a> */
  def serializeArray[T](): js.Array[T] = js.native

  /** Display the matched elements. <br/>
    * See: <a href="http://api.jquery.com/show/">jQuery Docs</a> */
  def show(duration: Int = js.native, easing: String = js.native): JQuery = js.native

  /** Display the matched elements. <br/>
    * See: <a href="http://api.jquery.com/show/">jQuery Docs</a> */
  private[jquery] def show(duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Display the matched elements. <br/>
    * See: <a href="http://api.jquery.com/show/">jQuery Docs</a> */
  private[jquery] def show(options: js.Dictionary[Any]): JQuery = js.native

  /** Get the siblings of each element in the set of matched elements, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/siblings/">jQuery Docs</a> */
  def siblings(selector: String = js.native): JQuery = js.native

  /** Reduce the set of matched elements to a subset specified by a range of indices. Including `start`, without `end`. <br/>
    * See: <a href="http://api.jquery.com/slice/">jQuery Docs</a> */
  def slice(start: Int, end: Int = js.native): JQuery = js.native

  /** Display the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideDown/">jQuery Docs</a> */
  def slideDown(duration: Int = js.native, easing: String = js.native): JQuery = js.native

  /** Display the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideDown/">jQuery Docs</a> */
  private[jquery] def slideDown(duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Display the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideDown/">jQuery Docs</a> */
  private[jquery] def slideDown(options: js.Dictionary[Any]): JQuery = js.native

  /** Display or hide the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideToggle/">jQuery Docs</a> */
  def slideToggle(duration: Int = js.native, easing: String = js.native): JQuery = js.native

  /** Display or hide the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideToggle/">jQuery Docs</a> */
  private[jquery] def slideToggle(duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Display or hide the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideToggle/">jQuery Docs</a> */
  private[jquery] def slideToggle(options: js.Dictionary[Any]): JQuery = js.native

  /** Hide the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
  def slideUp(duration: Int = js.native, easing: String = js.native): JQuery = js.native

  /** Hide the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
  private[jquery] def slideUp(duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Hide the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
  private[jquery] def slideUp(options: js.Dictionary[Any]): JQuery = js.native

  /** Stop the currently-running animation on the matched elements. <br/>
    * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
  def stop(queue: String = js.native, clearQueue: Boolean = js.native, jumpToEnd: Boolean = js.native): JQuery = js.native

  /** Trigger submit event on an element. <br/>
    * See: <a href="http://api.jquery.com/submit/">jQuery Docs</a> */
  def submit(): JQuery = js.native

  /** Get the combined text contents of each element in the set of matched elements, including their descendants. <br/>
    * See: <a href="http://api.jquery.com/text/">jQuery Docs</a> */
  def text(): String = js.native

  /** Set the content of each element in the set of matched elements to the specified text. <br/>
    * See: <a href="http://api.jquery.com/text/#text-text/">jQuery Docs</a> */
  def text(text: String | Double | Int | Boolean): JQuery = js.native

  /** Set the content of each element in the set of matched elements to the specified text. <br/>
    * See: <a href="http://api.jquery.com/text/#text-text/">jQuery Docs</a> */
  private[jquery] def text(function: js.ThisFunction2[Element, Int, String, String]): JQuery = js.native

  /** Retrieve all the elements contained in the jQuery set, as an array. <br/>
    * See: <a href="http://api.jquery.com/toArray/">jQuery Docs</a> */
  private[jquery] def toArray(): js.Array[Element] = js.native

  /** Display or hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
  def toggle(display: Boolean): JQuery = js.native

  /** Display or hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
  def toggle(duration: Int = js.native, easing: String = js.native): JQuery = js.native

  /** Display or hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
  private[jquery] def toggle(duration: Int, easing: String, callback: js.ThisFunction0[Element, Any]): JQuery = js.native

  /** Display or hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
  private[jquery] def toggle(options: js.Dictionary[Any]): JQuery = js.native

  /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
    * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
  def toggleClass(className: String): JQuery = js.native

  /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
    * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
  def toggleClass(className: String, state: Boolean): JQuery = js.native

  /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
    * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
  private[jquery] def toggleClass(function: js.Function3[Int, String, Boolean, String], state: Boolean = js.native): JQuery = js.native

  /** Execute all handlers and behaviors attached to the matched elements for the given event type. <br/>
    * See: <a href="http://api.jquery.com/trigger/">jQuery Docs</a> */
  def trigger(event: String | JQueryEvent): JQuery = js.native

  /** Execute all handlers and behaviors attached to the matched elements for the given event type. <br/>
    * See: <a href="http://api.jquery.com/trigger/">jQuery Docs</a> */
  private[jquery] def trigger(event: String | JQueryEvent, extraParams: js.Dictionary[Any] | js.Array[Any]): JQuery = js.native

  /** Execute all handlers attached to an element for an event. <br/>
    * See: <a href="http://api.jquery.com/triggerHandler/">jQuery Docs</a> */
  def triggerHandler(event: String | JQueryEvent): JQuery = js.native

  /** Execute all handlers attached to an element for an event. <br/>
    * See: <a href="http://api.jquery.com/triggerHandler/">jQuery Docs</a> */
  private[jquery] def triggerHandler(event: String | JQueryEvent, extraParams: js.Dictionary[Any] | js.Array[Any]): JQuery = js.native

  /** Remove the parents of the set of matched elements from the DOM, leaving the matched elements in their place. <br/>
    * See: <a href="http://api.jquery.com/unwrap/">jQuery Docs</a> */
  def unwrap(): JQuery = js.native

  /** Get the current value of the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/val/">jQuery Docs</a> */
  @JSName("val")
  def value(): String | Number | js.Array[Any] = js.native

  /** Set the value of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/val/">jQuery Docs</a> */
  @JSName("val")
  def value(value: String | Number | js.Array[Any]): JQuery = js.native

  /** Set the value of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/val/">jQuery Docs</a> */
  @JSName("val")
  private[jquery] def value(function: js.ThisFunction2[Element, Int, String, String]): JQuery = js.native

  /** Get the current computed width for the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/width/">jQuery Docs</a> */
  def width(): Double = js.native

  /** Set the CSS width of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/width/#width-value">jQuery Docs</a> */
  def width(value: String | Double): JQuery = js.native

  /** Set the CSS width of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/width/#width-value">jQuery Docs</a> */
  private[jquery] def width(function: js.ThisFunction2[Element, Int, Int, String | Double]): JQuery = js.native

  /** Wrap an HTML structure around each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/wrap/">jQuery Docs</a> */
  def wrap(wrappingElement: Selector | Element | JQuery): JQuery = js.native

  /** Wrap an HTML structure around each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/wrap/">jQuery Docs</a> */
  private[jquery] def wrap(function: js.ThisFunction1[Element, Int, String | JQuery]): JQuery = js.native

  /** Wrap an HTML structure around all elements in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/wrapAll/">jQuery Docs</a> */
  def wrapAll(wrappingElement: Selector | Element | JQuery): JQuery = js.native

  /** Wrap an HTML structure around all elements in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/wrapAll/">jQuery Docs</a> */
  private[jquery] def wrapAll(function: js.ThisFunction1[Element, Int, String | JQuery]): JQuery = js.native

  /** Wrap an HTML structure around the content of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/wrapInner/">jQuery Docs</a> */
  def wrapInner(wrappingElement: Selector | Element | JQuery): JQuery = js.native

  /** Wrap an HTML structure around the content of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/wrapInner/">jQuery Docs</a> */
  private[jquery] def wrapInner(function: js.ThisFunction1[Element, Int, String | JQuery]): JQuery = js.native
}

object JQuery {
  import scala.scalajs.js.`|`

  trait CallbackRegistration {
    def unregister(): Unit
  }

  case class CallbackParameters(once: Boolean, selector: String, data: js.Any)
  case class CallbackRegistrationRef(event: String, callback: JQueryCallback, registration: CallbackRegistration)

  private val registrations: mutable.Map[Element, mutable.Buffer[CallbackRegistrationRef]] = mutable.Map[Element, mutable.Buffer[CallbackRegistrationRef]]()

  case class AnimationOptions(duration: Option[Int] = None, easing: String = null, queue: Option[Boolean] = None,
                              step: (Int, js.Dynamic) => Any = null, progress: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Int, Int) => js.Any = null,
                              complete: () => js.Any = null, start: JQueryPromise[js.Function1[js.Any, js.Any], js.Any] => js.Any = null,
                              done: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Boolean) => js.Any = null,
                              fail: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Boolean) => js.Any = null,
                              always: (JQueryPromise[js.Function1[js.Any, js.Any], js.Any], Boolean) => js.Any = null) {
    def toJSDictionary: js.Dictionary[Any] = {
      val r = js.Dictionary[Any]()
      if (duration.isDefined) r.update("duration", duration.get)
      if (easing != null) r.update("easing", easing)
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

  implicit class JQueryWrapper(private val jquery: JQuery) {
    import js.JSConverters._

    class OnCallbackRegistration(event: String, callback: JQueryCallback,
                                 reg: (ThisFunction1[Element, JQueryEvent, Any]) => Any,
                                 unreg: (String, ThisFunction1[Element, JQueryEvent, Any]) => js.Any = (event, c) => jquery.off(event, c))
      extends CallbackRegistration {
      private val c: ThisFunction1[Element, JQueryEvent, Any] = callback
      reg(c)

      override def unregister(): Unit = unreg(event, c)
    }

    /** Adds the specified class(es) to each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/addClass/">jQuery Docs</a> */
    def addClass(function: (Int) => String): JQuery = jquery.addClass(function)

    /** Adds the specified class(es) to each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/addClass/">jQuery Docs</a> */
    def addClass(function: (Int, String) => String): JQuery = jquery.addClass(function)

    /** Perform a custom animation of a set of CSS properties. <br/>
      * See: <a href="http://api.jquery.com/animate/">jQuery Docs</a> */
    def animate(properties: Map[String, Any], duration: Int = 400, easing: String = "swing", callback: (Element) => Any = (_) => {}): JQuery = jquery.animate(properties.toJSDictionary, duration, easing, callback)

    /** Perform a custom animation of a set of CSS properties. <br/>
      * See: <a href="http://api.jquery.com/animate/">jQuery Docs</a> */
    def animate(properties: Map[String, Any], options: AnimationOptions): JQuery = jquery.animate(properties.toJSDictionary, options.toJSDictionary)

    /** Insert content, specified by the parameter, to the end of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/append/">jQuery Docs</a> */
    def append(function: (Element, Int, String) => Any): JQuery = jquery.append(function)

    /** Get the value of an attribute for the first element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/attr/#attr-attributeName">jQuery Docs</a> */
    def attr(attributeName: String): Option[String] = jquery.attr(attributeName).toOption

    /** Set one or more attributes for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/attr/#attr-attributeName-value">jQuery Docs</a> */
    def attr(attributes: Map[String, String | Double]): JQuery = jquery.attr(attributes.toJSDictionary)

    /** Set one or more attributes for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/attr/#attr-attributeName-value">jQuery Docs</a> */
    def attr(attributeName: String, attributeValue: String | Double): JQuery = jquery.attr(attributeName, attributeValue)

    /** Set one or more attributes for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/attr/#attr-attributeName-value">jQuery Docs</a> */
    def attr(attributeName: String, function: (Int, String) => String | Double): JQuery = jquery.attr(attributeName, function)

    /** Insert content, specified by the parameter, before each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/before/">jQuery Docs</a> */
    def before(content: (Int, String) => String | Element | JQuery): JQuery = jquery.before(content)

    /** Bind an event handler to the "blur" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
    def blur(callback: JQueryCallback): JQuery = on("blur", callback)

    /** Bind an event handler to the "blur" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
    def blur(data: js.Any, callback: JQueryCallback): JQuery = on("blur", data, callback)

    /** Bind an event handler to the "change" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
    def change(callback: JQueryCallback): JQuery = on("change", callback)

    /** Bind an event handler to the "change" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
    def change(data: js.Any, callback: JQueryCallback): JQuery = on("change", data, callback)

    /** Bind an event handler to the "click" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/click/">jQuery Docs</a> */
    def click(callback: JQueryCallback): JQuery = on("click", callback)

    /** Bind an event handler to the "click" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/click/">jQuery Docs</a> */
    def click(data: js.Any, callback: JQueryCallback): JQuery = on("click", data, callback)

    /** Bind an event handler to the "contextmenu" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/contextmenu/">jQuery Docs</a> */
    def contextMenu(callback: JQueryCallback): JQuery = on("contextmenu", callback)

    /** Bind an event handler to the "contextmenu" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/contextmenu/">jQuery Docs</a> */
    def contextMenu(data: js.Any, callback: JQueryCallback): JQuery = on("contextmenu", data, callback)

    /** Set one or more CSS properties for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/css/#css-propertyName-value">jQuery Docs</a> */
    def css(attributeName: String, attributeValue: String | Int): JQuery = jquery.css(attributeName, attributeValue)

    /** Set one or more CSS properties for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/css/#css-propertyName-value">jQuery Docs</a> */
    def css(attributeName: String, attributeFun: (Int, String) => String | Int): JQuery = jquery.css(attributeName, attributeFun)

    /** Set one or more CSS properties for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/css/#css-propertyName-value">jQuery Docs</a> */
    def css(propertyNames: Map[String, String | Int]): JQuery = jquery.css(propertyNames.toJSDictionary)

    /** Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute. <br/>
      * See: <a href="http://api.jquery.com/data/#data-key">jQuery Docs</a> */
    def data(key: String): Option[Any] = jquery.data(key).toOption

    /** Store arbitrary data associated with the matched elements. <br/>
      * See: <a href="http://api.jquery.com/data/#data-key-value">jQuery Docs</a> */
    def data(obj: Map[String, Any]): JQuery = jquery.data(obj.toJSDictionary)

    /** Bind an event handler to the "dblclick" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/dblclick/">jQuery Docs</a> */
    def dblClick(callback: JQueryCallback): JQuery = on("dblclick", callback)

    /** Bind an event handler to the "dblclick" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/dblclick/">jQuery Docs</a> */
    def dblClick(data: js.Any, callback: JQueryCallback): JQuery = on("dblclick", data, callback)

    /** Iterate over a jQuery object, executing a function for each matched element. <br/>
      * See: <a href="http://api.jquery.com/each/">jQuery Docs</a> */
    def each(callback: (Element, Int, Element) => Any): JQuery = jquery.each(callback)

    /** Bind an event handler to the "error" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/error/">jQuery Docs</a> */
    @deprecated("Since jQuery 1.8", "0.1.0")
    def error(callback: JQueryCallback): JQuery = on("error", callback)

    /** Bind an event handler to the "error" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/error/">jQuery Docs</a> */
    @deprecated("Since jQuery 1.8", "0.1.0")
    def error(data: js.Any, callback: JQueryCallback): JQuery = on("error", data, callback)

    /** Display the matched elements by fading them to opaque. <br/>
      * See: <a href="http://api.jquery.com/fadeIn/">jQuery Docs</a> */
    def fadeIn(duration: Int, easing: String, callback: (Element) => Any): JQuery = jquery.fadeIn(duration, easing, callback)

    /** Display the matched elements by fading them to opaque. <br/>
      * See: <a href="http://api.jquery.com/fadeIn/">jQuery Docs</a> */
    def fadeIn(options: AnimationOptions): JQuery = jquery.fadeIn(options.toJSDictionary)

    /** Hide the matched elements by fading them to transparent. <br/>
      * See: <a href="http://api.jquery.com/fadeOut/">jQuery Docs</a> */
    def fadeOut(duration: Int, easing: String, callback: (Element) => Any): JQuery = jquery.fadeOut(duration, easing, callback)

    /** Hide the matched elements by fading them to transparent. <br/>
      * See: <a href="http://api.jquery.com/fadeOut/">jQuery Docs</a> */
    def fadeOut(options: AnimationOptions): JQuery = jquery.fadeOut(options.toJSDictionary)

    /** Adjust the opacity of the matched elements. <br/>
      * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
    def fadeTo(duration: Int, opacity: Double, callback: (Element) => Any): JQuery = jquery.fadeTo(duration, opacity, callback)

    /** Adjust the opacity of the matched elements. <br/>
      * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
    def fadeTo(duration: Int, opacity: Double, easing: String, callback: (Element) => Any): JQuery = jquery.fadeTo(duration, opacity, easing, callback)

    /** Display or hide the matched elements by animating their opacity. <br/>
      * See: <a href="http://api.jquery.com/fadeToggle/">jQuery Docs</a> */
    def fadeToggle(duration: Int, easing: String, callback: (Element) => Any): JQuery = jquery.fadeToggle(duration, easing, callback)

    /** Display or hide the matched elements by animating their opacity. <br/>
      * See: <a href="http://api.jquery.com/fadeToggle/">jQuery Docs</a> */
    def fadeToggle(options: AnimationOptions): JQuery = jquery.fadeToggle(options.toJSDictionary)

    /** Reduce the set of matched elements to those that match the selector or pass the function's test. <br/>
      * See: <a href="http://api.jquery.com/filter/">jQuery Docs</a> */
    def filter(function: (Element, Int, Element) => Boolean): JQuery = jquery.filter(function)

    /** Bind an event handler to the "focus" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focus/">jQuery Docs</a> */
    def focus(callback: JQueryCallback): JQuery = on("focus", callback)

    /** Bind an event handler to the "focus" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focus/">jQuery Docs</a> */
    def focus(data: js.Any, callback: JQueryCallback): JQuery = on("focus", data, callback)

    /** Bind an event handler to the "focusIn" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focusIn/">jQuery Docs</a> */
    def focusIn(callback: JQueryCallback): JQuery = on("focusin", callback)

    /** Bind an event handler to the "focusIn" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focusIn/">jQuery Docs</a> */
    def focusIn(data: js.Any, callback: JQueryCallback): JQuery = on("focusin", data, callback)

    /** Bind an event handler to the "focusOut" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focusOut/">jQuery Docs</a> */
    def focusOut(callback: JQueryCallback): JQuery = on("focusout", callback)

    /** Bind an event handler to the "focusOut" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focusOut/">jQuery Docs</a> */
    def focusOut(data: js.Any, callback: JQueryCallback): JQuery = on("focusout", data, callback)

    /** Retrieve one of the elements matched by the jQuery object. <br/>
      * See: <a href="http://api.jquery.com/get/#get-index">jQuery Docs</a> */
    def get(index: Int): Option[Element] = jquery.get(index).toOption

    /** Retrieve the elements matched by the jQuery object. <br/>
      * See: <a href="http://api.jquery.com/get/#get">jQuery Docs</a> */
    def get(): Seq[Element] = jquery.get().toSeq

    /** Set the CSS height of every matched element. <br/>
      * See: <a href="http://api.jquery.com/height/#height-value">jQuery Docs</a> */
    def height(function: (Element, Int, Int) => String | Double): JQuery = jquery.height(function)

    /** Hide the matched elements. <br/>
      * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
    def hide(duration: Int, easing: String, callback: (Element) => Any): JQuery = jquery.hide(duration, easing, callback)

    /** Hide the matched elements. <br/>
      * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
    def hide(options: AnimationOptions): JQuery = jquery.hide(options.toJSDictionary)

    /** Bind two handlers to the matched elements, to be executed when the mouse pointer enters and leaves the elements. <br/>
      * See: <a href="http://api.jquery.com/hover/">jQuery Docs</a> */
    def hover(handlerIn: (Element) => Any, handlerOut: (Element) => Any): JQuery = {
      mouseEnter((el, _) => handlerIn(el))
      mouseLeave((el, _) => handlerOut(el))
      jquery
    }

    /** Bind a single handler to the matched elements, to be executed when the mouse pointer enters or leaves the elements. <br/>
      * See: <a href="http://api.jquery.com/hover/">jQuery Docs</a> */
    def hover(handlerInOut: (Element) => Any): JQuery = hover(handlerInOut, handlerInOut)

    /** Set the CSS inner height of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/innerHeight/#innerHeight-value">jQuery Docs</a> */
    def innerHeight(function: (Element, Int, Double) => Double | String): JQuery = jquery.innerHeight(function)

    /** Set the CSS inner width of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/innerWidth/#innerWidth-value">jQuery Docs</a> */
    def innerWidth(function: (Element, Int, Double) => Double | String): JQuery = jquery.innerWidth(function)

    /** Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments. <br/>
      * See: <a href="http://api.jquery.com/is/">jQuery Docs</a> */
    def is(function: (Element, Int, Element) => Boolean): Boolean = jquery.is(function)

    /** Bind an event handler to the "keydown" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keydown/">jQuery Docs</a> */
    def keyDown(callback: JQueryCallback): JQuery = on("keydown", callback)

    /** Bind an event handler to the "keydown" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keydown/">jQuery Docs</a> */
    def keyDown(data: js.Any, callback: JQueryCallback): JQuery = on("keydown", data, callback)

    /** Bind an event handler to the "keypress" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keypress/">jQuery Docs</a> */
    def keyPress(callback: JQueryCallback): JQuery = on("keypress", callback)

    /** Bind an event handler to the "keypress" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keypress/">jQuery Docs</a> */
    def keyPress(data: js.Any, callback: JQueryCallback): JQuery = on("keypress", data, callback)

    /** Bind an event handler to the "keyup" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keyup/">jQuery Docs</a> */
    def keyUp(callback: JQueryCallback): JQuery = on("keyup", callback)

    /** Bind an event handler to the "keyup" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keyup/">jQuery Docs</a> */
    def keyUp(data: js.Any, callback: JQueryCallback): JQuery = on("keyup", data, callback)

    /** Load data from the server and place the returned HTML into the matched element. <br/>
      * See: <a href="http://api.jquery.com/load/">jQuery Docs</a> */
    def load(url: String, data: js.Any, callback: (Element, String, String, JQueryXHR) => Any): JQuery = jquery.load(url, data, callback)

    /** Pass each element in the current matched set through a function, producing a new jQuery object containing the return values. <br/>
      * See: <a href="http://api.jquery.com/map/">jQuery Docs</a> */
    def map(callback: (Int, Element) => Any): JQuery = jquery.map(callback)

    /** Bind an event handler to the "mousedown" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mousedown/">jQuery Docs</a> */
    def mouseDown(callback: JQueryCallback): JQuery = on("mousedown", callback)

    /** Bind an event handler to the "mousedown" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mousedown/">jQuery Docs</a> */
    def mouseDown(data: js.Any, callback: JQueryCallback): JQuery = on("mousedown", data, callback)

    /** Bind an event handler to the "mouseenter" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseenter/">jQuery Docs</a> */
    def mouseEnter(callback: JQueryCallback): JQuery = on("mouseenter", callback)

    /** Bind an event handler to the "mouseenter" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseenter/">jQuery Docs</a> */
    def mouseEnter(data: js.Any, callback: JQueryCallback): JQuery = on("mouseenter", data, callback)

    /** Bind an event handler to the "mouseleave" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseleave/">jQuery Docs</a> */
    def mouseLeave(callback: JQueryCallback): JQuery = on("mouseleave", callback)

    /** Bind an event handler to the "mouseleave" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseleave/">jQuery Docs</a> */
    def mouseLeave(data: js.Any, callback: JQueryCallback): JQuery = on("mouseleave", data, callback)

    /** Bind an event handler to the "mousemove" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mousemove/">jQuery Docs</a> */
    def mouseMove(callback: JQueryCallback): JQuery = on("mousemove", callback)

    /** Bind an event handler to the "mousemove" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mousemove/">jQuery Docs</a> */
    def mouseMove(data: js.Any, callback: JQueryCallback): JQuery = on("mousemove", data, callback)

    /** Bind an event handler to the "mouseout" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseout/">jQuery Docs</a> */
    def mouseOut(callback: JQueryCallback): JQuery = on("mouseout", callback)

    /** Bind an event handler to the "mouseout" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseout/">jQuery Docs</a> */
    def mouseOut(data: js.Any, callback: JQueryCallback): JQuery = on("mouseout", data, callback)

    /** Bind an event handler to the "mouseover" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseover/">jQuery Docs</a> */
    def mouseOver(callback: JQueryCallback): JQuery = on("mouseover", callback)

    /** Bind an event handler to the "mouseover" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseover/">jQuery Docs</a> */
    def mouseOver(data: js.Any, callback: JQueryCallback): JQuery = on("mouseover", data, callback)

    /** Bind an event handler to the "mouseup" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseup/">jQuery Docs</a> */
    def mouseUp(callback: JQueryCallback): JQuery = on("mouseup", callback)

    /** Bind an event handler to the "mouseup" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseup/">jQuery Docs</a> */
    def mouseUp(data: js.Any, callback: JQueryCallback): JQuery = on("mouseup", data, callback)

    /** Remove elements from the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/not/">jQuery Docs</a> */
    def not(function: (Element, Int, Element) => Boolean): JQuery = jquery.not(function)

    /** Get the current coordinates of the first element in the set of matched elements, relative to the document. <br/>
      * See: <a href="http://api.jquery.com/offset/">jQuery Docs</a> */
    def offset(): Map[String, Double] = jquery.offset().toMap

    /** Get the current coordinates of the first element in the set of matched elements, relative to the document. <br/>
      * See: <a href="http://api.jquery.com/offset/">jQuery Docs</a> */
    def offset(coordinates: Map[String, Double]): JQuery  = jquery.offset(coordinates.toJSDictionary)

    /** Attach an event handler function for one or more events to the selected elements. <br/>
      * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
    def on(event: String, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(false, null, null))
      jquery
    }

    /** Attach an event handler function for one or more events to the selected elements. <br/>
      * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
    def on(event: String, data: js.Any, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(false, null, data))
      jquery
    }

    /** Attach an event handler function for one or more events to the selected elements. <br/>
      * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
    def on(event: String, selector: String, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(false, selector, null))
      jquery
    }

    /** Attach an event handler function for one or more events to the selected elements. <br/>
      * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
    def on(event: String, selector: String, data: js.Any, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(false, selector, data))
      jquery
    }

    /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
      * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
    def one(event: String, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(true, null, null))
      jquery
    }

    /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
      * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
    def one(event: String, data: js.Any, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(true, null, data))
      jquery
    }

    /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
      * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
    def one(event: String, selector: String, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(true, selector, null))
      jquery
    }

    /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
      * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
    def one(event: String, selector: String, data: js.Any, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(true, selector, data))
      jquery
    }

    /** Remove an event handler. <br/>
      * See: <a href="http://api.jquery.com/off/">jQuery Docs</a> */
    def off(event: String, callback: JQueryCallback): JQuery = {
      jquery.toArray()
        .foreach( el => {
          if (registrations.contains(el)) {
            val jqueryRegs: mutable.Buffer[CallbackRegistrationRef] = registrations.get(el).get
            val found: mutable.Buffer[CallbackRegistrationRef] = jqueryRegs.filter(r => {
              r match {
                case CallbackRegistrationRef(ev, cb, _) if cb == callback && ev == event => true
                case _ => false
              }
            })
            found.foreach( _.registration.unregister())
            jqueryRegs --= found
            if (jqueryRegs.isEmpty) registrations.remove(el)
          }
        })

      jquery
    }

    private def separateCallbacks(event: String, callback:JQueryCallback, params: CallbackParameters): Unit = {

      type ThisFunctionCallback = ThisFunction1[Element, JQueryEvent, Any]

      jquery.each((element: Element, idx: Int, _: Element) => {
        val cb = params match {
          case CallbackParameters(false, null, null) => c: ThisFunctionCallback => jQ(element).on(event, c)
          case CallbackParameters(false, null, data) => c: ThisFunctionCallback => jQ(element).on(event, data, c)
          case CallbackParameters(false, selector, null) => c: ThisFunctionCallback => jQ(element).on(event, selector, c)
          case CallbackParameters(false, selector, data) => c: ThisFunctionCallback => jQ(element).on(event, selector, data, c)

          case CallbackParameters(true, null, null) => c: ThisFunctionCallback => jQ(element).one(event, c)
          case CallbackParameters(true, null, data) => c: ThisFunctionCallback => jQ(element).one(event, data, c)
          case CallbackParameters(true, selector, null) => c: ThisFunctionCallback => jQ(element).one(event, selector, c)
          case CallbackParameters(true, selector, data) => c: ThisFunctionCallback => jQ(element).one(event, selector, data, c)
        }

        val registration: CallbackRegistration = new OnCallbackRegistration(event, callback, cb)
        collectRegistration(event, callback, element, idx, params, registration)
      })
    }

    private def collectRegistration(event: String, callback: JQueryCallback, el: Element, index: Int, params: CallbackParameters, reg: CallbackRegistration) = {
      val jqueryRegs: mutable.Buffer[CallbackRegistrationRef] = registrations.getOrElse(el, mutable.Buffer[CallbackRegistrationRef]())
      jqueryRegs += CallbackRegistrationRef(event, callback, reg)
      registrations.update(el, jqueryRegs)
    }

    /** Set the CSS outer Height of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/outerHeight/">jQuery Docs</a> */
    def outerHeight(function: (Element, Int, Double) => Double): JQuery = jquery.outerHeight(function)

    /** Set the CSS outer width of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/outerWidth/">jQuery Docs</a> */
    def outerWidth(function: (Element, Int, Double) => Double): JQuery = jquery.outerWidth(function)

    /** Get the current coordinates of the first element in the set of matched elements, relative to the offset parent. <br/>
      * See: <a href="http://api.jquery.com/position/">jQuery Docs</a> */
    def position(): (Double, Double) = {
      val p = jquery.position()
      (p("top"), p("left"))
    }

    /** Insert content, specified by the parameter, to the beginning of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/prepend/">jQuery Docs</a> */
    def prepend(function: (Element, Int, String) => Any): JQuery = jquery.prepend(function)

    /** Set one or more properties for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/prop/">jQuery Docs</a> */
    def prop(propertyName: String, function: (Element, Int, Any) => Any): JQuery = jquery.prop(propertyName, function)

    /** Set one or more properties for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/prop/">jQuery Docs</a> */
    def prop(properties: Map[String, Any]): JQuery = jquery.prop(properties.toJSDictionary)

    /** Add a collection of DOM elements onto the jQuery stack. <br/>
      * See: <a href="http://api.jquery.com/pushStack/">jQuery Docs</a> */
    def pushStack(elements: Seq[Any]): JQuery = jquery.pushStack(elements.toJSArray)

    /** Add a collection of DOM elements onto the jQuery stack. <br/>
      * See: <a href="http://api.jquery.com/pushStack/">jQuery Docs</a> */
    def pushStack(elements: Seq[Any], name: String, arguments: Seq[Any]): JQuery = jquery.pushStack(elements.toJSArray, name, arguments.toJSArray)

    /** Specify a function to execute when the DOM is fully loaded. <br/>
      * See: <a href="http://api.jquery.com/ready/">jQuery Docs</a> */
    def ready(callback: (Element) => Any): JQuery = jquery.ready(callback)

    /** Remove a single class, multiple classes, or all classes from each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/removeClass/">jQuery Docs</a> */
    def removeClass(function: (Int, String) => String): JQuery = jquery.removeClass(function)

    /** Remove a previously-stored piece of data. <br/>
      * See: <a href="http://api.jquery.com/removeData/">jQuery Docs</a> */
    def removeData(list: String*): JQuery = jquery.removeData(list.toJSArray)

    /** Bind an event handler to the "resize" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/resize/">jQuery Docs</a> */
    def resize(callback: JQueryCallback): JQuery = on("resize", callback)

    /** Bind an event handler to the "resize" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/resize/">jQuery Docs</a> */
    def resize(data: js.Any, callback: JQueryCallback): JQuery = on("resize", data, callback)

    /** Bind an event handler to the "scroll" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/scroll/">jQuery Docs</a> */
    def scroll(callback: JQueryCallback): JQuery = on("scroll", callback)

    /** Bind an event handler to the "scroll" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/scroll/">jQuery Docs</a> */
    def scroll(data: js.Any, callback: JQueryCallback): JQuery = on("scroll", data, callback)

    /** Bind an event handler to the "select" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/select/">jQuery Docs</a> */
    def select(callback: JQueryCallback): JQuery = on("select", callback)

    /** Bind an event handler to the "select" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/select/">jQuery Docs</a> */
    def select(data: js.Any, callback: JQueryCallback): JQuery = on("select", data, callback)

    /** Display the matched elements. <br/>
      * See: <a href="http://api.jquery.com/show/">jQuery Docs</a> */
    def show(duration: Int, easing: String, callback: (Element) => Any): JQuery = jquery.show(duration, easing, callback)

    /** Display the matched elements. <br/>
      * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
    def show(options: AnimationOptions): JQuery = jquery.show(options.toJSDictionary)

    /** Display the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideDown/">jQuery Docs</a> */
    def slideDown(duration: Int, easing: String, callback: (Element) => Any): JQuery = jquery.slideDown(duration, easing, callback)

    /** Display the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideDown/">jQuery Docs</a> */
    def slideDown(options: AnimationOptions): JQuery = jquery.slideDown(options.toJSDictionary)

    /** Display or hide the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideToggle/">jQuery Docs</a> */
    def slideToggle(duration: Int, easing: String, callback: (Element) => Any): JQuery = jquery.slideToggle(duration, easing, callback)

    /** Display or hide the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideToggle/">jQuery Docs</a> */
    def slideToggle(options: AnimationOptions): JQuery = jquery.slideToggle(options.toJSDictionary)

    /** Hide the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
    def slideUp(duration: Int, easing: String, callback: (Element) => Any): JQuery = jquery.slideUp(duration, easing, callback)

    /** Hide the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
    def slideUp(options: AnimationOptions): JQuery = jquery.slideUp(options.toJSDictionary)

    /** Trigger submit event on an element. <br/>
      * See: <a href="http://api.jquery.com/submit/">jQuery Docs</a> */
    def submit(callback: JQueryCallback): JQuery = on("submit", callback)

    /** Trigger submit event on an element. <br/>
      * See: <a href="http://api.jquery.com/submit/">jQuery Docs</a> */
    def submit(data: js.Any, callback: JQueryCallback): JQuery = on("submit", data, callback)

    /** Set the content of each element in the set of matched elements to the specified text. <br/>
      * See: <a href="http://api.jquery.com/text/#text-text/">jQuery Docs</a> */
    def text(function: (Element, Int, String) => String): JQuery = jquery.text(function)

    /** Retrieve all the elements contained in the jQuery set, as an array. <br/>
      * See: <a href="http://api.jquery.com/toArray/">jQuery Docs</a> */
    def toArray: Seq[Element] = jquery.toArray().toSeq

    /** Display or hide the matched elements. <br/>
      * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
    def toggle(duration: Int, easing: String, callback: (Element) => Any): JQuery = jquery.toggle(duration, easing, callback)

    /** Display or hide the matched elements. <br/>
      * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
    def toggle(options: AnimationOptions): JQuery = jquery.toggle(options.toJSDictionary)

    /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
      * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
    def toggleClass(function: (Int, String, Boolean) => String): JQuery = jquery.toggleClass(function)

    /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
      * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
    def toggleClass(function: (Int, String, Boolean) => String, state: Boolean): JQuery = jquery.toggleClass(function, state)

    /** Execute all handlers and behaviors attached to the matched elements for the given event type. <br/>
      * See: <a href="http://api.jquery.com/trigger/">jQuery Docs</a> */
    def trigger(event: String | JQueryEvent, extraParams: Map[String, Any]): JQuery = jquery.trigger(event, extraParams.toJSDictionary)

    /** Execute all handlers and behaviors attached to the matched elements for the given event type. <br/>
      * See: <a href="http://api.jquery.com/trigger/">jQuery Docs</a> */
    def trigger(event: String | JQueryEvent, extraParams: Seq[Any]): JQuery = jquery.trigger(event, extraParams.toJSArray)

    /** Execute all handlers attached to an element for an event. <br/>
      * See: <a href="http://api.jquery.com/triggerHandler/">jQuery Docs</a> */
    def triggerHandler(event: String | JQueryEvent, extraParams: Map[String, Any]): JQuery = jquery.triggerHandler(event, extraParams.toJSDictionary)

    /** Execute all handlers attached to an element for an event. <br/>
      * See: <a href="http://api.jquery.com/triggerHandler/">jQuery Docs</a> */
    def triggerHandler(event: String | JQueryEvent, extraParams: Seq[Any]): JQuery = jquery.triggerHandler(event, extraParams.toJSArray)

    /** Set the value of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/val/">jQuery Docs</a> */
    def value(function: (Element, Int, String) => String): JQuery = jquery.value(function)

    /** Set the CSS width of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/height/#height-value">jQuery Docs</a> */
    def width(function: (Element, Int, Int) => String | Double): JQuery = jquery.width(function)

    /** Wrap an HTML structure around each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/wrap/">jQuery Docs</a> */
    def wrap(function: (Element, Int) => String | JQuery): JQuery = jquery.wrap(function)

    /** Wrap an HTML structure around all elements in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/wrapAll/">jQuery Docs</a> */
    def wrapAll(function: (Element, Int) => String | JQuery): JQuery = jquery.wrapAll(function)

    /** Wrap an HTML structure around the content of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/wrapInner/">jQuery Docs</a> */
    def wrapInner(function: (Element, Int) => String | JQuery): JQuery = jquery.wrapInner(function)
  }
}


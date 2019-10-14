package io.udash.wrappers.jquery

import org.scalajs.dom.Element

import scala.collection.mutable
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.{ThisFunction1, UndefOr, |}

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

  /** Insert content, specified by the parameter, after each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/after/">jQuery Docs</a> */
  def after(content: (Selector | Element | JQuery)*): JQuery = js.native

  /** Insert content, specified by the parameter, after each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/after/">jQuery Docs</a> */
  def after(function: js.Function2[Int, String, String | Element | JQuery]): JQuery = js.native

  /** Insert content, specified by the parameter, to the end of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/append/">jQuery Docs</a> */
  def append(content: (String | Element | JQuery)*): JQuery = js.native

  /** Insert every element in the set of matched elements to the end of the target. <br/>
    * See: <a href="http://api.jquery.com/appendTo/">jQuery Docs</a> */
  def appendTo(target: (Selector | Element | JQuery)*): JQuery = js.native

  /** Set one or more attributes for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/attr/#attr-attributeName-value">jQuery Docs</a> */
  def attr(attributeName: String, attributeValue: String | Int | Double | Boolean): JQuery = js.native

  /** Insert content, specified by the parameter, before each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/before/">jQuery Docs</a> */
  def before(content: (String | Element | JQuery)*): JQuery = js.native

  /** Trigger blur event on an element. <br/>
    * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def blur(): JQuery = js.native

  /** Trigger change event on an element. <br/>
    * See: <a href="http://api.jquery.com/change/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.3.0", "1.2.0")
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
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def click(): JQuery = js.native

  /** Create a deep copy of the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/clone/">jQuery Docs</a> */
  def clone(withDataAndEvent: Boolean = js.native, deepWithDataAndEvents: Boolean = js.native): JQuery = js.native

  /** For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree. <br/>
    * See: <a href="http://api.jquery.com/closest/">jQuery Docs</a> */
  def closest(selector: Selector | Element | JQuery): JQuery = js.native

  /** For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree. <br/>
    * See: <a href="http://api.jquery.com/closest/">jQuery Docs</a> */
  def closest(selector: Selector, context: Element): JQuery = js.native

  /** Get the children of each element in the set of matched elements, including text and comment nodes. <br/>
    * See: <a href="http://api.jquery.com/contents/">jQuery Docs</a> */
  def contents(): JQuery = js.native

  /** Trigger contextmenu event on an element. <br/>
    * See: <a href="http://api.jquery.com/contextmenu/">jQuery Docs</a> */
  @JSName("contextmenu")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def contextMenu(): JQuery = js.native

  /** Get the computed style properties for the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/css/#css-propertyName">jQuery Docs</a> */
  def css(propertyName: String): String = js.native

  /** Set one or more CSS properties for the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/css/#css-propertyName-value">jQuery Docs</a> */
  def css(attributeName: String, attributeValue: String | Int | Double | Boolean): JQuery = js.native

  /** Store arbitrary data associated with the matched elements. <br/>
    * See: <a href="http://api.jquery.com/data/#data-key-value">jQuery Docs</a> */
  def data(key: String, value: Any): JQuery = js.native

  /** Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute. <br/>
    * See: <a href="http://api.jquery.com/data/#data-key">jQuery Docs</a> */
  def data(): js.Dynamic = js.native

  /** Trigger dblclick event on an element. <br/>
    * See: <a href="http://api.jquery.com/dblclick/">jQuery Docs</a> */
  @JSName("dblclick")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def dblClick(): JQuery = js.native

  /** Set a timer to delay execution of subsequent items in the queue. <br/>
    * See: <a href="http://api.jquery.com/delay/">jQuery Docs</a> */
  def delay(duration: Int, queueName: String = js.native): JQuery = js.native

  /** Execute the next function on the queue for the matched elements. <br/>
    * See: <a href="http://api.jquery.com/dequeue/">jQuery Docs</a> */
  def dequeue(queueName: String = js.native): JQuery = js.native

  /** Remove the set of matched elements from the DOM. <br/>
    * See: <a href="http://api.jquery.com/detach/">jQuery Docs</a> */
  def detach(selector: Selector = js.native): JQuery = js.native

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
  def fadeIn(duration: Int = js.native, easing: EasingFunction = js.native): JQuery = js.native

  /** Hide the matched elements by fading them to transparent. <br/>
    * See: <a href="http://api.jquery.com/fadeOut/">jQuery Docs</a> */
  def fadeOut(duration: Int = js.native, easing: EasingFunction = js.native): JQuery = js.native

  /** Adjust the opacity of the matched elements. <br/>
    * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
  def fadeTo(duration: Int, opacity: Double): JQuery = js.native

  /** Adjust the opacity of the matched elements. <br/>
    * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
  def fadeTo(duration: Int, opacity: Double, easing: EasingFunction): JQuery = js.native

  /** Display or hide the matched elements by animating their opacity. <br/>
    * See: <a href="http://api.jquery.com/fadeToggle/">jQuery Docs</a> */
  def fadeToggle(duration: Int = js.native, easing: EasingFunction = js.native): JQuery = js.native

  /** Reduce the set of matched elements to those that match the selector or pass the function's test. <br/>
    * See: <a href="http://api.jquery.com/filter/">jQuery Docs</a> */
  def filter(selector: Selector | JQuery): JQuery = js.native

  /** Reduce the set of matched elements to those that match the selector or pass the function's test. <br/>
    * See: <a href="http://api.jquery.com/filter/">jQuery Docs</a> */
  def filter(elements: Element*): JQuery = js.native

  /** Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element. <br/>
    * See: <a href="http://api.jquery.com/find/">jQuery Docs</a> */
  def find(selector: Selector | Element | JQuery): JQuery = js.native

  /** Stop the currently-running animation, remove all queued animations, and complete all animations for the matched elements. <br/>
    * See: <a href="http://api.jquery.com/finish/">jQuery Docs</a> */
  def finish(queue: String = js.native): JQuery = js.native

  /** Reduce the set of matched elements to the first in the set. <br/>
    * See: <a href="http://api.jquery.com/first/">jQuery Docs</a> */
  def first(): JQuery = js.native

  /** Trigger focus event on an element. <br/>
    * See: <a href="http://api.jquery.com/focus/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def focus(): JQuery = js.native

  /** Trigger focusin event on an element. <br/>
    * See: <a href="http://api.jquery.com/focusin/">jQuery Docs</a> */
  @JSName("focusin")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def focusIn(): JQuery = js.native

  /** Trigger focusout event on an element. <br/>
    * See: <a href="http://api.jquery.com/focusout/">jQuery Docs</a> */
  @JSName("focusout")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def focusOut(): JQuery = js.native

  /** Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element. <br/>
    * See: <a href="http://api.jquery.com/has/">jQuery Docs</a> */
  def has(selector: Selector | Element): JQuery = js.native

  /** Determine whether any of the matched elements are assigned the given class. <br/>
    * See: <a href="http://api.jquery.com/hasClass/">jQuery Docs</a> */
  def hasClass(className: String):Boolean = js.native

  /** Get the current computed height for the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/height/">jQuery Docs</a> */
  def height(): Double = js.native

  /** Set the CSS height of every matched element. <br/>
    * See: <a href="http://api.jquery.com/height/#height-value">jQuery Docs</a> */
  def height(value: String | Int | Double): JQuery = js.native

  /** Hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
  def hide(duration: Int = js.native, easing: EasingFunction = js.native): JQuery = js.native

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

  /** Get the current computed inner width for the first element in the set of matched elements, including padding but not border. <br/>
    * See: <a href="http://api.jquery.com/innerWidth/">jQuery Docs</a> */
  def innerWidth(): Double = js.native

  /** Set the CSS inner width of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/innerWidth/#innerWidth-value">jQuery Docs</a> */
  def innerWidth(value: Int | Double | String): JQuery = js.native

  /** Insert every element in the set of matched elements after the target. <br/>
    * See: <a href="http://api.jquery.com/insertAfter/">jQuery Docs</a> */
  def insertAfter(selector: Selector | Element | JQuery): JQuery = js.native

  /** Insert every element in the set of matched elements before the target. <br/>
    * See: <a href="http://api.jquery.com/insertBefore/">jQuery Docs</a> */
  def insertBefore(selector: Selector | Element | JQuery): JQuery = js.native

  /** Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments. <br/>
    * See: <a href="http://api.jquery.com/is/">jQuery Docs</a> */
  def is(selector: Selector | Element | JQuery): Boolean = js.native

  /** A string containing the jQuery version number. <br/>
    * See: <a href="http://api.jquery.com/jquery/">jQuery Docs</a> */
  def jquery: String = js.native

  /** Trigger keydown event on an element. <br/>
    * See: <a href="http://api.jquery.com/keydown/">jQuery Docs</a> */
  @JSName("keydown")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def keyDown(): JQuery = js.native

  /** Trigger keypress event on an element. <br/>
    * See: <a href="http://api.jquery.com/keypress/">jQuery Docs</a> */
  @JSName("keypress")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def keyPress(): JQuery = js.native

  /** Trigger keyup event on an element. <br/>
    * See: <a href="http://api.jquery.com/keyup/">jQuery Docs</a> */
  @JSName("keyup")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
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

  /** Trigger mousedown event on an element. <br/>
    * See: <a href="http://api.jquery.com/mousedown/">jQuery Docs</a> */
  @JSName("mousedown")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def mouseDown(): JQuery = js.native

  /** Trigger mouseenter event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseenter/">jQuery Docs</a> */
  @JSName("mouseenter")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def mouseEnter(): JQuery = js.native

  /** Trigger mouseleave event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseleave/">jQuery Docs</a> */
  @JSName("mouseleave")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def mouseLeave(): JQuery = js.native

  /** Trigger mousemove event on an element. <br/>
    * See: <a href="http://api.jquery.com/mousemove/">jQuery Docs</a> */
  @JSName("mousemove")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def mouseMove(): JQuery = js.native

  /** Trigger mouseout event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseout/">jQuery Docs</a> */
  @JSName("mouseout")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def mouseOut(): JQuery = js.native

  /** Trigger mouseover event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseover/">jQuery Docs</a> */
  @JSName("mouseover")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def mouseOver(): JQuery = js.native

  /** Trigger mouseup event on an element. <br/>
    * See: <a href="http://api.jquery.com/mouseup/">jQuery Docs</a> */
  @JSName("mouseup")
  @deprecated("Since jQuery 3.3.0", "1.2.0")
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
  def not(selector: Selector | JQuery): JQuery = js.native

  /** Remove elements from the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/not/">jQuery Docs</a> */
  def not(el: Element*): JQuery = js.native

  /** Remove an event handler. <br/>
    * See: <a href="http://api.jquery.com/off/">jQuery Docs</a> */
  def off(): JQuery = js.native

  /** Remove an event handler. <br/>
    * See: <a href="http://api.jquery.com/off/">jQuery Docs</a> */
  def off(events: String): JQuery = js.native

  /** Remove an event handler. <br/>
    * See: <a href="http://api.jquery.com/off/">jQuery Docs</a> */
  def off(jEvent: JQueryEvent, selector: Selector = js.native): JQuery = js.native

  /** Get the closest ancestor element that is positioned. <br/>
    * See: <a href="http://api.jquery.com/offsetParent/">jQuery Docs</a> */
  def offsetParent(): JQuery = js.native

  /** Set the CSS outer Height of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/outerHeight/">jQuery Docs</a> */
  def outerHeight(value: Int | Double | String): JQuery = js.native

  /** Set the CSS outer width of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/outerWidth/">jQuery Docs</a> */
  def outerWidth(value: Int | Double | String): JQuery = js.native

  /** Get the parent of each element in the current set of matched elements, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/parent/">jQuery Docs</a> */
  def parent(selector: Selector = js.native): JQuery = js.native

  /** Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/parents/">jQuery Docs</a> */
  def parents(selector: Selector = js.native): JQuery = js.native

  /** Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object. <br/>
    * See: <a href="http://api.jquery.com/parentsUntil/">jQuery Docs</a> */
  def parentsUntil(selector: Selector | Element | JQuery = js.native, filter: Selector = js.native): JQuery = js.native

  /** Insert content, specified by the parameter, to the beginning of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/prepend/">jQuery Docs</a> */
  def prepend(content: (String | Element | JQuery)*): JQuery = js.native

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

  /** Remove the set of matched elements from the DOM. <br/>
    * See: <a href="http://api.jquery.com/remove/">jQuery Docs</a> */
  def remove(selector: String = js.native): JQuery = js.native

  /** Remove an attribute from each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/removeAttr/">jQuery Docs</a> */
  def removeAttr(attributeName:String): JQuery = js.native

  /** Remove a single class, multiple classes, or all classes from each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/removeClass/">jQuery Docs</a> */
  def removeClass(className: String*): JQuery = js.native

  /** Remove a previously-stored piece of data. <br/>
    * See: <a href="http://api.jquery.com/removeData/">jQuery Docs</a> */
  def removeData(name: String = js.native): JQuery = js.native

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
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def resize(): JQuery = js.native

  /** Trigger scroll event on an element. <br/>
    * See: <a href="http://api.jquery.com/scroll/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.3.0", "1.2.0")
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
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def select(): JQuery = js.native

  /** Encode a set of form elements as a string for submission. <br/>
    * See: <a href="http://api.jquery.com/serialize/">jQuery Docs</a> */
  def serialize(): String = js.native

  /** Encode a set of form elements as an array of names and values. <br/>
    * See: <a href="http://api.jquery.com/serializeArray/">jQuery Docs</a> */
  def serializeArray[T](): js.Array[T] = js.native

  /** Display the matched elements. <br/>
    * See: <a href="http://api.jquery.com/show/">jQuery Docs</a> */
  def show(duration: Int = js.native, easing: EasingFunction = js.native): JQuery = js.native

  /** Get the siblings of each element in the set of matched elements, optionally filtered by a selector. <br/>
    * See: <a href="http://api.jquery.com/siblings/">jQuery Docs</a> */
  def siblings(selector: Selector = js.native): JQuery = js.native

  /** Reduce the set of matched elements to a subset specified by a range of indices. Including `start`, without `end`. <br/>
    * See: <a href="http://api.jquery.com/slice/">jQuery Docs</a> */
  def slice(start: Int, end: Int = js.native): JQuery = js.native

  /** Display the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideDown/">jQuery Docs</a> */
  def slideDown(duration: Int = js.native, easing: EasingFunction = js.native): JQuery = js.native

  /** Display or hide the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideToggle/">jQuery Docs</a> */
  def slideToggle(duration: Int = js.native, easing: EasingFunction = js.native): JQuery = js.native

  /** Hide the matched elements with a sliding motion. <br/>
    * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
  def slideUp(duration: Int = js.native, easing: EasingFunction = js.native): JQuery = js.native

  /** Stop the currently-running animation on the matched elements. <br/>
    * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
  def stop(queue: String = js.native, clearQueue: Boolean = js.native, jumpToEnd: Boolean = js.native): JQuery = js.native

  /** Trigger submit event on an element. <br/>
    * See: <a href="http://api.jquery.com/submit/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def submit(): JQuery = js.native

  /** Get the combined text contents of each element in the set of matched elements, including their descendants. <br/>
    * See: <a href="http://api.jquery.com/text/">jQuery Docs</a> */
  def text(): String = js.native

  /** Set the content of each element in the set of matched elements to the specified text. <br/>
    * See: <a href="http://api.jquery.com/text/#text-text/">jQuery Docs</a> */
  def text(text: String | Double | Int | Boolean): JQuery = js.native

  /** Display or hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
  def toggle(display: Boolean): JQuery = js.native

  /** Display or hide the matched elements. <br/>
    * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
  def toggle(duration: Int = js.native, easing: EasingFunction = js.native): JQuery = js.native

  /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
    * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
  def toggleClass(className: String): JQuery = js.native

  /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
    * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
  def toggleClass(className: String, state: Boolean): JQuery = js.native

  /** Execute all handlers and behaviors attached to the matched elements for the given event type. <br/>
    * See: <a href="http://api.jquery.com/trigger/">jQuery Docs</a> */
  def trigger(event: EventName | JQueryEvent): JQuery = js.native

  /** Execute all handlers attached to an element for an event. <br/>
    * See: <a href="http://api.jquery.com/triggerHandler/">jQuery Docs</a> */
  def triggerHandler(event: EventName | JQueryEvent): JQuery = js.native

  /** Remove the parents of the set of matched elements from the DOM, leaving the matched elements in their place. <br/>
    * See: <a href="http://api.jquery.com/unwrap/">jQuery Docs</a> */
  def unwrap(): JQuery = js.native

  /** Get the current value of the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/val/">jQuery Docs</a> */
  @JSName("val")
  def value(): String | Int | Double | js.Array[Any] = js.native

  /** Set the value of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/val/">jQuery Docs</a> */
  @JSName("val")
  def value(value: String | Int | Double | js.Array[Any]): JQuery = js.native

  /** Get the current computed width for the first element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/width/">jQuery Docs</a> */
  def width(): Double = js.native

  /** Set the CSS width of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/width/#width-value">jQuery Docs</a> */
  def width(value: String | Int | Double): JQuery = js.native

  /** Wrap an HTML structure around each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/wrap/">jQuery Docs</a> */
  def wrap(wrappingElement: Selector | Element | JQuery): JQuery = js.native

  /** Wrap an HTML structure around all elements in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/wrapAll/">jQuery Docs</a> */
  def wrapAll(wrappingElement: Selector | Element | JQuery): JQuery = js.native

  /** Wrap an HTML structure around the content of each element in the set of matched elements. <br/>
    * See: <a href="http://api.jquery.com/wrapInner/">jQuery Docs</a> */
  def wrapInner(wrappingElement: Selector | Element | JQuery): JQuery = js.native
}

object JQuery {
  trait CallbackRegistration {
    def unregister(): Unit
  }

  case class CallbackParameters(once: Boolean, selector: Selector, data: js.Any)
  case class CallbackRegistrationRef(event: EventName, callback: JQueryCallback, registration: CallbackRegistration)

  private val registrations: mutable.Map[Element, mutable.Buffer[CallbackRegistrationRef]] = mutable.Map[Element, mutable.Buffer[CallbackRegistrationRef]]()

  implicit class JQueryWrapper(private val jquery: JQuery) {
    import js.JSConverters._

    class OnCallbackRegistration(event: EventName, callback: JQueryCallback,
                                 reg: (ThisFunction1[Element, JQueryEvent, Any]) => Any,
                                 unreg: (String, ThisFunction1[Element, JQueryEvent, Any]) => js.Any = (event, c) => jquery.asInstanceOf[js.Dynamic].off(event, c))
      extends CallbackRegistration {
      private val c: ThisFunction1[Element, JQueryEvent, Any] = callback
      reg(c)

      override def unregister(): Unit = unreg(event, c)
    }

    /** Adds the specified class(es) to each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/addClass/">jQuery Docs</a> */
    def addClass(classNames: Seq[String]): JQuery =
      jquery.asInstanceOf[js.Dynamic].addClass(classNames.toJSArray).asInstanceOf[JQuery]

    /** Adds the specified class(es) to each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/addClass/">jQuery Docs</a> */
    def addClass(function: (Int) => String): JQuery =
      jquery.asInstanceOf[js.Dynamic].addClass(function).asInstanceOf[JQuery]

    /** Adds the specified class(es) to each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/addClass/">jQuery Docs</a> */
    def addClass(function: (Int, String) => String): JQuery =
      jquery.asInstanceOf[js.Dynamic].addClass(function).asInstanceOf[JQuery]

    /** Perform a custom animation of a set of CSS properties. <br/>
      * See: <a href="http://api.jquery.com/animate/">jQuery Docs</a> */
    def animate(properties: Map[String, Any], duration: Int = 400, easing: EasingFunction = EasingFunction.swing, callback: (Element) => Any = (_) => {}): JQuery =
      jquery.asInstanceOf[js.Dynamic].animate(properties.toJSDictionary, duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Perform a custom animation of a set of CSS properties. <br/>
      * See: <a href="http://api.jquery.com/animate/">jQuery Docs</a> */
    def animate(properties: Map[String, Any], options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].animate(properties.toJSDictionary, options.toJSDictionary).asInstanceOf[JQuery]

    /** Insert content, specified by the parameter, to the end of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/append/">jQuery Docs</a> */
    def append(function: (Element, Int, String) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].append(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Get the value of an attribute for the first element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/attr/#attr-attributeName">jQuery Docs</a> */
    def attr(attributeName: String): Option[String] =
      jquery.asInstanceOf[js.Dynamic].attr(attributeName).asInstanceOf[UndefOr[String]].toOption

    /** Set one or more attributes for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/attr/#attr-attributeName-value">jQuery Docs</a> */
    def attr(attributes: Map[String, String | Int | Double | Boolean]): JQuery =
      jquery.asInstanceOf[js.Dynamic].attr(attributes.toJSDictionary).asInstanceOf[JQuery]

    /** Set one or more attributes for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/attr/#attr-attributeName-value">jQuery Docs</a> */
    def attr(attributeName: String, function: (Int, String) => String | Int | Double | Boolean): JQuery =
      jquery.asInstanceOf[js.Dynamic].attr(attributeName, function).asInstanceOf[JQuery]

    /** Insert content, specified by the parameter, before each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/before/">jQuery Docs</a> */
    def before(content: (Int, String) => String | Element | JQuery): JQuery =
      jquery.asInstanceOf[js.Dynamic].before(content).asInstanceOf[JQuery]

    /** Bind an event handler to the "blur" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def blur(callback: JQueryCallback): JQuery = on("blur", callback)

    /** Bind an event handler to the "blur" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def blur(data: js.Any, callback: JQueryCallback): JQuery = on("blur", data, callback)

    /** Bind an event handler to the "change" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def change(callback: JQueryCallback): JQuery = on("change", callback)

    /** Bind an event handler to the "change" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/blur/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def change(data: js.Any, callback: JQueryCallback): JQuery = on("change", data, callback)

    /** Bind an event handler to the "click" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/click/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def click(callback: JQueryCallback): JQuery = on("click", callback)

    /** Bind an event handler to the "click" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/click/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def click(data: js.Any, callback: JQueryCallback): JQuery = on("click", data, callback)

    /** Bind an event handler to the "contextmenu" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/contextmenu/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def contextMenu(callback: JQueryCallback): JQuery = on("contextmenu", callback)

    /** Bind an event handler to the "contextmenu" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/contextmenu/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def contextMenu(data: js.Any, callback: JQueryCallback): JQuery = on("contextmenu", data, callback)

    /** Set one or more CSS properties for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/css/#css-propertyName-value">jQuery Docs</a> */
    def css(propertyNames: Map[String, String | Int | Double | Boolean]): JQuery =
      jquery.asInstanceOf[js.Dynamic].css(propertyNames.toJSDictionary).asInstanceOf[JQuery]

    /** Set one or more CSS properties for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/css/#css-propertyName-value">jQuery Docs</a> */
    def css(attributeName: String, attributeFun: (Int, String) => String | Int | Double | Boolean): JQuery =
      jquery.asInstanceOf[js.Dynamic].css(attributeName, attributeFun).asInstanceOf[JQuery]

    /** Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute. <br/>
      * See: <a href="http://api.jquery.com/data/#data-key">jQuery Docs</a> */
    def data(key: String): Option[Any] =
      jquery.asInstanceOf[js.Dynamic].data(key).asInstanceOf[UndefOr[Any]].toOption

    /** Store arbitrary data associated with the matched elements. <br/>
      * See: <a href="http://api.jquery.com/data/#data-key-value">jQuery Docs</a> */
    def data(obj: Map[String, Any]): JQuery =
      jquery.asInstanceOf[js.Dynamic].data(obj.toJSDictionary).asInstanceOf[JQuery]

    /** Bind an event handler to the "dblclick" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/dblclick/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def dblClick(callback: JQueryCallback): JQuery = on("dblclick", callback)

    /** Bind an event handler to the "dblclick" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/dblclick/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def dblClick(data: js.Any, callback: JQueryCallback): JQuery = on("dblclick", data, callback)

    /** Iterate over a jQuery object, executing a function for each matched element. <br/>
      * See: <a href="http://api.jquery.com/each/">jQuery Docs</a> */
    def each(callback: (Element, Int) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].each(js.ThisFunction.fromFunction2(callback)).asInstanceOf[JQuery]

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
    def fadeIn(duration: Int, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].fadeIn(duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Display the matched elements by fading them to opaque. <br/>
      * See: <a href="http://api.jquery.com/fadeIn/">jQuery Docs</a> */
    def fadeIn(options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].fadeIn(options.toJSDictionary).asInstanceOf[JQuery]

    /** Hide the matched elements by fading them to transparent. <br/>
      * See: <a href="http://api.jquery.com/fadeOut/">jQuery Docs</a> */
    def fadeOut(duration: Int, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].fadeOut(duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Hide the matched elements by fading them to transparent. <br/>
      * See: <a href="http://api.jquery.com/fadeOut/">jQuery Docs</a> */
    def fadeOut(options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].fadeOut(options.toJSDictionary).asInstanceOf[JQuery]

    /** Adjust the opacity of the matched elements. <br/>
      * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
    def fadeTo(duration: Int, opacity: Double, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].fadeTo(duration, opacity, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Adjust the opacity of the matched elements. <br/>
      * See: <a href="http://api.jquery.com/fadeTo/">jQuery Docs</a> */
    def fadeTo(duration: Int, opacity: Double, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].fadeTo(duration, opacity, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Display or hide the matched elements by animating their opacity. <br/>
      * See: <a href="http://api.jquery.com/fadeToggle/">jQuery Docs</a> */
    def fadeToggle(duration: Int, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].fadeToggle(duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Display or hide the matched elements by animating their opacity. <br/>
      * See: <a href="http://api.jquery.com/fadeToggle/">jQuery Docs</a> */
    def fadeToggle(options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].fadeToggle(options.toJSDictionary).asInstanceOf[JQuery]

    /** Reduce the set of matched elements to those that match the selector or pass the function's test. <br/>
      * See: <a href="http://api.jquery.com/filter/">jQuery Docs</a> */
    def filter(function: (Element, Int, Element) => Boolean): JQuery =
      jquery.asInstanceOf[js.Dynamic].filter(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Bind an event handler to the "focus" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focus/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def focus(callback: JQueryCallback): JQuery = on("focus", callback)

    /** Bind an event handler to the "focus" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focus/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def focus(data: js.Any, callback: JQueryCallback): JQuery = on("focus", data, callback)

    /** Bind an event handler to the "focusIn" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focusIn/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def focusIn(callback: JQueryCallback): JQuery = on("focusin", callback)

    /** Bind an event handler to the "focusIn" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focusIn/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def focusIn(data: js.Any, callback: JQueryCallback): JQuery = on("focusin", data, callback)

    /** Bind an event handler to the "focusOut" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focusOut/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def focusOut(callback: JQueryCallback): JQuery = on("focusout", callback)

    /** Bind an event handler to the "focusOut" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/focusOut/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def focusOut(data: js.Any, callback: JQueryCallback): JQuery = on("focusout", data, callback)

    /** Retrieve one of the elements matched by the jQuery object. <br/>
      * See: <a href="http://api.jquery.com/get/#get-index">jQuery Docs</a> */
    def get(index: Int): Option[Element] =
      jquery.asInstanceOf[js.Dynamic].get(index).asInstanceOf[UndefOr[Element]].toOption

    /** Retrieve the elements matched by the jQuery object. <br/>
      * See: <a href="http://api.jquery.com/get/#get">jQuery Docs</a> */
    def get(): Seq[Element] =
      jquery.asInstanceOf[js.Dynamic].get().asInstanceOf[js.Array[Element]].toSeq

    /** Set the CSS height of every matched element. <br/>
      * See: <a href="http://api.jquery.com/height/#height-value">jQuery Docs</a> */
    def height(function: (Element, Int, Int) => String | Int | Double): JQuery =
      jquery.asInstanceOf[js.Dynamic].height(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Hide the matched elements. <br/>
      * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
    def hide(duration: Int, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].hide(duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Hide the matched elements. <br/>
      * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
    def hide(options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].hide(options.toJSDictionary).asInstanceOf[JQuery]

    /** Bind two handlers to the matched elements, to be executed when the mouse pointer enters and leaves the elements. <br/>
      * See: <a href="http://api.jquery.com/hover/">jQuery Docs</a> */
    def hover(handlerIn: (Element) => Any, handlerOut: (Element) => Any): JQuery = {
      on("mouseenter", (el, _) => handlerIn(el))
      on("mouseleave", (el, _) => handlerOut(el))
      jquery
    }

    /** Bind a single handler to the matched elements, to be executed when the mouse pointer enters or leaves the elements. <br/>
      * See: <a href="http://api.jquery.com/hover/">jQuery Docs</a> */
    def hover(handlerInOut: (Element) => Any): JQuery = hover(handlerInOut, handlerInOut)

    /** Set the CSS inner height of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/innerHeight/#innerHeight-value">jQuery Docs</a> */
    def innerHeight(function: (Element, Int, Double) => Int | Double | String): JQuery =
      jquery.asInstanceOf[js.Dynamic].innerHeight(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Set the CSS inner width of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/innerWidth/#innerWidth-value">jQuery Docs</a> */
    def innerWidth(function: (Element, Int, Double) => Int | Double | String): JQuery =
      jquery.asInstanceOf[js.Dynamic].innerWidth(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Check the current matched set of elements against a selector, element, or jQuery object and return true if at least one of these elements matches the given arguments. <br/>
      * See: <a href="http://api.jquery.com/is/">jQuery Docs</a> */
    def is(function: (Element, Int, Element) => Boolean): Boolean =
      jquery.asInstanceOf[js.Dynamic].is(js.ThisFunction.fromFunction3(function)).asInstanceOf[Boolean]

    /** Bind an event handler to the "keydown" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keydown/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def keyDown(callback: JQueryCallback): JQuery = on("keydown", callback)

    /** Bind an event handler to the "keydown" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keydown/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def keyDown(data: js.Any, callback: JQueryCallback): JQuery = on("keydown", data, callback)

    /** Bind an event handler to the "keypress" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keypress/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def keyPress(callback: JQueryCallback): JQuery = on("keypress", callback)

    /** Bind an event handler to the "keypress" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keypress/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def keyPress(data: js.Any, callback: JQueryCallback): JQuery = on("keypress", data, callback)

    /** Bind an event handler to the "keyup" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keyup/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def keyUp(callback: JQueryCallback): JQuery = on("keyup", callback)

    /** Bind an event handler to the "keyup" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/keyup/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def keyUp(data: js.Any, callback: JQueryCallback): JQuery = on("keyup", data, callback)

    /** Load data from the server and place the returned HTML into the matched element. <br/>
      * See: <a href="http://api.jquery.com/load/">jQuery Docs</a> */
    def load(url: String, data: js.Any, callback: (Element, String, String, JQueryXHR) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].load(url, data, js.ThisFunction.fromFunction4(callback)).asInstanceOf[JQuery]

    /** Pass each element in the current matched set through a function, producing a new jQuery object containing the return values. <br/>
      * See: <a href="http://api.jquery.com/map/">jQuery Docs</a> */
    def map(callback: (Int, Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].map(js.ThisFunction.fromFunction2(callback)).asInstanceOf[JQuery]

    /** Bind an event handler to the "mousedown" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mousedown/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseDown(callback: JQueryCallback): JQuery = on("mousedown", callback)

    /** Bind an event handler to the "mousedown" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mousedown/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseDown(data: js.Any, callback: JQueryCallback): JQuery = on("mousedown", data, callback)

    /** Bind an event handler to the "mouseenter" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseenter/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseEnter(callback: JQueryCallback): JQuery = on("mouseenter", callback)

    /** Bind an event handler to the "mouseenter" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseenter/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseEnter(data: js.Any, callback: JQueryCallback): JQuery = on("mouseenter", data, callback)

    /** Bind an event handler to the "mouseleave" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseleave/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseLeave(callback: JQueryCallback): JQuery = on("mouseleave", callback)

    /** Bind an event handler to the "mouseleave" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseleave/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseLeave(data: js.Any, callback: JQueryCallback): JQuery = on("mouseleave", data, callback)

    /** Bind an event handler to the "mousemove" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mousemove/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseMove(callback: JQueryCallback): JQuery = on("mousemove", callback)

    /** Bind an event handler to the "mousemove" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mousemove/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseMove(data: js.Any, callback: JQueryCallback): JQuery = on("mousemove", data, callback)

    /** Bind an event handler to the "mouseout" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseout/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseOut(callback: JQueryCallback): JQuery = on("mouseout", callback)

    /** Bind an event handler to the "mouseout" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseout/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseOut(data: js.Any, callback: JQueryCallback): JQuery = on("mouseout", data, callback)

    /** Bind an event handler to the "mouseover" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseover/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseOver(callback: JQueryCallback): JQuery = on("mouseover", callback)

    /** Bind an event handler to the "mouseover" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseover/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseOver(data: js.Any, callback: JQueryCallback): JQuery = on("mouseover", data, callback)

    /** Bind an event handler to the "mouseup" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseup/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseUp(callback: JQueryCallback): JQuery = on("mouseup", callback)

    /** Bind an event handler to the "mouseup" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/mouseup/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def mouseUp(data: js.Any, callback: JQueryCallback): JQuery = on("mouseup", data, callback)

    /** Remove elements from the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/not/">jQuery Docs</a> */
    def not(function: (Element, Int, Element) => Boolean): JQuery =
      jquery.asInstanceOf[js.Dynamic].not(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Get the current coordinates of the first element in the set of matched elements, relative to the document. <br/>
      * See: <a href="http://api.jquery.com/offset/">jQuery Docs</a> */
    def offset(): Offset = {
      val o = jquery.asInstanceOf[js.Dynamic].offset().asInstanceOf[js.Dictionary[Double]]
      Offset(o("top"), o("left"))
    }

    /** Get the current coordinates of the first element in the set of matched elements, relative to the document. <br/>
      * See: <a href="http://api.jquery.com/offset/">jQuery Docs</a> */
    def offset(coordinates: Offset): JQuery  =
      jquery.asInstanceOf[js.Dynamic].offset(coordinates.toJSDictionary).asInstanceOf[JQuery]

    /** Attach an event handler function for one or more events to the selected elements. <br/>
      * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
    def on(event: EventName, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(false, null, null))
      jquery
    }

    /** Attach an event handler function for one or more events to the selected elements. <br/>
      * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
    def on(event: EventName, data: js.Any, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(false, null, data))
      jquery
    }

    /** Attach an event handler function for one or more events to the selected elements. <br/>
      * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
    def on(event: EventName, selector: Selector, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(false, selector, null))
      jquery
    }

    /** Attach an event handler function for one or more events to the selected elements. <br/>
      * See: <a href="http://api.jquery.com/on/">jQuery Docs</a> */
    def on(event: EventName, selector: Selector, data: js.Any, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(false, selector, data))
      jquery
    }

    /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
      * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
    def one(event: EventName, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(true, null, null))
      jquery
    }

    /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
      * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
    def one(event: EventName, data: js.Any, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(true, null, data))
      jquery
    }

    /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
      * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
    def one(event: EventName, selector: Selector, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(true, selector, null))
      jquery
    }

    /** Attach a handler to an event for the elements. The handler is executed at most once per element per event type. <br/>
      * See: <a href="http://api.jquery.com/one/">jQuery Docs</a> */
    def one(event: EventName, selector: Selector, data: js.Any, callback: JQueryCallback): JQuery = {
      separateCallbacks(event, callback, new CallbackParameters(true, selector, data))
      jquery
    }

    /** Remove an event handler. <br/>
      * See: <a href="http://api.jquery.com/off/">jQuery Docs</a> */
    def off(event: EventName, callback: JQueryCallback): JQuery = {
      jquery.asInstanceOf[js.Dynamic].toArray().asInstanceOf[js.Array[Element]]
        .foreach( el => {
          if (registrations.contains(el)) {
            val jqueryRegs: mutable.Buffer[CallbackRegistrationRef] = registrations(el)
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

    private def separateCallbacks(event: EventName, callback: JQueryCallback, params: CallbackParameters): Unit = {

      type ThisFunctionCallback = ThisFunction1[Element, JQueryEvent, Any]

      jquery.asInstanceOf[js.Dynamic].each(js.ThisFunction.fromFunction2((element: Element, idx: Int) => {
        val cb = params match {
          case CallbackParameters(false, null, null) => c: ThisFunctionCallback => jQ(element).asInstanceOf[js.Dynamic].on(event, c)
          case CallbackParameters(false, null, data) => c: ThisFunctionCallback => jQ(element).asInstanceOf[js.Dynamic].on(event, data, c)
          case CallbackParameters(false, selector, null) => c: ThisFunctionCallback => jQ(element).asInstanceOf[js.Dynamic].on(event, selector, c)
          case CallbackParameters(false, selector, data) => c: ThisFunctionCallback => jQ(element).asInstanceOf[js.Dynamic].on(event, selector, data, c)

          case CallbackParameters(true, null, null) => c: ThisFunctionCallback => jQ(element).asInstanceOf[js.Dynamic].one(event, c)
          case CallbackParameters(true, null, data) => c: ThisFunctionCallback => jQ(element).asInstanceOf[js.Dynamic].one(event, data, c)
          case CallbackParameters(true, selector, null) => c: ThisFunctionCallback => jQ(element).asInstanceOf[js.Dynamic].one(event, selector, c)
          case CallbackParameters(true, selector, data) => c: ThisFunctionCallback => jQ(element).asInstanceOf[js.Dynamic].one(event, selector, data, c)
        }

        val registration: CallbackRegistration = new OnCallbackRegistration(event, callback, cb)
        collectRegistration(event, callback, element, idx, params, registration)
      }))
    }

    private def collectRegistration(event: EventName, callback: JQueryCallback, el: Element, index: Int, params: CallbackParameters, reg: CallbackRegistration) = {
      val jqueryRegs: mutable.Buffer[CallbackRegistrationRef] = registrations.getOrElse(el, mutable.Buffer[CallbackRegistrationRef]())
      jqueryRegs += CallbackRegistrationRef(event, callback, reg)
      registrations.update(el, jqueryRegs)
    }

    /** Get the current computed height for the first element in the set of matched elements, including padding,
      * border, and optionally margin. Returns a number (without "px") representation of the value or undef
      * if called on an empty set of elements. <br/>
      * See: <a href="http://api.jquery.com/outerHeight/">jQuery Docs</a> */
    def outerHeight(includeMargin: Boolean = false): Option[Double] =
      jquery.asInstanceOf[js.Dynamic].outerHeight(includeMargin).asInstanceOf[UndefOr[Double]].toOption

    /** Set the CSS outer Height of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/outerHeight/">jQuery Docs</a> */
    def outerHeight(function: (Element, Int, Double) => Double): JQuery =
      jquery.asInstanceOf[js.Dynamic].outerHeight(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Get the current computed width for the first element in the set of matched elements, including padding and border. <br/>
      * See: <a href="http://api.jquery.com/outerWidth/">jQuery Docs</a> */
    def outerWidth(includeMargin: Boolean = false): Option[Double] =
      jquery.asInstanceOf[js.Dynamic].outerWidth(includeMargin).asInstanceOf[UndefOr[Double]].toOption

    /** Set the CSS outer width of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/outerWidth/">jQuery Docs</a> */
    def outerWidth(function: (Element, Int, Double) => Double): JQuery =
      jquery.asInstanceOf[js.Dynamic].outerWidth(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Get the current coordinates of the first element in the set of matched elements, relative to the offset parent. <br/>
      * See: <a href="http://api.jquery.com/position/">jQuery Docs</a> */
    def position(): Position = {
      val p = jquery.asInstanceOf[js.Dynamic].position().asInstanceOf[js.Dictionary[Double]]
      Position(p("top"), p("left"))
    }

    /** Insert content, specified by the parameter, to the beginning of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/prepend/">jQuery Docs</a> */
    def prepend(function: (Element, Int, String) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].prepend(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Set one or more properties for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/prop/">jQuery Docs</a> */
    def prop(propertyName: String, function: (Element, Int, Any) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].prop(propertyName, js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Set one or more properties for the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/prop/">jQuery Docs</a> */
    def prop(properties: Map[String, Any]): JQuery =
      jquery.asInstanceOf[js.Dynamic].prop(properties.toJSDictionary).asInstanceOf[JQuery]

    /** Add a collection of DOM elements onto the jQuery stack. <br/>
      * See: <a href="http://api.jquery.com/pushStack/">jQuery Docs</a> */
    def pushStack(elements: Seq[Any]): JQuery =
      jquery.asInstanceOf[js.Dynamic].pushStack(elements.toJSArray).asInstanceOf[JQuery]

    /** Add a collection of DOM elements onto the jQuery stack. <br/>
      * See: <a href="http://api.jquery.com/pushStack/">jQuery Docs</a> */
    def pushStack(elements: Seq[Any], name: String, arguments: Seq[Any]): JQuery =
      jquery.asInstanceOf[js.Dynamic].pushStack(elements.toJSArray, name, arguments.toJSArray).asInstanceOf[JQuery]

    /** Specify a function to execute when the DOM is fully loaded. <br/>
      * See: <a href="http://api.jquery.com/ready/">jQuery Docs</a> */
    @deprecated("Use jQ(callback) instead.", "1.1.0")
    def ready(callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].ready(js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Remove a single class, multiple classes, or all classes from each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/removeClass/">jQuery Docs</a> */
    def removeClass(classNames: Seq[String]): JQuery =
      jquery.asInstanceOf[js.Dynamic].removeClass(classNames.toJSArray).asInstanceOf[JQuery]

    /** Remove a single class, multiple classes, or all classes from each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/removeClass/">jQuery Docs</a> */
    def removeClass(function: (Int, String) => String): JQuery =
      jquery.asInstanceOf[js.Dynamic].removeClass(function).asInstanceOf[JQuery]

    /** Remove a previously-stored piece of data. <br/>
      * See: <a href="http://api.jquery.com/removeData/">jQuery Docs</a> */
    def removeData(list: String*): JQuery =
      jquery.asInstanceOf[js.Dynamic].removeData(list.toJSArray).asInstanceOf[JQuery]

    /** Bind an event handler to the "resize" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/resize/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def resize(callback: JQueryCallback): JQuery = on("resize", callback)

    /** Bind an event handler to the "resize" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/resize/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def resize(data: js.Any, callback: JQueryCallback): JQuery = on("resize", data, callback)

    /** Bind an event handler to the "scroll" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/scroll/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def scroll(callback: JQueryCallback): JQuery = on("scroll", callback)

    /** Bind an event handler to the "scroll" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/scroll/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def scroll(data: js.Any, callback: JQueryCallback): JQuery = on("scroll", data, callback)

    /** Bind an event handler to the "select" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/select/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def select(callback: JQueryCallback): JQuery = on("select", callback)

    /** Bind an event handler to the "select" JavaScript event on an element. <br/>
      * See: <a href="http://api.jquery.com/select/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def select(data: js.Any, callback: JQueryCallback): JQuery = on("select", data, callback)

    /** Display the matched elements. <br/>
      * See: <a href="http://api.jquery.com/show/">jQuery Docs</a> */
    def show(duration: Int, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].show(duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Display the matched elements. <br/>
      * See: <a href="http://api.jquery.com/hide/">jQuery Docs</a> */
    def show(options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].show(options.toJSDictionary).asInstanceOf[JQuery]

    /** Display the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideDown/">jQuery Docs</a> */
    def slideDown(duration: Int, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].slideDown(duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Display the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideDown/">jQuery Docs</a> */
    def slideDown(options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].slideDown(options.toJSDictionary).asInstanceOf[JQuery]

    /** Display or hide the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideToggle/">jQuery Docs</a> */
    def slideToggle(duration: Int, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].slideToggle(duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Display or hide the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideToggle/">jQuery Docs</a> */
    def slideToggle(options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].slideToggle(options.toJSDictionary).asInstanceOf[JQuery]

    /** Hide the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
    def slideUp(duration: Int, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].slideUp(duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Hide the matched elements with a sliding motion. <br/>
      * See: <a href="http://api.jquery.com/slideUp/">jQuery Docs</a> */
    def slideUp(options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].slideUp(options.toJSDictionary).asInstanceOf[JQuery]

    /** Trigger submit event on an element. <br/>
      * See: <a href="http://api.jquery.com/submit/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def submit(callback: JQueryCallback): JQuery = on("submit", callback)

    /** Trigger submit event on an element. <br/>
      * See: <a href="http://api.jquery.com/submit/">jQuery Docs</a> */
    @deprecated("Since jQuery 3.3.0", "1.2.0")
    def submit(data: js.Any, callback: JQueryCallback): JQuery = on("submit", data, callback)

    /** Set the content of each element in the set of matched elements to the specified text. <br/>
      * See: <a href="http://api.jquery.com/text/#text-text/">jQuery Docs</a> */
    def text(function: (Element, Int, String) => String): JQuery =
      jquery.asInstanceOf[js.Dynamic].text(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Retrieve all the elements contained in the jQuery set, as an array. <br/>
      * See: <a href="http://api.jquery.com/toArray/">jQuery Docs</a> */
    def toArray: Seq[Element] =
      jquery.asInstanceOf[js.Dynamic].toArray().asInstanceOf[js.Array[Element]].toSeq

    /** Display or hide the matched elements. <br/>
      * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
    def toggle(duration: Int, easing: EasingFunction, callback: (Element) => Any): JQuery =
      jquery.asInstanceOf[js.Dynamic].toggle(duration, easing, js.ThisFunction.fromFunction1(callback)).asInstanceOf[JQuery]

    /** Display or hide the matched elements. <br/>
      * See: <a href="http://api.jquery.com/toggle/">jQuery Docs</a> */
    def toggle(options: AnimationOptions): JQuery =
      jquery.asInstanceOf[js.Dynamic].toggle(options.toJSDictionary).asInstanceOf[JQuery]

    /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
      * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
    def toggleClass(classNames: Seq[String]): JQuery =
      jquery.asInstanceOf[js.Dynamic].toggleClass(classNames.toJSArray).asInstanceOf[JQuery]

    /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
      * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
    def toggleClass(function: (Int, String, Boolean) => String): JQuery =
      jquery.asInstanceOf[js.Dynamic].toggleClass(function).asInstanceOf[JQuery]

    /** Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument. <br/>
      * See: <a href="http://api.jquery.com/toggleClass/">jQuery Docs</a> */
    def toggleClass(function: (Int, String, Boolean) => String, state: Boolean): JQuery =
      jquery.asInstanceOf[js.Dynamic].toggleClass(function, state).asInstanceOf[JQuery]

    /** Execute all handlers and behaviors attached to the matched elements for the given event type. <br/>
      * See: <a href="http://api.jquery.com/trigger/">jQuery Docs</a> */
    def trigger(event: EventName | JQueryEvent, extraParams: Map[String, Any]): JQuery =
      jquery.asInstanceOf[js.Dynamic].trigger(event.asInstanceOf[js.Dynamic], extraParams.toJSDictionary).asInstanceOf[JQuery]

    /** Execute all handlers and behaviors attached to the matched elements for the given event type. <br/>
      * See: <a href="http://api.jquery.com/trigger/">jQuery Docs</a> */
    def trigger(event: EventName | JQueryEvent, extraParams: Seq[Any]): JQuery =
      jquery.asInstanceOf[js.Dynamic].trigger(event.asInstanceOf[js.Dynamic], extraParams.toJSArray).asInstanceOf[JQuery]

    /** Execute all handlers attached to an element for an event. <br/>
      * See: <a href="http://api.jquery.com/triggerHandler/">jQuery Docs</a> */
    def triggerHandler(event: EventName | JQueryEvent, extraParams: Map[String, Any]): JQuery =
      jquery.asInstanceOf[js.Dynamic].triggerHandler(event.asInstanceOf[js.Dynamic], extraParams.toJSDictionary).asInstanceOf[JQuery]

    /** Execute all handlers attached to an element for an event. <br/>
      * See: <a href="http://api.jquery.com/triggerHandler/">jQuery Docs</a> */
    def triggerHandler(event: EventName | JQueryEvent, extraParams: Seq[Any]): JQuery =
      jquery.asInstanceOf[js.Dynamic].triggerHandler(event.asInstanceOf[js.Dynamic], extraParams.toJSArray).asInstanceOf[JQuery]

    /** Set the value of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/val/">jQuery Docs</a> */
    def value(function: (Element, Int, String) => String): JQuery =
      jquery.asInstanceOf[js.Dynamic].value(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Set the CSS width of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/height/#height-value">jQuery Docs</a> */
    def width(function: (Element, Int, Int) => String | Int | Double): JQuery =
      jquery.asInstanceOf[js.Dynamic].width(js.ThisFunction.fromFunction3(function)).asInstanceOf[JQuery]

    /** Wrap an HTML structure around each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/wrap/">jQuery Docs</a> */
    def wrap(function: (Element, Int) => String | JQuery): JQuery =
      jquery.asInstanceOf[js.Dynamic].wrap(js.ThisFunction.fromFunction2(function)).asInstanceOf[JQuery]

    /** Wrap an HTML structure around all elements in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/wrapAll/">jQuery Docs</a> */
    def wrapAll(function: (Element, Int) => String | JQuery): JQuery =
      jquery.asInstanceOf[js.Dynamic].wrapAll(js.ThisFunction.fromFunction2(function)).asInstanceOf[JQuery]

    /** Wrap an HTML structure around the content of each element in the set of matched elements. <br/>
      * See: <a href="http://api.jquery.com/wrapInner/">jQuery Docs</a> */
    def wrapInner(function: (Element, Int) => String | JQuery): JQuery =
      jquery.asInstanceOf[js.Dynamic].wrapInner(js.ThisFunction.fromFunction2(function)).asInstanceOf[JQuery]
  }
}


package io.udash.wrappers.jquery

import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait JQueryStatic extends js.Object {
  import scala.scalajs.js.`|`

  /** Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string. <br/>
    * See: <a href="http://api.jquery.com/jQuery/">jQuery Docs</a> */
  def apply(): JQuery = js.native

  /** Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string. <br/>
    * See: <a href="http://api.jquery.com/jQuery/">jQuery Docs</a> */
  def apply(selector: Selector, context: Element | JQuery): JQuery = js.native

  /** Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string. <br/>
    * See: <a href="http://api.jquery.com/jQuery/">jQuery Docs</a> */
  def apply(selector: Selector): JQuery = js.native

  /** Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string. <br/>
    * See: <a href="http://api.jquery.com/jQuery/">jQuery Docs</a> */
  def apply(element: Element): JQuery = js.native

  /** Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string. <br/>
    * See: <a href="http://api.jquery.com/jQuery/">jQuery Docs</a> */
  def apply(`object`: js.Any): JQuery = js.native

  /** Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string. <br/>
    * See: <a href="http://api.jquery.com/jQuery/">jQuery Docs</a> */
  def apply(jq: JQuery): JQuery = js.native

  /** Binds a function to be executed when the DOM has finished loading. <br/>
    * See: <a href="http://api.jquery.com/jQuery/#jQuery-callback">jQuery Docs</a> */
  def apply(callback: js.Function0[js.Any]): JQuery = js.native

  /** Creates DOM elements on the fly from the provided string of raw HTML. <br/>
    * See: <a href="http://api.jquery.com/jQuery/#jQuery-callback">jQuery Docs</a> */
  def apply(html: String, document: Document = js.native): JQuery = js.native

  /** Creates DOM elements on the fly from the provided string of raw HTML. <br/>
    * See: <a href="http://api.jquery.com/jQuery/#jQuery-callback">jQuery Docs</a> */
  def apply(html: String, attrs: js.Any): JQuery = js.native

  /** Perform an asynchronous HTTP (Ajax) request. <br/>
    * See: <a href="http://api.jquery.com/jQuery.ajax/">jQuery Docs</a> */
  def ajax(settings: JQueryAjaxSettings): JQueryXHR = js.native

  /** Perform an asynchronous HTTP (Ajax) request. <br/>
    * See: <a href="http://api.jquery.com/jQuery.ajax/">jQuery Docs</a> */
  def ajax(url: String, settings: JQueryAjaxSettings = js.native): JQueryXHR = js.native

  /** A multi-purpose callbacks list object that provides a powerful way to manage callback lists. <br/>
    * See: <a href="http://api.jquery.com/jQuery.Callbacks/">jQuery Docs</a> */
  @JSName("Callbacks")
  def callbacks[FunType <: js.Function1[ArgType, js.Any], ArgType](flags: String = js.native): JQueryCallbacks[FunType, ArgType] = js.native

  /** Check to see if a DOM element is a descendant of another DOM element. <br/>
    * See: <a href="http://api.jquery.com/jQuery.contains/">jQuery Docs</a> */
  def contains(container: Element, contained: Element): Boolean = js.native

  /** Store arbitrary data associated with the specified element. Returns the value that was set. <br/>
    * See: <a href="http://api.jquery.com/jQuery.data/">jQuery Docs</a> */
  def data(element: Element, key: String, value: js.Any): js.Any = js.native

  /** A factory function that returns a chainable utility object with methods to register multiple callbacks into callback queues,
    * invoke callback queues, and relay the success or failure state of any synchronous or asynchronous function. <br/>
    * See: <a href="http://api.jquery.com/jQuery.Deferred/">jQuery Docs</a> */
  @JSName("Deferred")
  def deferred[FunType <: js.Function1[ArgType, js.Any], ArgType](beforeStart: JQueryDeferred[_, _] = js.native): JQueryDeferred[FunType, ArgType] = js.native

  /** Execute the next function on the queue for the matched element. <br/>
    * See: <a href="http://api.jquery.com/jQuery.dequeue/">jQuery Docs</a> */
  def dequeue(element: Element, queueName: String): Unit = js.native

  /** Escapes any character that has a special meaning in a CSS selector. <br/>
    * See: <a href="http://api.jquery.com/jQuery.escapeSelector/">jQuery Docs</a> */
  def escapeSelector(index: Int): JQuery = js.native

  /** Load data from the server using a HTTP GET request. <br/>
    * See: <a href="http://api.jquery.com/jQuery.get/">jQuery Docs</a> */
  def get(settings: JQueryAjaxSettings): Unit = js.native

  /** Execute some JavaScript code globally. <br/>
    * See: <a href="http://api.jquery.com/jQuery.globalEval/">jQuery Docs</a> */
  def globalEval(code: String): Unit = js.native

  /** Determine whether an element has any jQuery data associated with it. <br/>
    * See: <a href="http://api.jquery.com/jQuery.hasData/">jQuery Docs</a> */
  def hasData(element: Element): Boolean = js.native

  /** Determine whether an element has any jQuery data associated with it. <br/>
    * See: <a href="http://api.jquery.com/jQuery.holdReady/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.2.0", "1.1.0")
  def holdReady(hold: Boolean): Unit = js.native

  /** Determine whether the argument is an array. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isArray/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.2.0", "1.1.0")
  def isArray[T](el: js.Any): Boolean = js.native

  /** Check to see if an object is empty (contains no enumerable properties). <br/>
    * See: <a href="http://api.jquery.com/jQuery.isEmptyObject/">jQuery Docs</a> */
  def isEmptyObject[T](el: js.Any): Boolean = js.native

  /** Determine if the argument passed is a JavaScript function object. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isFunction/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def isFunction[T](el: js.Any): Boolean = js.native

  /** Determines whether its argument is a number. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isNumeric/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def isNumeric[T](el: js.Any): Boolean = js.native

  /** Check to see if an object is a plain object (created using "{}" or "new Object"). <br/>
    * See: <a href="http://api.jquery.com/jQuery.isPlainObject/">jQuery Docs</a> */
  def isPlainObject[T](el: js.Any): Boolean = js.native

  /** Determine whether the argument is a window. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isWindow/">jQuery Docs</a> */
  @deprecated("Since jQuery 3.3.0", "1.2.0")
  def isWindow[T](el: js.Any): Boolean = js.native

  /** Check to see if a DOM node is within an XML document (or is an XML document). <br/>
    * See: <a href="http://api.jquery.com/jQuery.isXMLDoc/">jQuery Docs</a> */
  def isXMLDoc[T](el: js.Any): Boolean = js.native

  /** Create a serialized representation of an array, a plain object, or a jQuery object suitable
    * for use in a URL query string or Ajax request. In case a jQuery object is passed, it should
    * contain input elements with name/value properties. <br/>
    * See: <a href="http://api.jquery.com/jQuery.param/">jQuery Docs</a> */
  def param(obj: js.Array[js.Any] | js.Object | JQuery, traditional: Boolean = js.native): String = js.native

  /** Parses a string into an array of DOM nodes. <br/>
    * See: <a href="http://api.jquery.com/jQuery.parseHTML/">jQuery Docs</a> */
  def parseHTML(data: String, context: Element = js.native, keepScripts: Boolean = js.native): js.Array[Element] = js.native

  /** Takes a well-formed JSON string and returns the resulting JavaScript value. <br/>
    * See: <a href="http://api.jquery.com/jQuery.parseJSON/">jQuery Docs</a> */
  @deprecated("Since all the browsers supported by jQuery 3.0 support the native JSON.parse() method, we are deprecating jQuery.parseJSON().", "1.1.0")
  def parseJSON(json: String): js.Any = js.native

  /** Parses a string into an XML document. <br/>
    * See: <a href="http://api.jquery.com/jQuery.parseXML/">jQuery Docs</a> */
  def parseXML(xml: String): js.Dynamic = js.native

  /** Load data from the server using a HTTP POST request. <br/>
    * See: <a href="http://api.jquery.com/jQuery.post/">jQuery Docs</a> */
  def post(url: String, data: js.Any = js.native, successCallback: js.Function3[js.Any, String, JQueryXHR, js.Any] = js.native, dataType: String = js.native): js.Dynamic = js.native

  /** Sorts an array of DOM elements, in place, with the duplicates removed. Note that this only works on arrays of DOM elements, not strings or numbers. <br/>
    * See: <a href="http://api.jquery.com/jQuery.unique/">jQuery Docs</a> */
  @deprecated("The jQuery.unique() method has been renamed to jQuery.uniqueSort() to make its behavior easier to understand.", "1.1.0")
  def unique[T](array: js.Array[T]): js.Array[T] = js.native

  /** Sorts an array of DOM elements, in place, with the duplicates removed. Note that this only works on arrays of DOM elements, not strings or numbers. <br/>
    * See: <a href="http://api.jquery.com/jQuery.unique/">jQuery Docs</a> */
  def uniqueSort[T](array: js.Array[T]): js.Array[T] = js.native

  /** Provides a way to execute callback functions based on one or more objects, usually Deferred objects that represent asynchronous events. <br/>
    * See: <a href="http://api.jquery.com/jQuery.removeData/">jQuery Docs</a> */
  def when[FunType <: js.Function1[ArgType, js.Any], ArgType](deferred: JQueryDeferred[FunType, ArgType]*): JQueryPromise[FunType, ArgType] = js.native
}

object JQueryStatic {
  implicit class JQueryStaticExt(jQueryStatic: JQueryStatic) {
    import scala.scalajs.js.JSConverters._

    /** Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string. <br/>
      * See: <a href="http://api.jquery.com/jQuery/">jQuery Docs</a> */
    def apply(elementArray: Element*): JQuery = jQueryStatic(elementArray.toJSArray)

    /** Binds a function to be executed when the DOM has finished loading. <br/>
      * See: <a href="http://api.jquery.com/jQuery/#jQuery-callback">jQuery Docs</a> */
    def apply(callback: () => js.Any): JQuery = jQueryStatic(callback)

    /** Binds a function to be executed when the DOM has finished loading. <br/>
      * See: <a href="http://api.jquery.com/jQuery/#jQuery-callback">jQuery Docs</a> */
    def apply(option: Option[js.Any]): JQuery = option match {
      case Some(element) => jQueryStatic.apply(element)
      case None => jQueryStatic.apply()
    }

    /** Handle custom Ajax options or modify existing options before each request is sent and before they are processed by `.ajax()`. <br/>
      * See: <a href="http://api.jquery.com/jQuery.ajaxPrefilter/">jQuery Docs</a> */
    def ajaxPrefilter(dataTypes: String, handler: (js.Dynamic, js.Dynamic, JQueryXHR) => js.Any): Unit =
      jQueryStatic.asInstanceOf[js.Dynamic].ajaxPrefilter(dataTypes, handler)

    /** Creates an object that handles the actual transmission of Ajax data. <br/>
      * See: <a href="http://api.jquery.com/jQuery.ajaxTransport/">jQuery Docs</a> */
    def ajaxTransport(tpe: String, handler: (js.Dynamic, js.Dynamic, JQueryXHR) => js.Any): Unit =
      jQueryStatic.asInstanceOf[js.Dynamic].ajaxTransport(tpe, handler)

    /** A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and
      * array-like objects with a length property (such as a function's arguments object) are iterated by numeric index,
      * from 0 to length-1. Other objects are iterated via their named properties. <br/>
      * See: <a href="http://api.jquery.com/jQuery.each/">jQuery Docs</a> */
    def each[T](array: Seq[T], callback: (Int, T) => js.Any): Unit =
      jQueryStatic.asInstanceOf[js.Dynamic].each(array.toJSArray, callback)

    /** A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and
      * array-like objects with a length property (such as a function's arguments object) are iterated by numeric index,
      * from 0 to length-1. Other objects are iterated via their named properties. <br/>
      * See: <a href="http://api.jquery.com/jQuery.each/">jQuery Docs</a> */
    def each(obj: js.Any, callback: (String, js.Any) => js.Any): Unit =
      jQueryStatic.asInstanceOf[js.Dynamic].each(obj, callback)

    /** Load data from the server using a HTTP GET request. <br/>
      * See: <a href="http://api.jquery.com/jQuery.get/">jQuery Docs</a> */
    def get[T](url: String, data: js.Any, success: (T, String, JQueryXHR) => js.Any, dataType: String): JQueryXHR = {
      val callback = (data: js.Dynamic, status: String, xhr: JQueryXHR) => success(data.asInstanceOf[T], status, xhr)
      jQueryStatic.asInstanceOf[js.Dynamic].get(url, data, callback, dataType).asInstanceOf[JQueryXHR]
    }

    /** Load JSON-encoded data from the server using a GET HTTP request. <br/>
      * See: <a href="http://api.jquery.com/jQuery.getJSON/">jQuery Docs</a> */
    def getJSON[T](url: String, data: js.Any, success: (T, String, JQueryXHR) => js.Any): JQueryXHR = {
      val callback = (data: js.Dynamic, status: String, xhr: JQueryXHR) => success(data.asInstanceOf[T], status, xhr)
      jQueryStatic.asInstanceOf[js.Dynamic].get(url, data, callback, "json").asInstanceOf[JQueryXHR]
    }

    /** Load a JavaScript file from the server using a GET HTTP request, then execute it. <br/>
      * See: <a href="http://api.jquery.com/jQuery.getScript/">jQuery Docs</a> */
    def getScript(url: String, success: (String, String, JQueryXHR) => js.Any): JQueryXHR =
      jQueryStatic.asInstanceOf[js.Dynamic].getScript(url, success).asInstanceOf[JQueryXHR]

    /** Finds the elements of an array which satisfy a filter function. The original array is not affected. <br/>
      * See: <a href="http://api.jquery.com/jQuery.grep/">jQuery Docs</a> */
    def grep[T](array: Seq[T], function: (T, Int) => Boolean, invert: Boolean = false): Seq[T] =
      jQueryStatic.asInstanceOf[js.Dynamic].grep(array.toJSArray, function, invert).asInstanceOf[js.Array[T]].toSeq

    /** Search for a specified value within an array and return its index (or -1 if not found). <br/>
      * See: <a href="http://api.jquery.com/jQuery.inArray/">jQuery Docs</a> */
    def inArray[T](value: T, array: Seq[T], fromIndex: Int): Int =
      jQueryStatic.asInstanceOf[js.Dynamic].inArray(value.asInstanceOf[js.Dynamic], array.toJSArray, fromIndex).asInstanceOf[Int]

    def parse(data: String) = {
      jQ(jQueryStatic.parseHTML(data)(0))
    }
  }
}

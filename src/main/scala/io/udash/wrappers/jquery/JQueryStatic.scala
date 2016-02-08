package io.udash.wrappers.jquery

import org.scalajs.dom._

import scala.scalajs.js

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
  private[jquery] def apply(elementArray: js.Array[Element]): JQuery = js.native

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

  /** Handle custom Ajax options or modify existing options before each request is sent and before they are processed by `.ajax()`. <br/>
    * See: <a href="http://api.jquery.com/jQuery.ajaxPrefilter/">jQuery Docs</a> */
  private[jquery] def ajaxPrefilter(dataTypes: String, handler: js.Function3[js.Dynamic, js.Dynamic, JQueryXHR, js.Any]): Unit = js.native

  /** Creates an object that handles the actual transmission of Ajax data. <br/>
    * See: <a href="http://api.jquery.com/jQuery.ajaxTransport/">jQuery Docs</a> */
  private[jquery] def ajaxTransport(tpe: String, handler: js.Function3[js.Dynamic, js.Dynamic, JQueryXHR, js.Any]): Unit = js.native

  /** A multi-purpose callbacks list object that provides a powerful way to manage callback lists. <br/>
    * See: <a href="http://api.jquery.com/jQuery.Callbacks/">jQuery Docs</a> */
  def callbacks[FunType <: js.Function1[ArgType, js.Any], ArgType](flags: String): JQueryCallbacks[FunType, ArgType] = js.native

  /** Check to see if a DOM element is a descendant of another DOM element. <br/>
    * See: <a href="http://api.jquery.com/jQuery.contains/">jQuery Docs</a> */
  def contains(container: Element, contained: Element): Boolean = js.native

  /** Store arbitrary data associated with the specified element. Returns the value that was set. <br/>
    * See: <a href="http://api.jquery.com/jQuery.data/">jQuery Docs</a> */
  def data(element: Element, key: String, value: js.Any): js.Any = js.native

  /** A factory function that returns a chainable utility object with methods to register multiple callbacks into callback queues,
    * invoke callback queues, and relay the success or failure state of any synchronous or asynchronous function. <br/>
    * See: <a href="http://api.jquery.com/jQuery.Deferred/">jQuery Docs</a> */
  def deferred[FunType <: js.Function1[ArgType, js.Any], ArgType](beforeStart: JQueryDeferred[_, _]): JQueryDeferred[FunType, ArgType] = js.native

  /** Execute the next function on the queue for the matched element. <br/>
    * See: <a href="http://api.jquery.com/jQuery.dequeue/">jQuery Docs</a> */
  def dequeue(element: Element, queueName: String): Unit = js.native

  /** A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and
    * array-like objects with a length property (such as a function's arguments object) are iterated by numeric index,
    * from 0 to length-1. Other objects are iterated via their named properties. <br/>
    * See: <a href="http://api.jquery.com/jQuery.each/">jQuery Docs</a> */
  private[jquery] def each[T](array: js.Array[T], callback: js.Function2[Int, T, js.Any]): Unit = js.native

  /** A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and
    * array-like objects with a length property (such as a function's arguments object) are iterated by numeric index,
    * from 0 to length-1. Other objects are iterated via their named properties. <br/>
    * See: <a href="http://api.jquery.com/jQuery.each/">jQuery Docs</a> */
  private[jquery] def each(obj: js.Any, callback: js.Function2[String, js.Any, js.Any]): Unit = js.native

  /** Load data from the server using a HTTP GET request. <br/>
    * See: <a href="http://api.jquery.com/jQuery.get/">jQuery Docs</a> */
  def get(settings: JQueryAjaxSettings): Unit = js.native

  /** Load data from the server using a HTTP GET request. <br/>
    * See: <a href="http://api.jquery.com/jQuery.get/">jQuery Docs</a> */
  private[jquery] def get(url: String, data: js.Any | String = js.native, success: js.Function3[js.Dynamic, String, JQueryXHR, js.Any] = js.native, dataType: String = js.native): JQueryXHR = js.native

  /** Load a JavaScript file from the server using a GET HTTP request, then execute it. <br/>
    * See: <a href="http://api.jquery.com/jQuery.getScript/">jQuery Docs</a> */
  private[jquery] def getScript(url: String, success: (String, String, JQueryXHR) => js.Any): JQueryXHR = js.native

  /** Execute some JavaScript code globally. <br/>
    * See: <a href="http://api.jquery.com/jQuery.globalEval/">jQuery Docs</a> */
  def globalEval(code: String): Unit = js.native

  /** Finds the elements of an array which satisfy a filter function. The original array is not affected. <br/>
    * See: <a href="http://api.jquery.com/jQuery.grep/">jQuery Docs</a> */
  private[jquery] def grep[T](array: js.Array[T], function: js.Function2[T, Int, Boolean], invert: Boolean): js.Array[T] = js.native

  /** Determine whether an element has any jQuery data associated with it. <br/>
    * See: <a href="http://api.jquery.com/jQuery.hasData/">jQuery Docs</a> */
  def hasData(element: Element): Boolean = js.native

  /** Determine whether an element has any jQuery data associated with it. <br/>
    * See: <a href="http://api.jquery.com/jQuery.holdReady/">jQuery Docs</a> */
  def holdReady(hold: Boolean): Unit = js.native

  /** Search for a specified value within an array and return its index (or -1 if not found). <br/>
    * See: <a href="http://api.jquery.com/jQuery.inArray/">jQuery Docs</a> */
  private[jquery] def inArray[T](value: T, array: js.Array[T], fromIndex: Int): Int = js.native

  /** Determine whether the argument is an array. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isArray/">jQuery Docs</a> */
  def isArray[T](el: js.Any): Boolean = js.native

  /** Check to see if an object is empty (contains no enumerable properties). <br/>
    * See: <a href="http://api.jquery.com/jQuery.isEmptyObject/">jQuery Docs</a> */
  def isEmptyObject[T](el: js.Any): Boolean = js.native

  /** Determine if the argument passed is a JavaScript function object. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isFunction/">jQuery Docs</a> */
  def isFunction[T](el: js.Any): Boolean = js.native

  /** Determines whether its argument is a number. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isNumeric/">jQuery Docs</a> */
  def isNumeric[T](el: js.Any): Boolean = js.native

  /** Check to see if an object is a plain object (created using "{}" or "new Object"). <br/>
    * See: <a href="http://api.jquery.com/jQuery.isPlainObject/">jQuery Docs</a> */
  def isPlainObject[T](el: js.Any): Boolean = js.native

  /** Determine whether the argument is a window. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isWindow/">jQuery Docs</a> */
  def isWindow[T](el: js.Any): Boolean = js.native

  /** Check to see if a DOM node is within an XML document (or is an XML document). <br/>
    * See: <a href="http://api.jquery.com/jQuery.isXMLDoc/">jQuery Docs</a> */
  def isXMLDoc[T](el: js.Any): Boolean = js.native

  /** Parses a string into an array of DOM nodes. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isXMLDoc/">jQuery Docs</a> */
  def parseHTML(data: String, context: Element = js.native, keepScripts: Boolean = js.native): js.Array[Element] = js.native

  /** Takes a well-formed JSON string and returns the resulting JavaScript value. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isXMLDoc/">jQuery Docs</a> */
  def parseJSON(json: String): js.Any = js.native

  /** Parses a string into an XML document. <br/>
    * See: <a href="http://api.jquery.com/jQuery.isXMLDoc/">jQuery Docs</a> */
  def parseXML(xml: String): js.Dynamic = js.native

  /** Load data from the server using a HTTP POST request. <br/>
    * See: <a href="http://api.jquery.com/jQuery.post/">jQuery Docs</a> */
  def post(url: String, data: js.Any = js.native, successCallback: js.Function3[js.Any, String, JQueryXHR, js.Any] = js.native, dataType: String = js.native): js.Dynamic = js.native

  /** Sorts an array of DOM elements, in place, with the duplicates removed. Note that this only works on arrays of DOM elements, not strings or numbers. <br/>
    * See: <a href="http://api.jquery.com/jQuery.unique/">jQuery Docs</a> */
  def unique[T](array: js.Array[T]): js.Array[T] = js.native

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
    def ajaxPrefilter(dataTypes: String, handler: (js.Dynamic, js.Dynamic, JQueryXHR) => js.Any): Unit = jQueryStatic.ajaxPrefilter(dataTypes, handler)

    /** Creates an object that handles the actual transmission of Ajax data. <br/>
      * See: <a href="http://api.jquery.com/jQuery.ajaxTransport/">jQuery Docs</a> */
    def ajaxTransport(tpe: String, handler: (js.Dynamic, js.Dynamic, JQueryXHR) => js.Any): Unit = jQueryStatic.ajaxTransport(tpe, handler)

    /** A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and
      * array-like objects with a length property (such as a function's arguments object) are iterated by numeric index,
      * from 0 to length-1. Other objects are iterated via their named properties. <br/>
      * See: <a href="http://api.jquery.com/jQuery.each/">jQuery Docs</a> */
    def each[T](array: Seq[T], callback: (Int, T) => js.Any): Unit = jQueryStatic.each[T](array.toJSArray, callback)

    /** A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and
      * array-like objects with a length property (such as a function's arguments object) are iterated by numeric index,
      * from 0 to length-1. Other objects are iterated via their named properties. <br/>
      * See: <a href="http://api.jquery.com/jQuery.each/">jQuery Docs</a> */
    def each(obj: js.Any, callback: (String, js.Any) => js.Any): Unit = jQueryStatic.each(obj, callback)

    /** Load data from the server using a HTTP GET request. <br/>
      * See: <a href="http://api.jquery.com/jQuery.get/">jQuery Docs</a> */
    def get[T](url: String, data: js.Any, success: (T, String, JQueryXHR) => js.Any, dataType: String): JQueryXHR = {
      val callback = (data: js.Dynamic, status: String, xhr: JQueryXHR) => success(data.asInstanceOf[T], status, xhr)
      jQueryStatic.get(url, data, callback, dataType)
    }

    /** Load JSON-encoded data from the server using a GET HTTP request. <br/>
      * See: <a href="http://api.jquery.com/jQuery.getJSON/">jQuery Docs</a> */
    def getJSON[T](url: String, data: js.Any, success: (T, String, JQueryXHR) => js.Any): JQueryXHR = {
      val callback = (data: js.Dynamic, status: String, xhr: JQueryXHR) => success(data.asInstanceOf[T], status, xhr)
      jQueryStatic.get(url, data, callback, "json")
    }

    /** Load a JavaScript file from the server using a GET HTTP request, then execute it. <br/>
      * See: <a href="http://api.jquery.com/jQuery.getScript/">jQuery Docs</a> */
    def getScript(url: String, success: (String, String, JQueryXHR) => js.Any): JQueryXHR = jQueryStatic.getScript(url, success)

    /** Finds the elements of an array which satisfy a filter function. The original array is not affected. <br/>
      * See: <a href="http://api.jquery.com/jQuery.grep/">jQuery Docs</a> */
    def grep[T](array: Seq[T], function: (T, Int) => Boolean, invert: Boolean = false): js.Array[T] = jQueryStatic.grep[T](array.toJSArray, function, invert)

    /** Search for a specified value within an array and return its index (or -1 if not found). <br/>
      * See: <a href="http://api.jquery.com/jQuery.inArray/">jQuery Docs</a> */
    def inArray[T](value: T, array: Seq[T], fromIndex: Int): Int = jQueryStatic.inArray(value, array.toJSArray, fromIndex)

    def parse(data: String) = {
      jQ(jQueryStatic.parseHTML(data)(0))
    }
  }
}

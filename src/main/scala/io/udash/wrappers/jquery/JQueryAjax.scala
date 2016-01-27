package io.udash.wrappers.jquery

import scala.scalajs.js

/** See: <a href="http://api.jquery.com/jQuery.ajax/#jqXHR">jQuery Docs</a> */
@js.native
trait JQueryXHR extends js.Object {
  import scala.scalajs.js.`|`

  def overrideMimeType(tpe: String): Unit = js.native

  /** An alternative construct to the success callback option. (data, textStatus, jqXHR) => anything */
  def done(callback: ((js.Any, String, JQueryXHR) => js.Any)*): Unit = js.native

  /** An alternative construct to the error callback option. (jqXHR, textStatus, errorThrown) => anything */
  def fail(callback: ((JQueryXHR, String, js.Any) => js.Any)*): Unit = js.native

  /** An alternative construct to the complete callback option. (data|jqXHR, textStatus, jqXHR|errorThrown) => anything */
  def always(callback: ((js.Any | JQueryXHR, String, JQueryXHR | js.Any) => js.Any)*): Unit = js.native

  /** Incorporates the functionality of the .done() and .fail() methods. (data, textStatus, jqXHR) => anything, (jqXHR, textStatus, errorThrown) => anything */
  def `then`(done: ((js.Any, String, JQueryXHR) => js.Any), fail: ((JQueryXHR, String, js.Any) => js.Any)): Unit = js.native
}

/** jQuery AJAX settings object<br/>
  * See: <a href="http://api.jquery.com/jQuery.ajax/">jQuery Docs</a> */
@js.native
trait JQueryAjaxSettings extends js.Object {
  /** The content type sent in the request header that tells the server what kind of response it will accept in return. */
  def accepts: js.Any = js.native

  /** By default, all requests are sent asynchronously (i.e. this is set to true by default). If you need synchronous requests, set this option to false. */
  def async: Boolean = js.native

  /** A pre-request callback function that can be used to modify the [[JQueryXHR]] object before it is sent.
    * Returning false in the beforeSend function will cancel the request. */
  def beforeSend(jqXHR: JQueryXHR, settings: JQueryAjaxSettings): Boolean = js.native

  /** If set to false, it will force requested pages not to be cached by the browser. */
  def cache: Boolean = js.native

  /** A function to be called when the request finishes (after success and error callbacks are executed). */
  def complete(jqXHR: JQueryXHR, textStatus: String): js.Dynamic = js.native

  /** An object of string/regular-expression pairs that determine how jQuery will parse the response, given its content type. */
  def contents: js.Any = js.native

  /** When sending data to the server, use this content type. */
  def contentType: js.Any = js.native

  /** This object will be the context of all Ajax-related callbacks. */
  def context: js.Any = js.native

  /** An object containing dataType-to-dataType converters. */
  def converters: js.Any = js.native

  /** If you wish to force a crossDomain request (such as JSONP) on the same domain, set the value of crossDomain to true. */
  def crossDomain: Boolean = js.native

  /** Data to be sent to the server. It is converted to a query string, if not already a string. It's appended to the url for GET-requests. */
  def data: js.Any = js.native

  /** A function to be used to handle the raw response data of XMLHttpRequest. */
  def dataFilter(data: js.Any, tpe: js.Any): js.Any = js.native

  /** The type of data that you're expecting back from the server. */
  def dataType: String = js.native

  /** A function to be called if the request fails. */
  def error(jqXHR: JQueryXHR, textStatus: String, errorThrow: String): js.Any = js.native

  /** Whether to trigger global Ajax event handlers for this request. The default is true. Set to false to prevent the global handlers like `ajaxStart` or `ajaxStop` from being triggered. */
  def global: Boolean = js.native

  /** An object of additional header key/value pairs to send along with requests using the XMLHttpRequest transport. */
  def headers: js.Any = js.native

  /** Allow the request to be successful only if the response has changed since the last request. */
  def ifModified: Boolean = js.native

  /** Allow the current environment to be recognized as "local," (e.g. the filesystem), even if jQuery does not recognize it as such by default. */
  def isLocal: Boolean = js.native

  /** Override the callback function name in a JSONP request. */
  def jsonp: String = js.native

  /** Specify the callback function name for a JSONP request. */
  def jsonpCallback: js.Any = js.native

  /** The HTTP method to use for the request (e.g. "POST", "GET", "PUT"). */
  def method: String = js.native

  /** A mime type to override the XHR mime type. */
  def mimeType: String = js.native

  /** A password to be used with XMLHttpRequest in response to an HTTP access authentication request. */
  def password: String = js.native

  /** By default, data passed in to the data option as an object (technically, anything other than a string) will be
    * processed and transformed into a query string, fitting to the default content-type "application/x-www-form-urlencoded". */
  def processData: Boolean = js.native

  /** Only applies when the "script" transport is used. */
  def scriptCharset: String = js.native

  /** An object of numeric HTTP codes and functions to be called when the response has the corresponding code. */
  def statusCode: js.Any = js.native

  /** A function to be called if the request succeeds. */
  def success(data: js.Any, textStatus: String, jqXHR: JQueryXHR): js.Any = js.native

  /** Set a timeout (in milliseconds) for the request. */
  def timeout: Double = js.native

  /** Set this to true if you wish to use the traditional style of param serialization. */
  def traditional: Boolean = js.native

  /** An alias for method. */
  @deprecated(message = "Use `method` instead.", since = "0.1.0")
  def `type`: String = js.native

  /** A string containing the URL to which the request is sent. */
  def url: String = js.native

  /** A username to be used with XMLHttpRequest in response to an HTTP access authentication request. */
  def username: String = js.native

  /** Callback for creating the XMLHttpRequest object. */
  def xhr: js.Any = js.native

  /** An object of fieldName-fieldValue pairs to set on the native XHR object. */
  def xhrFields: js.Object = js.native
}

object JQueryAjaxSettings {
  def apply(accepts: js.Any = null, async: Option[Boolean] = None, beforeSend: (JQueryXHR, JQueryAjaxSettings) => js.Any = null,
            cache: Option[Boolean] = None, complete: (JQueryXHR, String) => js.Any = null, contents: js.Any = null, contentType: js.Any = null,
            context: js.Any = null, converters: js.Any = null, crossDomain: Option[Boolean] = None, data: js.Any = null, dataFilter: (js.Any, js.Any) => js.Any = null,
            dataType: String = null, error: (JQueryXHR, String) => js.Any = null, global: Option[Boolean] = None, headers: js.Any = null, 
            ifModified: Option[Boolean] = None, isLocal: Option[Boolean] = None, jsonp: String = null, jsonpCallback: js.Any = null, method: String = null, 
            mimeType: String = null, password: String = null, processData: Option[Boolean] = None, scriptCharset: String = null, statusCode: js.Any = null, 
            success: (js.Any, String, JQueryXHR) => js.Any = null, timeout: Option[Double] = None, traditional: Option[Boolean] = None, `type`: String = null,
            url: String = null, username: String = null, xhr: js.Any = null, xhrFields: js.Object = null)
  : JQueryAjaxSettings = {
    val o = js.Dynamic.literal()

    if (accepts != null) o.accepts = accepts
    if (async.isDefined) o.async = async.get
    if (beforeSend != null) o.beforeSend = beforeSend
    if (cache.isDefined) o.cache = cache.get
    if (complete != null) o.complete = complete
    if (contents != null) o.contents = contents
    if (contentType != null) o.contentType = contentType
    if (context != null) o.context = context
    if (converters != null) o.converters = converters
    if (crossDomain.isDefined) o.crossDomain = crossDomain.get
    if (data != null) o.data = data
    if (dataFilter != null) o.dataFilter = dataFilter
    if (dataType != null) o.dataType = dataType
    if (error != null) o.error = error
    if (global.isDefined) o.global = global.get
    if (headers != null) o.headers = headers
    if (ifModified.isDefined) o.ifModified = ifModified.get
    if (isLocal.isDefined) o.isLocal = isLocal.get
    if (jsonp != null) o.jsonp = jsonp
    if (jsonpCallback != null) o.jsonpCallback = jsonpCallback
    if (method != null) o.method = method
    if (mimeType != null) o.mimeType = mimeType
    if (password != null) o.password = password
    if (processData.isDefined) o.processData = processData.get
    if (scriptCharset != null) o.scriptCharset = scriptCharset
    if (statusCode != null) o.statusCode = statusCode
    if (success != null) o.success = success
    if (timeout.isDefined) o.timeout = timeout.get
    if (traditional.isDefined) o.traditional = traditional.get
    if (`type` != null) o.`type` = `type`
    if (url != null) o.url = url
    if (username != null) o.username = username
    if (xhr != null) o.xhr = xhr
    if (xhrFields != null) o.xhrFields = xhrFields

    o.asInstanceOf[JQueryAjaxSettings]
  }
}
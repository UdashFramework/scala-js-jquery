package io.udash.wrappers.jquery

import org.scalajs.dom._

import scala.scalajs.js

@js.native
trait JQueryPromise[FunType <: js.Function1[ArgType, js.Any], ArgType] extends js.Any {
  /** Add handlers to be called when the Deferred object is either resolved or rejected. <br/>
    * See: <a href="http://api.jquery.com/deferred.always/">jQuery Docs</a> */
  def always(callbacks: FunType*): JQueryDeferred[FunType, ArgType] = js.native

  /** Add handlers to be called when the Deferred object is resolved. <br/>
    * See: <a href="http://api.jquery.com/deferred.done/">jQuery Docs</a> */
  def done(callbacks: FunType*): JQueryDeferred[FunType, ArgType] = js.native

  /** Add handlers to be called when the Deferred object is rejected. <br/>
    * See: <a href="http://api.jquery.com/deferred.fail/">jQuery Docs</a> */
  def fail(callbacks: FunType*): JQueryDeferred[FunType, ArgType] = js.native

  /** Call the progressCallbacks on a Deferred object with the given `context` and `args`. <br/>
    * See: <a href="http://api.jquery.com/deferred.progress/">jQuery Docs</a> */
  def progress(callbacks: FunType*): JQueryDeferred[FunType, ArgType] = js.native

  /** Return a Deferred's Promise object. <br/>
    * See: <a href="http://api.jquery.com/deferred.promise/">jQuery Docs</a> */
  def promise(target: js.Object = js.native): JQueryPromise[FunType, ArgType] = js.native

  /** Add handlers to be called when the Deferred object is resolved, rejected, or still in progress. <br/>
    * See: <a href="http://api.jquery.com/deferred.then/">jQuery Docs</a> */
  // Usage of then as identifier is deprecated. It can be used as a keyword in future versions of scala.
  def `then`(done: FunType, fail: FunType, progress: FunType): JQueryDeferred[FunType, ArgType] = js.native
}


@js.native
trait JQueryDeferred[FunType <: js.Function1[ArgType, js.Any], ArgType] extends JQueryPromise[FunType, ArgType] {
  /** Call the progressCallbacks on a Deferred object with the given `args`. <br/>
    * See: <a href="http://api.jquery.com/deferred.notify/">jQuery Docs</a> */
  def notify(args: ArgType): JQueryDeferred[FunType, ArgType] = js.native

  /** Call the progressCallbacks on a Deferred object with the given `context` and `args`. <br/>
    * See: <a href="http://api.jquery.com/deferred.notifyWith/">jQuery Docs</a> */
  def notifyWith(context: js.Any, args: ArgType): JQueryDeferred[FunType, ArgType] = js.native

  /** Reject a Deferred object and call any failCallbacks with the given `args`. <br/>
    * See: <a href="http://api.jquery.com/deferred.reject/">jQuery Docs</a> */
  def reject(args: ArgType): JQueryDeferred[FunType, ArgType] = js.native

  /** Reject a Deferred object and call any failCallbacks with the given `context` and `args`. <br/>
    * See: <a href="http://api.jquery.com/deferred.rejectWith/">jQuery Docs</a> */
  def rejectWith(context: js.Any, args: ArgType): JQueryDeferred[FunType, ArgType] = js.native

  /** Resolve a Deferred object and call any doneCallbacks with the given `args`. <br/>
    * See: <a href="http://api.jquery.com/deferred.resolve/">jQuery Docs</a> */
  def resolve(args: ArgType): JQueryDeferred[FunType, ArgType] = js.native

  /** Resolve a Deferred object and call any doneCallbacks with the given `context` and `args`. <br/>
    * See: <a href="http://api.jquery.com/deferred.resolveWith/">jQuery Docs</a> */
  def resolveWith(context: js.Any, args: ArgType): JQueryDeferred[FunType, ArgType] = js.native
}

object JQueryPromise {
  sealed trait JQueryDeferredState
  case object JQueryDeferredPending extends JQueryDeferredState
  case object JQueryDeferredResolved extends JQueryDeferredState
  case object JQueryDeferredRejected extends JQueryDeferredState
  case class JQueryDeferredUnknown(describe: String) extends JQueryDeferredState

  implicit class JQueryPromiseExt(jQueryPromise: JQueryPromise[_, _]) {
    /** Determine the current state of a Deferred object. <br/>
      * See: <a href="http://api.jquery.com/deferred.resolveWith/">jQuery Docs</a> */
    def state: JQueryDeferredState = jQueryPromise.asInstanceOf[js.Dynamic].state.asInstanceOf[String] match {
      case "pending" => JQueryDeferredPending
      case "resolved" => JQueryDeferredResolved
      case "rejected" => JQueryDeferredRejected
      case unknown: String => JQueryDeferredUnknown(unknown)
    }
  }
}
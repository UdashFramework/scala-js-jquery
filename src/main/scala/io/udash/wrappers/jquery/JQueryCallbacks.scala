package io.udash.wrappers.jquery

import scala.scalajs.js

@js.native
trait JQueryCallbacks[FunType <: js.Function1[ArgType, js.Any], ArgType] extends js.Any {
  /** Add a callback or a collection of callbacks to a callback list. <br/>
    * See: <a href="http://api.jquery.com/callbacks.add/">jQuery Docs</a> */
  def add(callback: FunType): JQueryCallbacks[FunType, ArgType] = js.native

  /** Disable a callback list from doing anything more. <br/>
    * See: <a href="http://api.jquery.com/callbacks.disable/">jQuery Docs</a> */
  def disable(): JQueryCallbacks[FunType, ArgType] = js.native

  /** Determine if the callbacks list has been disabled. <br/>
    * See: <a href="http://api.jquery.com/callbacks.disabled/">jQuery Docs</a> */
  def disabled: Boolean = js.native

  /** Remove all of the callbacks from a list. <br/>
    * See: <a href="http://api.jquery.com/callbacks.empty/">jQuery Docs</a> */
  def empty(): JQueryCallbacks[FunType, ArgType] = js.native

  /** Call all of the callbacks with the given arguments. <br/>
    * See: <a href="http://api.jquery.com/callbacks.fire/">jQuery Docs</a> */
  def fire(args: ArgType): JQueryCallbacks[FunType, ArgType] = js.native

  /** Determine if the callbacks have already been called at least once. <br/>
    * See: <a href="http://api.jquery.com/callbacks.fired/">jQuery Docs</a> */
  def fired: Boolean = js.native

  /** Call all callbacks in a list with the given context and arguments. <br/>
    * See: <a href="http://api.jquery.com/callbacks.fireWith/">jQuery Docs</a> */
  def fireWith(context: js.Any, args: js.Any*): JQueryCallbacks[FunType, ArgType] = js.native

  /** Determine whether or not the list has any callbacks attached. <br/>
    * See: <a href="http://api.jquery.com/callbacks.has/">jQuery Docs</a> */
  def has: Boolean = js.native

  /** Determine whether `callback` is in a list. <br/>
    * See: <a href="http://api.jquery.com/callbacks.has/">jQuery Docs</a> */
  def has(callback: FunType): Boolean = js.native

  /** Lock a callback list in its current state. <br/>
    * See: <a href="http://api.jquery.com/callbacks.lock/">jQuery Docs</a> */
  def lock(): JQueryCallbacks[FunType, ArgType] = js.native

  /** Determine if the callbacks list has been locked. <br/>
    * See: <a href="http://api.jquery.com/callbacks.locked/">jQuery Docs</a> */
  def locked: Boolean = js.native

  /** Remove a callback or a collection of callbacks from a callback list. <br/>
    * See: <a href="http://api.jquery.com/callbacks.remove/">jQuery Docs</a> */
  def remove(callback: FunType): JQueryCallbacks[FunType, ArgType] = js.native
}

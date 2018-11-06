# scala-js-jquery [![Build Status](https://travis-ci.org/UdashFramework/scala-js-jquery.svg?branch=master)](https://travis-ci.org/UdashFramework/scala-js-jquery) [![Join the chat at https://gitter.im/UdashFramework/scala-js-jquery](https://badges.gitter.im/UdashFramework/scala-js-jquery.svg)](https://gitter.im/UdashFramework/scala-js-jquery?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge) [<img align="right" height="50px" src="http://www.avsystem.com/avsystem_logo.png">](http://www.avsystem.com/)

Static types for the jQuery API for [Scala.js](http://www.scala-js.org/) programs. 

## Usage

Add the following dependency to your SBT build:

```scala
libraryDependencies += "io.udash" %%% "udash-jquery" % "3.0.0"
```

then import the jQuery package: 

```scala
import io.udash.wrappers.jquery._
```

Since version `3.0.0` the wrapper is published as a CommonJS module with JS dependencies managed 
by [scalajs-bundler](https://github.com/scalacenter/scalajs-bundler). 

If you do not want to use the bundler, you have to include jQuery sources manually by:
 * explicit link in your `index.html`.
 ```html
 <script src="https://code.jquery.com/jquery-3.3.1.min.js" 
         integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" 
         crossorigin="anonymous"></script>
 ```
 * or a [Scala.js dependency](http://www.scala-js.org/doc/project/dependencies.html).
 ```scala
 jsDependencies +=
   "org.webjars" % "jquery" % "3.3.1" / "3.3.1/jquery.js" minified "3.3.1/jquery.min.js"
 ```
 

## Examples

```scala
import io.udash.wrappers.jquery._

jQ("#elementId")
  .hide(AnimationOptions(
    duration = Some(3000),
    easing = Some(EasingFunction.linear)
  ))
  .show(1500, EasingFunction.swing)
```

```scala
import io.udash.wrappers.jquery._

val element: JQuery = jQ("#id")
element.text("Text content")
element.attr("example-attr", "value")
element.attr("example-attr") match {
  case Some(value) => println(s"Attribute value: $value")
  case None => println("Attribute not found!")
}
```

```scala
import io.udash.wrappers.jquery._

val callbacks = jQ.callbacks[js.Function1[(Int, Int), js.Any], (Int, Int)]()
callbacks.add((t: (Int, Int)) => {
  val (a, b) = t
  jQ("#plus").append(li(s"$a + $b = ${a+b}").render)
})
callbacks.add((t: (Int, Int)) => {
  val (a, b) = t
  jQ("#minus").append(li(s"$a - $b = ${a-b}").render)
})
callbacks.add((t: (Int, Int)) => {
  val (a, b) = t
  jQ("#mul").append(li(s"$a * $b = ${a*b}").render)
})
callbacks.add((t: (Int, Int)) => {
  val (a, b) = t
  jQ("#div").append(li(s"$a / $b = ${a/b}").render)
})

callbacks.fire(1, 1)
callbacks.fire(3, 3)
callbacks.fire(7, 4)

callbacks.disable()
callbacks.fire(1, 2)
```

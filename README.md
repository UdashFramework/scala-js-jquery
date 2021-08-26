# udash-jquery [<img align="right" height="50px" src="https://avsystem.github.io/Anjay-doc/_images/avsystem_logo.png">](http://www.avsystem.com/)
![Build Status](https://github.com/UdashFramework/scala-js-jquery.svg/workflows/CI/badge.svg?branch=master&event=push)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.udash/udash-jquery_sjs1_2.13/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.udash/udash-jquery_sjs1_2.13)
[![Join the chat at https://gitter.im/UdashFramework/scala-js-jquery](https://badges.gitter.im/UdashFramework/scala-js-jquery.svg)](https://gitter.im/UdashFramework/scala-js-jquery?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Static types for the jQuery API for [Scala.js](http://www.scala-js.org/) programs. 

## Usage

Add the following dependency to your SBT build:

```scala
libraryDependencies += "io.udash" %%% "udash-jquery" % "3.0.4"
```

then import the jQuery package: 

```scala
import io.udash.wrappers.jquery._
```

Since version `3.0.4` the wrapper targets SJS 1.x series and supports JS dependencies managed by
by [scalajs-bundler](https://github.com/scalacenter/scalajs-bundler) or [sbt-jsdependencies
](https://github.com/scala-js/jsdependencies)
 

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

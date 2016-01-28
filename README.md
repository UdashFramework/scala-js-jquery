# scala-js-jquery [![Build Status](https://travis-ci.org/UdashFramework/scala-js-jquery.svg?branch=master)](https://travis-ci.org/UdashFramework/scala-js-jquery) [<img align="right" height="50px" src="http://www.avsystem.com/avsystem_logo.png">](http://www.avsystem.com/)

Static types for the jQuery API for [Scala.js](http://www.scala-js.org/) programs. 

## Example

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
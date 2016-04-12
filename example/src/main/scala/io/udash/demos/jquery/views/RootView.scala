package io.udash.demos.jquery.views

import io.udash._
import io.udash.demos.jquery.{Context, IndexState, RootState}
import org.scalajs.dom.Element

object RootViewPresenter extends DefaultViewPresenterFactory[RootState.type](() => new RootView)

class RootView extends View {
  import Context._

  import scalatags.JsDom.all._

  private var child: Element = div().render

  private val content = div(
    a(href := IndexState.url)(h1("jquery-demo")),
    child
  ).render

  override def getTemplate: Element = content

  override def renderChild(view: View): Unit = {
    import io.udash.wrappers.jquery._
    val newChild = view.getTemplate
    jQ(child).replaceWith(newChild)
    child = newChild
  }
}
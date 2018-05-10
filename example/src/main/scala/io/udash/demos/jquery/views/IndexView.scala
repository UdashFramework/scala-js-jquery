package io.udash.demos.jquery.views

import io.udash._
import io.udash.demos.jquery._

object IndexViewPresenter extends StaticViewFactory[IndexState.type](() => new IndexView)

class IndexView extends FinalView {
  import Context._
  import scalatags.JsDom.all._

  private val content = div(
    "Take a look at following demo pages:",
    ul(
      li(a(href := AddState.url)(".add() & .css()")),
      li(a(href := AddBackState.url)(".addBack() & .addClass()")),
      li(a(href := AfterBeforeState.url)(".after() & .before()")),
      li(a(href := AnimateState.url)(".animate() & .click()")),
      li(a(href := AppendPrependState.url)(".append() & .prepend()")),
      li(a(href := AttrState.url)(".attr()")),
      li(a(href := CallbacksState.url)("Callbacks")),
      li(a(href := ChildrenState.url)(".children()")),
      li(a(href := DataState.url)(".data()")),
      li(a(href := DeferredState.url)("Deferred")),
      li(a(href := EachState.url)(".each()")),
      li(a(href := HideShowState.url)(".hide() & .show()")),
      li(a(href := OnOneOffState.url)(".on() & .one() & .off()")),
      li(a(href := OffsetPositionState.url)(".offset() & .position()"))
    )
  )

  override def getTemplate: Modifier = content
}
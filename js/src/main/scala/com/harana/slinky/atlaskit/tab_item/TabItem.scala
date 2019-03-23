package com.harana.slinky.atlaskit.tab_item

import com.harana.slinky.atlaskit.ReactNode
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.{KeyboardEvent, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/tabs", "TabItem")
@js.native
object ReactTabItem extends js.Object

@react object TabItem extends ExternalComponent {

  case class Props(data: Option[Tab] = None,
                   elementProps: Option[ElementProps] = None,
                   innerRef: Option[HTMLElement => Unit] = None,
                   isSelected: Option[Boolean] = None)

  override val component = ReactTabItem
}

@js.native
trait Tab extends js.Object {
  val label: String = js.native
  val content: ReactNode = js.native
}

@js.native
trait ElementProps extends js.Object {
  val `aria-posinset`: js.UndefOr[Int] = js.native
  val `aria-selected`: js.UndefOr[Boolean] = js.native
  val `aria-setsize`: js.UndefOr[Int] = js.native
  val onClick: js.UndefOr[() => Unit] = js.native
  val onKeyDown: js.UndefOr[KeyboardEvent => Unit] = js.native
  val onMouseDown: js.UndefOr[MouseEvent => Unit] = js.native
  val role: js.UndefOr[String] = js.native
  val tabIndex: js.UndefOr[Int | String] = js.native
}
package com.harana.slinky.atlaskit.dropdown_menu_stateless

import com.harana.slinky.atlaskit.{ReactNode, SyntheticKeyboardEvent, SyntheticMouseEvent}
import com.harana.slinky.atlaskit.button.Button
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/dropdown-menu", "DropdownMenuStateless")
@js.native
object ReactDropdownMenuStateless extends js.Object

@react object DropdownMenuStateless extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   boundariesElement: Option[String] = None,
                   isLoading: Option[Boolean] = None,
                   isOpen: Option[Boolean] = None,
                   position: Option[String] = None,
                   isMenuFixed: Option[Boolean] = None,
                   shouldAllowMultilineItems: Option[Boolean] = None,
                   shouldFitContainer: Option[Boolean] = None,
                   shouldFlip: Option[Boolean] = None,
                   trigger: Option[ReactNode] = None,
                   triggerButtonProps: Option[Button.Props] = None,
                   triggerType: Option[String] = None,
                   onPositioned: Option[() => Unit] = None,
                   defaultOpen: Option[Boolean] = None,
                   onOpenChange: Option[OnOpenChange => Unit] = None,
                   children: Seq[ReactElement])

  override val component = ReactDropdownMenuStateless
}

@js.native
trait OnOpenChange extends js.Object {
  val isOpen: Boolean = js.native
  val event: SyntheticKeyboardEvent | SyntheticMouseEvent = js.native
}
package com.harana.slinky.atlaskit.dropdown_item

import com.harana.slinky.atlaskit.ReactNode
import org.scalajs.dom.raw.{KeyboardEvent, MouseEvent}
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/dropdown-menu", "DropdownItem")
@js.native
object ReactDropdownItem extends js.Object

@react object DropdownItem extends ExternalComponent {

  case class Props(autoFocus: Option[Boolean] = None,
                   children: Option[ReactNode] = None,
                   description: Option[String] = None,
                   dnd: Option[js.Object] = None,
                   elemAfter: Option[ReactNode] = None,
                   elemBefore: Option[ReactNode] = None,
                   href: Option[String] = None,
                   isCompact: Option[Boolean] = None,
                   isDisabled: Option[Boolean] = None,
                   isDragging: Option[Boolean] = None,
                   isHidden: Option[Boolean] = None,
                   isSelected: Option[Boolean] = None,
                   linkComponent: Option[(String, String) => Unit] = None,
                   onClick: Option[MouseEvent => Unit] = None,
                   onKeyDown: Option[KeyboardEvent => Unit] = None,
                   onMouseEnter: Option[MouseEvent => Unit] = None,
                   onMouseLeave: Option[MouseEvent => Unit] = None,
                   role: Option[String] = None,
                   shouldAllowMultiline: Option[Boolean] = None,
                   target: Option[String] = None,
                   title: Option[String] = None)

  override val component = ReactDropdownItem
}
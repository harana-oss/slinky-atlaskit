package com.harana.slinky.atlaskit.droplist_item

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/droplist", "Item")
@js.native
object ReactDroplistItem extends js.Object

@react object DroplistItem extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   children: Seq[ReactNode] = Seq(),
                   description: Option[String] = None,
                   elemAfter: Option[ReactNode] = None,
                   elemBefore: Option[ReactNode] = None,
                   href: Option[String] = None,
                   isActive: Option[Boolean] = None,
                   isChecked: Option[Boolean] = None,
                   isFocused: Option[Boolean] = None,
                   isHidden: Option[Boolean] = None,
                   isSelected: Option[Boolean] = None,
                   onActive: Option[js.Any => Unit] = None,
                   target: Option[String] = None,
                   title: Option[String] = None,
                   tooltipDescription: Option[String] = None,
                   tooltipPosition: Option[String] = None,
                   `type`: Option[String] = None,
                   itemContext: Option[String] = None)

  override val component = ReactDroplistItem
}
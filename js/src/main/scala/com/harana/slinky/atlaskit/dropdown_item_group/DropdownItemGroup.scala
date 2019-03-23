package com.harana.slinky.atlaskit.dropdown_item_group

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/dropdown-menu", "DropdownItemGroup")
@js.native
object ReactDropdownItemGroup extends js.Object

@react object DropdownItemGroup extends ExternalComponent {

  case class Props(children: Seq[String] = Seq(),
                   title: Option[String] = None,
                   elemAfter: Option[ReactNode] = None)

  override val component = ReactDropdownItemGroup
}
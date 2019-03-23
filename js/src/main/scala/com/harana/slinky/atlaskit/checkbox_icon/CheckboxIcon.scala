package com.harana.slinky.atlaskit.checkbox_icon

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/checkbox", "CheckboxIcon")
@js.native
object ReactCheckboxIcon extends js.Object

@react object CheckboxIcon extends ExternalComponent {

  case class Props(isActive: Option[Boolean] = None,
                   isChecked: Option[Boolean] = None,
                   isDisabled: Option[Boolean] = None,
                   isFullWidth: Option[Boolean] = None,
                   isIndeterminate: Option[Boolean] = None,
                   isInvalid: Option[Boolean] = None,
                   isHovered: Option[Boolean] = None,
                   primaryColor: Option[String] = None,
                   secondaryColor: Option[String] = None)

  override val component = ReactCheckboxIcon
}
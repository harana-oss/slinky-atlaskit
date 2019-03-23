package com.harana.slinky.atlaskit.radio_icon

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/radio", "RadioIcon")
@js.native
object ReactRadioIcon extends js.Object

@react object RadioIcon extends ExternalComponent {

  case class Props(isActive: Option[Boolean] = None,
                   isChecked: Option[Boolean] = None,
                   isDisabled: Option[Boolean] = None,
                   isFocused: Option[Boolean] = None,
                   isHovered: Option[Boolean] = None,
                   isInvalid: Option[Boolean] = None)

  override val component = ReactRadioIcon
}
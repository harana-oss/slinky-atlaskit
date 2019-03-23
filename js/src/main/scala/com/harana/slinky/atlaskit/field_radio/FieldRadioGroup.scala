package com.harana.slinky.atlaskit.field_radio

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/field-radio-group", "AkRadio")
@js.native
object ReactFieldRadio extends js.Object

@react object FieldRadio extends ExternalComponent {

  case class Props(isDisabled: Option[Boolean] = None,
                   isRequired: Option[Boolean] = None,
                   isSelected: Option[Boolean] = None,
                   name: Option[String] = None,
                   onChange: Option[js.Any => js.Any] = None,
                   value: Option[String] = None,
                   children: Seq[ReactElement])

  override val component = ReactFieldRadio
}
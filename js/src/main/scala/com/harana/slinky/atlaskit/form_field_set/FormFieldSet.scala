package com.harana.slinky.atlaskit.form_field_set

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/form", "Fieldset")
@js.native
object ReactFormFieldset extends js.Object

@react object FormFieldset extends ExternalComponent {

  case class Props(children: Option[ReactNode] = None,
                   legend: Option[ReactNode] = None)

  override val component = ReactFormFieldset
}
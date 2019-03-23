package com.harana.slinky.atlaskit.form_section

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/form", "FormSection")
@js.native
object ReactFormSection extends js.Object

@react object FormSection extends ExternalComponent {

  case class Props(title: Option[ReactNode] = None,
                   children: Option[ReactNode] = None,
                   description: Option[ReactNode] = None)

  override val component = ReactFormSection
}
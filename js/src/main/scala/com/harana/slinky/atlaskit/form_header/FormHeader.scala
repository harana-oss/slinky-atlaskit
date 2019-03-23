package com.harana.slinky.atlaskit.form_header

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/form", "FormHeader")
@js.native
object ReactFormHeader extends js.Object

@react object FormHeader extends ExternalComponent {

  case class Props(title: Option[ReactNode] = None,
                   description: Option[ReactNode] = None,
                   children: Option[ReactNode] = None)

  override val component = ReactFormHeader
}
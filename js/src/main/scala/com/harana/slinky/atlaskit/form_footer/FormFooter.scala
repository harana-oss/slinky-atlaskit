package com.harana.slinky.atlaskit.form_footer

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/form", "FormFooter")
@js.native
object ReactFormFooter extends js.Object

@react object FormFooter extends ExternalComponent {

  case class Props(children: Option[ReactNode] = None)

  override val component = ReactFormFooter
}
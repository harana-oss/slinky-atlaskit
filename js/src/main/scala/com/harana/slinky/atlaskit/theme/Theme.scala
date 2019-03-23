package com.harana.slinky.atlaskit.theme

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/theme", JSImport.Default)
@js.native
object ReactTheme extends js.Object

@react object Theme extends ExternalComponent {

  case class Props(mode: String,
                   children: Seq[ReactElement])

  override val component = ReactTheme
}
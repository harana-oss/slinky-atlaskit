package com.harana.slinky.atlaskit.button_group

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/button", "ButtonGroup")
@js.native
object ReactButtonGroup extends js.Object

@react object ButtonGroup extends ExternalComponent {

  case class Props(appearance: Option[String] = None)

  override val component = ReactButtonGroup
}
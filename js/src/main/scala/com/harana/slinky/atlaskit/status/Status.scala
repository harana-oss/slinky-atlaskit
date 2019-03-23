package com.harana.slinky.atlaskit.status

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/status", "Status")
@js.native
object ReactStatus extends js.Object

@react object Status extends ExternalComponent {

  case class Props(text: String,
                   color: String)

  override val component = ReactStatus
}
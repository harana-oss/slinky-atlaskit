package com.harana.slinky.atlaskit.smart_card

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/smart-card", "Card")
@js.native
object ReactSmartCard extends js.Object

@react object SmartCard extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   data: js.Dictionary[js.Any],
                   onClick: Option[() => Unit] = None)

  override val component = ReactSmartCard
}
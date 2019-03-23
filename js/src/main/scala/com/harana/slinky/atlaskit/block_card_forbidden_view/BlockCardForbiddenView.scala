package com.harana.slinky.atlaskit.block_card_forbidden_view

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/media-ui", "BlockCardForbiddenView")
@js.native
object ReactBlockCardForbiddenView extends js.Object

@react object BlockCardForbiddenView extends ExternalComponent {

  case class Props(url: Option[String] = None,
                   isSelected: Option[Boolean] = None,
                   onClick: Option[() => Unit] = None,
                   onAuthorise: Option[() => Unit] = None)

  override val component = ReactBlockCardForbiddenView
}
package com.harana.slinky.atlaskit.block_card_resolving_view

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/media-ui", "BlockCardResolvingView")
@js.native
object ReactBlockCardResolvingView extends js.Object

@react object BlockCardResolvingView extends ExternalComponent {

  case class Props(isSelected: Option[Boolean] = None,
                   onClick: Option[() => Unit] = None)

  override val component = ReactBlockCardResolvingView
}
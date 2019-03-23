package com.harana.slinky.atlaskit.inline_card_resolving_view

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/media-ui", "InlineCardResolvingView")
@js.native
object ReactInlineCardResolvingView extends js.Object

@react object InlineCardResolvingView extends ExternalComponent {

  case class Props(url: Option[String] = None,
                   isSelected: Option[Boolean] = None,
                   onClick: Option[() => Unit] = None)

  override val component = ReactInlineCardResolvingView
}
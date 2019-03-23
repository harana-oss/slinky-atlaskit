package com.harana.slinky.atlaskit.inline_card_errored_view

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/media-ui", "InlineCardErroredView")
@js.native
object ReactInlineCardErroredView extends js.Object

@react object InlineCardErroredView extends ExternalComponent {

  case class Props(url: Option[String] = None,
                   message: Option[String] = None,
                   isSelected: Option[Boolean] = None,
                   onClick: Option[() => Unit] = None,
                   onRetry: Option[() => Unit] = None)

  override val component = ReactInlineCardErroredView
}
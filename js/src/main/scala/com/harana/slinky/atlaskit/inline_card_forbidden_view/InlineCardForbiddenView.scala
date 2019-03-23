package com.harana.slinky.atlaskit.inline_card_forbidden_view

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/media-ui", "InlineCardForbiddenView")
@js.native
object ReactInlineCardForbiddenView extends js.Object

@react object InlineCardForbiddenView extends ExternalComponent {

  case class Props(url: Option[String] = None,
                   isSelected: Option[Boolean] = None,
                   onClick: Option[() => Unit] = None,
                   onAuthorise: Option[() => Unit] = None)

  override val component = ReactInlineCardForbiddenView
}
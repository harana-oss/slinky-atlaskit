package com.harana.slinky.atlaskit.inline_card_unauthorised_view

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/media-ui", "InlineCardUnauthorisedView")
@js.native
object ReactInlineCardUnauthorisedView extends js.Object

@react object InlineCardUnauthorisedView extends ExternalComponent {

  case class Props(url: Option[String] = None,
                   icon: Option[String] = None,
                   isSelected: Option[Boolean] = None,
                   onClick: Option[() => Unit] = None,
                   onAuthorise: Option[() => Unit] = None)

  override val component = ReactInlineCardUnauthorisedView
}
package com.harana.slinky.atlaskit.inline_card_resolved_view

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/media-ui", "InlineCardResolvedView")
@js.native
object ReactInlineCardResolvedView extends js.Object

@react object InlineCardResolvedView extends ExternalComponent {

  case class Props(icon: Option[String | ReactNode] = None,
                   title: Option[String] = None,
                   lozenge: Option[Lozenge] = None,
                   isSelected: Option[Boolean] = None,
                   link: Option[String] = None,
                   onClick: Option[() => Unit] = None)

  override val component = ReactInlineCardResolvedView
}

@js.native
trait Lozenge extends js.Object {
  val text: String = js.native
  val appearance: js.UndefOr[String] = js.native
  val isBold: Boolean = js.native
}
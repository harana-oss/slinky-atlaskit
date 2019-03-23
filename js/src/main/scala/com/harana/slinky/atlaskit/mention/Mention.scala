package com.harana.slinky.atlaskit.mention

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/mention", JSImport.Default)
@js.native
object ReactMention extends js.Object

@react object Mention extends ExternalComponent {

  case class Props(id: Option[String] = None,
                   text: Option[String] = None,
                   isHighlighted: Option[Boolean] = None,
                   accessLevel: Option[String] = None,
                   onClick: Option[Mention => Unit] = None,
                   onMouseEnter: Option[Mention => Unit] = None,
                   onMouseLeave: Option[Mention => Unit] = None,
                   onHover: Option[() => Unit] = None)

  override val component = ReactMention
}

@js.native
trait Mention extends js.Object {
  val mentionId: js.UndefOr[String] = js.native
  val text: js.UndefOr[String] = js.native
  val event: js.UndefOr[js.Any] = js.native
}
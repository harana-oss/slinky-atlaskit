package com.harana.slinky.atlaskit.inline_message

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/inline-message", "InlineMessage")
@js.native
object ReactInlineMessage extends js.Object

@react object InlineMessage extends ExternalComponent {

  case class Props(children: Option[ReactNode] = None,
                   placement: Option[String] = None,
                   secondaryText: Option[String] = None,
                   title: Option[String] = None,
                   `type`: Option[String] = None)

  override val component = ReactInlineMessage
}
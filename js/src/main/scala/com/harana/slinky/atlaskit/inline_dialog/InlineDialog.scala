package com.harana.slinky.atlaskit.inline_dialog

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/inline-dialog", "InlineDialog")
@js.native
object ReactInlineDialog extends js.Object

@react object InlineDialog extends ExternalComponent {

  case class Props(children: Option[ReactNode] = None,
                   content: Option[ReactNode] = None,
                   isOpen: Option[Boolean] = None,
                   onContentBlur: Option[() => Unit] = None,
                   onContentClick: Option[() => Unit] = None,
                   onContentFocus: Option[() => Unit] = None,
                   onClose: Option[OnClose => Unit] = None,
                   placement: Option[String] = None)

  override val component = ReactInlineDialog
}

@js.native
trait OnClose extends js.Object {
  val isOpen: String = js.native
  val event: js.Any = js.native
}
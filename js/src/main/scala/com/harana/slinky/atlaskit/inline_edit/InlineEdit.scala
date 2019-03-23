package com.harana.slinky.atlaskit.inline_edit

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/inline-edit", "InlineEdit")
@js.native
object ReactInlineEdit extends js.Object

@react object InlineEdit extends ExternalComponent {

  case class Props(label: Option[String] = None,
                   readView: Option[ReactNode] = None,
                   editView: Option[ReactNode] = None,
                   isFitContainerWidthReadView: Option[Boolean] = None,
                   isWaiting: Option[Boolean] = None,
                   isInvalid: Option[Boolean] = None,
                   isLabelHidden: Option[Boolean] = None,
                   areActionButtonsHidden: Option[Boolean] = None,
                   isConfirmOnBlurDisabled: Option[Boolean] = None,
                   onConfirm: Option[() => Unit] = None,
                   onCancel: Option[() => Unit] = None,
                   labelHtmlFor: Option[String] = None,
                   shouldConfirmOnEnter: Option[Boolean] = None,
                   disableEditViewFieldBase: Option[Boolean] = None,
                   invalidMessage: Option[ReactNode] = None,
                   editButtonLabel: Option[String] = None,
                   confirmButtonLabel: Option[String] = None,
                   cancelButtonLabel: Option[String] = None)

  override val component = ReactInlineEdit
}
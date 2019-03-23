package com.harana.slinky.atlaskit.textarea

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.reactMod.ReactNs.FocusEventHandler
import typings.stdLib.Event

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/textarea", "TextArea")
@js.native
object ReactTextarea extends js.Object

@react object Textarea extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   isCompact: Option[Boolean] = None,
                   isDisabled: Option[Boolean] = None,
                   isReadOnly: Option[Boolean] = None,
                   isRequired: Option[Boolean] = None,
                   isInvalid: Option[Boolean] = None,
                   minimumRows: Option[Int] = None,
                   maxHeight: Option[String] = None,
                   value: Option[String | Int] = None,
                   defaultValue: Option[String | Int] = None,
                   onBlur: Option[FocusEventHandler[HTMLTextAreaElement] => Unit] = None,
                   onFocus: Option[FocusEventHandler[HTMLTextAreaElement] => Unit] = None,
                   isMonospaced: Option[Boolean] = None,
                   resize: Option[String] = None,
                   spellCheck: Option[Boolean] = None,
                   theme: Option[js.Any] = None,
                   forwardedRef: Option[Event => Unit] = None)

  override val component = ReactTextarea
}
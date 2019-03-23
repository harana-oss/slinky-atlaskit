package com.harana.slinky.atlaskit.textfield

import com.harana.ui.components.SyntheticEvent
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/textfield", JSImport.Default)
@js.native
object ReactTextfield extends js.Object

@react object Textfield extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   createAnalyticsEvent: Option[SyntheticEvent => Unit] = None,
                   defaultValue: Option[String] = None,
                   isCompact: Option[Boolean] = None,
                   isDisabled: Option[Boolean] = None,
                   isFocused: Option[Boolean] = None,
                   isInvalid: Option[Boolean] = None,
                   isMonospaced: Option[Boolean] = None,
                   isReadOnly: Option[Boolean] = None,
                   isRequired: Option[Boolean] = None,
                   onBlur: Option[SyntheticEvent => Unit] = None,
                   onFocus: Option[SyntheticEvent => Unit] = None,
                   width: Option[String | Int] = None,
                   value: Option[String | Int] = None,
                   forwardedRef: Option[js.Any] = None,
                   theme: Option[(ThemeTokens, ThemeProps)] = None)

  override val component = ReactTextfield
}

@js.native
trait ThemeTokens extends js.Object {
  val backgroundColor: js.UndefOr[String] = js.native
  val backgroundColorFocus: js.UndefOr[String] = js.native
  val backgroundColorHover: js.UndefOr[String] = js.native
  val borderColor: js.UndefOr[String] = js.native
  val borderColorFocus: js.UndefOr[String] = js.native
  val textColor: js.UndefOr[String] = js.native
  val disabledTextColor: js.UndefOr[String] = js.native
  val placeholderTextColor: js.UndefOr[String] = js.native
}

@js.native
trait ThemeProps extends js.Object {
  val appearance: String = js.native
  val mode: String = js.native
}
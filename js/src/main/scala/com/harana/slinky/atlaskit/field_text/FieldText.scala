package com.harana.slinky.atlaskit.field_text

import com.harana.ui.components.SyntheticEvent
import com.harana.slinky.atlaskit.{ReactNode, SyntheticInputEvent, SyntheticKeyboardEvent}
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/field-text", "FieldText")
@js.native
object ReactFieldText extends js.Object

@react object FieldText extends ExternalComponent {

  case class Props(autoComplete: Option[String] = None,
                   form: Option[String] = None,
                   pattern: Option[String] = None,
                   compact: Option[Boolean] = None,
                   `type`: Option[String] = None,
                   disabled: Option[Boolean] = None,
                   isReadOnly: Option[Boolean] = None,
                   required: Option[Boolean] = None,
                   isInvalid: Option[Boolean] = None,
                   label: Option[String] = None,
                   name: Option[String] = None,
                   min: Option[Int] = None,
                   max: Option[String] = None,
                   placeholder: Option[String] = None,
                   value: Option[String | Int] = None,
                   onBlur: Option[String] = None,
                   onChange: Option[SyntheticInputEvent => js.Any] = None,
                   onFocus: Option[SyntheticInputEvent => js.Any] = None,
                   onKeyDown: Option[SyntheticKeyboardEvent => js.Any] = None,
                   onKeyPress: Option[SyntheticKeyboardEvent => js.Any] = None,
                   onKeyUp: Option[SyntheticKeyboardEvent => js.Any] = None,
                   id: Option[String] = None,
                   isLabelHidden: Option[Boolean] = None,
                   isMonospaced: Option[Boolean] = None,
                   invalidMessage: Option[ReactNode] = None,
                   shouldFitContainer: Option[Boolean] = None,
                   isSpellCheckEnabled: Option[Boolean] = None,
                   autoFocus: Option[Boolean] = None,
                   maxLength: Option[Int] = None,
                   isValidationHidden: Option[Boolean] = None)

  override val component = ReactFieldText
}
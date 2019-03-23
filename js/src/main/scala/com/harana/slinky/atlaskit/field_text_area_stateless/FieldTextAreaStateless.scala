package com.harana.slinky.atlaskit.field_text_area_stateless

import com.harana.slinky.atlaskit.{ReactNode, SyntheticInputEvent}
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/field-text-area", "FieldTextAreaStateless")
@js.native
object ReactFieldTextAreaStateless extends js.Object

@react object FieldTextAreaStateless extends ExternalComponent {

  case class Props(compact: Option[Boolean] = None,
                   disabled: Option[Boolean] = None,
                   isReadOnly: Option[Boolean] = None,
                   required: Option[Boolean] = None,
                   isInvalid: Option[Boolean] = None,
                   label: Option[String] = None,
                   name: Option[String] = None,
                   placeholder: Option[String] = None,
                   value: Option[String | Int] = None,
                   onBlur: Option[SyntheticInputEvent => js.Any] = None,
                   onChange: Option[_ => Unit] = None,
                   onFocus: Option[SyntheticInputEvent => js.Any] = None,
                   id: Option[String] = None,
                   isLabelHidden: Option[Boolean] = None,
                   isMonospaced: Option[Boolean] = None,
                   invalidMessage: Option[ReactNode] = None,
                   shouldFitContainer: Option[Boolean] = None,
                   isSpellCheckEnabled: Option[Boolean] = None,
                   autoFocus: Option[Boolean] = None,
                   maxLength: Option[Int] = None,
                   minimumRows: Option[Int] = None,
                   enableResize: Option[Boolean | String] = None,
                   `type`: Option[String] = None)

  override val component = ReactFieldTextAreaStateless
}
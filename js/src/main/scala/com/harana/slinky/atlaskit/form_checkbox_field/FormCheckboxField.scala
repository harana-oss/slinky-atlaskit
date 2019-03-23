package com.harana.slinky.atlaskit.form_checkbox_field

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/form", "CheckboxField")
@js.native
object ReactFormCheckboxField extends js.Object

@react object FormCheckboxField extends ExternalComponent {

  case class Props(children: Option[Children => ReactNode] = None,
                   defaultIsChecked: Option[Boolean] = None,
                   isRequired: Option[Boolean] = None,
                   label: Option[ReactNode] = None,
                   name: Option[String] = None,
                   value: Option[String] = None)

  override val component = ReactFormCheckboxField
}

@js.native
trait Children extends js.Object {
  val fieldProps: FieldProps = js.native
  val error: js.Any = js.native
  val meta: Meta = js.native
}

@js.native
trait FieldProps extends js.Object {
  val isChecked: Boolean = js.native
  val onChange: js.Any => js.Any = js.native
  val onBlur: () => js.Any = js.native
  val onFocus: () => js.Any = js.native
  val value: js.Any = js.native
}

@js.native
trait Meta extends js.Object {
  val dirty: Boolean = js.native
  val touched: Boolean = js.native
  val valid: Boolean = js.native
  val error: js.Any = js.native
  val submitError: js.Any = js.native
}
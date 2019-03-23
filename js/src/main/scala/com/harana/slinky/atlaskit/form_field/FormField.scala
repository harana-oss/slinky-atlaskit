package com.harana.slinky.atlaskit.form_field

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{Promise, |}

@JSImport("@atlaskit/form", "Field")
@js.native
object ReactFormField extends js.Object

@react object FormField extends ExternalComponent {

  case class Props(children: Option[Children => ReactNode] = None,
                   defaultValue: Option[js.Any] = None,
                   isRequired: Option[Boolean] = None,
                   label: Option[ReactNode] = None,
                   name: Option[String] = None,
                   transform: Option[(js.Any, js.Any) => js.Any] = None,
                   validate: Option[(js.Any, js.Object, js.Object) => String | Unit | Promise[String | Unit]] = None)

  override val component = ReactFormField
}

@js.native
trait Children extends js.Object {
  val fieldProps: FieldProps = js.native
  val error: js.Any = js.native
  val meta: Meta = js.native
}

@js.native
trait FieldProps extends js.Object {
  val id: String = js.native
  val isRequired: Boolean = js.native
  val isDisabled: Boolean = js.native
  val isInvalid: Boolean = js.native
  val onChange: js.Any => js.Any = js.native
  val onBlur: () => js.Any = js.native
  val onFocus: () => js.Any = js.native
  val value: js.Any = js.native
  val `aria-invalid`: String = js.native
  val `aria-labelledby`: String = js.native
}

@js.native
trait Meta extends js.Object {
  val dirty: Boolean = js.native
  val touched: Boolean = js.native
  val valid: Boolean = js.native
  val error: js.Any = js.native
  val submitError: js.Any = js.native
}
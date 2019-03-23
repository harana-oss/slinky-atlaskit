package com.harana.slinky.atlaskit.form

import com.harana.slinky.atlaskit.ReactNode
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.Event
import typings.reactLib.reactMod.ReactNs.{Ref, SyntheticEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/form", JSImport.Default)
@js.native
object ReactForm extends js.Object

@react object Form extends ExternalComponent {

  case class Props(children: Option[Children => ReactNode] = None,
                   onSubmit: Option[js.Object => js.Any] = None,
                   isDisabled: Option[Boolean] = None)

  override val component = ReactForm
}

@js.native
trait Children extends js.Object {
  val formProps: FormProps = js.native
  val disabled: Boolean = js.native
  val dirty: Boolean = js.native
  val submitting: Boolean = js.native
  val getValues: () => js.Object = js.native
}

@js.native
trait FormProps extends js.Object {
  val ref: Ref[String] = js.native
  val onSubmit: SyntheticEvent[HTMLFormElement, Event] => js.Any | js.Any = js.native
}

package com.harana.slinky.atlaskit.field_radio_group_stateless

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/field-radio-group", "AkFieldRadioGroup")
@js.native
object ReactFieldRadioGroupStateless extends js.Object

@react object FieldRadioGroupStateless extends ExternalComponent {

  case class Props(isRequired: Option[Boolean] = None,
                   label: Option[String] = None,
                   onRadioChange: Option[() => Unit] = None,
                   items: Option[Seq[Item]] = None)

  override val component = ReactFieldRadioGroupStateless
}

@js.native
trait Item extends js.Object {
  val isDisabled: js.UndefOr[Boolean] = js.native
  val isSelected: js.UndefOr[Boolean] = js.native
  val label: js.UndefOr[ReactNode] = js.native
  val name: js.UndefOr[String] = js.native
  val value: js.UndefOr[String] = js.native
}
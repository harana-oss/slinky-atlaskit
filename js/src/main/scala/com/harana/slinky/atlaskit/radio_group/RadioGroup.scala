package com.harana.slinky.atlaskit.radio_group

import com.harana.ui.components.SyntheticEvent
import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/radio", "RadioGroup")
@js.native
object ReactRadioGroup extends js.Object

@react object RadioGroup extends ExternalComponent {

  case class Props(value: Option[Int | String] = None,
                   defaultValue: Option[Int | String] = None,
                   isDisabled: Option[Boolean] = None,
                   isRequired: Option[Boolean] = None,
                   options: Option[Seq[Radio]] = None,
                   onInvalid: Option[SyntheticEvent => Unit] = None,
                   onChange: Option[SyntheticEvent => Unit] = None)

  override val component = ReactRadioGroup
}

@js.native
trait Radio extends js.Object {
  val isDisabled: js.UndefOr[Boolean] = js.native
  val isChecked: js.UndefOr[Boolean] = js.native
  val label: js.UndefOr[ReactNode] = js.native
  val name: js.UndefOr[String] = js.native
  val value: js.UndefOr[String | Int] = js.native
}
package com.harana.slinky.atlaskit.date_picker

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.stdLib.Date

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/datetime-picker", "DatePicker")
@js.native
object ReactDatePicker extends js.Object

@react object DatePicker extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   autoFocus: Option[Boolean] = None,
                   defaultIsOpen: Option[Boolean] = None,
                   defaultValue: Option[String] = None,
                   disabled: Seq[String] = Seq(),
                   icon: Option[ReactNode] = None,
                   id: Option[String] = None,
                   innerProps: Option[js.Object] = None,
                   isDisabled: Option[Boolean] = None,
                   isOpen: Option[Boolean] = None,
                   name: Option[String] = None,
                   onBlur: Option[() => Unit] = None,
                   onChange: Option[String => Unit] = None,
                   onFocus: Option[() => Unit] = None,
                   parseInputValue: Option[(String, String) => Date] = None,
                   formatDisplayLabel: Option[(String, String) => String] = None,
                   selectProps: Option[js.Object] = None,
                   spacing: Option[String] = None,
                   value: Option[String] = None,
                   isInvalid: Option[Boolean] = None,
                   hideIcon: Option[Boolean] = None,
                   dateFormat: Option[String] = None,
                   placeholder: Option[String] = None)

  override val component = ReactDatePicker
}

@js.native
trait ParseValue extends js.Object {
  val dateValue: String = js.native
  val timeValue: String = js.native
  val zoneValue: String = js.native
}
package com.harana.slinky.atlaskit.date_time_picker

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/datetime-picker", "DateTimePicker")
@js.native
object ReactDateTimePicker extends js.Object

@react object DateTimePicker extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   autoFocus: Option[Boolean] = None,
                   defaultValue: Option[String] = None,
                   id: Option[String] = None,
                   innerProps: Option[js.Object] = None,
                   isDisabled: Option[Boolean] = None,
                   name: Option[String] = None,
                   onBlur: Option[() => Unit] = None,
                   onChange: Option[String => Unit] = None,
                   onFocus: Option[() => Unit] = None,
                   value: Option[String] = None,
                   timeIsEditable: Option[Boolean] = None,
                   isInvalid: Option[Boolean] = None,
                   hideIcon: Option[Boolean] = None,
                   dateFormat: Option[String] = None,
                   datePickerProps: Option[js.Object] = None,
                   timePickerProps: Option[js.Object] = None,
                   parseValue: Option[(String, String, String, String) => ParseValue] = None,
                   datePickerSelectProps: Option[js.Object] = None,
                   timePickerSelectProps: Option[js.Object] = None,
                   times: Seq[String] = Seq(),
                   timeFormat: Option[String] = None,
                   spacing: Option[String] = None)

  override val component = ReactDateTimePicker
}

@js.native
trait ParseValue extends js.Object {
  val dateValue: String = js.native
  val timeValue: String = js.native
  val zoneValue: String = js.native
}
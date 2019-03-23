package com.harana.slinky.atlaskit.time_picker

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.stdLib.Date

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/datetime-picker", "TimePicker")
@js.native
object ReactTimePicker extends js.Object

@react object TimePicker extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   autoFocus: Option[Boolean] = None,
                   defaultIsOpen: Option[Boolean] = None,
                   defaultValue: Option[String] = None,
                   formatDisplayLabel: Option[(String, String) => String] = None,
                   icon: Option[ReactNode] = None,
                   id: Option[String] = None,
                   innerProps: Option[js.Object] = None,
                   isDisabled: Option[Boolean] = None,
                   isOpen: Option[Boolean] = None,
                   name: Option[String] = None,
                   onBlur: Option[() => Unit] = None,
                   onChange: Option[String => Unit] = None,
                   onFocus: Option[() => Unit] = None,
                   parseInputValue: Option[(String, String) => String | Date] = None,
                   selectProps: Option[js.Object] = None,
                   spacing: Option[String] = None,
                   times: Seq[String] = Seq(),
                   timeIsEditable: Option[Boolean] = None,
                   value: Option[String] = None,
                   isInvalid: Option[Boolean] = None,
                   hideIcon: Option[Boolean] = None,
                   timeFormat: Option[String] = None,
                   placeholder: Option[String] = None)

  override val component = ReactTimePicker
}
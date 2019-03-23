package com.harana.slinky.atlaskit.calendar

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/calendar", JSImport.Default)
@js.native
object ReactCalendar extends js.Object

@react object Calendar extends ExternalComponent {

  case class Props(day: Option[Int] = None,
                   defaultDay: Option[Int] = None,
                   defaultDisabled: Seq[String] = Seq(),
                   defaultMonth: Option[Int] = None,
                   defaultPreviouslySelected: Seq[String] = Seq(),
                   defaultSelected: Seq[String] = Seq(),
                   defaultYear: Option[Int] = None,
                   disabled: Seq[String] = Seq(),
                   innerProps: Option[js.Object] = None,
                   month: Option[Int] = None,
                   onBlur: Option[js.Any => Unit] = None,
                   onChange: Option[Change => Unit] = None,
                   onFocus: Option[js.Any => Unit] = None,
                   onSelect: Option[Select => Unit] = None,
                   previouslySelected: Seq[String] = Seq(),
                   selected: Seq[String] = Seq(),
                   today: Option[String] = None,
                   year: Option[Int] = None)

  override val component = ReactCalendar
}

@js.native
trait Change extends js.Object {
  val day: Int = js.native
  val month: Int = js.native
  val year: Int = js.native
  val iso: String = js.native
  val `type`: String = js.native
}

@js.native
trait Select extends js.Object {
  val day: Int = js.native
  val month: Int = js.native
  val year: Int = js.native
  val iso: String = js.native
}
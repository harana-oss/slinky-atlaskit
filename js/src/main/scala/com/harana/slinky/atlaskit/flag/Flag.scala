package com.harana.slinky.atlaskit.flag

import com.harana.slinky.atlaskit.ReactNode
import org.scalajs.dom.raw.{Event, MouseEvent}
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/flag", "Flag")
@js.native
object ReactFlag extends js.Object

@react object Flag extends ExternalComponent {

  case class Props(actions: Seq[Action] = Seq(),
                   appearance: Option[String] = None,
                   description: Option[ReactNode] = None,
                   icon: Option[ReactElement] = None,
                   id: Option[Int | String] = None,
                   isDismissAllowed: Option[Boolean] = None,
                   title: Option[String] = None,
                   linkComponent: Option[ReactElement] = None,
                   onBlur: Option[Event => js.Any] = None,
                   onFocus: Option[Event => js.Any] = None,
                   onMouseOut: Option[MouseEvent => js.Any] = None,
                   onMouseOver: Option[MouseEvent => js.Any] = None)

  override val component = ReactFlag
}

@js.native
trait Action extends js.Object {
  val content: ReactNode = js.native
  val onClick: js.UndefOr[() => js.Any] = js.native
  val href: String = js.native
  val target: String = js.native
}
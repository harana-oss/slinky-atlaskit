package com.harana.slinky.atlaskit.auto_dismiss_flag

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/flag", "AutoDismissFlag")
@js.native
object ReactAutoDismissFlag extends js.Object

@react object AutoDismissFlag extends ExternalComponent {

  case class Props(actions: Seq[Action] = Seq(),
                   appearance: Option[String] = None,
                   description: Option[ReactNode] = None,
                   icon: Option[ReactElement] = None,
                   id: Option[Int | String] = None,
                   isDismissAllowed: Option[Boolean] = None,
                   title: Option[String] = None,
                   linkComponent: Option[ReactElement] = None)

  override val component = ReactAutoDismissFlag
}

@js.native
trait Action extends js.Object {
  val content: ReactNode = js.native
  val onClick: js.UndefOr[() => js.Any] = js.native
  val href: String = js.native
  val target: String = js.native
}
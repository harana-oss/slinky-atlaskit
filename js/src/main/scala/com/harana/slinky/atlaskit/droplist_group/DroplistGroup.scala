package com.harana.slinky.atlaskit.droplist_group

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/droplist", "DroplistGroup")
@js.native
object ReactDroplistGroup extends js.Object

@react object DroplistGroup extends ExternalComponent {

  case class Props(children: Seq[ReactNode] = Seq(),
                   elemAfter: Option[ReactNode] = None,
                   heading: Option[String] = None)

  override val component = ReactDroplistGroup
}
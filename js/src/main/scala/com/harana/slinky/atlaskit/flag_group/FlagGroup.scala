package com.harana.slinky.atlaskit.flag_group

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/flag", "FlagGroup")
@js.native
object ReactFlagGroup extends js.Object

@react object FlagGroup extends ExternalComponent {

  case class Props(children: Seq[ReactElement] = Seq(),
                   onDismissed: Option[() => Unit] = None)

  override val component = ReactFlagGroup
}
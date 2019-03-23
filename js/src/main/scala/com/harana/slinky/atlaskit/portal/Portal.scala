package com.harana.slinky.atlaskit.portal

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/portal", "Portal")
@js.native
object ReactPortal extends js.Object

@react object Portal extends ExternalComponent {

  case class Props(zIndex: Option[Int] = None,
                   children: Seq[ReactElement])

  override val component = ReactPortal
}
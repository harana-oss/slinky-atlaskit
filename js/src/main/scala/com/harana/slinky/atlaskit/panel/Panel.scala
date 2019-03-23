package com.harana.slinky.atlaskit.panel

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/panel", "Panel")
@js.native
object ReactPanel extends js.Object

@react object Panel extends ExternalComponent {

  case class Props(children: Option[ReactNode] = None,
                   header: Option[ReactElement] = None,
                   isDefaultExpanded: Option[Boolean] = None)

  override val component = ReactPanel
}
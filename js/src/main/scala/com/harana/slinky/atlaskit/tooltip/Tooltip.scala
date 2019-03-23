package com.harana.slinky.atlaskit.tooltip

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/tooltip", "Tooltip")
@js.native
object ReactTooltip extends js.Object

@react object Tooltip extends ExternalComponent {

  case class Props(content: Option[ReactNode] = None,
                   delay: Option[Int] = None,
                   hideTooltipOnClick: Option[Boolean] = None,
                   hideTooltipOnMouseDown: Option[Boolean] = None,
                   mousePosition: Option[String] = None,
                   onShow: Option[() => Unit] = None,
                   onHide: Option[() => Unit] = None,
                   position: Option[String] = None,
                   tag: Option[String] = None,
                   truncate: Option[Boolean] = None,
                   children: Seq[ReactElement])

  override val component = ReactTooltip
}
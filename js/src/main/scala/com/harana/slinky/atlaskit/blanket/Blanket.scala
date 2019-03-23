package com.harana.slinky.atlaskit.blanket

import org.scalajs.dom.raw.MouseEvent
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/blanket", JSImport.Default)
@js.native
object ReactBlanket extends js.Object

@react object Blanket extends ExternalComponent {

  case class Props(canClickThrough: Option[Boolean] = None,
                   isTined: Option[Boolean] = None,
                   onBlanketClicked: Option[MouseEvent => Unit] = None)

  override val component = ReactBlanket
}
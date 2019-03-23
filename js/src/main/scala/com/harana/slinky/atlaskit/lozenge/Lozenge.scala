package com.harana.slinky.atlaskit.lozenge

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/lozenge", "Lozenge")
@js.native
object ReactLozenge extends js.Object

@react object Lozenge extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   children: Option[ReactNode] = None,
                   isBold: Option[Boolean] = None,
                   maxWidth: Option[Int | String] = None)

  override val component = ReactLozenge
}
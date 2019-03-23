package com.harana.slinky.atlaskit.badge

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/badge", JSImport.Default)
@js.native
object ReactBadge extends js.Object

@react object Badge extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   children: Option[Int | String] = None,
                   max: Option[Int] = None,
                   theme: Option[(Theme, BadgeTheme)] = None)

  override val component = ReactBadge
}

@js.native
trait Theme extends js.Object {
  val backgroundColor: String = js.native
  val textColor: String = js.native
}

@js.native
trait BadgeTheme extends js.Object {
  val appearance: String = js.native
  val mode: String = js.native
}
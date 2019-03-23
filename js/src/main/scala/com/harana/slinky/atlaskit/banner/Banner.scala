package com.harana.slinky.atlaskit.banner

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/banner", JSImport.Default)
@js.native
object ReactBanner extends js.Object

@react object Banner extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   children: Seq[ReactNode],
                   icon: Option[ReactNode] = None,
                   isOpen: Option[Boolean] = None,
                   innerRef: Option[HTMLElement => js.Any] = None)

  override val component = ReactBanner
}
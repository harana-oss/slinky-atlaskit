package com.harana.slinky.atlaskit.page

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/page", JSImport.Default)
@js.native
object ReactPage extends js.Object

@react object Page extends ExternalComponent {

  case class Props(banner: Option[ReactNode] = None,
                   navigation: Option[ReactNode] = None,
                   isBannerOpen: Option[Boolean] = None,
                   bannerHeight: Option[Int] = None,
                   children: Seq[ReactElement])

  override val component = ReactPage
}
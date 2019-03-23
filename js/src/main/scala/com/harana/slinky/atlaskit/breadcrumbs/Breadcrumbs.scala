package com.harana.slinky.atlaskit.breadcrumbs

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/breadcrumbs", JSImport.Default)
@js.native
object ReactBreadcrumbs extends js.Object

@react object Breadcrumbs extends ExternalComponent {

  case class Props(children: Seq[ReactNode])

  override val component = ReactBreadcrumbs
}

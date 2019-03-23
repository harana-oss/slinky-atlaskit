package com.harana.slinky.atlaskit.breadcrumbs_stateless

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.Event

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/breadcrumbs", "BreadcrumbsStateless")
@js.native
object ReactBreadcrumbsStateless extends js.Object

@react object BreadcrumbsStateless extends ExternalComponent {

  case class Props(isExpanded: Option[Boolean] = None,
                   maxItems: Option[Int] = None,
                   onExpand: Option[Event => Unit] = None,
                   children: Seq[ReactNode],
                   itemsBeforeCollapse: Option[Int] = None,
                   itemsAfterCollapse: Option[Int] = None)

  override val component = ReactBreadcrumbsStateless
}

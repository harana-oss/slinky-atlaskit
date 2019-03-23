package com.harana.slinky.atlaskit.breadcrumbs_item

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import typings.reactLib.Event

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/breadcrumbs", "BreadcrumbsItem")
@js.native
object ReactBreadcrumbsItem extends js.Object

@react object BreadcrumbsItem extends ExternalComponent {

  case class Props(hasSeperator: Option[Boolean] = None,
                   href: Option[String] = None,
                   iconBefore: Option[ReactNode] = None,
                   iconAfter: Option[ReactNode] = None,
                   onClick: Option[Event => Unit] = None,
                   text: Option[String] = None,
                   truncationWidth: Option[Int] = None,
                   target: Option[String] = None,
                   component: Option[ReactElement] = None)

  override val component = ReactBreadcrumbsItem
}

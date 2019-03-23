package com.harana.slinky.atlaskit.page_header

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/page-header", JSImport.Default)
@js.native
object ReactPageHeader extends js.Object

@react object PageHeader extends ExternalComponent {

  case class Props(breadcrumbs: Option[ReactElement] = None,
                   actions: Option[ReactElement] = None,
                   bottomBar: Option[ReactElement] = None,
                   disableTitleStyles: Option[Boolean] = None,
                   truncateTitle: Option[Boolean] = None,
                   title: Option[String] = None,
                   children: Seq[ReactElement])

  override val component = ReactPageHeader
}
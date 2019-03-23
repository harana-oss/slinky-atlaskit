package com.harana.slinky.atlaskit.global_search

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/global-search", "GlobalQuickSearch")
@js.native
object ReactGlobalSearch extends js.Object

@react object GlobalSearch extends ExternalComponent {

  case class Props(onMount: Option[() => js.Any] = None,
                   onSearch: Option[String => js.Any] = None,
                   onSearchSubmit: Option[String => js.Any] = None,
                   isLoading: Option[Boolean] = None,
                   placeholder: Option[String] = None,
                   searchSessionId: Option[String] = None,
                   children: Option[ReactNode] = None,
                   isSendSearchTermsEnabled: Option[Boolean] = None,
                   selectedResultId: Option[String] = None,
                   onSelectedResultIdChanged: Option[String => Unit] = None)

  override val component = ReactGlobalSearch
}
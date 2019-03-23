package com.harana.slinky.atlaskit.quick_search

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/quick-search", JSImport.Default)
@js.native
object ReactQuickSearch extends js.Object

@react object QuickSearch extends ExternalComponent {

  case class Props(isLoading: Option[Boolean] = None,
                   onSearchBlur: Option[() => Unit] = None,
                   onSearchInput: Option[() => Unit] = None,
                   onSearchKeyDown: Option[() => Unit] = None,
                   onSearchSubmit: Option[() => Unit] = None,
                   placeholder: Option[String] = None,
                   value: Option[String] = None,
                   selectedResultId: Option[String | Int | Null] = None,
                   onSelectedResultIdChange: Option[String => Unit] = None,
                   firePrivateAnalyticsEvent: Option[() => js.Any] = None,
                   linkComponent: Option[js.Any] = None,
                   children: Seq[ReactElement])

  override val component = ReactQuickSearch
}
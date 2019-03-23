package com.harana.slinky.atlaskit.dynamic_table

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/dynamic-table", JSImport.Default)
@js.native
object ReactDynamicTable extends js.Object

@react object DynamicTable extends ExternalComponent {

  case class Props(defaultPage: Option[Int] = None,
                   defaultSortKey: Option[String] = None,
                   defaultSortOrder: Option[String] = None,
                   caption: Option[ReactNode] = None,
                   head: Option[Head] = None,
                   rows: Seq[Row] = Seq(),
                   emptyView: Option[ReactElement] = None,
                   loadingSpinnerSize: Option[String] = None,
                   isLoading: Option[Boolean] = None,
                   isFixedSize: Option[Boolean] = None,
                   onSetPage: Option[Int] = None,
                   onSort: Option[Int] = None,
                   page: Option[Int] = None,
                   sortKey: Option[Int] = None,
                   sortOrder: Option[String] = None,
                   isRankable: Option[Boolean] = None,
                   onRankStart: Option[OnRankStart] = None,
                   onRankEnd: Option[OnRankEnd] = None,
                   paginationi18n: Option[Paginationi18n] = None)

  override val component = ReactDynamicTable
}

@js.native
trait Head extends js.Object {
  val cells: js.Array[Cell] = js.native
}

@js.native
trait Row extends js.Object {
  val cells: js.Array[Cell] = js.native
  val key: js.UndefOr[String] = js.native
}

@js.native
trait Cell extends js.Object {
  val key: js.UndefOr[String | Int] = js.native
  val colSpan: js.UndefOr[Int] = js.native
  val content: ReactNode = js.native
  val isSortable: js.UndefOr[Boolean] = js.native
  val width: js.UndefOr[Int] = js.native
  val shoudlTruncate: js.UndefOr[Boolean] = js.native
}

@js.native
trait OnRankStart extends js.Object {
  val index: Int = js.native
  val key: String = js.native
}

@js.native
trait OnRankEnd extends js.Object {
  val sourceIndex: Int = js.native
  val sourceKey: String = js.native
  val destination: OnRankEndDestination = js.native
}

@js.native
trait OnRankEndDestination extends js.Object {
  val index: Int = js.native
  val afterKey: js.UndefOr[String] = js.native
  val beforeKey: js.UndefOr[String] = js.native
}

@js.native
trait Paginationi18n extends js.Object {
  val prev: String = js.native
  val next: String = js.native
}
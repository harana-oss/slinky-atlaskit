package com.harana.slinky.atlaskit.pagination

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.Event

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/pagination", JSImport.Default)
@js.native
object ReactPagination extends js.Object

@react object Pagination extends ExternalComponent {

  case class Props(collapseRange: Option[(Seq[ReactNode], Int, CollapseOptions) => Seq[ReactNode]] = None,
                   createAnalyticsEvent: Option[js.Any] = None,
                   components: Option[Long] = None,
                   defaultSelectedIndex: Option[Int] = None,
                   getPageLabel: Option[(js.Any, Int) => Int | String] = None,
                   i18n: Option[i18n] = None,
                   innerStyles: Option[js.Any] = None,
                   onChange: Option[(Event, js.Any, js.Any) => Unit] = None,
                   pages: Option[Seq[js.Any]] = None,
                   selectedIndex: Option[Int] = None,
                   renderEllipsis: Option[RenderEllipsis] = None)

  override val component = ReactPagination
}

@js.native
trait CollapseOptions extends js.Object {
  val max: Int = js.native
  val ellipsis: RenderEllipsis = js.native
}

@js.native
trait i18n extends js.Object {
  val prev: String = js.native
  val next: String = js.native
}

@js.native
trait RenderEllipsis extends js.Object {
  val key: String = js.native
}
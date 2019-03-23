package com.harana.slinky.atlaskit.media_filmstrip

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/media-filmstrip", "FilmstripView")
@js.native
object ReactMediaFilmstrip extends js.Object

@react object MediaFilmstrip extends ExternalComponent {

  case class Props(animate: Option[Boolean] = None,
                   offset: Option[Int] = None,
                   children: Option[ReactNode] = None,
                   onSize: Option[OnSize => Unit] = None,
                   onScroll: Option[OnScroll => Unit] = None)

  override val component = ReactMediaFilmstrip
}

@js.native
trait OnSize extends js.Object {
  val event: js.UndefOr[js.Any] = js.native
  val width: js.UndefOr[Int] = js.native
  val offset: js.UndefOr[Int] = js.native
  val offsets: js.UndefOr[js.Array[Int]] = js.native
  val minOffset: js.UndefOr[Int] = js.native
  val maxOffset: js.UndefOr[Int] = js.native
}

@js.native
trait OnScroll extends js.Object {
  val event: js.UndefOr[js.Any] = js.native
  val direction: js.UndefOr[String] = js.native
  val offset: js.UndefOr[Int] = js.native
  val animate: js.UndefOr[Boolean] = js.native
}
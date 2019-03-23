package com.harana.slinky.atlaskit.media_card

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/media-card", "Card")
@js.native
object ReactMediaCard extends js.Object

@react object MediaCard extends ExternalComponent {

  case class Props(status: Option[String] = None,
                   details: Option[Details] = None,
                   dataURI: Option[String] = None,
                   progress: Option[Int] = None,
                   onRetry: Option[() => Unit] = None,
                   resizeMode: Option[String] = None,
                   disableOverlay: Option[Boolean] = None,
                   mediaItemType: Option[String] = None,
                   previewOrientation: Option[Int] = None,
                   appearance: Option[String] = None,
                   dimensions: Option[Dimensions] = None,
                   actions: Option[Seq[Action]] = None,
                   selectable: Option[Boolean] = None,
                   selected: Option[Boolean] = None)

  override val component = ReactMediaCard
}

@js.native
trait Details extends js.Object {
  val id: String = js.native
  val name: js.UndefOr[String] = js.native
  val size: js.UndefOr[String] = js.native
  val mimeType: js.UndefOr[String] = js.native
  val mediaType: js.UndefOr[String] = js.native
  val creationDate: js.UndefOr[Int] = js.native
  val processingStatus: js.UndefOr[String] = js.native
  val artifacts: js.UndefOr[js.Dictionary[String]] = js.native
}

@js.native
trait Dimensions extends js.Object {
  val width: Int | String = js.native
  val height: Int | String = js.native
}

@js.native
trait Action extends js.Object {
  val label: js.UndefOr[String] = js.native
  val handler: (js.Any, js.Any) => Unit = js.native
  val icon: js.UndefOr[ReactNode] = js.native
}

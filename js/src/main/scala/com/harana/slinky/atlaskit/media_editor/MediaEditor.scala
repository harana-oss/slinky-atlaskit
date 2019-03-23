package com.harana.slinky.atlaskit.media_editor

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/media-editor", "MediaEditor")
@js.native
object ReactMediaEditor extends js.Object

@react object MediaEditor extends ExternalComponent {

  case class Props(imageUrl: Option[String] = None,
                   dimensions: Option[Dimensions] = None,
                   screenScaleFactor: Option[Int] = None,
                   backgroundColor: Option[BackgroundColor] = None,
                   shapeParameters: Option[ShapeParameters] = None,
                   tool: Option[String] = None,
                   onLoad: Option[(String, js.Any) => Unit] = None,
                   onError: Option[(String, js.Any) => Unit] = None,
                   onShapeParametersChanged: Option[ShapeParameters => Unit] = None)

  override val component = ReactMediaEditor
}

@js.native
trait Dimensions extends js.Object {
  val width: Int | String = js.native
  val height: Int | String = js.native
}

@js.native
trait BackgroundColor extends js.Object {
  val red: Int = js.native
  val green: Int = js.native
  val blue: Int = js.native
  val alpha: Int = js.native
}

@js.native
trait Color extends js.Object {
  val red: Int = js.native
  val green: Int = js.native
  val blue: Int = js.native
}

@js.native
trait ShapeParameters extends js.Object {
  val color: Color = js.native
  val lineWidth: Int = js.native
  val addShow: Boolean = js.native
}

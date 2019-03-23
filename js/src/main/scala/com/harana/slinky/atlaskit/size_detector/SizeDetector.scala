package com.harana.slinky.atlaskit.size_detector

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/size-detector", "SizeDetector")
@js.native
object ReactSizeDetector extends js.Object

@react object SizeDetector extends ExternalComponent {

  case class Props(children: Size => ReactNode,
                   containerSize: Option[js.Object] = None,
                   onResize: Option[Size => Unit] = None)

  override val component = ReactSizeDetector
}

@js.native
trait Size extends js.Object {
  val width: js.UndefOr[Int] = js.native
  val height: js.UndefOr[Int] = js.native
}
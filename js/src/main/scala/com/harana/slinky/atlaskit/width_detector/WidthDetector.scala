package com.harana.slinky.atlaskit.width_detector

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import typings.reactLib.reactMod.ReactNs.CSSProperties

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/width-detector", "WidthDetector")
@js.native
object ReactWidthDetector extends js.Object

@react object WidthDetector extends ExternalComponent {

  case class Props(children: Option[Int => ReactElement] = None,
                   onResize: Option[Int => Unit] = None,
                   containerStyle: Option[CSSProperties] = None)

  override val component = ReactWidthDetector
}
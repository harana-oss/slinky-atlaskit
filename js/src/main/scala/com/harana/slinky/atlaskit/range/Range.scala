package com.harana.slinky.atlaskit.range

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/range", "FieldRange")
@js.native
object ReactRange extends js.Object

@react object Range extends ExternalComponent {

  case class Props(isDisabled: Option[Boolean] = None,
                   max: Option[Int] = None,
                   min: Option[Int] = None,
                   onChange: Option[Int => js.Any] = None,
                   step: Option[Int] = None,
                   value: Option[Int] = None,
                   defaultValue: Option[Int] = None,
                   inputRef: Option[HTMLInputElement => js.Any] = None,
                   theme: Option[(Thumb, Track)] = None)

  override val component = ReactRange
}

@js.native
trait Thumb extends js.Object {
  val default: ThumbDefault = js.native
  val disabled: ThumbDisabled = js.native
  val focus: ThumbFocus = js.native
}

@js.native
trait ThumbDefault extends js.Object {
  val background: String = js.native
  val border: String = js.native
}

@js.native
trait ThumbDisabled extends js.Object {
  val boxShadow: String = js.native
}

@js.native
trait ThumbFocus extends js.Object {
  val background: String = js.native
  val border: String = js.native
}

@js.native
trait Track extends js.Object {
  val background: String = js.native
  val default: Bounds = js.native
  val disabled: Bounds = js.native
  val hover: Bounds = js.native
}

@js.native
trait Bounds extends js.Object {
  val lower: String = js.native
  val upper: String = js.native
}
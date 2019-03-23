package com.harana.slinky.atlaskit.field_range

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/field-range", "FieldRange")
@js.native
object ReactFieldRange extends js.Object

@react object FieldRange extends ExternalComponent {

  case class Props(disabled: Option[Boolean] = None,
                   max: Option[Int] = None,
                   min: Option[Int] = None,
                   onChange: Option[() => Unit] = None,
                   step: Option[Int] = None,
                   value: Option[Int] = None)

  override val component = ReactFieldRange
}
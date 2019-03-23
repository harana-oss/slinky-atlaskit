package com.harana.slinky.atlaskit.status_picker

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/status", "StatusPicker")
@js.native
object ReactStatus extends js.Object

@react object Status extends ExternalComponent {

  case class Props(selectedColor: Option[String] = None,
                   text: Option[String] = None,
                   onEnter: Option[() => Unit] = None,
                   onColorClick: Option[String => Unit] = None,
                   onColorHover: Option[String => Unit] = None,
                   onTextChanged: Option[String => Unit] = None,
                   autoFocus: Option[Boolean] = None)

  override val component = ReactStatus
}
package com.harana.slinky.atlaskit.toggle

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.Event

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/toggle", "Toggle")
@js.native
object ReactToggle extends js.Object

@react object Toggle extends ExternalComponent {

  case class Props(isDisabled: Option[Boolean] = None,
                   label: Option[String] = None,
                   name: Option[String] = None,
                   value: Option[String] = None,
                   onBlur: Option[Event => Unit] = None,
                   onCharge: Option[Event => Unit] = None,
                   onFocus: Option[Event => Unit] = None,
                   size: Option[String] = None,
                   isDefaultChecked: Option[Boolean] = None)

  override val component = ReactToggle
}
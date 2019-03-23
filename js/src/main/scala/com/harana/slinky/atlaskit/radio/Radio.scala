package com.harana.slinky.atlaskit.radio

import com.harana.ui.components.SyntheticEvent
import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/radio", "Radio")
@js.native
object ReactRadio extends js.Object

@react object Radio extends ExternalComponent {

  case class Props(ariaLabel: Option[String] = None,
                   isDisabled: Option[Boolean] = None,
                   isRequired: Option[Boolean] = None,
                   options: Option[Boolean] = None,
                   label: Option[ReactNode] = None,
                   name: Option[String] = None,
                   onChange: Option[SyntheticEvent => Unit] = None,
                   onBlur: Option[SyntheticEvent => Unit] = None,
                   onFocus: Option[SyntheticEvent => Unit] = None,
                   onMouseDown: Option[SyntheticEvent => Unit] = None,
                   onMouseUp: Option[SyntheticEvent => Unit] = None,
                   onMouseEnter: Option[SyntheticEvent => Unit] = None,
                   onMouseLeave: Option[SyntheticEvent => Unit] = None,
                   onInvalid: Option[SyntheticEvent => Unit] = None,
                   value: Option[Int | String] = None)

  override val component = ReactRadio
}
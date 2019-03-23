package com.harana.slinky.atlaskit.checkbox

import com.harana.slinky.atlaskit.{ReactNode, SyntheticInputEvent}
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/checkbox", JSImport.Default)
@js.native
object ReactCheckbox extends js.Object

@react object Checkbox extends ExternalComponent {

  case class Props(defaultChecked: Option[Boolean] = None,
                   id: Option[String] = None,
                   innerRef: Option[HTMLInputElement => Unit] = None,
                   isChecked: Option[Boolean] = None,
                   isDisabled: Option[Boolean] = None,
                   isFullWidth: Option[Boolean] = None,
                   isIndeterminate: Option[Boolean] = None,
                   isInvalid: Option[Boolean] = None,
                   isRequired: Option[Boolean] = None,
                   label: Option[ReactNode] = None,
                   name: Option[String] = None,
                   onChange: Option[SyntheticInputEvent => Unit] = None,
                   value: Option[String] = None)

  override val component = ReactCheckbox
}
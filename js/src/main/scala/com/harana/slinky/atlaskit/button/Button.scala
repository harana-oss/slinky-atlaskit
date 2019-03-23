package com.harana.slinky.atlaskit.button

import org.scalajs.dom.raw.{Event, HTMLButtonElement, HTMLElement}
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import typings.reactLib.reactMod.ReactNs.{ComponentType, FocusEventHandler, MouseEventHandler}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/button", JSImport.Default)
@js.native
object ReactButton extends js.Object

@react object Button extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   ariaControls: Option[String] = None,
                   ariaExpanded: Option[Boolean] = None,
                   ariaHaspopup: Option[Boolean] = None,
                   className: Option[String] = None,
                   component: Option[ComponentType[_]] = None,
                   form: Option[String] = None,
                   href: Option[String] = None,
                   iconAfter: Option[ReactElement] = None,
                   iconBefore: Option[ReactElement] = None,
                   innerRef: Option[HTMLElement => js.Any] = None,
                   id: Option[String] = None,
                   isDisabled: Option[Boolean] = None,
                   isLoading: Option[Boolean] = None,
                   isSelected: Option[Boolean] = None,
                   onBlur: Option[FocusEventHandler[HTMLButtonElement]] = None,
                   onClick: Option[(Event, js.Any) => Unit] = None,
                   onMouseDown: Option[MouseEventHandler[HTMLButtonElement]] = None,
                   onMouseEnter: Option[MouseEventHandler[HTMLButtonElement]] = None,
                   onMouseLeave: Option[MouseEventHandler[HTMLButtonElement]] = None,
                   onMouseUp: Option[MouseEventHandler[HTMLButtonElement]] = None,
                   onFocus: Option[FocusEventHandler[HTMLButtonElement]] = None,
                   spacing: Option[String] = None,
                   tabIndex: Option[Int] = None,
                   target: Option[String] = None,
                   `type`: Option[String] = None,
                   shouldFitContainer: Option[Boolean] = None,
                   autoFocus: Option[Boolean] = None,
                   theme: Option[Boolean] = None)

                   override val component = ReactButton
}
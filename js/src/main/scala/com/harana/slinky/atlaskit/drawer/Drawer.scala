package com.harana.slinky.atlaskit.drawer

import com.harana.slinky.atlaskit.{ReactNode, SyntheticKeyboardEvent, SyntheticMouseEvent}
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.reactMod.ReactNs.ComponentType
import typings.stdLib.KeyboardEvent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/drawer", JSImport.Default)
@js.native
object ReactDrawer extends js.Object

@react object Drawer extends ExternalComponent {

  case class Props(children: Option[ReactNode] = None,
                   icon: Option[ComponentType[_]] = None,
                   width: Option[String] = None,
                   createAnalyticsEvent: Option[js.Object => js.Any] = None,
                   onClose: Option[(SyntheticMouseEvent | SyntheticKeyboardEvent, js.Any) => Unit] = None,
                   onCloseComplete: Option[HTMLElement => Unit] = None,
                   onKeyDown: Option[KeyboardEvent => Unit] = None,
                   isOpen: Option[Boolean] = None,
                   shouldUnmountOnExit: Option[Boolean] = None)

  override val component = ReactDrawer
}
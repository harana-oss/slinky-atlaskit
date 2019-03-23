package com.harana.slinky.atlaskit.modal_dialog

import com.harana.ui.components.SyntheticEvent
import com.harana.slinky.atlaskit.ReactNode
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import typings.reactLib.Event

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/modal-dialog", "ModalDialog")
@js.native
object ReactModalDialog extends js.Object

@react object ModalDialog extends ExternalComponent {

  case class Props(actions: Option[Seq[Action]] = None,
                   appearance: Option[String] = None,
                   autoFocus: Option[Boolean | _ => HTMLElement] = None,
                   components: Option[Components] = None,
                   children: Option[ReactNode] = None,
                   heading: Option[String] = None,
                   isHeadingMultiline: Option[Boolean] = None,
                   height: Option[Int | String] = None,
                   onClose: Option[Event => Unit] = None,
                   onCloseComplete: Option[HTMLElement => Unit] = None,
                   onOpenComplete: Option[(HTMLElement, Boolean) => Unit] = None,
                   onStackChange: Option[Int => Unit] = None,
                   scrollBehaviour: Option[String] = None,
                   shouldCloseOnOverlayClick: Option[Boolean] = None,
                   shouldCloseOnEscapePress: Option[Boolean] = None,
                   isChromeless: Option[Boolean] = None,
                   stackIndex: Option[Int] = None,
                   width: Option[Int | String] = None)

  override val component = ReactModalDialog
}

@js.native
trait Action extends js.Object {
  val onClick: js.UndefOr[() => Unit] = js.native
  val text: js.UndefOr[String] = js.native
}

@js.native
trait Components extends js.Object {
  val Header: js.UndefOr[ReactElement] = js.native
  val Footer: js.UndefOr[ReactElement] = js.native
  val Body: js.UndefOr[ReactElement] = js.native
  val Container: js.UndefOr[ReactElement] = js.native
}
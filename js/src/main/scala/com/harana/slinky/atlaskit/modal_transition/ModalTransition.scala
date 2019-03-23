package com.harana.slinky.atlaskit.modal_transition

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/modal-dialog", "ModalTransition")
@js.native
object ReactModalTransition extends js.Object

@react object ModalTransition extends ExternalComponent {

  case class Props(children: Option[ReactNode] = None)

  override val component = ReactModalTransition
}

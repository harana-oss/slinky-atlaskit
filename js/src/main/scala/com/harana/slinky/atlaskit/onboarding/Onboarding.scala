package com.harana.slinky.atlaskit.onboarding

import com.harana.slinky.atlaskit.ReactNode
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import typings.reactLib.MouseEvent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/onboarding", JSImport.Default)
@js.native
object ReactOnboarding extends js.Object

@react object Onboarding extends ExternalComponent {

  case class Props(actions: Option[Seq[Action]] = None,
                   actionsBeforeElement: Option[ReactNode] = None,
                   dialogPlacement: Option[String] = None,
                   dialogWidth: Option[Int] = None,
                   footer: Option[js.Any] = None,
                   header: Option[js.Any] = None,
                   heading: Option[String] = None,
                   image: Option[String] = None,
                   pulse: Option[Boolean] = None,
                   target: Option[String] = None,
                   targetNode: Option[HTMLElement] = None,
                   targetBgColor: Option[String] = None,
                   targetOnClick: Option[OnClick] = None,
                   targetRadius: Option[Int] = None,
                   targetReplacement: Option[js.Any] = None,
                   children: Seq[ReactElement])

  override val component = ReactOnboarding
}

@js.native
trait Action extends js.Object {
  val onClick: js.UndefOr[js.Any => Unit] = js.native
  val key: js.UndefOr[String] = js.native
  val text: js.UndefOr[ReactNode] = js.native
}

@js.native
trait OnClick extends js.Object {
  val event: MouseEvent = js.native
  val target: js.UndefOr[String] = js.native
}
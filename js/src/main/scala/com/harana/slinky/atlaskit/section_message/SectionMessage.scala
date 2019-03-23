package com.harana.slinky.atlaskit.section_message

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/section-message", JSImport.Default)
@js.native
object ReactSectionMessage extends js.Object

@react object SectionMessage extends ExternalComponent {

  case class Props(appearance: String,
                   title: Option[String] = None,
                   actions: Option[Seq[Action]] = None,
                   icon: Option[ReactElement] = None,
                   linkComponent: Option[ReactElement] = None,
                   children: Seq[ReactElement])

  override val component = ReactSectionMessage
}

@js.native
trait Action extends js.Object {
  val text: ReactNode = js.native
  val onClick: js.UndefOr[js.Function0[Unit]] = js.native
  val href: js.UndefOr[String] = js.native
  val key: String = js.native
}
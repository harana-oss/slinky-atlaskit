package com.harana.slinky.atlaskit.block_card_resolved_view.block_card_resolved_view

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/media-ui", "BlockCardResolvedView")
@js.native
object ReactBlockCardResolvedView extends js.Object

@react object BlockCardResolvedView extends ExternalComponent {

  case class Props(context: Option[Context] = None,
                   link: Option[String] = None,
                   icon: Option[Icon | ReactNode] = None,
                   user: Option[User] = None,
                   thumbnail: Option[String] = None,
                   preview: Option[String] = None,
                   title: Option[Title] = None,
                   byline: Option[Title | ReactNode] = None,
                   description: Option[Title] = None,
                   users: Option[Seq[User]] = None,
                   actions: Option[Seq[Action]] = None,
                   isSelected: Option[Boolean] = None,
                   onClick: Option[() => Unit] = None)

  override val component = ReactBlockCardResolvedView
}

@js.native
trait Action extends js.Object {
  val id: String = js.native
  val text: String = js.native
  val handler: js.Function1[js.Any, Unit] = js.native
}

@js.native
trait Badge extends js.Object {
  val value: Int = js.native
  val max: js.UndefOr[Int] = js.native
  val appearance: js.UndefOr[String] = js.native
}

@js.native
trait Context extends js.Object {
  val icon: js.UndefOr[String] = js.native
  val text: String = js.native
}

@js.native
trait Details extends js.Object {
  val title: js.UndefOr[String] = js.native
  val icon: js.UndefOr[String | ReactNode] = js.native
  val badge: js.UndefOr[Badge] = js.native
  val lozenge: js.UndefOr[Lozenge] = js.native
  val text: js.UndefOr[String] = js.native
  val tooltip: js.UndefOr[String] = js.native
}

@js.native
trait Icon extends js.Object {
  val tooltip: js.UndefOr[String] = js.native
  val url: String = js.native
}

@js.native
trait Lozenge extends js.Object {
  val text: String = js.native
  val appearance: js.UndefOr[String] = js.native
  val isBold: Boolean = js.native
}

@js.native
trait Title extends js.Object {
  val text: String = js.native
  val tooltip: js.UndefOr[String] = js.native
}

@js.native
trait User extends js.Object {
  val icon: js.UndefOr[String] = js.native
  val name: js.UndefOr[String] = js.native
}
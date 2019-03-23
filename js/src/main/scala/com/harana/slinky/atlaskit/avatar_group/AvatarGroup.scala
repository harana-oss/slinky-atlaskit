package com.harana.slinky.atlaskit.avatar_group

import com.harana.slinky.atlaskit.avatar.{AvatarTheme, OnClick, Theme}
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.reactMod.ReactNs.ComponentType
import typings.stdLib.{KeyboardEvent, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/avatar-group", JSImport.Default)
@js.native
object ReactAvatarGroup extends js.Object

@react object AvatarGroup extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   avatar: Option[js.Any] = None,
                   maxCount: Option[Int] = None,
                   size: Option[String] = None,
                   borderColor: Option[String] = None,
                   data: Seq[Avatar],
                   onAvatarClick: Option[OnAvatarClick] = None,
                   onMoreClick: Option[() => js.Any] = None,
                   showMoreButtonProps: Option[js.Any] = None,
                   boundariesElement: Option[String] = None)

  override val component = ReactAvatarGroup
}

@js.native
trait OnAvatarClick extends js.Object {
  val event: KeyboardEvent | MouseEvent = js.native
  val item: js.Object = js.native
}

@js.native
trait Avatar extends js.Object {
  val appearance: js.UndefOr[String] = js.native
  val size: js.UndefOr[String] = js.native
  val enableTooltip: js.UndefOr[Boolean] = js.native
  val borderColor: js.UndefOr[String | js.Function0[String]] = js.native
  val component: js.UndefOr[ComponentType[js.Any]] = js.native
  val href: js.UndefOr[String] = js.native
  val isActive: js.UndefOr[Boolean] = js.native
  val isDisabled: js.UndefOr[Boolean] = js.native
  val isFocus: js.UndefOr[Boolean] = js.native
  val isHover: js.UndefOr[Boolean] = js.native
  val isSelected: js.UndefOr[Boolean] = js.native
  val name: js.UndefOr[String] = js.native
  val presence: js.UndefOr[String] = js.native
  val src: js.UndefOr[Boolean] = js.native
  val status: js.UndefOr[Boolean] = js.native
  val stackIndex: js.UndefOr[Int] = js.native
  val tabIndex: js.UndefOr[Int] = js.native
  val target: js.UndefOr[String] = js.native
  val theme: js.UndefOr[(Theme, AvatarTheme)] = js.native
  val onClick: js.UndefOr[(OnClick, js.Any) => Unit] = js.native
}
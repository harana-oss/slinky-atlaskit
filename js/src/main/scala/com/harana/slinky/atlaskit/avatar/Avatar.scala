package com.harana.slinky.atlaskit.avatar

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.reactMod.ReactNs.ComponentType
import typings.stdLib.{KeyboardEvent, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/avatar", JSImport.Default)
@js.native
object ReactAvatar extends js.Object

@react object Avatar extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   size: Option[String] = None,
                   enableTooltip: Option[Boolean] = None,
                   borderColor: Option[String | js.Function0[String]] = None,
                   component: Option[ComponentType[js.Any]] = None,
                   href: Option[String] = None,
                   isActive: Option[Boolean] = None,
                   isDisabled: Option[Boolean] = None,
                   isFocus: Option[Boolean] = None,
                   isHover: Option[Boolean] = None,
                   isSelected: Option[Boolean] = None,
                   name: Option[String] = None,
                   presence: Option[String] = None,
                   src: Option[Boolean] = None,
                   status: Option[Boolean] = None,
                   stackIndex: Option[Int] = None,
                   tabIndex: Option[Int] = None,
                   target: Option[String] = None,
                   theme: Option[(Theme, AvatarTheme)] = None,
                   onClick: Option[(OnClick, js.Any) => Unit] = None)

  override val component = ReactAvatar
}

@js.native
trait Dimensions extends js.Object {
  val width: String = js.native
  val height: String = js.native
}

@js.native
trait Presence extends js.Object {
  val bottom: String = js.native
  val left: String = js.native
  val right: String = js.native
  val top: String = js.native
  val height: String = js.native
  val width: String = js.native
}

@js.native
trait Status extends js.Object {
  val bottom: String = js.native
  val left: String = js.native
  val right: String = js.native
  val top: String = js.native
  val height: String = js.native
  val width: String = js.native
}

@js.native
trait Theme extends js.Object {
  val backgroundColor: String = js.native
  val borderRadus: String = js.native
  val dimensions: Dimensions = js.native
  val presence: Presence = js.native
  val status: Status = js.native
}

@js.native
trait AvatarTheme extends js.Object {
  val appearance: String = js.native
  val includeBorderWidth: Boolean = js.native
  val isLoading: Boolean = js.native
  val presence: String = js.native
  val size: String = js.native
  val mode: String = js.native
}

@js.native
trait OnClick extends js.Object {
  val event: KeyboardEvent | MouseEvent = js.native
  val item: js.Object = js.native
}
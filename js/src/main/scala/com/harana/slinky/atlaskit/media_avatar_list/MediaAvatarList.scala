package com.harana.slinky.atlaskit.media_avatar_list

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/media-avatar-picker", "AvatarList")
@js.native
object ReactAvatarList extends js.Object

@react object AvatarList extends ExternalComponent {

  case class Props(avatars: Option[Seq[Avatar]] = None,
                   onItemClick: Option[Avatar => Unit] = None,
                   selectedAvatar: Option[Avatar] = None)

  override val component = ReactAvatarList
}

@js.native
trait Avatar extends js.Object {
  val dataURI: String = js.native
}
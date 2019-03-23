package com.harana.slinky.atlaskit.media_avatar_picker_dialog

import com.harana.slinky.atlaskit.media_avatar_list.Avatar
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/media-avatar-picker", "AvatarPickerDialog")
@js.native
object ReactAvatarPickerDialog extends js.Object

@react object AvatarPickerDialog extends ExternalComponent {

  case class Props(avatars: Option[Seq[Avatar]] = None,
                   defaultSelectedAvatar: Option[Avatar => Unit] = None,
                   onAvatarPicked: Option[Avatar => Unit] = None,
                   imageSource: Option[String] = None,
                   onImagePicked: Option[(js.Any, Crop) => Unit] = None,
                   onImagePickedDataURI: Option[String => Unit] = None,
                   onCancel: Option[() => Unit] = None,
                   title: Option[String] = None,
                   primaryButtonText: Option[String] = None,
                   errorMessage: Option[String] = None,
                   isLoading: Option[Boolean] = None,
                   predefinedAvatarsText: Option[String] = None)

  override val component = ReactAvatarPickerDialog
}

@js.native
trait Crop extends js.Object {
  val x: Int = js.native
  val y: Int = js.native
  val size: Int = js.native
}
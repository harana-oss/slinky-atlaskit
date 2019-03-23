package com.harana.slinky.atlaskit.comment_edited

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/comment", "CommentEdited")
@js.native
object ReactCommentEdited extends js.Object

@react object CommentEdited extends ExternalComponent {

  case class Props(children: Seq[String] = Seq(),
                   onFocus: Option[js.Any => Unit] = None,
                   onMouseOver: Option[js.Any => Unit] = None)

  override val component = ReactCommentEdited
}
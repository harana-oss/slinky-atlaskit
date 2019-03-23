package com.harana.slinky.atlaskit.comment_layout

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/comment", "CommentLayout")
@js.native
object ReactCommentLayout extends js.Object

@react object CommentLayout extends ExternalComponent {

  case class Props(avatar: Option[ReactNode] = None,
                   children: Seq[ReactNode] = Seq(),
                   content: Option[ReactNode] = None,
                   highlighted: Option[Boolean] = None,
                   id: Option[String] = None)

  override val component = ReactCommentLayout
}
package com.harana.slinky.atlaskit.comment_action

import com.harana.slinky.atlaskit.ReactNode
import org.scalajs.dom.raw.Event
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/comment", "CommentAction")
@js.native
object ReactCommentAction extends js.Object

@react object CommentAction extends ExternalComponent {

  case class Props(children: Seq[ReactNode] = Seq(),
                   onClick: Option[(Event, js.Any) => Unit] = None,
                   onFocus: Option[js.Any => Unit] = None,
                   onMouseOver: Option[js.Any => Unit] = None)

  override val component = ReactCommentAction
}
package com.harana.slinky.atlaskit.comment_author

import com.harana.slinky.atlaskit.ReactNode
import org.scalajs.dom.raw.Event
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/comment", "CommentAuthor")
@js.native
object ReactCommentAuthor extends js.Object

@react object CommentAuthor extends ExternalComponent {

  case class Props(children: Option[ReactNode] = None,
                   href: Option[String] = None,
                   onClick: Option[(Event, js.Any) => Unit] = None,
                   onFocus: Option[js.Any => Unit] = None,
                   onMouseOver: Option[js.Any => Unit] = None)

  override val component = ReactCommentAuthor
}
package com.harana.slinky.atlaskit.comment_time

import com.harana.slinky.atlaskit.ReactNode
import org.scalajs.dom.raw.Event
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/comment", "CommentTime")
@js.native
object ReactCommentTime extends js.Object

@react object CommentTime extends ExternalComponent {

  case class Props(children: Seq[ReactNode] = Seq(),
                   href: Option[String] = None,
                   onClick: Option[(Event, js.Any) => Unit] = None,
                   onFocus: Option[js.Any => Unit] = None,
                   onMouseOver: Option[js.Any => Unit] = None)

  override val component = ReactCommentTime
}
package com.harana.slinky.atlaskit.comment

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/comment", "Comment")
@js.native
object ReactComment extends js.Object

@react object Comment extends ExternalComponent {

  case class Props(actions: Seq[ReactNode] = Seq(),
                   author: Option[ReactNode] = None,
                   avatar: Option[ReactNode] = None,
                   children: Option[ReactNode] = None,
                   content: Option[ReactNode] = None,
                   highlighted: Option[Boolean] = None,
                   restrictedTo: Option[ReactNode] = None,
                   isSaving: Option[Boolean] = None,
                   savingText: Option[String] = None,
                   time: Option[ReactNode] = None,
                   `type`: Option[String] = None,
                   edited: Option[ReactNode] = None,
                   isError: Option[Boolean] = None,
                   errorActions: Seq[ReactNode] = Seq(),
                   id: Option[String] = None)

  override val component = ReactComment
}
package com.harana.slinky.atlaskit.mention_picker

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/mention", "MentionPicker")
@js.native
object ReactMentionPicker extends js.Object

@react object MentionPicker extends ExternalComponent {

  case class Props()

  override val component = ReactMentionPicker
}

@js.native
trait Mention extends js.Object {
  val mentionId: js.UndefOr[String] = js.native
  val text: js.UndefOr[String] = js.native
  val event: js.UndefOr[js.Any] = js.native
}
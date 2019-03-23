package com.harana.slinky.atlaskit.feedback_form

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/feedback-collector", "FeedbackForm")
@js.native
object ReactFeedbackForm extends js.Object

@react object FeedbackForm extends ExternalComponent {

  case class Props(onClose: Option[() => Unit] = None,
                   onSubmit: Option[OnSubmit => Unit] = None)

  override val component = ReactFeedbackForm
}

@js.native
trait OnSubmit extends js.Object {
  val `type`: String = js.native
  val description: String = js.native
  val canBeContacted: String = js.native
  val enrollInResearchGroup: String = js.native
}
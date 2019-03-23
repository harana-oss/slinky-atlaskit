package com.harana.slinky.atlaskit.feedback_collector

import com.harana.slinky.atlaskit.feedback_collector.Types.AnyValue
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/feedback-collector", "FeedbackCollector")
@js.native
object ReactFeedbackCollector extends js.Object

@react object FeedbackCollector extends ExternalComponent {

  case class Props(email: Option[String] = None,
                   name: Option[String] = None,
                   requestTypeId: Option[String] = None,
                   embeddableKey: Option[String] = None,
                   additionalFields: Option[AdditionalFields] = None,
                   canBeContactedFieldId: Option[String] = None,
                   canBeContactedDefaultValue: Option[AnyValue] = None,
                   customerNameFieldId: Option[String] = None,
                   customerNameDefaultValue: Option[AnyValue] = None,
                   descriptionFieldId: Option[String] = None,
                   descriptionDefaultValue: Option[AnyValue] = None,
                   enrollInResearchFieldId: Option[AnyValue] = None,
                   enrollInResearchDefaultValue: Option[AnyValue] = None,
                   emailFieldId: Option[String] = None,
                   emailDefaultValue: Option[AnyValue] = None,
                   summaryFieldId: Option[String] = None,
                   summaryDefaultValue: Option[AnyValue] = None,
                   summaryTruncateLength: Option[Int] = None,
                   timeoutOnSubmit: Option[Int] = None,
                   typeFieldId: Option[String] = None,
                   typeBugDefaultValue: Option[AnyValue] = None,
                   typeCommentDefaultValue: Option[AnyValue] = None,
                   typeSuggestionDefaultValue: Option[AnyValue] = None,
                   typeQuestionDefaultValue: Option[AnyValue] = None,
                   typeEmptyDefaultValue: Option[AnyValue] = None,
                   onClose: Option[() => Unit] = None,
                   onSubmit: Option[() => Unit] = None)

  override val component = ReactFeedbackCollector
}

object Types {
  type AnyValue = String | js.Object | js.Array[js.Object]
}

@js.native
trait AdditionalFields extends js.Object {
  val id: String = js.native
}
package com.harana.slinky.atlaskit.nps

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/nps", JSImport.Default)
@js.native
object ReactNps extends js.Object

@react object Nps extends ExternalComponent {

  case class Props(product: Option[String] = None,
                   canClose: Option[Boolean] = None,
                   onClose: Option[() => Unit] = None,
                   canOptOut: Option[Boolean] = None,
                   onRatingSelect: Option[Int => Unit] = None,
                   onCommentChange: Option[String => Unit] = None,
                   onRoleSelect: Option[String => Unit] = None,
                   onAllowContactChange: Option[Boolean => Unit] = None,
                   onFeedbackSubmit: Option[Response => Unit] = None,
                   onFollowupSubmit: Option[Response => Unit] = None,
                   onFinish: Option[Response => Unit] = None,
                   roles: Option[Seq[String]] = None)

  override val component = ReactNps
}

@js.native
trait Response extends js.Object {
  val rating: Int = js.native
  val comment: js.UndefOr[String | Null] = js.native
  val role: js.UndefOr[String | Null] = js.native
  val allowContact: js.UndefOr[Boolean] = js.native
}
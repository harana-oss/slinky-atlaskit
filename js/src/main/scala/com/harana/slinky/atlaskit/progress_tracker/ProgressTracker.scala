package com.harana.slinky.atlaskit.progress_tracker

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/progress-tracker", "ProgressTracker")
@js.native
object ReactProgressTracker extends js.Object

@react object ProgressTracker extends ExternalComponent {

  case class Props(items: Option[Seq[Stage]] = None,
                   spacing: Option[String] = None,
                   animated: Option[Boolean] = None)

  override val component = ReactProgressTracker
}

@js.native
trait Stage extends js.Object {
  val id: String = js.native
  val label: String = js.native
  val percentageComplete: Int = js.native
  val status: String = js.native
  val noLink: js.UndefOr[Boolean] = js.native
}
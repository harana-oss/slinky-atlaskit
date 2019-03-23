package com.harana.slinky.atlaskit.progress_indicator

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.Event

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/progress-indicator", "ProgressDots")
@js.native
object ReactProgressIndicator extends js.Object

@react object ProgressIndicator extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   ariaControls: Option[Boolean] = None,
                   ariaLabel: Option[Long] = None,
                   onSelect: Option[OnSelect => Unit] = None,
                   selectedIndex: Option[Int] = None,
                   size: Option[String] = None,
                   spacing: Option[String] = None,
                   values: Option[Seq[js.Any]])

  override val component = ReactProgressIndicator
}

@js.native
trait OnSelect extends js.Object {
  val event: Event = js.native
  val index: Int = js.native
}
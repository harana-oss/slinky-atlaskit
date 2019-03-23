package com.harana.slinky.atlaskit.spinner

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/spinner", "Spinner")
@js.native
object ReactSpinner extends js.Object

@react object Spinner extends ExternalComponent {

  case class Props(delay: Option[Int] = None,
                   invertColor: Option[Boolean] = None,
                   onComplete: Option[() => Unit] = None,
                   size: Option[String] = None,
                   isCompleting: Option[Boolean] = None)

  override val component = ReactSpinner
}
package com.harana.slinky.atlaskit.empty_state

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/empty-state", JSImport.Default)
@js.native
object ReactEmptyState extends js.Object

@react object EmptyState extends ExternalComponent {

  case class Props(header: Option[String] = None,
                   description: Option[String] = None,
                   size: Option[String] = None,
                   imageUrl: Option[String] = None,
                   maxImageWidth: Option[Int] = None,
                   maxImageHeight: Option[Int] = None,
                   primaryAction: Option[ReactElement] = None,
                   secondaryAction: Option[ReactElement] = None,
                   tertiaryAction: Option[ReactElement] = None,
                   isLoading: Option[Boolean] = None,
                   imageWidth: Option[Int] = None,
                   imageHeight: Option[Int] = None)

  override val component = ReactEmptyState
}
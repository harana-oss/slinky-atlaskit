package com.harana.slinky.atlaskit.tag

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.reactMod.ReactNs.ComponentType

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/tags", "Tag")
@js.native
object ReactTag extends js.Object

@react object Tag extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   color: Option[String] = None,
                   elemBefore: Option[ReactNode] = None,
                   text: Option[String] = None,
                   href: Option[String] = None,
                   removeButtonText: Option[String] = None,
                   onBeforeRemoveAction: Option[() => Boolean] = None,
                   onAfterRemoveAction: Option[String => js.Any] = None,
                   linkComponent: Option[ComponentType[_]] = None)

  override val component = ReactTag
}
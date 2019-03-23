package com.harana.slinky.atlaskit.droplist

import com.harana.slinky.atlaskit.{ReactNode, SyntheticKeyboardEvent, SyntheticMouseEvent}
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/droplist", "DropList")
@js.native
object ReactDroplist extends js.Object

@react object Droplist extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   boundariesElement: Option[String] = None,
                   children: Seq[ReactNode] = Seq(),
                   isLoading: Option[Boolean] = None,
                   isOpen: Option[Boolean] = None,
                   onClick: Option[SyntheticMouseEvent => Unit] = None,
                   onKeyDown: Option[SyntheticKeyboardEvent => Unit] = None,
                   onOpenChange: Option[SyntheticKeyboardEvent => Unit] = None,
                   position: Option[String] = None,
                   isMenuFixed: Option[Boolean] = None,
                   shouldAllowMultilineItems: Option[Boolean] = None,
                   shouldFitContainer: Option[Boolean] = None,
                   shouldFlip: Option[Boolean] = None,
                   maxHeight: Option[Int] = None,
                   trigger: Option[ReactNode] = None,
                   onPositioned: Option[() => Unit])

  override val component = ReactDroplist
}
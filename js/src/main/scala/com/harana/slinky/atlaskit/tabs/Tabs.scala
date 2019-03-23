package com.harana.slinky.atlaskit.tabs

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/tabs", "Tabs")
@js.native
object ReactTabs extends js.Object

@react object Tabs extends ExternalComponent {

  case class Props(components: Option[js.Any] = None,
                   defaultSelected: Option[js.Any] = None,
                   minPeriod: Option[Long] = None,
                   maxPeriod: Option[Long] = None,
                   isSelectedTest: Option[Int => Boolean | Tab => Boolean] = None,
                   onSelect: Option[Int => Unit | Tab => Unit] = None,
                   selected: Option[Int | Tab] = None,
                   tabs: Option[Seq[Tab]] = None)

  override val component = ReactTabs
}

@js.native
trait Tab extends js.Object {
  val label: String = js.native
  val content: ReactNode = js.native
}
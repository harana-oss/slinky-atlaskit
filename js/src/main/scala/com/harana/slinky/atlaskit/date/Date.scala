package com.harana.slinky.atlaskit.date

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.stdLib.Event

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/date", "Date")
@js.native
object ReactDate extends js.Object

@react object Date extends ExternalComponent {

  case class Props(onClick: Option[(Int, Event) => Unit] = None,
                   value: Option[Int] = None,
                   any: Option[String] = None,
                   color: Option[String] = None,
                   className: Option[String] = None,
                   children: Option[ReactNode] = None)

  override val component = ReactDate
}
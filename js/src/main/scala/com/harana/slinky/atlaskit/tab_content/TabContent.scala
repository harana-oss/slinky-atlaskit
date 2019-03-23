package com.harana.slinky.atlaskit.tab_content

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/tabs", "TabContent")
@js.native
object ReactTabContent extends js.Object

@react object TabContent extends ExternalComponent {

  case class Props(data: Option[Tab] = None,
                   elementProps: Option[ElementProps] = None)

  override val component = ReactTabContent
}

@js.native
trait Tab extends js.Object {
  val label: String = js.native
  val content: ReactNode = js.native
}

@js.native
trait ElementProps extends js.Object {
  val role: js.UndefOr[String] = js.native
}
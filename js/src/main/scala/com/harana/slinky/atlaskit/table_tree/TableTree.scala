package com.harana.slinky.atlaskit.table_tree

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/table-tree", "TableTree")
@js.native
object ReactTableTree extends js.Object

@react object TableTree extends ExternalComponent {

  case class Props(columns: Option[ReactElement] = None,
                   columnWidths: Option[String | Int] = None,
                   headers: Option[Seq[String]] = None,
                   children: Seq[ReactElement],
                   items: Option[Seq[js.Object]] = None)

  override val component = ReactTableTree
}
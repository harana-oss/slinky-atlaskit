package com.harana.slinky.atlaskit.tree

import com.harana.slinky.atlaskit.tree.Types.ItemId
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/tree", "Tree")
@js.native
object ReactTree extends js.Object

@react object Tree extends ExternalComponent {

  case class Props(tree: Option[TreeData] = None,
                   onExpand: Option[js.Any => Unit | js.Array[Int] => Unit] = None,
                   onCollapse: Option[js.Any => Unit | js.Array[Int] => Unit] = None,
                   onDragStart: Option[js.Any => Unit] = None,
                   onDragEnd: Option[TreePosition => Unit] = None,
                   renderItem: Option[String] = None,
                   offsetPerLevel: Option[Int] = None,
                   isDragEnabled: Option[Boolean] = None,
                   isNestingEnabled: Option[Boolean] = None)

  override val component = ReactTree
}

object Types {
  type ItemId = js.Any
}

@js.native
trait TreePosition extends js.Object {
  val parentId: ItemId = js.native
  val index: js.UndefOr[Int] = js.native
}

@js.native
trait TreeData extends js.Object {
  val rootId: ItemId = js.native
  val items: js.Dictionary[TreeItem] = js.native
}

@js.native
trait TreeItem extends js.Object {
  val id: ItemId = js.native
  val children: js.Array[ItemId] = js.native
  val hasChildren: js.UndefOr[Boolean] = js.native
  val isExpanded: js.UndefOr[Boolean] = js.native
  val isChildrenLoading: js.UndefOr[Boolean] = js.native
  val data: js.UndefOr[js.Any] = js.native
}

@js.native
trait RenderItem extends js.Object {
  val item: TreeItem = js.native
  val depth: Int = js.native
  val onExpand: js.Any => Unit = js.native
  val onCollapse: js.Any => Unit = js.native
  val provided: js.Any => Unit = js.native
}

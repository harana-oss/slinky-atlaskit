package com.harana.slinky.atlaskit.emoji

import com.harana.slinky.atlaskit.emoji.Types.EmojiRepresentation
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/emoji", JSImport.Default)
@js.native
object ReactEmoji extends js.Object

@react object Emoji extends ExternalComponent {

  case class Props(emoji: EmojiDescription,
                   selected: Option[Boolean] = None,
                   selectOnHover: Option[Long] = None,
                   onSelected: Option[Long] = None,
                   onMouseMove: Option[String] = None,
                   onDelete: Option[String] = None,
                   onLoadError: Option[String] = None,
                   className: Option[String] = None,
                   showTooltip: Option[Boolean] = None,
                   showDelete: Option[Boolean] = None,
                   fitToHeight: Option[Int] = None)

  override val component = ReactEmoji
}

object Types {
  type EmojiRepresentation = SpriteRepresentation | ImageRepresentation | MediaApiRepresentation
}

@js.native
trait SpriteSheet extends js.Object {
  val url: String = js.native
  val row: Int = js.native
  val column: Int = js.native
  val height: Int = js.native
  val width: Int = js.native
}

@js.native
trait EmojiImageRepresentation extends js.Object {
  val height: Int = js.native
  val width: Int = js.native
}

@js.native
trait SpriteImageRepresentation extends js.Object {
  val x: Int = js.native
  val y: Int = js.native
  val xIndex: Int = js.native
  val yIndex: Int = js.native
}

@js.native
trait ImageRepresentation extends EmojiImageRepresentation {
  val imagePath: String = js.native
}

@js.native
trait MediaApiRepresentation extends EmojiImageRepresentation {
  val mediaPath: String = js.native
}

@js.native
trait SpriteRepresentation extends SpriteImageRepresentation {
  val sprite: SpriteSheet = js.native
}

@js.native
trait EmojiDescription extends js.Object {
  val name: js.UndefOr[String] = js.native
  val order: js.UndefOr[Int] = js.native
  val `type`: String = js.native
  val category: String = js.native
  val ascii: js.UndefOr[js.Array[String]] = js.native
  val createdDate: js.UndefOr[String] = js.native
  val creatorUserId: js.UndefOr[String] = js.native
  val representation: EmojiRepresentation = js.native
  val altRepresentation: js.UndefOr[EmojiRepresentation] = js.native
  val searchable: Boolean = js.native
}
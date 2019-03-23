package com.harana.slinky.atlaskit.tag_group

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/tag-group", "TagGroup")
@js.native
object ReactTagGroup extends js.Object

@react object TagGroup extends ExternalComponent {

  case class Props(alignment: Option[String] = None,
                   children: Seq[ReactElement] = Seq())

  override val component = ReactTagGroup
}
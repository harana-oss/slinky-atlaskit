package com.harana.slinky.atlaskit.code

import com.harana.slinky.atlaskit.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/code", "AkCode")
@js.native
object ReactCode extends js.Object

@react object Code extends ExternalComponent {

  case class Props(codeStyle: Option[js.Object] = None,
                   codeTagProps: Option[js.Object] = None,
                   language: Option[String] = None,
                   lineNumberContainerStyle: Option[js.Object] = None,
                   preTag: Option[ReactNode] = None,
                   showLineNumbers: Option[Boolean] = None,
                   text: Option[String] = None,
                   theme: Option[Theme] = None)

  override val component = ReactCode
}

@js.native
trait Theme extends js.Object {
  val lineNumberColor: String  | Int = js.native
  val lineNumberBgColor: String  | Int = js.native
  val backgroundColor: String  | Int = js.native
  val textColor: String  | Int = js.native
  val substringColor: String  | Int = js.native
  val keywordColor: String  | Int = js.native
  val attributeColor: String  | Int = js.native
  val selectorTagColor: String  | Int = js.native
  val docTagColor: String  | Int = js.native
  val nameColor: String  | Int = js.native
  val builtInColor: String  | Int = js.native
  val literalColor: String  | Int = js.native
  val bulletColor: String  | Int = js.native
  val codeColor: String  | Int = js.native
  val additionColor: String  | Int = js.native
  val regexpColor: String  | Int = js.native
  val symbolColor: String  | Int = js.native
  val variableColor: String  | Int = js.native
  val templateVariableColor: String  | Int = js.native
  val linkColor: String  | Int = js.native
  val selectorAttributeColor: String  | Int = js.native
  val selectorPseudoColor: String  | Int = js.native
  val typeColor: String  | Int = js.native
  val stringColor: String  | Int = js.native
  val selectorIdColor: String  | Int = js.native
  val selectorClassColor: String  | Int = js.native
  val quoteColor: String  | Int = js.native
  val templateTagColor: String  | Int = js.native
  val deletionColor: String  | Int = js.native
  val titleColor: String  | Int = js.native
  val sectionColor: String  | Int = js.native
  val commentColor: String  | Int = js.native
  val metaKeywordColor: String  | Int = js.native
  val metaColor: String  | Int = js.native
  val functionColor: String  | Int = js.native
  val numberColor: String  | Int = js.native
}
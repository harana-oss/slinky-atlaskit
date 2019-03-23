package com.harana.slinky.atlaskit.editor

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("@atlaskit/editor-core", "Editor")
@js.native
object ReactEditorCore extends js.Object

@react object EditorCore extends ExternalComponent {

  case class Props(appearance: Option[String] = None,
                   contentComponents: Seq[ReactElement] = Seq(),
                   primaryToolbarComponents: Seq[ReactElement] = Seq(),
                   secondaryToolbarComponents: Seq[ReactElement] = Seq(),
                   addonToolbarComponents: Seq[ReactElement] = Seq(),
                   allowAnalyticsGASV3: Option[Boolean] = None,
                   allowBlockType: Option[AllowBlockType] = None,
                   allowTasksAndDecisions: Option[Boolean] = None,
                   allowBreakout: Option[Boolean] = None,
                   allowRule: Option[Boolean] = None,
                   allowCodeBlocks: Option[Boolean] = None,
                   allowLists: Option[Boolean] = None,
                   allowTextColor: Option[Boolean | AllowTextColor] = None,
                   allowTables: Option[Boolean | AllowTables] = None,
                   allowHelpDialog: Option[Boolean] = None,
                   allowJiraIssue: Option[Boolean] = None,
                   allowUnsupportedContent: Option[Boolean] = None,
                   allowPanel: Option[Boolean] = None,
                   allowExtension: Option[Boolean | AllowExtension] = None,
                   allowConfluenceInlineComment: Option[Boolean] = None,
                   allowPlaceholderCursor: Option[Boolean] = None,
                   allowTemplatePlaceholders: Option[Boolean | AllowTemplatePlaceholders] = None,
                   allowDate: Option[Boolean] = None,
                   allowInlineAction: Option[Boolean] = None,
                   allowStatus: Option[Boolean | AllowStatus] = None,
                   allowDynamicTextSizing: Option[Boolean] = None,
                   allowTextAlignment: Option[Boolean] = None,
                   allowIndentation: Option[Boolean] = None,
                   quickInsert: Option[Boolean] = None,
                   saveOnEnter: Option[Boolean] = None,
                   shouldFocus: Option[Boolean] = None,
                   disabled: Option[Boolean] = None,
                   errorReporterHandler: Option[Boolean] = None,
                   uploadErrorHandler: Option[Boolean] = None,
                   activityProvider: Option[Boolean] = None)

  override val component = ReactEditorCore
}

@js.native
trait AllowBlockType extends js.Object {
  val exclude: String = js.native
}

@js.native
trait AllowTextColor extends js.Object {
  val defaultColor: Color = js.native
}

@js.native
trait Color extends js.Object {
  val color: String = js.native
  val label: String = js.native
}

@js.native
trait AllowTables extends js.Object {
  val advanced: js.UndefOr[Boolean] = js.native
  val allowBackgroundColor: js.UndefOr[Boolean] = js.native
  val allowColumnResizing: js.UndefOr[Boolean] = js.native
  val allowHeaderColumn: js.UndefOr[Boolean] = js.native
  val allowHeaderRow: js.UndefOr[Boolean] = js.native
  val allowMergeCells: js.UndefOr[Boolean] = js.native
  val allowNumberColumn: js.UndefOr[Boolean] = js.native
  val isHeaderRowRequired: js.UndefOr[Boolean] = js.native
  val stickToolbarToBottom: js.UndefOr[Boolean] = js.native
  val permittedLayouts: js.UndefOr[String | Seq[js.Any]] = js.native
  val allowControls: js.UndefOr[Boolean] = js.native
}

@js.native
trait AllowExtension extends js.Object {
  val stickToolbarToBottom: js.UndefOr[String] = js.native
  val allowBreakout: js.UndefOr[String] = js.native
}

@js.native
trait AllowTemplatePlaceholders extends js.Object {
  val allowInserting: js.UndefOr[Boolean] = js.native
}

@js.native
trait AllowStatus extends js.Object {
  val menuDisabled: js.UndefOr[Boolean] = js.native
}

@js.native
trait ErrorReporterHandler extends js.Object {
  val captureMessage: js.UndefOr[(String, js.Array[String]) => Unit] = js.native
  val captureException: js.UndefOr[(Error, js.Array[String]) => Unit] = js.native
}
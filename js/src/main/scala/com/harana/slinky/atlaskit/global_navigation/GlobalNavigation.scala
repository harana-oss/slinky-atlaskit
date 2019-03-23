package com.harana.slinky.atlaskit.global_navigation

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.reactMod.ReactNs.ComponentType

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/global-navigation", JSImport.Default)
@js.native
object ReactGlobalNavigation extends js.Object

@react object GlobalNavigation extends ExternalComponent {

  case class Props(productIcon: Option[ComponentType[js.Object]] = None,
                   onProductClick: Option[() => Unit] = None,
                   productTooltip: Option[String] = None,
                   productHref: Option[String] = None,
                   onCreateClick: Option[() => Unit] = None,
                   createTooltip: Option[String] = None,
                   onStarredClick: Option[() => Unit] = None,
                   starredTooltip: Option[String] = None,
                   onSearchClick: Option[() => Unit] = None,
                   searchTooltip: Option[String] = None,
                   appSwitcherComponent: Option[ComponentType[js.Any]] = None,
                   appSwitcherTooltip: Option[String] = None,
                   enableAtlassianSwitcher: Option[Boolean] = None,
                   triggerXFlow: Option[(String, String) => Unit] = None,
                   helpTooltip: Option[String] = None,
                   helpItems: Option[ComponentType[js.Any]] = None,
                   profileTooltip: Option[String] = None,
                   profileItems: Option[ComponentType[js.Any]] = None,
                   profileIconUrl: Option[String] = None,
                   loginHref: Option[String] = None,
                   locale: Option[String] = None,
                   product: Option[String] = None,
                   fabricNotificationLogUrl: Option[String] = None,
                   cloudId: Option[String] = None,
                   onNotificationClick: Option[() => Unit] = None,
                   notificationCount: Option[Int] = None,
                   notificationTooltip: Option[String] = None,
                   onSettingsClick: Option[() => Unit] = None,
                   settingsTooltip: Option[String] = None,
                   isCreateDrawerOpen: Option[Boolean ] = None,
                   createDrawerContents: Option[ComponentType[js.Any]] = None,
                   createDrawerWidth: Option[String] = None,
                   onCreateDrawerOpen: Option[() => Unit] = None,
                   onCreateDrawerClose: Option[() => Unit] = None,
                   onCreateDrawerCloseComplete: Option[HTMLElement => Unit] = None,
                   shouldCreateDrawerUnmountOnExit: Option[Boolean] = None,
                   isSearchDrawerOpen: Option[Boolean] = None,
                   searchDrawerContents: Option[ComponentType[js.Any]] = None,
                   searchDrawerWidth: Option[String] = None,
                   onSearchDrawerOpen: Option[() => Unit] = None,
                   onSearchDrawerClose: Option[() => Unit] = None,
                   onSearchDrawerCloseComplete: Option[HTMLElement => Unit] = None,
                   shouldSearchDrawerUnmountOnExit: Option[Boolean] = None,
                   isNotificationDrawerOpen: Option[Boolean] = None,
                   notificationDrawerContents: Option[ComponentType[js.Any]] = None,
                   notificationDrawerWidth: Option[String] = None,
                   onNotificationDrawerOpen: Option[() => Unit] = None,
                   onNotificationDrawerClose: Option[() => Unit] = None,
                   onNotificationDrawerCloseComplete: Option[HTMLElement => Unit] = None,
                   shouldNotificationDrawerUnmountOnExit: Option[Boolean] = None,
                   isStarredDrawerOpen: Option[Boolean] = None,
                   starredDrawerContents: Option[ComponentType[js.Any]] = None,
                   starredDrawerWidth: Option[String] = None,
                   onStarredDrawerOpen: Option[() => Unit] = None,
                   onStarredDrawerClose: Option[() => Unit] = None,
                   onStarredDrawerCloseComplete: Option[HTMLElement => Unit] = None,
                   shouldStarredDrawerUnmountOnExit: Option[Boolean] = None)

  override val component = ReactGlobalNavigation
}
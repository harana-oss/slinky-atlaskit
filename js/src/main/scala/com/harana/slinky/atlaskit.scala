package com.harana.slinky

import slinky.core.facade.ReactElement
import typings.{csstypeLib, reactLib}

import scala.scalajs.js.|

package object atlaskit {
  type CSSProperties = csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]
  type ReactNode = Int | String | ReactElement
  type SyntheticKeyboardEvent = reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]
  type SyntheticMouseEvent = reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
}

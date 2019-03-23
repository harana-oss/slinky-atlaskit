package com.harana.slinky.atlaskit.form_validators

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("@atlaskit/form", "ErrorMessage")
@js.native
object ReactErrorMessage extends js.Object

@react object ErrorMessage extends ExternalComponent {
  type Props = Unit

  override val component = ReactErrorMessage
}

@JSImport("@atlaskit/form", "HelperMessage")
@js.native
object ReactHelperMessage extends js.Object

@react object HelperMessage extends ExternalComponent {
  type Props = Unit

  override val component = ReactHelperMessage
}

@JSImport("@atlaskit/form", "ValidMessage")
@js.native
object ReactValidMessage extends js.Object

@react object ValidMessage extends ExternalComponent {
  type Props = Unit

  override val component = ReactValidMessage
}
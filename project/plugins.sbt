logLevel := Level.Warn
resolvers += "Typesafe" at "https://repo.typesafe.com/typesafe/releases/"
resolvers += Resolver.url("heroku-sbt-plugin-releases", url("https://dl.bintray.com/heroku/sbt-plugins/"))(Resolver.ivyStylePatterns)
resolvers ++= Seq(Resolver.bintrayRepo("scalameta", "maven"), Resolver.jcenterRepo, Resolver.bintrayIvyRepo("scalacenter", "sbt-releases"), Resolver.bintrayRepo("scalacenter", "releases"))

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")
addSbtPlugin("com.gilt" % "sbt-dependency-graph-sugar" % "0.9.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.26")
addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.0.8-0.6")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.4")
addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.3")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.9")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.14.0")
addSbtPlugin("ch.epfl.scala" % "sbt-web-scalajs-bundler" % "0.14.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.2")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.4.0")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.1.0-M13-1")
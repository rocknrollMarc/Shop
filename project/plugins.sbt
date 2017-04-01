// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.12")
addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.2.0")

//addSbtPlugin("com.typesafe.play" % "play-docs-sbt-plugin" % "2.5.12")
//addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.1")


//ide
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.1.0")

//style
// Use the Scalariform plugin to reformat the code
//addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")


//tools
//task: dependencyUpdates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.0")
addSbtPlugin("com.gilt" % "sbt-dependency-graph-sugar" % "0.8.2")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
//tasks: checkDuplicates # duplicate things on classpath
addSbtPlugin("org.scala-sbt" % "sbt-duplicates-finder" % "0.6.0")

name := "cavission"
organization := "com.example"
version := "1.0-SNAPSHOT"
lazy val root = (project in file(".")).enablePlugins(PlayScala)
scalaVersion := "2.13.10"






// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"
libraryDependencies += guice
libraryDependencies ++= Seq(
  javaJdbc
)
// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.28"
libraryDependencies += "io.ebean" % "ebean" % "12.1.3"
libraryDependencies += "javax.validation" % "validation-api" % "2.0.1.Final"

libraryDependencies += "com.typesafe.play" %% "play" % "2.8.20"



resolvers += Resolver.mavenLocal
resolvers += "Maven Central" at "https://repo1.maven.org/maven2"

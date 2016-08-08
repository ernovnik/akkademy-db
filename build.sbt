name := """akkademy-db"""

version := "1.0"

scalaVersion := "2.11.8"

// Change this to another test framework if you prefer
//libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.15",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.15" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
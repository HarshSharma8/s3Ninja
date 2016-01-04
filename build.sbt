name := "S3NinjaDemo"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4",
  "com.amazonaws" % "aws-java-sdk" % "1.10.30",
  "com.typesafe" % "config" % "1.2.1",
  "ch.qos.logback" % "logback-classic" % "1.0.13"
)

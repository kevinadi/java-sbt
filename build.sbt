// sbt make-pom

name := "java-sbt"

version := "1.0"

scalaVersion := "2.11.7"

autoScalaLibrary := false

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.1",
    "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
)


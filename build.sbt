name in ThisBuild := "scalatest-forall-async-example"

version in ThisBuild := "0.1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.12.6"

libraryDependencies ++= Seq(
   "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test,
   "org.scalacheck" %% "scalacheck" % "1.13.5" % Test
)

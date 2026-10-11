import Dependencies._

ThisBuild / scalaVersion := "3.9.0"
ThisBuild / version      := "0.1.0-SNAPSHOT"

ThisBuild / scalacOptions := {
  val common = Seq(
    "-encoding",
    "UTF-8",
    "-no-indent",
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Werror",
    "-Wunused:all",
    "-Wvalue-discard",
    "-Wnonunit-statement",
    "-Xcheck-macros",
    "-Xmax-inlines:64"
  )
  common
}

ThisBuild / semanticdbEnabled := true

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = (project in file("."))
  .settings(
    name                := "devfolio",
    libraryDependencies += munit % Test
  )

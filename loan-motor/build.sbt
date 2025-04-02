val scala3Version = "3.6.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "loanmotor",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )

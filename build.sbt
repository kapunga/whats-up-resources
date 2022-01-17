val scala3Version = "3.1.0"

lazy val core = project.in(file("core"))
  .settings(
    name := "Core",

    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
  )


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.13.6"
    )),
    name := "how-to-test"
  )

libraryDependencies += "org.scalacheck" %% "scalacheck"        % "1.15.4" % "test"
libraryDependencies += "org.specs2"     %% "specs2-core"       % "4.12.12" % "test"
libraryDependencies += "org.specs2"     %% "specs2-scalacheck" % "4.12.12" % "test"

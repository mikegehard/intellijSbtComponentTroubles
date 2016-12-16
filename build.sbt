lazy val commonSettings = Seq(
  scalaVersion := "2.11.8"
)

lazy val root =
        project.in( file(".") )
   .aggregate(contests)

lazy val contests = project.
    settings(commonSettings: _*)

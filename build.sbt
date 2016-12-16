lazy val commonSettings = Seq(
  scalaVersion := "2.11.8"
)

lazy val root =
        project.in( file(".") )
   .aggregate(contests)

lazy val contests = project.
    in( file("apps/contests") ).
    settings(commonSettings: _*)

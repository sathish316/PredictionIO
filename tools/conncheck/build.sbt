name := "PredictionIO Connection Check Tool"

version := "0.3"

organization := "io.prediction"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "io.prediction" %% "predictionio-commons" % "0.3"
)

resolvers ++= Seq(
  "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
)
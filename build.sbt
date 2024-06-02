ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.19"

val flinkVersion = "1.18.0"

lazy val root = (project in file("."))
  .settings(
    name := "flink-app",
    libraryDependencies ++= Seq(
      "org.apache.flink" % "flink-runtime-web" % flinkVersion,
      "org.apache.flink" %% "flink-scala" % flinkVersion,
      "org.apache.flink" %% "flink-streaming-scala" % flinkVersion,
      "ch.qos.logback" % "logback-classic" % "1.2.3")
  )

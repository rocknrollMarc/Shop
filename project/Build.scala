import sbt._
import Keys._
import play.sbt._
import Play.autoImport._
import PlayKeys._

object ApplicationBuild extends Build {
  val appName         = "modern-web-template"
  val appVersion      = "0.1-SNAPSHOT"

  val appDependencies = Seq(
    "net.codingwell" %% "scala-guice" % "4.0.1",
    "com.google.inject" % "guice" % "4.0",
    //"javax.inject" % "javax.inject" % "1",
    //"org.reactivemongo" %% "reactivemongo" % "0.10.0",
    //"org.reactivemongo" %% "play2-reactivemongo" % "0.10.2",
	"org.reactivemongo" %% "play2-reactivemongo" % "0.11.14",//for play-2.5.x
    "org.mockito" % "mockito-core" % "1.9.5" % "test",
	specs2 % Test
  )


  val main = Project(appName, file(".")).enablePlugins(PlayScala).settings(
    scalaVersion := "2.11.8",
    version := appVersion,
	libraryDependencies ++= appDependencies
    // Add your own project settings here      
  )

}

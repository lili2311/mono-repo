name := "subsearch"

assemblyJarName in assembly := s"subsearch-0.2.0.jar"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += Resolver.sonatypeRepo("public")

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % "test"
libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.2"
libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.6.6"
libraryDependencies += "com.github.scopt" %% "scopt" % "3.4.0"
libraryDependencies += "pl.project13.scala" %% "rainbow" % "0.2"
libraryDependencies += "dnsjava" % "dnsjava" % "2.1.7"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.1"
libraryDependencies += "org.scala-lang.modules" % "scala-jline" % "2.12.1"
libraryDependencies += "net.ruippeixotog" %% "scala-scraper" % "1.0.0"

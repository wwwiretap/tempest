name := "tempest"

version := "0.9"

scalaVersion := "2.11.5"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

libraryDependencies += "net.openhft" % "koloboke-impl-jdk6-7" % "0.6.6"

libraryDependencies += "it.unimi.dsi" % "fastutil" % "6.6.0"

libraryDependencies += "org.apache.thrift" % "libthrift" % "0.9.1"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.6.1" // Needed for thrift

libraryDependencies += "com.twitter" %% "util-app" % "6.23.0"

scalacOptions += "-target:jvm-1.7"

scalacOptions += "-Ywarn-unused"

unmanagedSourceDirectories in Compile += baseDirectory.value / "src/gen/java"

test in assembly := {} // Disable tests during assembly
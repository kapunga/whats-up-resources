# Issue

`sbt run` seems to work:
```
kapunga ~/whats-up-resources (master)$ sbt core/run
[info] welcome to sbt 1.6.1 (AdoptOpenJDK Java 1.8.0_282)
[info] loading settings for project global-plugins from idea.sbt ...
[info] loading global plugins from /Users/kapunga/.sbt/1.0/plugins
[info] loading project definition from /Users/kapunga/Personal Projects/whats-up-resources/project
[info] loading settings for project whats-up-resources from build.sbt ...
[info] set current project to whats-up-resources (in build file:/Users/kapunga/Personal%20Projects/whats-up-resources/)
[info] running wur.run
Hello World!
[success] Total time: 1 s, completed Jan 16, 2022 9:04:17 PM
```

`sbt console` does not:
```
kapunga ~/whats-up-resources (master)$ sbt core/console
sbt core/console
[info] welcome to sbt 1.6.1 (AdoptOpenJDK Java 1.8.0_282)
[info] loading settings for project global-plugins from idea.sbt ...
[info] loading global plugins from /Users/kapunga/.sbt/1.0/plugins
[info] loading project definition from /Users/kapunga/Personal Projects/whats-up-resources/project
[info] loading settings for project whats-up-resources from build.sbt ...
[info] set current project to whats-up-resources (in build file:/Users/kapunga/Personal%20Projects/whats-up-resources/)
Welcome to Scala 3.1.0 (1.8.0_282, Java OpenJDK 64-Bit Server VM).
Type in expressions for evaluation. Or try :help.

scala> import wur._

scala> Hello.world
com.typesafe.config.ConfigException$Missing: merge of system properties,reference.conf @ jar:file:/Users/kapunga/.sbt/boot/scala-2.12.15/org.scala-sbt/sbt/1.6.1/ssl-config-core_2.12-0.4.0.jar!/reference.conf: 1: No configuration setting found for key 'hello'
  at com.typesafe.config.impl.SimpleConfig.findKeyOrNull(SimpleConfig.java:157)
  at com.typesafe.config.impl.SimpleConfig.findKey(SimpleConfig.java:150)
  at com.typesafe.config.impl.SimpleConfig.findOrNull(SimpleConfig.java:177)
  at com.typesafe.config.impl.SimpleConfig.find(SimpleConfig.java:189)
  at com.typesafe.config.impl.SimpleConfig.find(SimpleConfig.java:194)
  at com.typesafe.config.impl.SimpleConfig.getString(SimpleConfig.java:251)
  at wur.Hello$.<clinit>(Main.scala:7)
  ... 62 elided

scala>
```

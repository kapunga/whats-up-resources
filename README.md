# Scala 3 REPL does not appear to be loading resources properly

I am unable to properly load resources from a jar file from the Scala 3 REPL.
For this project, I can read them just fine when running the project:
```
kapunga ~/whats-up-resources (master)$ sbt core/run
[info] welcome to sbt 1.6.1 (AdoptOpenJDK Java 1.8.0_282)
[info] loading settings for project global-plugins from idea.sbt ...
[info] loading global plugins from /Users/kapunga/.sbt/1.0/plugins
[info] loading project definition from /Users/kapunga/Personal Projects/whats-up-resources/project
[info] loading settings for project whats-up-resources from build.sbt ...
[info] set current project to whats-up-resources (in build file:/Users/kapunga/Personal%20Projects/whats-up-resources/)
[info] compiling 1 Scala source to /Users/kapunga/Personal Projects/whats-up-resources/core/target/scala-3.1.0/classes ...
[info] running wur.run
Hello,
World!
[success] Total time: 4 s, completed Jan 17, 2022 12:12:32 AM
kapunga ~/whats-up-resources (master)$
```

However, when I try and load the resources from the repl, they are not found:

```
kapunga ~/whats-up-resources (master)$ scala3-repl -classpath core/target/scala-3.1.0/core_3-0.1.0-SNAPSHOT.jar
Welcome to Scala 3.1.0 (11.0.10, Java OpenJDK 64-Bit Server VM).
Type in expressions for evaluation. Or try :help.

scala> import wur._

scala> Hello.world
java.io.FileNotFoundException: resource 'hello.txt' was not found in the classpath from the given classloader.
  at scala.io.Source$.fromResource(Source.scala:183)
  at wur.Hello$.world(Main.scala:5)
  ... 34 elided

scala>
```

The resource file is definitely there:
```
kapunga ~/whats-up-resources (master)$ jar tf core/target/scala-3.1.0/core_3-0.1.0-SNAPSHOT.jar
META-INF/MANIFEST.MF
wur/
hello.txt
wur/Hello$.class
wur/Hello.class
wur/Hello.tasty
wur/Main$package$.class
wur/Main$package.class
wur/Main$package.tasty
wur/run.class
wur/run.tasty
kapunga ~/whats-up-resources (master)$
``` 

I've confirmed that this is not an issue with SBT or in Scala 2.13.8

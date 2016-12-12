# java-sbt

**Goal**: run/compile java programs using sbt, and test them using ScalaTest.

This repository is an example of:

- Using sbt with java
- Using ScalaTest with java
- Calling scala code from java
- The minimum workable directory structure expected by sbt:
  - java sources in `src/main/java`
  - scala sources in `src/main/scala`
  - ScalaTest in `src/test/scala`
  - `build.sbt` in project root directory
  - `pom.xml` in project root directory (for VSCode java plugin support, not really needed)

To test:

```
sbt test
```

To run:

```
sbt run
```

To create `pom.xml` file from `build.sbt`:

```
sbt make-pom
```

To get help:

> http://www.scala-sbt.org/documentation.html

Maybe important links:

- [sbt](http://www.scala-sbt.org/index.html)
- [ScalaTest](http://www.scalatest.org/)

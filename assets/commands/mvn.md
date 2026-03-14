# TAGLINE

Apache Maven build automation and dependency management tool

# TLDR

**Build project**

```mvn package```

**Clean and build, install to local repository**

```mvn clean install```

**Run tests**

```mvn test```

**Skip tests during build**

```mvn install -DskipTests```

**Generate a new project from archetype**

```mvn archetype:generate```

**Deploy artifact to remote repository**

```mvn deploy```

**Show dependency tree**

```mvn dependency:tree```

**Check for dependency updates**

```mvn versions:display-dependency-updates```

**Run with a specific profile**

```mvn clean install -P [profile-name]```

**Build offline without downloading dependencies**

```mvn package -o```

# SYNOPSIS

**mvn** [_options_] [_phase(s)_] [_goal(s)_]

# PARAMETERS

_PHASES_
> Build lifecycle phases to execute.

**clean**
> Remove target directory with compiled output.

**validate**
> Validate project is correct and all information is available.

**compile**
> Compile project sources.

**test**
> Run unit tests.

**package**
> Package compiled code (JAR, WAR, etc.).

**verify**
> Run integration tests and checks.

**install**
> Install package to local repository (~/.m2/repository).

**deploy**
> Deploy package to remote repository.

**-D** _PROPERTY=VALUE_
> Set a system property (e.g., -DskipTests, -Dmaven.test.skip=true).

**-P** _PROFILE_
> Activate a build profile defined in pom.xml.

**-pl** _MODULES_, **--projects** _MODULES_
> Build specific modules in a multi-module project.

**-am**, **--also-make**
> Build required dependent modules when using -pl.

**-f** _FILE_, **--file** _FILE_
> Use an alternative POM file.

**-o**, **--offline**
> Work offline without downloading dependencies.

**-U**, **--update-snapshots**
> Force update of snapshot dependencies.

**-T** _THREADS_
> Thread count for parallel builds (e.g., -T 4, -T 1C for 1 per CPU core).

**-X**, **--debug**
> Produce debug output.

**-q**, **--quiet**
> Quiet output, only show errors.

**-e**, **--errors**
> Produce execution error messages.

**-s** _FILE_, **--settings** _FILE_
> Use alternate user settings file.

**--help**
> Display help information.

# DESCRIPTION

**mvn** is the command-line interface for Apache Maven, a build automation and dependency management tool primarily used for Java projects. It uses a Project Object Model (pom.xml) to describe the project, its dependencies, plugins, and build lifecycle.

Maven follows a convention-over-configuration approach with a standard project structure (src/main/java, src/test/java, etc.). The build lifecycle consists of ordered phases: validate, compile, test, package, verify, install, deploy. Specifying a phase executes all preceding phases.

Dependencies are resolved from remote repositories (Maven Central by default) and cached in the local repository at ~/.m2/repository. Maven supports multi-module projects, build profiles for environment-specific configurations, and an extensive plugin ecosystem.

# CAVEATS

Requires a JDK installation and a pom.xml file. First builds download many dependencies and may take longer. The **-DskipTests** flag skips test execution but still compiles tests; use **-Dmaven.test.skip=true** to skip compilation of tests entirely. The local repository (~/.m2/repository) can grow large over time.

# HISTORY

Maven was created by **Jason van Zyl** at the Apache Software Foundation. Maven 1.0 was released in **2004**, and Maven 2.0 followed in **2005** with a complete rewrite. Maven 3.0 was released in **2010** with improved performance and backward compatibility. It remains one of the most widely used Java build tools alongside Gradle.

# SEE ALSO

[gradle](/man/gradle)(1), [ant](/man/ant)(1), [java](/man/java)(1), [javac](/man/javac)(1)


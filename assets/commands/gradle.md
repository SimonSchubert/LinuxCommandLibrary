# TAGLINE

JVM build automation tool

# TLDR

**Build project**

```gradle build```

**Run tests**

```gradle test```

**Clean project**

```gradle clean```

**List tasks**

```gradle tasks```

**Run with daemon**

```gradle --daemon build```

# SYNOPSIS

**gradle** [_options_] [_tasks_]

# PARAMETERS

_TASKS_
> Tasks to execute.

**--daemon**
> Use Gradle daemon.

**--no-daemon**
> Don't use daemon.

**-q**, **--quiet**
> Quiet output.

**-i**, **--info**
> Info logging.

**--parallel**
> Parallel execution.

**--help**
> Display help information.

# DESCRIPTION

**gradle** is a build automation tool for Java, Kotlin, Android, and other JVM projects. It uses Groovy or Kotlin DSL for build scripts and provides dependency management, incremental builds, and an extensive plugin ecosystem.

Gradle is the standard build system for Android development and supports multi-project builds with a persistent daemon for faster execution.

# CONFIGURATION

**build.gradle** / **build.gradle.kts**
> Project build script defining tasks, dependencies, and plugins.

**gradle.properties**
> Project and user-level properties for build configuration.

**settings.gradle** / **settings.gradle.kts**
> Multi-project build settings and included modules.

**~/.gradle/gradle.properties**
> User-level Gradle properties applied to all builds.

# CAVEATS

JVM required. First run downloads dependencies. Daemon improves performance.

# HISTORY

Gradle was created by **Hans Dockter**, first released in **2007**, becoming the official Android build system in **2013**.

# SEE ALSO

[gradle-wrapper](/man/gradle-wrapper)(1), [maven](/man/maven)(1)

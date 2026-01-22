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

**gradle** is a build automation tool for Java, Kotlin, Android, and other JVM projects. It uses Groovy or Kotlin DSL for build scripts.

The tool provides dependency management, incremental builds, and extensive plugin ecosystem. It's the standard build system for Android.

gradle provides flexible JVM project building.

# CAVEATS

JVM required. First run downloads dependencies. Daemon improves performance.

# HISTORY

Gradle was created by **Hans Dockter**, first released in **2007**, becoming the official Android build system in **2013**.

# SEE ALSO

[gradle-wrapper](/man/gradle-wrapper)(1), [maven](/man/maven)(1)

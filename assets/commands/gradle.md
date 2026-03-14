# TAGLINE

JVM build automation tool

# TLDR

**Build project**

```gradle build```

**Run tests**

```gradle test```

**Clean and rebuild**

```gradle clean build```

**List available tasks**

```gradle tasks```

**Build with parallel execution**

```gradle build --parallel```

**Run with a build scan** for detailed reporting

```gradle build --scan```

**Use the configuration cache** for faster repeat builds

```gradle build --configuration-cache```

**Use a specific build file**

```gradle -b [path/to/build.gradle] build```

# SYNOPSIS

**gradle** [_options_] [_tasks_...]

# PARAMETERS

_TASKS_
> Tasks to execute.

**--daemon**
> Use Gradle daemon (enabled by default).

**--no-daemon**
> Do not use the Gradle daemon.

**-q**, **--quiet**
> Log errors only.

**-i**, **--info**
> Set log level to info.

**-d**, **--debug**
> Set log level to debug.

**--parallel**
> Build projects in parallel.

**--configuration-cache**
> Enable the configuration cache for faster repeat builds.

**--scan**
> Create a build scan at scans.gradle.com.

**-b**, **--build-file** _file_
> Specify the build file.

**-c**, **--settings-file** _file_
> Specify the settings file.

**--refresh-dependencies**
> Refresh the state of dependencies.

**-x**, **--exclude-task** _task_
> Exclude a task from execution.

**--continuous**
> Continuous build; re-execute on file changes.

**--help**
> Display help information.

# DESCRIPTION

**gradle** is a build automation tool for Java, Kotlin, Android, and other JVM projects. It uses Groovy or Kotlin DSL for build scripts and provides dependency management, incremental builds, and an extensive plugin ecosystem.

Gradle is the standard build system for Android development and supports multi-project builds. The Gradle daemon runs persistently in the background to improve build performance and is enabled by default. In most projects, the **Gradle Wrapper** (`./gradlew`) is preferred over invoking `gradle` directly to ensure consistent build tool versions.

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

JVM required. First run downloads dependencies and the Gradle distribution. The daemon is enabled by default; use **--no-daemon** to disable. Prefer the Gradle Wrapper (**./gradlew**) to ensure reproducible builds.

# HISTORY

Gradle was created by **Hans Dockter**, first released in **2007**, becoming the official Android build system in **2013**. Kotlin DSL support was added in Gradle 5.0 (2018). The configuration cache for faster builds was stabilized in Gradle 8.1 (2023).

# SEE ALSO

[gradle-wrapper](/man/gradle-wrapper)(1), [mvn](/man/mvn)(1), [ant](/man/ant)(1)

# TAGLINE

Gradle full build lifecycle task

# TLDR

**Build project**

```gradle build```

**Build without tests**

```gradle build -x test```

**Build specific module**

```gradle :module:build```

**Build with info logging**

```gradle build --info```

**Build with parallel execution**

```gradle build --parallel```

**Dry run** to see which tasks would execute

```gradle build --dry-run```

# SYNOPSIS

**gradle build** [_options_]

# PARAMETERS

**-x** _TASK_, **--exclude-task** _TASK_
> Exclude a task from execution.

**--info**
> Set log level to info.

**--debug**
> Set log level to debug.

**--stacktrace**
> Print full stacktrace for exceptions.

**--parallel**
> Build projects in parallel.

**--offline**
> Execute the build without accessing network resources.

**--build-cache**
> Enable the Gradle build cache.

**--no-daemon**
> Run the build without the Gradle daemon.

**--continue**
> Continue task execution after a task failure.

**--dry-run**
> Show which tasks would be executed without running them.

**-P** _PROP_, **--project-prop** _PROP_
> Set a project property.

**--help**
> Display help information.

# DESCRIPTION

**gradle build** compiles source code, runs tests, and produces output artifacts. It is the main build lifecycle task combining compile, test, and assemble phases.

The command executes the complete build process including dependency resolution, compilation, testing, and packaging. It can be customized per project through build scripts. The build task is provided by the Java plugin and follows Gradle's three-phase lifecycle: initialization, configuration, and execution.

# CAVEATS

Runs tests by default. Use **-x test** to skip. The first build may download dependencies which can take significant time. Requires a **build.gradle** or **build.gradle.kts** file in the project directory.

# HISTORY

The build task is a standard **Gradle** lifecycle task inherited from Java plugin conventions.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-clean](/man/gradle-clean)(1)

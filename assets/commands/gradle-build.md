# TLDR

**Build project**

```gradle build```

**Build without tests**

```gradle build -x test```

**Build specific module**

```gradle :module:build```

**Build with info**

```gradle build --info```

**Build release**

```gradle assembleRelease```

# SYNOPSIS

**gradle build** [_options_]

# PARAMETERS

**-x** _TASK_
> Exclude task.

**--info**
> Info logging level.

**--parallel**
> Parallel execution.

**--offline**
> Offline mode.

**--help**
> Display help information.

# DESCRIPTION

**gradle build** compiles source code, runs tests, and produces output artifacts. It's the main build lifecycle task combining compile, test, and assemble.

The command executes the complete build process including dependency resolution, compilation, testing, and packaging. It can be customized per project.

gradle build executes the full build lifecycle.

# CAVEATS

Runs tests by default. Use -x test to skip. First build may download dependencies.

# HISTORY

The build task is a standard **Gradle** lifecycle task inherited from Java plugin conventions.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-clean](/man/gradle-clean)(1)

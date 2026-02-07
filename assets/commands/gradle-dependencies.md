# TAGLINE

Gradle dependency tree viewer

# TLDR

**List dependencies**

```gradle dependencies```

**Show specific configuration**

```gradle dependencies --configuration [compileClasspath]```

**Module dependencies**

```gradle :module:dependencies```

**Output to file**

```gradle dependencies > deps.txt```

# SYNOPSIS

**gradle dependencies** [_options_]

# PARAMETERS

**--configuration** _NAME_
> Specific configuration to show.

**--help**
> Display help information.

# DESCRIPTION

**gradle dependencies** displays the dependency tree for a project. It shows all direct and transitive dependencies with their versions and conflict resolution.

The output shows dependency hierarchies for different configurations (compile, runtime, test), helping to understand dependency chains and version conflicts.

# CAVEATS

Large trees can be overwhelming. Use --configuration to filter. Check for version conflicts.

# HISTORY

The dependencies task is a standard **Gradle** diagnostic task for understanding project dependencies.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-dependencyinsight](/man/gradle-dependencyinsight)(1)

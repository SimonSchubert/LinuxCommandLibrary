# TLDR

**Trace dependency**

```gradle dependencyInsight --dependency [library-name]```

**Specific configuration**

```gradle dependencyInsight --configuration [compileClasspath] --dependency [guava]```

# SYNOPSIS

**gradle dependencyInsight** [_options_]

# PARAMETERS

**--dependency** _NAME_
> Dependency to trace.

**--configuration** _NAME_
> Configuration to inspect.

**--help**
> Display help information.

# DESCRIPTION

**gradle dependencyInsight** traces why a dependency appears in the build. It shows the path from direct dependencies to the transitive inclusion.

The task helps debug version conflicts and understand why specific versions are selected. It's essential for resolving dependency issues.

gradle dependencyInsight explains dependency inclusion.

# CAVEATS

Requires --dependency flag. Use with --configuration for accuracy. Helps resolve conflicts.

# HISTORY

The dependencyInsight task is a standard **Gradle** diagnostic for understanding dependency resolution.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-dependencies](/man/gradle-dependencies)(1)

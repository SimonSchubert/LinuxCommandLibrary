# TAGLINE

Gradle dependency tracing tool

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

**gradle dependencyInsight** traces why a specific dependency appears in the build. It shows the path from direct dependencies to the transitive inclusion, revealing how version conflicts are resolved.

The task is essential for debugging dependency issues and understanding why specific versions are selected during resolution.

# CAVEATS

Requires --dependency flag. Use with --configuration for accuracy. Helps resolve conflicts.

# HISTORY

The dependencyInsight task is a standard **Gradle** diagnostic for understanding dependency resolution.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-dependencies](/man/gradle-dependencies)(1)

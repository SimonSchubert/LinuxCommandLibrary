# TAGLINE

Gradle dependency tracing tool

# TLDR

**Trace a dependency** to see why it is included

```gradle dependencyInsight --dependency [library-name]```

**Trace a dependency** in a specific configuration

```gradle dependencyInsight --configuration [compileClasspath] --dependency [guava]```

**Show only a single path** to each dependency (useful for large graphs)

```gradle dependencyInsight --dependency [library-name] --singlepath```

**Trace a dependency** in a specific subproject

```gradle :[subproject]:dependencyInsight --dependency [library-name]```

# SYNOPSIS

**gradle dependencyInsight** [_options_]

# PARAMETERS

**--dependency** _NAME_
> Required. The dependency to trace. Matches partially against group, name, or version.

**--configuration** _NAME_
> Configuration to inspect (e.g., compileClasspath, runtimeClasspath). Defaults to compileClasspath for Java projects.

**--singlepath**
> Show only one path to each dependency instead of all paths. Useful for large dependency graphs.

# DESCRIPTION

**gradle dependencyInsight** traces why a specific dependency appears in the build. It shows the path from direct dependencies to the transitive inclusion, revealing how version conflicts are resolved.

The **--dependency** value is matched partially against the group, name, or version of dependencies, so a query like `guava` will match `com.google.guava:guava:31.1-jre`.

The task is essential for debugging dependency issues and understanding why specific versions are selected during resolution.

# CAVEATS

The **--dependency** flag is required. Without **--configuration**, the task defaults to compileClasspath in Java projects. The dependency value uses partial matching, which may return unexpected results for common names.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-dependencies](/man/gradle-dependencies)(1)

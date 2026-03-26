# TAGLINE

Display available Gradle project tasks

# TLDR

**List main tasks**

```gradle tasks```

**List all tasks including internal ones**

```gradle tasks --all```

**List with Gradle wrapper**

```./gradlew tasks```

**List tasks for a subproject**

```gradle :app:tasks```

**List tasks in a specific group**

```gradle tasks --group [build]```

**Get help on a specific task**

```gradle help --task [taskName]```

# SYNOPSIS

**gradle** **tasks** [**--all**] [**--group** _name_]

# PARAMETERS

**--all**
> Show all tasks including internal and lifecycle tasks without a group.

**--group** _name_
> Show only tasks belonging to the specified group.

**--no-report**
> Hide the task rule report at the bottom of the output.

# DESCRIPTION

**gradle tasks** displays available tasks for the selected project. By default, it shows only tasks assigned to a task group that have descriptions. Use **--all** to include ungrouped, internal, and lifecycle tasks. Use **--group** to filter by a specific task group. Use **gradle help --task** to get detailed information about a specific task including its type, path, and options.

Tasks are organized into groups such as build, verification, documentation, and help. Custom task groups defined in build scripts also appear in the output.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-projects](/man/gradle-projects)(1), [ant](/man/ant)(1), [mvn](/man/mvn)(1)

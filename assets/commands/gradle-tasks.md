# TAGLINE

Gradle available tasks lister

# TLDR

**List main tasks**

```gradle tasks```

**List all tasks including hidden**

```gradle tasks --all```

**List with wrapper**

```./gradlew tasks```

**List tasks for subproject**

```gradle :app:tasks```

**Get help on specific task**

```gradle help --task [taskName]```

# SYNOPSIS

**gradle** **tasks** [**--all**]

# PARAMETERS

**--all**
> Show all tasks including internal ones.

**--group** _name_
> Show tasks in specific group.

# DESCRIPTION

**gradle tasks** displays available tasks for the selected project. By default, it shows only tasks assigned to a task group with descriptions. Use **--all** to include internal and lifecycle tasks. Use **gradle help --task** to get detailed information about a specific task including its type and options.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-projects](/man/gradle-projects)(1)

# TAGLINE

CLI tool for managing multiple repositories

# TLDR

**Initialize a mani configuration**

```mani init```

**Sync (clone) all repositories**

```mani sync```

**Run a command across all projects**

```mani exec "[command]"```

**Run a command only on projects with a specific tag**

```mani exec --tags [frontend] "[command]"```

**Run a predefined task**

```mani run [task_name]```

**List all projects**

```mani list projects```

**List all available tasks**

```mani list tasks```

# SYNOPSIS

**mani** _command_ [_options_]

# PARAMETERS

**init**
> Initialize a new mani configuration in the current directory.

**sync**
> Clone and update all repositories defined in the configuration.

**exec** _command_
> Execute a shell command across projects.

**run** _task_
> Run a predefined task from the configuration.

**list** _resource_
> List projects, tags, or tasks.

**--tags** _tags_
> Filter projects by tags (comma-separated).

**--projects** _projects_
> Filter by project names (comma-separated).

**--all-projects**
> Target all projects including the root.

**--parallel**
> Run commands in parallel across projects.

**--output** _format_
> Output format: stream, table, markdown, or html.

# DESCRIPTION

**mani** is a CLI tool for managing multiple repositories from a central workspace. You define repositories and commands in a **mani.yaml** configuration file and then run commands across all or a subset of projects.

Features include flexible project selection by name, tags, or paths, multiple output formats (stream, table, markdown, HTML), parallel execution across projects, and predefined tasks with custom commands.

# CONFIGURATION

**mani.yaml**
> Central configuration file defining repositories, tags, and tasks.

# CAVEATS

All repositories must be accessible from the machine running mani. Clone operations require network access.

# HISTORY

**mani** was created by **alajmo** and is written in **Go**.

# SEE ALSO

[git](/man/git)(1), [mr](/man/mr)(1)

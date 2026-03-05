# TAGLINE

CLI tool for managing multiple repositories

# TLDR

**Initialize a mani configuration**

```mani init```

**Sync (clone) all repositories**

```mani sync```

**Run a command across all projects**

```mani exec "[command]"```

**Run a predefined task**

```mani run [task_name]```

**List all projects**

```mani list projects```

# SYNOPSIS

**mani** _command_ [_options_]

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

[git](/man/git)(1), [repo](/man/repo)(1)

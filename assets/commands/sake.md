# TAGLINE

Task runner for local and remote hosts via SSH

# TLDR

**Initialize a new sake configuration**

```sake init```

**Run a task on all servers**

```sake run [ping] --all```

**Execute a command on all servers with table output**

```sake exec --all --output table '[uptime]'```

**SSH into a defined server**

```sake ssh [server]```

# SYNOPSIS

**sake** _command_ [_options_]

# PARAMETERS

**init**
> Create a new sake.yaml configuration file.

**run** _TASK_
> Run a defined task on target servers.

**exec** _COMMAND_
> Execute an ad-hoc shell command on target servers.

**ssh** _SERVER_
> SSH into a configured server.

**list servers**
> List all configured servers.

**list tasks**
> List all defined tasks.

**--all**
> Target all servers.

**--output** _FORMAT_
> Output format: table, text, or json.

# DESCRIPTION

**sake** lets you define servers and tasks in a sake.yaml configuration file and then run those tasks on local or remote hosts via SSH. It supports auto-completion of tasks, servers, and tags, table-formatted output, parallel execution, and can SSH into Docker containers.

# HISTORY

**sake** was created by **Samir Alajmovic** (alajmo) and is written in **Go**.

# SEE ALSO

[ansible](/man/ansible)(1), [ssh](/man/ssh)(1), [fabric](/man/fabric)(1)

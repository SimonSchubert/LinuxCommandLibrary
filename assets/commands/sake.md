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

**list servers**, **list tasks**, **list tags**
> List configured servers, tasks, or tags.

**describe** _servers_|_tasks_
> Show detailed information about configured servers or tasks.

**edit task** _TASK_, **edit server** _SERVER_
> Open the corresponding sake.yaml entry in **$EDITOR**.

**completion** _bash_|_zsh_|_fish_
> Print a shell completion script.

**--all**
> Target all servers.

**--tags** _TAG_
> Target servers matching one or more tags.

**--limit** _N_
> Limit execution to the first _N_ matching servers.

**--config** _FILE_
> Use the specified configuration file instead of auto-discovering sake.yaml.

**--output** _FORMAT_
> Output format: **table**, **text**, **json**, **html**, or **markdown**.

**--strategy** _free_|_row_|_column_
> Execution strategy across multiple servers.

**--parallel**
> Run tasks on target servers concurrently rather than serially.

# DESCRIPTION

**sake** lets you define servers and tasks in a sake.yaml configuration file and then run those tasks on local or remote hosts via SSH. It supports auto-completion of tasks, servers, and tags, table-formatted output, parallel execution, and can SSH into Docker containers.

# HISTORY

**sake** was created by **Samir Alajmovic** (alajmo) and is written in **Go**.

# SEE ALSO

[ansible](/man/ansible)(1), [ssh](/man/ssh)(1), [fabric](/man/fabric)(1)

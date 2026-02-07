# TAGLINE

list containers on the system

# TLDR

**List running containers**

```docker container ls```

**List all containers**

```docker container ls -a```

**List with specific format**

```docker container ls --format "{{.Names}}: {{.Status}}"```

**Filter by status**

```docker container ls -f status=[running|exited|paused]```

**Show only IDs**

```docker container ls -q```

# SYNOPSIS

**docker** **container** **ls** [_options_]

# PARAMETERS

**-a**, **--all**
> Show all containers (default shows running).

**-q**, **--quiet**
> Only display container IDs.

**-f**, **--filter** _filter_
> Filter output based on conditions.

**--format** _string_
> Format output using Go template.

**-n**, **--last** _n_
> Show n last created containers.

**-s**, **--size**
> Display total file sizes.

# DESCRIPTION

**docker container ls** lists containers on the Docker host, providing information about container IDs, images, commands, creation time, status, ports, and names. By default, only running containers are displayed, but the **-a** flag reveals all containers regardless of state.

This command is equivalent to the legacy **docker ps** command and serves as the primary interface for viewing container inventory. Filtering and formatting options make it suitable for scripting and automation workflows.

# SEE ALSO

[docker-ps](/man/docker-ps)(1), [docker-container](/man/docker-container)(1)

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

**docker container ls** lists containers. By default shows only running containers; use **-a** to show all. This is equivalent to **docker ps**.

# SEE ALSO

[docker-ps](/man/docker-ps)(1), [docker-container](/man/docker-container)(1)

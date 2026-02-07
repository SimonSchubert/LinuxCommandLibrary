# TAGLINE

list Docker containers and their status

# TLDR

**List running containers**

```docker ps```

**List all containers** (including stopped)

```docker ps -a```

**List with custom format**

```docker ps --format "{{.ID}}: {{.Names}}"```

**List only container IDs**

```docker ps -q```

**List containers by name filter**

```docker ps -f name=[pattern]```

**List containers by status**

```docker ps -f status=[running|exited|paused]```

**Show container sizes**

```docker ps -s```

**List last created container**

```docker ps -l```

# SYNOPSIS

**docker ps** [_options_]

# PARAMETERS

**-a**, **--all**
> Show all containers (default shows running only).

**-q**, **--quiet**
> Only display container IDs.

**-l**, **--latest**
> Show latest created container.

**-n** _num_
> Show n last created containers.

**-s**, **--size**
> Display total file sizes.

**-f**, **--filter** _filter_
> Filter output based on conditions.

**--format** _string_
> Format output using Go template.

**--no-trunc**
> Don't truncate output.

# FILTERS

**id**: Container ID
**name**: Container name
**label**: Label key or key=value
**status**: created, restarting, running, paused, exited, dead
**ancestor**: Image name or ID
**network**: Network name or ID
**publish** / **expose**: Port number
**health**: healthy, unhealthy, starting, none

# FORMAT PLACEHOLDERS

**{{.ID}}**: Container ID
**{{.Names}}**: Container names
**{{.Image}}**: Image name
**{{.Status}}**: Container status
**{{.Ports}}**: Published ports
**{{.State}}**: Container state
**{{.CreatedAt}}**: Creation time
**{{.RunningFor}}**: Time since start

# DESCRIPTION

**docker ps** lists Docker containers. By default, it shows only running containers with their ID, image, command, creation time, status, ports, and names.

The command provides filtering capabilities to find specific containers by various criteria. Custom formatting allows displaying exactly the information needed, useful for scripting and automation.

Container IDs are shown truncated by default; use **--no-trunc** for full IDs. The **-q** option outputs only IDs, convenient for passing to other commands.

# CAVEATS

Stopped containers are hidden by default; use **-a** to see them. Size calculation (**-s**) can be slow on systems with many containers. Format strings use Go template syntax. Some filters may behave unexpectedly with wildcards.

# HISTORY

docker ps has been part of Docker since its initial release in **2013**, modeled after the Unix **ps** command for processes. The filtering and formatting options were added over time to support container management at scale. The command remains the primary way to inspect running containers.

# SEE ALSO

[docker](/man/docker)(1), [docker-inspect](/man/docker-inspect)(1), [docker-logs](/man/docker-logs)(1), [docker-stats](/man/docker-stats)(1)


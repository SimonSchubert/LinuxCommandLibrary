# TAGLINE

List containers and their status

# TLDR

**List running containers**

```podman ps```

**List all containers**

```podman ps -a```

**Show only IDs**

```podman ps -q```

**Custom format output**

```podman ps --format "{{.Names}} {{.Status}}"```

**Show latest container**

```podman ps -l```

# SYNOPSIS

**podman ps** [_options_]

# PARAMETERS

**-a**, **--all**
> Show all containers.

**-q**, **--quiet**
> Only show IDs.

**-l**, **--latest**
> Show latest container.

**--format** _FORMAT_
> Output format template.

**-n** _N_
> Show last N containers.

**--no-trunc**
> Don't truncate output.

# DESCRIPTION

**podman ps** lists containers managed by Podman, showing container ID, image, command, creation time, status, ports, and names. By default, only running containers are shown; use **-a** to include stopped containers.

The **--format** option accepts Go templates for custom output formatting. Use **-q** for just container IDs (useful for scripting), **-l** for the most recently created container, and **-n** to limit to the last N containers. Docker ps compatible.

# CAVEATS

Only shows podman containers. Docker-compatible output.

# HISTORY

podman ps provides **container listing** functionality.

# SEE ALSO

[podman](/man/podman)(1), [podman-run](/man/podman-run)(1), [docker-ps](/man/docker-ps)(1)


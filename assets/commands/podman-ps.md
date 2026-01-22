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

**podman ps** lists containers. Shows container status.

The tool displays running processes. Docker ps compatible.

podman ps shows containers.

# CAVEATS

Only shows podman containers. Docker-compatible output.

# HISTORY

podman ps provides **container listing** functionality.

# SEE ALSO

[podman](/man/podman)(1), [podman-run](/man/podman-run)(1), [docker-ps](/man/docker-ps)(1)


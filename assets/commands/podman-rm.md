# TAGLINE

Remove one or more containers

# TLDR

**Remove container**

```podman rm [container]```

**Force remove running container**

```podman rm -f [container]```

**Remove multiple containers**

```podman rm [container1] [container2]```

**Remove all containers**

```podman rm -a```

**Remove container and its anonymous volumes**

```podman rm -v [container]```

**Remove containers matching a filter**

```podman rm --filter status=exited```

# SYNOPSIS

**podman rm** [_options_] _container_...

# PARAMETERS

**-a**, **--all**
> Remove all containers.

**--cidfile** _file_
> Read container ID from file and remove it. Can be specified multiple times.

**--depend**
> Remove selected container and recursively remove all containers that depend on it.

**--filter** _filter_
> Filter containers to remove (e.g., status, label, network, ancestor, name).

**-f**, **--force**
> Force removal of running and paused containers.

**-i**, **--ignore**
> Ignore errors when specified containers are not in the container store.

**-l**, **--latest**
> Use the last created container instead of specifying name or ID.

**-t**, **--time** _seconds_
> Seconds to wait before forcibly stopping the container. Use -1 for infinite wait.

**-v**, **--volumes**
> Remove anonymous volumes associated with the container.

# DESCRIPTION

**podman rm** removes one or more containers. By default, only stopped containers can be removed. Use --force to remove running containers.

# EXAMPLES

```bash
# Remove stopped container
podman rm mycontainer

# Force remove running container
podman rm -f webserver

# Remove all containers
podman rm -a

# Remove all containers including running ones
podman rm -af

# Remove with anonymous volumes
podman rm -v database

# Remove containers filtered by status
podman rm --filter status=exited

# Remove latest container
podman rm -l
```

# CAVEATS

Cannot remove running containers without --force. Anonymous volumes not removed unless -v specified. Named volumes are never removed by this command.

# HISTORY

podman rm is part of **Podman**, the daemonless container engine by **Red Hat** providing Docker-compatible container management.

# SEE ALSO

[podman](/man/podman)(1), [podman-rmi](/man/podman-rmi)(1), [podman-ps](/man/podman-ps)(1), [docker-rm](/man/docker-rm)(1)

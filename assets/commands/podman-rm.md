# TAGLINE

Remove one or more containers

# TLDR

**Remove container**

```podman rm [container]```

**Force remove running container**

```podman rm -f [container]```

**Remove multiple containers**

```podman rm [container1] [container2]```

**Remove all stopped containers**

```podman rm $(podman ps -aq)```

**Remove container and volumes**

```podman rm -v [container]```

# SYNOPSIS

**podman rm** [_options_] _container_...

# PARAMETERS

**-f**, **--force**
> Force removal of running container.

**-v**, **--volumes**
> Remove associated volumes.

**-a**, **--all**
> Remove all containers.

**-l**, **--latest**
> Remove most recent container.

**--depend**
> Remove dependencies too.

# DESCRIPTION

**podman rm** removes one or more containers. By default, only stopped containers can be removed. Use --force to remove running containers.

# EXAMPLES

```bash
# Remove stopped container
podman rm mycontainer

# Force remove running container
podman rm -f webserver

# Remove by ID
podman rm abc123def456

# Remove all containers
podman rm -a

# Remove with volumes
podman rm -v database

# Remove latest container
podman rm -l

# Prune stopped containers
podman container prune
```

# CAVEATS

Cannot remove running containers without --force. Volumes not removed unless -v specified.

# HISTORY

podman rm is part of **Podman**, the daemonless container engine by **Red Hat** providing Docker-compatible container management.

# SEE ALSO

[podman-rmi](/man/podman-rmi)(1), [podman-stop](/man/podman-stop)(1), [podman-ps](/man/podman-ps)(1), [podman-container-prune](/man/podman-container-prune)(1)

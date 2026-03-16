# TAGLINE

Remove Distrobox containers

# TLDR

**Remove** a container

```distrobox-rm [container_name]```

**Force** remove a running container

```distrobox-rm -f [container_name]```

Remove **all** Distrobox containers

```distrobox-rm --all```

Remove a container and **its separate home directory**

```distrobox-rm --rm-home [container_name]```

Remove a **rootful** container

```distrobox-rm --root [container_name]```

Remove with **verbose** output

```distrobox-rm -v [container_name]```

# SYNOPSIS

**distrobox-rm** [_options_] _container_name_

# DESCRIPTION

**distrobox-rm** removes a Distrobox container. It is recommended to stop the container before removing it. Distrobox containers are OCI containers that integrate with the host system.

# PARAMETERS

**-f**, **--force**
> Force removal of the container even if running.

**-a**, **--all**
> Remove all Distrobox containers.

**--rm-home**
> Remove the mounted home directory if it differs from the host user's home.

**--root**, **-r**
> Launch podman/docker/lilipod with root privileges. Preferred over using sudo directly.

**-v**, **--verbose**
> Show additional output.

**-Y**, **--yes**
> Assume yes to all prompts.

**-h**, **--help**
> Show help message.

# CAVEATS

Removing a container deletes all data inside it that was not mapped to the host. Stop the container first with distrobox-stop for a clean removal. Use **--rm-home** carefully as it permanently deletes the container's separate home directory.

# HISTORY

**distrobox-rm** is part of **Distrobox**, a tool to create and manage containers that are tightly integrated with the host system.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-create](/man/distrobox-create)(1), [distrobox-stop](/man/distrobox-stop)(1), [distrobox-list](/man/distrobox-list)(1), [distrobox-enter](/man/distrobox-enter)(1)

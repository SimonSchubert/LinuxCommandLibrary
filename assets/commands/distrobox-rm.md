# TAGLINE

remove Distrobox containers

# TLDR

**Remove** a container

```distrobox-rm container_name```

**Force** remove a container

```distrobox-rm -f container_name```

Remove **all** containers

```distrobox-rm --all```

Remove with **verbose** output

```distrobox-rm -v container_name```

# SYNOPSIS

**distrobox-rm** [_options_] _container_name_

# DESCRIPTION

**distrobox-rm** removes a Distrobox container. It is recommended to stop the container before removing it. Distrobox containers are OCI containers that integrate with the host system.

# PARAMETERS

**-f, --force**
> Force removal of the container even if running

**-a, --all**
> Remove all Distrobox containers

**-v, --verbose**
> Show additional output

**-Y, --yes**
> Assume yes to all prompts

**-h, --help**
> Show help message

# CAVEATS

Removing a container deletes all data inside it that was not mapped to the host. Stop the container first with distrobox-stop for a clean removal.

# HISTORY

**distrobox-rm** is part of **Distrobox**, a tool to create and manage containers that are tightly integrated with the host system.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-create](/man/distrobox-create)(1), [distrobox-stop](/man/distrobox-stop)(1)

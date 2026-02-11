# TAGLINE

Remove Toolbx containers

# TLDR

**Remove** a container

```toolbox rm [container_name]```

Remove **all** containers

```toolbox rm -a```

**Force** remove active container

```toolbox rm -f [container_name]```

# SYNOPSIS

**toolbox rm** [_OPTIONS_] [_CONTAINER_...]

# PARAMETERS

**-a, --all**
> Remove all Toolbx containers

**-f, --force**
> Force removal of running containers

# DESCRIPTION

**toolbox rm** removes one or more Toolbx containers. Containers must be stopped before removal unless the force flag is used.

Multiple containers can be removed by specifying their names as arguments. The --all flag removes all Toolbx containers at once.

# CAVEATS

Running containers cannot be removed without --force. Data stored only inside the container will be lost. The home directory (mounted from host) is preserved.

# SEE ALSO

[toolbox](/man/toolbox)(1), [toolbox-rmi](/man/toolbox-rmi)(1), [toolbox-list](/man/toolbox-list)(1)

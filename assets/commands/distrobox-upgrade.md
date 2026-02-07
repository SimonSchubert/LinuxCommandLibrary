# TAGLINE

upgrade Distrobox containers using native package managers

# TLDR

**Upgrade** a container

```distrobox-upgrade [container_name]```

Upgrade **all** containers

```distrobox-upgrade -a```

Upgrade **specific** containers

```distrobox-upgrade [container1] [container2]```

# SYNOPSIS

**distrobox-upgrade** [_options_] [_containers_...]

# DESCRIPTION

**distrobox-upgrade** upgrades one or more Distrobox containers using each container's native package manager. It runs the appropriate update commands (apt, dnf, pacman, etc.) based on the container's distribution.

# PARAMETERS

**-a, --all**
> Upgrade all containers

_containers_
> Space-separated list of container names

# CAVEATS

Each container is upgraded using its own package manager. Large upgrades may take significant time and disk space.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-enter](/man/distrobox-enter)(1)

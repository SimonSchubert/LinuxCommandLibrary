# TAGLINE

Initialize Toolbx container internals

# TLDR

**Initialize** a running container (normally done by the container entry point)

```toolbox init-container --gid [gid] --home [home] --shell [shell] --uid [uid] --user [user]```

# SYNOPSIS

**toolbox init-container** [_OPTIONS_]

# PARAMETERS

**--gid** _GID_
> The user's numerical group ID from the host

**--home** _PATH_
> Create the user with this login directory (required)

**--home-link**
> Make /home a symbolic link to /var/home

**--media-link**
> Make /media a symbolic link to /run/media

**--mnt-link**
> Make /mnt a symbolic link to /var/mnt

**--monitor-host**
> Deprecated, does nothing

**--shell** _SHELL_
> Create the user with this login shell (required)

**--uid** _UID_
> Create the user with this numerical user ID (required)

**--user** _NAME_
> Create the user with this login name (required)

# DESCRIPTION

**toolbox init-container** initializes a newly created Toolbx container that is running. It is the entry point of all Toolbx containers and is not expected to be invoked directly by humans.

It customizes the container for the current user by creating a matching user with sudo and root access. It keeps configuration files such as /etc/hosts, /etc/localtime and /etc/resolv.conf synchronized with the host, and bind mounts parts of the host file system into the container. Doing this at runtime lets newer Toolbx versions improve containers created by older ones, since OCI container configuration cannot be changed after creation.

# CAVEATS

This command cannot be run on the host system. It must run inside the container being initialized.

# SEE ALSO

[toolbox](/man/toolbox)(1), [toolbox-create](/man/toolbox-create)(1), [podman](/man/podman)(1)

# RESOURCES

```[Source code](https://github.com/containers/toolbox)```

```[Homepage](https://containertoolbx.org/)```

<!-- verified: 2026-11-09 -->

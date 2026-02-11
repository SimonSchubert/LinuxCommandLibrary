# TAGLINE

Initialize Toolbx container internals

# TLDR

**Initialize** a running container

```toolbox init-container --gid [gid] --home [home] --shell [shell] --uid [uid] --user [user]```

# SYNOPSIS

**toolbox init-container** [_OPTIONS_]

# PARAMETERS

**--gid** _GID_
> Group ID of the user

**--home** _PATH_
> Home directory path

**--home-link**
> Create symbolic link for home

**--media-link**
> Create symbolic link for media

**--mnt-link**
> Create symbolic link for mnt

**--monitor-host**
> Monitor host for configuration changes

**--shell** _SHELL_
> User's login shell

**--uid** _UID_
> User ID

**--user** _NAME_
> Username

# DESCRIPTION

**toolbox init-container** initializes a running Toolbx container. This is an internal command executed automatically when a container starts and should not be run manually by users.

The command sets up the container environment to match the host system's user configuration, creating necessary symbolic links and configuring user identity.

# CAVEATS

This command cannot be run on the host system. It is designed for internal use by the Toolbx container initialization process only.

# SEE ALSO

[toolbox](/man/toolbox)(1), [toolbox-create](/man/toolbox-create)(1)

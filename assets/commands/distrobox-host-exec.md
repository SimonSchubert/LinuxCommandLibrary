# TAGLINE

execute host commands from inside Distrobox container

# TLDR

**Execute** command on host from inside container

```distrobox-host-exec "[command]"```

Execute **ls** on the host

```distrobox-host-exec ls```

# SYNOPSIS

**distrobox-host-exec** [_command_] [_arguments_]

# DESCRIPTION

**distrobox-host-exec** executes a command on the host system from inside a Distrobox container. This allows accessing host binaries and tools that aren't available inside the container.

Useful for running host-specific commands like flatpak, snap, or system utilities from within the container environment.

# PARAMETERS

_command_
> Command to execute on host

_arguments_
> Arguments to pass to the command

# CAVEATS

Only works from inside a Distrobox container. The command must exist on the host system. Environment variables may differ between container and host.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-enter](/man/distrobox-enter)(1)

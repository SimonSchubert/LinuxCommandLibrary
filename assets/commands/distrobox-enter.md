# TAGLINE

enter and run commands in Distrobox containers

# TLDR

**Enter** a container

```distrobox-enter [container_name]```

Enter and **run a command**

```distrobox-enter [container_name] -- [sh -l]```

Enter **without TTY** (for scripts)

```distrobox-enter -T [container_name] -- [uptime --pretty]```

# SYNOPSIS

**distrobox-enter** [_options_] [_name_] [_-- command_]

# DESCRIPTION

**distrobox-enter** enters a Distrobox container. By default it runs your $SHELL, but you can specify different shells or entire commands.

For scripts, applications, or services, use --no-tty to disable TTY and interactivity.

# PARAMETERS

**-n, --name** _name_
> Container name (defaults to my-distrobox)

**-T, --no-tty**
> Do not instantiate a tty (for scripts)

**-nw, --no-workdir**
> Start from the container's home directory instead of the current directory

**-a, --additional-flags** _flags_
> Additional flags passed to the container manager command

**-r, --root**
> Launch podman/docker with root privileges

**-d, --dry-run**
> Only print the container manager command generated

**-v, --verbose**
> Show increased verbosity

**-- command**
> Terminate option parsing; remaining arguments are executed inside the container

# CAVEATS

Container must exist (create with distrobox-create). First entry initializes the container which takes longer. Commands after -- are passed to the container.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-create](/man/distrobox-create)(1), [distrobox-export](/man/distrobox-export)(1)

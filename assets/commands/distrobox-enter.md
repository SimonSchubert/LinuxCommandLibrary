# TLDR

**Enter** a container

```distrobox-enter [container_name]```

Enter and **run a command**

```distrobox-enter [container_name] -- [sh -l]```

Enter **without TTY** (for scripts)

```distrobox-enter -n [container_name] -- [uptime --pretty]```

# SYNOPSIS

**distrobox-enter** [_options_] [_name_] [_-- command_]

# DESCRIPTION

**distrobox-enter** enters a Distrobox container. By default it runs your $SHELL, but you can specify different shells or entire commands.

For scripts, applications, or services, use --headless mode to disable TTY and interactivity.

# PARAMETERS

**-n, --name** _name_
> Container name

**-e, --env** _var=value_
> Set environment variable

**--headless**
> Disable TTY (for scripts)

**--no-workdir**
> Don't change to current directory

**-- command**
> Command to execute

# CAVEATS

Container must exist (create with distrobox-create). First entry initializes the container which takes longer. Commands after -- are passed to the container.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-create](/man/distrobox-create)(1), [distrobox-export](/man/distrobox-export)(1)

# TAGLINE

stop running Distrobox containers

# TLDR

**Stop** a container

```distrobox-stop [container_name]```

Stop **without confirmation**

```distrobox-stop -n [container_name] -Y```

# SYNOPSIS

**distrobox-stop** [_options_] [_name_]

# DESCRIPTION

**distrobox-stop** stops a running Distrobox container. By default it asks for confirmation before stopping.

Stopped containers retain their state and can be restarted.

# PARAMETERS

**-n, --name** _name_
> Container name

**-Y, --yes**
> Skip confirmation prompt

# CAVEATS

Stopping a container terminates any running processes inside. Exported applications will stop working until the container is restarted.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-enter](/man/distrobox-enter)(1), [distrobox-rm](/man/distrobox-rm)(1)

# RESOURCES

```[Source code](https://github.com/89luca89/distrobox)```

```[Homepage](https://distrobox.it/)```

<!-- verified: 2026-07-11 -->

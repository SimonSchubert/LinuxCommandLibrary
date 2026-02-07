# TAGLINE

manage Docker system resources and disk usage

# TLDR

**Show disk usage**

```docker system df```

**Show detailed disk usage**

```docker system df -v```

**Remove unused data**

```docker system prune```

**Remove all unused data including volumes**

```docker system prune -a --volumes```

**Show system information**

```docker system info```

**Show system events**

```docker system events```

# SYNOPSIS

**docker** **system** _command_ [_options_]

# SUBCOMMANDS

**df**
> Show Docker disk usage.

**prune**
> Remove unused data.

**info**
> Display system-wide information.

**events**
> Get real-time events from server.

# DESCRIPTION

**docker system** manages Docker system resources. Useful for monitoring disk usage and cleaning up unused containers, images, networks, and volumes.

# SEE ALSO

[docker-info](/man/docker-info)(1), [docker-volume-prune](/man/docker-volume-prune)(1)


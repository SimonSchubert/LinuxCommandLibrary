# TAGLINE

start one or more stopped containers

# TLDR

**Start a stopped container**

```docker container start [container]```

**Start multiple containers**

```docker container start [container1] [container2]```

**Start with attached output**

```docker container start -a [container]```

**Start interactively**

```docker container start -ai [container]```

# SYNOPSIS

**docker** **container** **start** [_options_] _container_ [_container..._]

# PARAMETERS

**-a**, **--attach**
> Attach STDOUT/STDERR.

**-i**, **--interactive**
> Attach STDIN.

# DESCRIPTION

**docker container start** starts one or more stopped containers, resuming them from their previous state. Unlike **docker container run**, which creates a new container, this command operates on existing containers that have been stopped.

The container resumes with its original configuration, including environment variables, volumes, network settings, and the command that was initially specified. This makes it useful for restarting services or resuming work in development containers.

# SEE ALSO

[docker-start](/man/docker-start)(1), [docker-container-stop](/man/docker-container-stop)(1)

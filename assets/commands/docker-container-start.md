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

**docker container start** starts one or more stopped containers.

# SEE ALSO

[docker-start](/man/docker-start)(1), [docker-container-stop](/man/docker-container-stop)(1)

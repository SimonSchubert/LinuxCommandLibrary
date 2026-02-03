# TLDR

**Start a stopped container**

```docker start [container]```

**Start multiple containers**

```docker start [container1] [container2]```

**Start with attached output**

```docker start -a [container]```

**Start interactively**

```docker start -ai [container]```

# SYNOPSIS

**docker** **start** [_options_] _container_ [_container..._]

# PARAMETERS

**-a**, **--attach**
> Attach STDOUT/STDERR and forward signals.

**-i**, **--interactive**
> Attach container's STDIN.

# DESCRIPTION

**docker start** starts one or more stopped containers. Containers retain their configuration from when they were created or last run.

# SEE ALSO

[docker-container-start](/man/docker-container-start)(1), [docker-stop](/man/docker-stop)(1)


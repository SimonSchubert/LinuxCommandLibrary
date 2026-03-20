# TAGLINE

dynamically update container resource limits

# TLDR

**Update CPU limit**

```docker update --cpus [2] [container]```

**Update memory limit**

```docker update --memory [512m] [container]```

**Update restart policy**

```docker update --restart [always] [container]```

**Update multiple containers**

```docker update --memory [1g] [container1] [container2]```

**Remove memory limit**

```docker update --memory [0] [container]```

# SYNOPSIS

**docker** **update** [_options_] _container_ [_container..._]

# PARAMETERS

**--cpus** _decimal_
> Number of CPUs.

**--memory**, **-m** _bytes_
> Memory limit.

**--memory-swap** _bytes_
> Swap limit (-1 for unlimited).

**--restart** _string_
> Restart policy (no, on-failure, always, unless-stopped).

**--cpu-shares** _int_
> CPU shares (relative weight).

**--memory-reservation** _bytes_
> Memory soft limit.

**--cpuset-cpus** _string_
> CPUs in which to allow execution (e.g., 0-3, 0,1).

**--pids-limit** _int_
> Tune container pids limit (-1 for unlimited).

**--blkio-weight** _uint16_
> Block IO relative weight (10-1000), 0 to disable.

**--cpu-period** _int_
> Limit CPU CFS period (microseconds).

**--cpu-quota** _int_
> Limit CPU CFS quota (microseconds).

# DESCRIPTION

**docker update** dynamically updates container resource constraints. Allows changing CPU, memory, and restart settings without recreating the container. Can update running or stopped containers. Not supported for Windows containers.

# CAVEATS

The **--kernel-memory** option has been deprecated since Docker 20.10. Memory changes on running containers may require a restart to take full effect on some systems.

# SEE ALSO

[docker](/man/docker)(1), [docker-container-update](/man/docker-container-update)(1), [docker-run](/man/docker-run)(1), [docker-inspect](/man/docker-inspect)(1)


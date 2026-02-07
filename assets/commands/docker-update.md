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

**--memory** **-m** _bytes_
> Memory limit.

**--memory-swap** _bytes_
> Swap limit (-1 for unlimited).

**--restart** _string_
> Restart policy (no, on-failure, always, unless-stopped).

**--cpu-shares** _int_
> CPU shares (relative weight).

**--kernel-memory** _bytes_
> Kernel memory limit.

# DESCRIPTION

**docker update** dynamically updates container resource constraints. Allows changing CPU, memory, and restart settings without recreating the container.

# SEE ALSO

[docker-container-update](/man/docker-container-update)(1), [docker-run](/man/docker-run)(1)


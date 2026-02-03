# TLDR

**Update CPU limit**

```docker container update --cpus [2] [container]```

**Update memory limit**

```docker container update --memory [512m] [container]```

**Update restart policy**

```docker container update --restart [always] [container]```

**Update multiple containers**

```docker container update --memory [1g] [container1] [container2]```

# SYNOPSIS

**docker** **container** **update** [_options_] _container_ [_container..._]

# PARAMETERS

**--cpus** _decimal_
> Number of CPUs.

**--memory** **-m** _bytes_
> Memory limit.

**--memory-swap** _bytes_
> Swap limit.

**--restart** _policy_
> Restart policy (no, on-failure, always, unless-stopped).

**--cpu-shares** _int_
> CPU shares.

# DESCRIPTION

**docker container update** dynamically updates container resource limits. Some updates require container restart to take effect.

# SEE ALSO

[docker-update](/man/docker-update)(1), [docker-container](/man/docker-container)(1)

# TAGLINE

dynamically update container resource limits

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

**docker container update** dynamically updates resource constraints and restart policies for one or more running containers without requiring a restart. This allows administrators to adjust resource limits in response to changing workload requirements or to correct initial configuration mistakes.

While most resource limit changes take effect immediately, some settings may require a container restart to fully apply. The restart policy update is particularly useful for changing whether containers should automatically restart on failure or system boot.

# SEE ALSO

[docker-update](/man/docker-update)(1), [docker-container](/man/docker-container)(1)

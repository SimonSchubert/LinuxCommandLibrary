# TAGLINE

display resource usage statistics for containers

# TLDR

**Show live resource usage**

```docker container stats```

**Show stats for specific containers**

```docker container stats [container1] [container2]```

**Show one-time snapshot**

```docker container stats --no-stream```

**Custom format**

```docker container stats --format "{{.Name}}: {{.CPUPerc}}"```

# SYNOPSIS

**docker** **container** **stats** [_options_] [_container..._]

# PARAMETERS

**--no-stream**
> Disable streaming, show single snapshot.

**-a**, **--all**
> Show all containers (default shows running).

**--format** _string_
> Format output using Go template. Placeholders: **.Container**, **.Name**, **.ID**, **.CPUPerc**, **.MemUsage**, **.MemPerc**, **.NetIO**, **.BlockIO**, **.PIDs**.

**--no-trunc**
> Do not truncate output (show full container IDs).

# DESCRIPTION

**docker container stats** displays a live stream of container resource usage statistics, providing real-time visibility into CPU percentage, memory usage and limit, network I/O, and block I/O for running containers.

By default, the display continuously updates with current metrics for all running containers. The **--no-stream** option provides a single snapshot instead of continuous updates, which is useful for scripting and automation.

# CAVEATS

On Linux, memory usage includes cache by default. Network I/O shows cumulative totals since container start, not per-second rates. Stats are not available for containers using the **host** network mode on some platforms.

# SEE ALSO

[docker-stats](/man/docker-stats)(1), [docker-container-top](/man/docker-container-top)(1)

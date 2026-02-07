# TAGLINE

display live container resource usage statistics

# TLDR

**Show live stats for all containers**

```docker stats```

**Show stats for specific containers**

```docker stats [container1] [container2]```

**Show one-time snapshot**

```docker stats --no-stream```

**Custom output format**

```docker stats --format "table {{.Name}}\t{{.CPUPerc}}\t{{.MemUsage}}"```

**Include stopped containers**

```docker stats -a```

# SYNOPSIS

**docker** **stats** [_options_] [_container..._]

# PARAMETERS

**-a**, **--all**
> Show all containers (default shows running).

**--no-stream**
> Disable streaming, show single snapshot.

**--no-trunc**
> Don't truncate output.

**--format** _string_
> Format output using Go template.

# DESCRIPTION

**docker stats** displays a live stream of container resource usage statistics including CPU percentage, memory usage/limit, network I/O, and block I/O.

# SEE ALSO

[docker-container-stats](/man/docker-container-stats)(1), [docker-top](/man/docker-top)(1)


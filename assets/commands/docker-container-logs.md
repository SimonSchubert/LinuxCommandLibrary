# TLDR

**View container logs**

```docker container logs [container]```

**Follow log output**

```docker container logs -f [container]```

**Show timestamps**

```docker container logs -t [container]```

**Show last n lines**

```docker container logs --tail [100] [container]```

**Logs since time**

```docker container logs --since [1h] [container]```

# SYNOPSIS

**docker** **container** **logs** [_options_] _container_

# PARAMETERS

**-f**, **--follow**
> Follow log output.

**-t**, **--timestamps**
> Show timestamps.

**--tail** _n_
> Number of lines from end.

**--since** _time_
> Show logs since timestamp.

**--until** _time_
> Show logs before timestamp.

# DESCRIPTION

**docker container logs** fetches logs from a container. Shows stdout and stderr from the container's main process.

# SEE ALSO

[docker-logs](/man/docker-logs)(1), [docker-container](/man/docker-container)(1)

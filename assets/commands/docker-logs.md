# TAGLINE

fetch container logs from STDOUT and STDERR

# TLDR

**Show container logs**

```docker logs [container]```

**Follow log output**

```docker logs -f [container]```

**Show last N lines**

```docker logs --tail [100] [container]```

**Show timestamps**

```docker logs -t [container]```

**Show logs since time**

```docker logs --since [2h] [container]```

**Show logs until time**

```docker logs --until [1h] [container]```

# SYNOPSIS

**docker** **logs** [_options_] _container_

# PARAMETERS

**-f**, **--follow**
> Follow log output.

**--tail** _string_
> Number of lines from end (default "all").

**-t**, **--timestamps**
> Show timestamps.

**--since** _string_
> Show logs since timestamp or duration.

**--until** _string_
> Show logs before timestamp or duration.

**--details**
> Show extra details.

# DESCRIPTION

**docker logs** fetches the logs of a container. Shows STDOUT and STDERR output from the container's main process. Logs are captured by Docker's logging driver and can be filtered by time range or number of lines. Essential for debugging containerized applications and monitoring runtime behavior.

# SEE ALSO

[docker-container-logs](/man/docker-container-logs)(1), [docker-events](/man/docker-events)(1)


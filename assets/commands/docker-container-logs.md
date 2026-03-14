# TAGLINE

view logs from a container

# TLDR

**View container logs**

```docker container logs [container]```

**Follow log output**

```docker container logs -f [container]```

**Show timestamps**

```docker container logs -t [container]```

**Show last n lines**

```docker container logs --tail [100] [container]```

**Show logs since a relative time or timestamp**

```docker container logs --since [1h30m] [container]```

**Show logs before a specific time**

```docker container logs --until [2024-01-01T00:00:00Z] [container]```

**Show extra attributes from the logging driver**

```docker container logs --details [container]```

# SYNOPSIS

**docker** **container** **logs** [_options_] _container_

# PARAMETERS

**--details**
> Show extra attributes provided to `--log-opt` when creating the container.

**-f**, **--follow**
> Follow log output.

**-n**, **--tail** _n_
> Number of lines to show from the end of the logs. Default is `all`.

**--since** _time_
> Show logs since timestamp (e.g., `2024-01-01T00:00:00Z`) or relative (e.g., `42m`, `1h30m`).

**-t**, **--timestamps**
> Show RFC3339Nano timestamps.

**--until** _time_
> Show logs before timestamp or relative time.

# DESCRIPTION

**docker container logs** fetches logs from a container's main process, displaying both standard output and standard error streams. This command is essential for debugging and monitoring containerized applications, allowing you to view historical logs or follow them in real-time.

Logs are collected from the container's configured logging driver, which by default captures stdout and stderr from the container's PID 1 process. Time-based filtering and tail options make it efficient to work with large log volumes. The `--since` and `--until` options accept Unix timestamps, RFC 3339 date/time strings, or Go duration strings relative to the client machine's time.

# SEE ALSO

[docker-logs](/man/docker-logs)(1), [docker-container](/man/docker-container)(1)

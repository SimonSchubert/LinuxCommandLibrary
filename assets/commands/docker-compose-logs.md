# TAGLINE

view compose service logs

# TLDR

**View logs** from all services

```docker compose logs```

**Follow log output**

```docker compose logs -f```

**View logs** for specific service

```docker compose logs [service_name]```

**Show timestamps**

```docker compose logs -t```

**Limit output lines**

```docker compose logs --tail [100]```

**Since specific time**

```docker compose logs --since [1h]```

# SYNOPSIS

**docker** **compose** **logs** [_options_] [_service..._]

# PARAMETERS

**-f**, **--follow**
> Follow log output.

**-t**, **--timestamps**
> Show timestamps.

**--tail** _n_
> Number of lines from end.

**--since** _time_
> Show logs since timestamp or relative time.

**--until** _time_
> Show logs before timestamp or relative time.

**--no-color**
> Produce monochrome output.

# DESCRIPTION

**docker compose logs** displays log output from services defined in the Compose file. Aggregates logs from all containers of each service.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [docker-logs](/man/docker-logs)(1)

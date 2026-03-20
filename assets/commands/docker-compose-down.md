# TAGLINE

stop and remove compose resources

# TLDR

**Stop and remove containers**

```docker compose down```

**Remove volumes too**

```docker compose down -v```

**Remove images too**

```docker compose down --rmi all```

**Remove orphan containers**

```docker compose down --remove-orphans```

**Timeout for shutdown**

```docker compose down -t [30]```

# SYNOPSIS

**docker** **compose** **down** [_options_]

# PARAMETERS

**-v**, **--volumes**
> Remove named volumes and anonymous volumes.

**--rmi** _type_
> Remove images: all or local.

**--remove-orphans**
> Remove containers not defined in Compose file.

**-t**, **--timeout** _seconds_
> Shutdown timeout (default 10).

# DESCRIPTION

**docker compose down** stops and removes containers and networks created by **docker compose up**.

By default, only containers and networks are removed. Volumes and images are preserved unless **-v** or **--rmi** is specified. Networks and volumes defined as **external** are never removed.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [docker-compose-up](/man/docker-compose-up)(1)

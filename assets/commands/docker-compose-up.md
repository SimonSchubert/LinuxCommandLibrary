# TLDR

**Start services**

```docker compose up```

**Start in detached mode**

```docker compose up -d```

**Build images before starting**

```docker compose up --build```

**Start specific services**

```docker compose up [service1] [service2]```

**Force recreate containers**

```docker compose up --force-recreate```

**Scale a service**

```docker compose up --scale [service]=[3]```

**Remove orphans**

```docker compose up --remove-orphans```

# SYNOPSIS

**docker** **compose** **up** [_options_] [_service..._]

# PARAMETERS

**-d**, **--detach**
> Run in background.

**--build**
> Build images before starting.

**--force-recreate**
> Recreate containers even if unchanged.

**--no-deps**
> Don't start linked services.

**--scale** _service=num_
> Scale service to num instances.

**--remove-orphans**
> Remove containers not defined in Compose file.

**--wait**
> Wait for services to be healthy.

# DESCRIPTION

**docker compose up** builds, creates, starts, and attaches to containers for services defined in docker-compose.yml. Creates networks and volumes as needed.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [docker-compose-down](/man/docker-compose-down)(1)

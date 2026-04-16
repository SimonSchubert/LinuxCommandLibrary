# TAGLINE

start compose services

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
> Run containers in the background and print container names.

**--build**
> Build images before starting containers.

**--no-build**
> Don't build images even if they are missing.

**--pull** _policy_
> Pull image before running: _always_, _missing_ (default), or _never_.

**--force-recreate**
> Recreate containers even if configuration and image are unchanged.

**--no-recreate**
> Don't recreate containers that already exist.

**--always-recreate-deps**
> Recreate dependent containers. Incompatible with **--no-recreate**.

**-V**, **--renew-anon-volumes**
> Recreate anonymous volumes instead of retrieving data from previous containers.

**--no-deps**
> Don't start linked (dependent) services.

**--scale** _service=num_
> Scale the given service to _num_ instances (overrides deploy.replicas).

**--remove-orphans**
> Remove containers for services not defined in the Compose file.

**--wait**
> Wait for services to be _running_ or _healthy_. Implies **--detach**.

**--wait-timeout** _seconds_
> Maximum time to wait for services when using **--wait**.

**--abort-on-container-exit**
> Stop all containers if any container stops. Incompatible with **-d**.

**--abort-on-container-failure**
> Stop all containers if any container exited with non-zero status.

**--attach** _service_
> Restrict log output to the specified service(s).

**--no-attach** _service_
> Do not attach (stream logs from) the specified service(s).

**-t**, **--timeout** _seconds_
> Shutdown timeout in seconds when stopping attached containers.

**--timestamps**
> Show timestamps in container logs.

**--quiet-pull**
> Pull images without printing progress information.

**--no-start**
> Don't start the services after creating them.

# DESCRIPTION

**docker compose up** builds, (re)creates, starts, and attaches to containers for the services defined in _compose.yaml_ / _docker-compose.yml_. It also creates networks and volumes declared in the file.

When run without **-d**, it streams aggregated logs from all attached containers and stops them on Ctrl+C. With **--wait** or **-d**, the command returns as soon as services are up (or healthy, with **--wait**).

# CAVEATS

If the Compose file has changed, containers are recreated unless **--no-recreate** is set. Using **--force-recreate** and **-V** together discards all existing data in anonymous volumes for recreated services.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [docker-compose-down](/man/docker-compose-down)(1)

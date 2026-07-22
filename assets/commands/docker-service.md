# TAGLINE

manage containerized services in Docker Swarm

# TLDR

**Create a service**

```docker service create --name [name] [image]```

**List services**

```docker service ls```

**Inspect a service**

```docker service inspect [service]```

**Scale a service**

```docker service scale [service]=[replicas]```

**Update service image**

```docker service update --image [image]:[tag] [service]```

**View service logs**

```docker service logs [service]```

**Remove a service**

```docker service rm [service]```

# SYNOPSIS

**docker** **service** _command_ [_options_]

# SUBCOMMANDS

**create**
> Create a new service.

**ls**
> List services.

**inspect**
> Display detailed information.

**update**
> Update a service.

**scale**
> Scale services.

**logs**
> Fetch service logs.

**ps**
> List tasks of a service.

**rm**
> Remove services.

**rollback**
> Revert a service to its previous specification.

# COMMON OPTIONS

**--replicas** _n_ (create/scale)
> Number of replicated tasks to run.

**--mode** _mode_ (create)
> **replicated** (default) or **global** (one task per node).

**--publish** _published:target_ (create)
> Publish a port externally (e.g. `8080:80`).

**--network** _name_ (create)
> Attach the service to a swarm overlay network.

**--env**, **-e** _KEY=VAL_ (create/update)
> Set environment variables.

**--constraint** _expr_ (create)
> Placement constraints (e.g. `node.role==worker`).

**--update-parallelism** _n_ / **--update-delay** _dur_ (create/update)
> Rolling-update concurrency and delay between batches.

# DESCRIPTION

**docker service** manages Swarm services. A service is a declaration of how a set of containers should run across a swarm: image, replica count, networks, mounts, secrets, resource limits, and update strategy. The swarm orchestrator schedules tasks (container instances) on cluster nodes and maintains the desired state, replacing failed tasks and routing traffic via the routing mesh.

Service commands are only available on a Docker host participating in a swarm; initialize one with **docker swarm init** before using them. Updates are applied as rolling updates by default, with **rollback** available to revert to the previous service spec.

# CAVEATS

Requires swarm mode (**docker swarm init** / **join**). For single-host workloads use **docker run** or **docker compose** instead. Rolling updates with **--update-parallelism 0** will replace all tasks at once and can cause downtime.

# INSTALL

```apt: sudo apt install docker-cli```

```dnf: sudo dnf install docker-cli```

```pacman: sudo pacman -S docker```

```apk: sudo apk add docker-cli```

```zypper: sudo zypper install docker```

```brew: brew install docker```

```nix: nix profile install nixpkgs#docker```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[docker-swarm](/man/docker-swarm)(1), [docker-node](/man/docker-node)(1), [docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1)


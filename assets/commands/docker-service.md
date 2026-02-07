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
> Revert to previous version.

# DESCRIPTION

**docker service** manages Swarm services. Services define how containers run in a swarm, including replicas, networks, and resource limits. Only available in Swarm mode. Services provide declarative configuration for running containers at scale with automatic scheduling, load balancing, rolling updates, and health monitoring across the cluster.

# SEE ALSO

[docker-swarm](/man/docker-swarm)(1), [docker-node](/man/docker-node)(1)


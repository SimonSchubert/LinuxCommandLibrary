# TAGLINE

Docker container management commands

# TLDR

**List running containers**

```docker container ls```

**List all containers**

```docker container ls -a```

**Run a container**

```docker container run [image]```

**Start a stopped container**

```docker container start [container]```

**Stop a container**

```docker container stop [container]```

**Remove a container**

```docker container rm [container]```

**Execute command in container**

```docker container exec -it [container] [command]```

# SYNOPSIS

**docker** **container** _command_ [_options_]

# SUBCOMMANDS

**ls**
> List containers.

**run**
> Create and run a container.

**start**
> Start stopped containers.

**stop**
> Stop running containers.

**rm**
> Remove containers.

**exec**
> Execute command in container.

**logs**
> View container logs.

**inspect**
> Display detailed information.

**cp**
> Copy files between container and host.

**stats**
> Display resource usage statistics.

# DESCRIPTION

**docker container** manages Docker containers. It provides commands for the full container lifecycle: creation, execution, monitoring, and removal.

This is the modern syntax; most subcommands also work as direct docker commands (e.g., **docker ps** = **docker container ls**).

# SEE ALSO

[docker](/man/docker)(1), [docker-run](/man/docker-run)(1)

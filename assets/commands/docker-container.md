# TAGLINE

Docker container management commands

# TLDR

**List running containers**

```docker container ls```

**List all containers including stopped ones**

```docker container ls -a```

**Create and run a container interactively**

```docker container run -it [image] [command]```

**Run a container in the background**

```docker container run -d -p [host_port]:[container_port] --name [name] [image]```

**Start a stopped container**

```docker container start [container]```

**Stop a running container**

```docker container stop [container]```

**Remove a stopped container**

```docker container rm [container]```

**Execute a command in a running container**

```docker container exec -it [container] [command]```

**View container logs**

```docker container logs -f [container]```

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

**restart**
> Restart one or more containers.

**rename**
> Rename a container.

**prune**
> Remove all stopped containers.

**top**
> Display running processes of a container.

**attach**
> Attach to a running container's STDIN, STDOUT, and STDERR.

**wait**
> Block until containers stop, then print exit codes.

# DESCRIPTION

**docker container** manages Docker containers. It provides commands for the full container lifecycle: creation, execution, monitoring, and removal.

This is the modern syntax; most subcommands also work as direct docker commands (e.g., **docker ps** = **docker container ls**).

# SEE ALSO

[docker](/man/docker)(1), [docker-run](/man/docker-run)(1), [docker-image](/man/docker-image)(1)

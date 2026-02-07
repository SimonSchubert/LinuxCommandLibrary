# TAGLINE

remove one or more containers

# TLDR

**Remove a container**

```docker container rm [container]```

**Remove multiple containers**

```docker container rm [container1] [container2]```

**Force remove running container**

```docker container rm -f [container]```

**Remove container and volumes**

```docker container rm -v [container]```

**Remove all stopped containers**

```docker container rm $(docker container ls -aq -f status=exited)```

# SYNOPSIS

**docker** **container** **rm** [_options_] _container_ [_container..._]

# PARAMETERS

**-f**, **--force**
> Force removal of running container.

**-v**, **--volumes**
> Remove anonymous volumes.

**-l**, **--link**
> Remove specified link.

# DESCRIPTION

**docker container rm** removes one or more containers from the Docker host, freeing disk space occupied by the container's read-write layer and metadata. Containers must be stopped before removal unless the **-f** flag is used to force removal of running containers.

The **-v** option also removes anonymous volumes associated with the container, which is useful for complete cleanup. Named volumes are preserved by default to prevent accidental data loss.

# SEE ALSO

[docker-rm](/man/docker-rm)(1), [docker-container](/man/docker-container)(1)

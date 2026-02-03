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

**docker container rm** removes one or more containers. Containers must be stopped unless **-f** is used.

# SEE ALSO

[docker-rm](/man/docker-rm)(1), [docker-container](/man/docker-container)(1)

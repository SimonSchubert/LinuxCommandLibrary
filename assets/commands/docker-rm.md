# TLDR

**Remove a container**

```docker rm [container]```

**Remove multiple containers**

```docker rm [container1] [container2]```

**Force remove running container**

```docker rm -f [container]```

**Remove container and volumes**

```docker rm -v [container]```

**Remove all stopped containers**

```docker rm $(docker ps -aq)```

# SYNOPSIS

**docker** **rm** [_options_] _container_ [_container..._]

# PARAMETERS

**-f**, **--force**
> Force removal of running container.

**-l**, **--link**
> Remove specified link.

**-v**, **--volumes**
> Remove anonymous volumes attached to container.

# DESCRIPTION

**docker rm** removes one or more containers. Containers must be stopped unless -f is used. Does not remove images; use docker rmi for that.

# SEE ALSO

[docker-container-rm](/man/docker-container-rm)(1), [docker-rmi](/man/docker-rmi)(1)


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
> Force the removal of a running container (uses SIGKILL).

**-v**, **--volumes**
> Remove anonymous volumes.

**-l**, **--link**
> Remove the specified inter-container network link rather than the container itself.

# DESCRIPTION

**docker container rm** removes one or more containers from the Docker host, freeing disk space occupied by the container's read-write layer and metadata. Containers must be stopped before removal unless the **-f** flag is used to force removal of running containers.

The **-v** option also removes anonymous volumes associated with the container, which is useful for complete cleanup. Named volumes are preserved by default to prevent accidental data loss.

The shorthand **docker rm** is equivalent to **docker container rm**.

# CAVEATS

Forcing removal of a running container with **-f** sends SIGKILL without giving the process a chance to clean up. To prune all stopped containers in one step use **docker container prune**.

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

[docker-rm](/man/docker-rm)(1), [docker-container](/man/docker-container)(1)

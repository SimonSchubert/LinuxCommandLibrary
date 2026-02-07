# TAGLINE

remove one or more containers

# TLDR

**Remove a container**

```docker container remove [container]```

# SYNOPSIS

**docker** **container** **remove** [_options_] _container_

# DESCRIPTION

**docker container remove** is an alias for **docker container rm** and removes one or more containers from the Docker host. Containers must be stopped before removal unless the force option is used. This command cleans up container filesystem layers and metadata but does not affect the underlying image.

Removing containers is important for maintaining system cleanliness and freeing disk space, as stopped containers continue to consume storage until explicitly deleted.

# SEE ALSO

[docker-container-rm](/man/docker-container-rm)(1), [docker-rm](/man/docker-rm)(1)

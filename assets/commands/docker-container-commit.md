# TLDR

**Create image from container**

```docker container commit [container] [image:tag]```

**Commit with message**

```docker container commit -m "[message]" [container] [image:tag]```

# SYNOPSIS

**docker** **container** **commit** [_options_] _container_ [_repository[:tag]_]

# DESCRIPTION

**docker container commit** creates a new image from a container's changes. This is an alias for **docker commit**.

# SEE ALSO

[docker-commit](/man/docker-commit)(1), [docker-container](/man/docker-container)(1)

# TAGLINE

inspect filesystem changes in a container

# TLDR

**Show filesystem changes in container**

```docker diff [container]```

# SYNOPSIS

**docker** **diff** _container_

# DESCRIPTION

**docker diff** inspects changes to files or directories on a container's filesystem since the container was created from its base image. The output categorizes each change with a prefix: **A** for added files, **C** for changed/modified files, and **D** for deleted files.

This command is useful for understanding what modifications have occurred within a running or stopped container, which helps in debugging, auditing changes, or determining what should be captured in a new image via **docker commit**. Only changes in the container's writable layer are reported; the underlying image layers remain unchanged.

The diff operation examines the entire container filesystem, so it may take time for containers with extensive modifications.

# SEE ALSO

[docker-container-diff](/man/docker-container-diff)(1), [docker-commit](/man/docker-commit)(1)

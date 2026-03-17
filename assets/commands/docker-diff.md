# TAGLINE

Inspect changes to files or directories on a container's filesystem

# TLDR

**Show filesystem changes in a container**

```docker diff [container_name]```

**Show changes using container ID**

```docker diff [container_id]```

# SYNOPSIS

**docker** **diff** _container_

# OUTPUT FIELDS

**A**
> A file or directory was added.

**C**
> A file or directory was changed (modified content or metadata).

**D**
> A file or directory was deleted.

# DESCRIPTION

**docker diff** inspects changes to files or directories on a container's filesystem since the container was created from its base image. The output categorizes each change with a single-character prefix: **A** for added, **C** for changed/modified, and **D** for deleted.

This command is useful for understanding what modifications have occurred within a running or stopped container, which helps in debugging, auditing changes, or determining what should be captured in a new image via **docker commit**. Only changes in the container's writable layer are reported; the underlying image layers remain unchanged.

You can reference the container by name or by full/shortened container ID.

# CAVEATS

The diff operation examines the entire container filesystem, so it may take time for containers with extensive modifications. No filtering options are available; the full diff is always shown.

# HISTORY

**docker diff** has been available since the early versions of Docker. It is an alias for **docker container diff**, which is the preferred form in newer Docker CLI versions.

# SEE ALSO

[docker-container-diff](/man/docker-container-diff)(1), [docker-commit](/man/docker-commit)(1), [docker-inspect](/man/docker-inspect)(1), [docker-cp](/man/docker-cp)(1)

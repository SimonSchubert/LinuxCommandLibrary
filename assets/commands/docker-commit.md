# TAGLINE

create image from container changes

# TLDR

**Create image from container**

```docker commit [container_id] [image_name:tag]```

**Commit with author info**

```docker commit --author "[name]" [container_id] [image:tag]```

**Commit with message**

```docker commit -m "[Added config files]" [container_id] [image:tag]```

**Commit with changed CMD**

```docker commit --change "CMD ['/app/start.sh']" [container_id] [image:tag]```

# SYNOPSIS

**docker** **commit** [_options_] _container_ [_repository[:tag]_]

# PARAMETERS

**-a**, **--author** _string_
> Author of the image.

**-c**, **--change** _list_
> Apply Dockerfile instructions to the image.

**-m**, **--message** _string_
> Commit message.

**-p**, **--pause**
> Pause container during commit (default true).

# DESCRIPTION

**docker commit** creates a new image from a container's changes. This captures the current state of a container's filesystem as a new image layer by examining all modifications made since the container was created.

While useful for debugging, experimentation, or saving a working state, this approach is not recommended for production workflows. Dockerfiles provide better reproducibility, version control, and documentation of the build process. Committed images lack the transparent layer history that Dockerfiles provide, making them harder to maintain and audit.

# CAVEATS

Does not include data in volumes. The resulting image lacks build history and is not reproducible.

# SEE ALSO

[docker](/man/docker)(1), [docker-build](/man/docker-build)(1), [docker-save](/man/docker-save)(1)

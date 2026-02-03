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

**docker commit** creates a new image from a container's changes. This captures the current state of a container's filesystem as a new image layer.

Useful for saving container modifications, though Dockerfiles are preferred for reproducible builds.

# CAVEATS

Does not include data in volumes. The resulting image lacks build history and is not reproducible.

# SEE ALSO

[docker](/man/docker)(1), [docker-build](/man/docker-build)(1), [docker-save](/man/docker-save)(1)

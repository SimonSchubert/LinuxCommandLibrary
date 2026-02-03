# TLDR

**List all images**

```docker image ls```

**List with digests**

```docker image ls --digests```

**List only image IDs**

```docker image ls -q```

**Filter by reference**

```docker image ls [repository]```

**List dangling images**

```docker image ls -f dangling=true```

# SYNOPSIS

**docker** **image** **ls** [_options_] [_repository[:tag]_]

# PARAMETERS

**-a**, **--all**
> Show all images (including intermediate).

**-q**, **--quiet**
> Only show image IDs.

**--digests**
> Show digests.

**-f**, **--filter** _filter_
> Filter output based on conditions.

**--format** _string_
> Format output using Go template.

**--no-trunc**
> Don't truncate output.

# DESCRIPTION

**docker image ls** lists images stored locally. By default shows repository, tag, image ID, creation time, and size.

# SEE ALSO

[docker-images](/man/docker-images)(1), [docker-image](/man/docker-image)(1)


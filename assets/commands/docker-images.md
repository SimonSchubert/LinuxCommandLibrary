# TAGLINE

list Docker images stored locally

# TLDR

**List all images**

```docker images```

**List with digests**

```docker images --digests```

**List only image IDs**

```docker images -q```

**Filter by repository**

```docker images [repository]```

**Show dangling images**

```docker images -f dangling=true```

# SYNOPSIS

**docker** **images** [_options_] [_repository[:tag]_]

# PARAMETERS

**-a**, **--all**
> Show all images (including intermediate layers).

**-q**, **--quiet**
> Only show image IDs.

**--digests**
> Show digests.

**-f**, **--filter** _filter_
> Filter output.

**--format** _string_
> Format output using Go template.

**--no-trunc**
> Don't truncate output.

# DESCRIPTION

**docker images** lists images stored on the local system. Shorthand for docker image ls. Shows repository, tag, image ID, creation time, and size. Images are the templates from which containers are created, containing the filesystem and configuration needed to run an application.

# SEE ALSO

[docker-image-ls](/man/docker-image-ls)(1), [docker-rmi](/man/docker-rmi)(1)


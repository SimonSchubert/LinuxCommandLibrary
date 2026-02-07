# TAGLINE

list Docker images on the system

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

**docker image ls** lists Docker images stored in the local image cache, displaying information including repository name, tag, image ID, creation time, and virtual size. This command provides visibility into which images are available for creating containers and how much disk space they consume.

By default, intermediate images created during builds are hidden; use **-a** to display them. Dangling images are untagged layers left over from superseded builds and can be identified with the filter **dangling=true**, making them candidates for cleanup via **docker image prune**.

The command supports filtering by repository name, tag patterns, and various image attributes. Output formatting with Go templates enables custom displays and scripting integration.

# SEE ALSO

[docker-images](/man/docker-images)(1), [docker-image](/man/docker-image)(1)

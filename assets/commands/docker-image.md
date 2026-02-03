# TLDR

**List images**

```docker image ls```

**Pull an image**

```docker image pull [image]:[tag]```

**Remove an image**

```docker image rm [image]```

**Build an image**

```docker image build -t [name] [path]```

**Inspect image details**

```docker image inspect [image]```

**Show image history**

```docker image history [image]```

**Remove unused images**

```docker image prune```

# SYNOPSIS

**docker** **image** _command_ [_options_]

# SUBCOMMANDS

**ls**
> List images.

**pull**
> Download image from registry.

**push**
> Upload image to registry.

**rm**
> Remove images.

**build**
> Build image from Dockerfile.

**inspect**
> Display detailed information.

**history**
> Show image layers.

**tag**
> Create image tag.

**prune**
> Remove unused images.

**save**
> Save image to tar archive.

**load**
> Load image from tar archive.

**import**
> Import from tarball.

# DESCRIPTION

**docker image** manages Docker images including listing, pulling, building, and removing images. Images are read-only templates used to create containers.

# SEE ALSO

[docker-images](/man/docker-images)(1), [docker-pull](/man/docker-pull)(1), [docker-build](/man/docker-build)(1)


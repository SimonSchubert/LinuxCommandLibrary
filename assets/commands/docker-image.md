# TAGLINE

manage Docker images

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

**docker image** manages Docker images, which are read-only templates used to create containers. Images contain the application code, runtime, libraries, environment variables, and configuration files needed to run software in an isolated environment.

Docker images are built in layers, with each instruction in a Dockerfile creating a new layer. This layering system enables efficient storage through layer sharing between images and faster builds through caching. Images are identified by repository name, optional tag (defaulting to "latest"), and a unique SHA256 digest.

The **docker image** command group provides comprehensive image lifecycle management, from pulling images from registries, building custom images via Dockerfile, tagging for organization, to cleaning up unused images that consume disk space.

# SEE ALSO

[docker-images](/man/docker-images)(1), [docker-pull](/man/docker-pull)(1), [docker-build](/man/docker-build)(1)

# TAGLINE

Manage container images in Podman

# TLDR

**List images**

```podman image list```

**Remove image**

```podman image rm [image]```

**Pull image**

```podman image pull [image:tag]```

**Inspect image**

```podman image inspect [image]```

**Build image**

```podman image build -t [name] [path]```

**Prune unused images**

```podman image prune```

# SYNOPSIS

**podman** **image** _command_ [_options_]

# PARAMETERS

**list**
> List images.

**rm** _image_
> Remove image.

**pull** _image_
> Pull image from registry.

**push** _image_
> Push image to registry.

**build**
> Build image from Dockerfile.

**inspect** _image_
> Show image details.

**prune**
> Remove unused images.

**tag** _src_ _dest_
> Tag an image.

# DESCRIPTION

**podman image** manages container images. Subcommand for Podman's image operations. Supports pulling, building, tagging, and removing images. Compatible with OCI and Docker image formats.

# SEE ALSO

[podman](/man/podman)(1), [podman-pull](/man/podman-pull)(1)


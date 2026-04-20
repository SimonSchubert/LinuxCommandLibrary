# TAGLINE

upload tarball as container image

# TLDR

**Push tarball** as image

```crane push [image.tar] [registry/repo:tag]```

**Push** and write the resulting image digest

```crane push [image.tar] [registry/repo:tag] --image-refs [refs.txt]```

**Push** with a specific platform index

```crane push [image.tar] [registry/repo:tag] --index```

# SYNOPSIS

**crane** **push** [_options_] _tarball_ _image_

# PARAMETERS

**--image-refs** _file_
> Path to write the full image reference (including digest) by tag.

**--index**
> Push a collection of images as a single index (manifest list).

**--platform** _os/arch_
> Specify platform when pushing a multi-platform tarball.

# DESCRIPTION

**crane push** uploads a tarball as a container image to a registry. The tarball should be in OCI or Docker image format (as produced by **crane pull**, **docker save**, or **crane export**).

The command reads the image layers from the tarball and pushes them to the target repository, then uploads the manifest. Authentication uses the same Docker credentials configured in **~/.docker/config.json**.

# CAVEATS

The registry must be reachable and the user must have push access. For multi-platform images, use **--index**. Large tarballs stream from disk, so sufficient bandwidth is required.

# SEE ALSO

[crane](/man/crane)(1), [crane-pull](/man/crane-pull)(1), [docker](/man/docker)(1), [skopeo](/man/skopeo)(1)

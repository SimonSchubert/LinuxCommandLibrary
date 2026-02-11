# TAGLINE

Build container images from Containerfiles

# TLDR

**Build from Containerfile**

```podman build -t [image:tag] [path]```

**Build with specific file**

```podman build -f [Dockerfile] -t [image] [path]```

**Build without cache**

```podman build --no-cache -t [image] [path]```

**Build with build args**

```podman build --build-arg [KEY=value] -t [image] [path]```

# SYNOPSIS

**podman build** [_options_] _path_

# PARAMETERS

_PATH_
> Build context directory.

**-t**, **--tag** _NAME_
> Image name and tag.

**-f**, **--file** _FILE_
> Containerfile path.

**--no-cache**
> Don't use build cache.

**--build-arg** _ARG_
> Build-time variables.

**--pull**
> Always pull base image.

**--squash**
> Squash layers.

# DESCRIPTION

**podman build** creates container images from a Containerfile (or Dockerfile) in the specified build context directory. It is compatible with Docker build syntax and supports multi-stage builds, build arguments, and layer caching.

Under the hood, it uses Buildah for the actual image building process. The **--no-cache** flag forces rebuilding all layers, **--build-arg** passes build-time variables, and **--squash** merges all layers into a single layer. The output is an OCI-compliant container image.

# CAVEATS

Uses Buildah under the hood. Docker build compatible.

# HISTORY

podman build uses **Buildah** for OCI-compliant image building.

# SEE ALSO

[podman](/man/podman)(1), [buildah](/man/buildah)(1), [docker-build](/man/docker-build)(1)


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

**podman build** builds container images from Containerfiles. Docker-compatible.

The tool creates OCI images. Supports multi-stage builds.

podman build creates images.

# CAVEATS

Uses Buildah under the hood. Docker build compatible.

# HISTORY

podman build uses **Buildah** for OCI-compliant image building.

# SEE ALSO

[podman](/man/podman)(1), [buildah](/man/buildah)(1), [docker-build](/man/docker-build)(1)


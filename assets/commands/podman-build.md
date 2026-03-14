# TAGLINE

Build container images from Containerfiles

# TLDR

**Build from Containerfile** in current directory

```podman build -t [image:tag] .```

**Build with specific Containerfile**

```podman build -f [Containerfile.dev] -t [image:tag] [path]```

**Build without cache**

```podman build --no-cache -t [image:tag] [path]```

**Build with build args**

```podman build --build-arg [KEY=value] -t [image:tag] [path]```

**Build a specific stage** of a multi-stage build

```podman build --target [stage_name] -t [image:tag] [path]```

**Build for a specific platform**

```podman build --platform [linux/arm64] -t [image:tag] [path]```

# SYNOPSIS

**podman build** [_options_] _context_

# PARAMETERS

_CONTEXT_
> Build context directory or URL.

**-t**, **--tag** _NAME_
> Image name and optional tag (name:tag).

**-f**, **--file** _FILE_
> Containerfile path. Use -f - to read from stdin.

**--no-cache**
> Do not use existing cached images for building. Rebuild all layers.

**--build-arg** _ARG_
> Build-time variables in KEY=value format.

**--pull**
> Always pull the base image even if a local copy exists. Accepts always, missing, never, or true/false.

**--squash**
> Squash all newly built layers into a single layer.

**--target** _STAGE_
> Set the target build stage in a multi-stage Containerfile.

**--platform** _OS/ARCH_
> Set the OS/architecture of the built image (e.g., linux/arm64, linux/amd64).

**--layers**
> Cache intermediate images during the build process (default true).

**--format** _FORMAT_
> Image manifest and metadata format (oci or docker).

**--label** _LABEL_
> Add a label to the image in KEY=value format.

# DESCRIPTION

**podman build** creates container images from a Containerfile (or Dockerfile) in the specified build context directory. It is compatible with Docker build syntax and supports multi-stage builds, build arguments, and layer caching.

Under the hood, it uses Buildah for the actual image building process. The output is an OCI-compliant container image by default.

# CAVEATS

Uses Buildah under the hood. Largely compatible with Docker build, but some Docker-specific features may behave differently. The default image format is OCI, unlike Docker which defaults to the Docker format. Use **--format docker** for Docker compatibility.

# SEE ALSO

[podman](/man/podman)(1), [buildah](/man/buildah)(1), [docker-build](/man/docker-build)(1), [podman-run](/man/podman-run)(1)

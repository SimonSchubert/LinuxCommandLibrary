# TAGLINE

Docker image builder

# TLDR

**Build an image from Dockerfile**

```docker build -t [image_name] .```

**Build with specific Dockerfile**

```docker build -f [Dockerfile.dev] -t [image_name] .```

**Build with build arguments**

```docker build --build-arg [VAR=value] -t [image_name] .```

**Build without cache**

```docker build --no-cache -t [image_name] .```

**Build for specific platform**

```docker build --platform [linux/amd64] -t [image_name] .```

**Build multi-platform image** (buildx)

```docker buildx build --platform [linux/amd64,linux/arm64] -t [image_name] .```

**Build and push to registry**

```docker build -t [registry/image:tag] --push .```

# SYNOPSIS

**docker build** [_options_] _path_|_url_

# PARAMETERS

**-t**, **--tag** _name:tag_
> Name and optionally tag the image.

**-f**, **--file** _path_
> Path to Dockerfile (default: PATH/Dockerfile).

**--build-arg** _key=value_
> Build-time variables.

**--no-cache**
> Don't use cache when building.

**--pull**
> Always pull newer base image.

**--target** _stage_
> Build specific stage in multi-stage Dockerfile.

**--platform** _platform_
> Target platform (linux/amd64, linux/arm64).

**--progress** _type_
> Progress output: auto, plain, tty.

**--secret** _id=secret_
> Secret to expose to build.

**--ssh** _socket_
> SSH agent socket to expose.

**-q**, **--quiet**
> Suppress build output.

**--push**
> Push image after build (buildx).

# DESCRIPTION

**docker build** creates Docker images from a Dockerfile and context (files available during build). The Dockerfile contains instructions for assembling the image layer by layer.

The build context is sent to the Docker daemon, which processes Dockerfile instructions sequentially. Each instruction creates a layer; layers are cached and reused when unchanged, speeding up subsequent builds.

Modern builds use **BuildKit** (enabled by default in recent Docker versions), providing improved performance, better caching, and features like secrets and SSH forwarding.

# CAVEATS

Large build contexts slow builds; use .dockerignore to exclude unnecessary files. Layer caching depends on instruction order; put frequently changing instructions last. Multi-platform builds require buildx and may need emulation or cross-compilation setup.

# HISTORY

Docker build has been a core Docker feature since the initial release in **2013**. BuildKit, a next-generation builder with improved performance and features, was introduced in **2017** and became the default in Docker **23.0** (2023). The buildx plugin extends build capabilities for multi-platform images and advanced build scenarios.

# SEE ALSO

[docker](/man/docker)(1), [docker-run](/man/docker-run)(1), [dockerfile](/man/dockerfile)(5), [docker-compose](/man/docker-compose)(1)

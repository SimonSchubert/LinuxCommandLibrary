# TAGLINE

download container images from registries

# TLDR

**Pull an image**

```docker pull [image]```

**Pull specific tag**

```docker pull [image]:[tag]```

**Pull all tags**

```docker pull -a [image]```

**Pull from private registry**

```docker pull [registry.example.com/image]:[tag]```

**Pull by digest**

```docker pull [image]@sha256:[digest]```

**Pull specific platform**

```docker pull --platform linux/arm64 [image]```

# SYNOPSIS

**docker** **pull** [_options_] _name[:tag|@digest]_

# PARAMETERS

**-a**, **--all-tags**
> Download all tagged images in the repository.

**--disable-content-trust**
> Skip image verification.

**--platform** _string_
> Set platform (e.g., linux/amd64, linux/arm64).

**-q**, **--quiet**
> Suppress verbose output.

# DESCRIPTION

**docker pull** downloads an image from a registry. Pulls from Docker Hub by default. If no tag is specified, pulls the latest tag. Images are downloaded in layers, and Docker caches these layers to optimize subsequent pulls. Supports multi-platform images with automatic platform detection.

# SEE ALSO

[docker-image-pull](/man/docker-image-pull)(1), [docker-push](/man/docker-push)(1)


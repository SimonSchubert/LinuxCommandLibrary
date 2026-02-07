# TAGLINE

download images from a registry

# TLDR

**Pull an image**

```docker image pull [image]```

**Pull specific tag**

```docker image pull [image]:[tag]```

**Pull all tags**

```docker image pull -a [image]```

**Pull by digest**

```docker image pull [image]@[sha256:digest]```

**Pull from specific registry**

```docker image pull [registry.example.com/image]:[tag]```

# SYNOPSIS

**docker** **image** **pull** [_options_] _name[:tag|@digest]_

# PARAMETERS

**-a**, **--all-tags**
> Download all tagged images.

**--disable-content-trust**
> Skip image verification.

**--platform** _string_
> Set platform (e.g., linux/amd64).

**-q**, **--quiet**
> Suppress verbose output.

# DESCRIPTION

**docker image pull** downloads a Docker image or repository from a registry to the local Docker daemon. When no registry is specified, Docker Hub serves as the default source. If no tag is provided, the **latest** tag is assumed.

The pull operation downloads image layers in parallel for efficiency. If some layers already exist locally from other images, Docker reuses them through its content-addressable storage system, minimizing bandwidth and storage requirements.

Images can be pulled by tag for version-specific deployments or by SHA256 digest for immutable, verifiable image references. The **--platform** flag enables pulling multi-architecture images for cross-platform development and deployment scenarios.

# SEE ALSO

[docker-pull](/man/docker-pull)(1), [docker-image-push](/man/docker-image-push)(1)

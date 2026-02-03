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

**docker image pull** downloads an image from a registry. Defaults to Docker Hub if no registry is specified. Pulls latest tag if none specified.

# SEE ALSO

[docker-pull](/man/docker-pull)(1), [docker-image-push](/man/docker-image-push)(1)


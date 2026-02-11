# TAGLINE

Pull container images from registries

# TLDR

**Pull image from Docker Hub**

```podman pull [image:tag]```

**Pull from specific registry**

```podman pull [registry.example.com/image:tag]```

**Pull all tags**

```podman pull --all-tags [image]```

**Pull without TLS verification**

```podman pull --tls-verify=false [image]```

# SYNOPSIS

**podman** **pull** [_options_] _image_

# PARAMETERS

**--all-tags**
> Pull all tagged images.

**--tls-verify** _bool_
> Verify TLS certificates.

**--creds** _user:pass_
> Registry credentials.

**--quiet**
> Suppress output.

**--arch** _arch_
> Pull specific architecture.

# DESCRIPTION

**podman pull** downloads container images from registries. Supports Docker Hub, Quay.io, and private registries. Images are stored locally for creating containers.

# SEE ALSO

[podman](/man/podman)(1), [podman-image](/man/podman-image)(1)


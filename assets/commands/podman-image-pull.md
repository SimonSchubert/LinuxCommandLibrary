# TAGLINE

Download container images from registries

# TLDR

**Pull an image** from Docker Hub

```podman image pull [nginx]```

**Pull a specific tag** of an image

```podman image pull [nginx]:[1.25]```

**Pull from a specific registry**

```podman image pull [quay.io/podman/hello]```

**Pull all tags** of an image

```podman image pull --all-tags [alpine]```

**Pull without verifying TLS** (insecure)

```podman image pull --tls-verify=false [registry.local:5000/myimage]```

**Pull with authentication**

```podman image pull --creds [user]:[password] [registry.example.com/image]```

**Pull and specify architecture**

```podman image pull --arch [arm64] [nginx]```

# SYNOPSIS

**podman image pull** [_options_] _image_

# PARAMETERS

**--all-tags**
> Pull all tagged images from the repository

**--arch** _ARCH_
> Override the architecture of the image to pull

**--authfile** _path_
> Path to authentication file

**--creds** _[username[:password]]_
> Credentials for registry authentication

**--disable-content-trust**
> Skip image verification (default: true)

**--os** _OS_
> Override the OS of the image to pull

**--platform** _PLATFORM_
> Specify platform (os/arch) to pull

**--quiet**, **-q**
> Suppress output information

**--tls-verify**
> Require HTTPS and verify certificates (default: true)

**--variant** _VARIANT_
> Override the variant of the image

# DESCRIPTION

**podman image pull** downloads container images from registries to local storage. It supports multiple registries including Docker Hub, Quay.io, and private registries. Images are stored locally and can be used to create containers.

By default, Podman searches registries defined in registries.conf. Fully qualified image names (including registry) bypass registry search. The command supports pulling by tag, digest, or retrieving all tags at once.

# CAVEATS

Large images may take significant time and bandwidth to download. Pulling from insecure registries requires explicit --tls-verify=false flag. Authentication credentials on command line may be visible in process listings; use --authfile for better security.

# HISTORY

**Podman** was developed by **Red Hat** as a daemonless container engine, first released in **2018**. The image pull command mirrors Docker's functionality while adding rootless container support. Podman has become a standard container tool in RHEL/Fedora ecosystems.

# SEE ALSO

[podman](/man/podman)(1), [podman-pull](/man/podman-pull)(1), [podman-images](/man/podman-images)(1), [podman-run](/man/podman-run)(1), [docker-pull](/man/docker-pull)(1)

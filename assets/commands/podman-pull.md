# TAGLINE

Pull container images from registries

# TLDR

**Pull image from Docker Hub**

```podman pull [image:tag]```

**Pull from specific registry**

```podman pull [registry.example.com/image:tag]```

**Pull all tags**

```podman pull --all-tags [image]```

**Pull specific platform image**

```podman pull --platform [linux/arm64] [image]```

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
> Override the architecture of the image to be pulled.

**--os** _os_
> Override the OS of the image to be pulled.

**--platform** _os/arch_
> Specify platform for image selection (e.g., linux/amd64). Conflicts with --arch and --os.

**--variant** _variant_
> Override the architecture variant (e.g., arm/v7).

**--retry** _count_
> Number of times to retry in case of failure.

**--decryption-key** _key[:passphrase]_
> Key for decryption of encrypted images.

**--authfile** _path_
> Path to the authentication file.

# DESCRIPTION

**podman pull** downloads container images from registries. Supports Docker Hub, Quay.io, and private registries. Images are stored locally for creating containers.

The pull policy defaults to **always**. Other policies are: **missing** (pull only if not local), **never** (use local only), and **newer** (pull if registry image is newer).

# SEE ALSO

[podman](/man/podman)(1), [podman-image](/man/podman-image)(1), [podman-images](/man/podman-images)(1), [podman-run](/man/podman-run)(1)


# TLDR

Change base OS to a **container image from registry**

```sudo bootc switch [image]```

Change to image from **local container storage**

```sudo bootc switch --transport containers-storage [image]```

Change to image from a **tarball**

```sudo bootc switch --transport oci-archive [path/to/image.tar.gz]```

# SYNOPSIS

**bootc switch** [_options_] _image_

# DESCRIPTION

**bootc switch** changes the base operating system to a different container image. This allows switching between different OS variants or versions while maintaining a transactional, rollback-capable system.

The new image is staged and becomes active on the next reboot. The previous deployment is retained for rollback if needed.

# PARAMETERS

**--transport** _type_
> Image source type: registry (default), containers-storage, oci-archive

**--retain**
> Keep the current deployment as a rollback option

**--no-signature-verification**
> Skip signature verification (use with caution)

# CAVEATS

Switching to incompatible images may result in a non-bootable system. Ensure the target image is compatible with the system's architecture and configuration. Requires root privileges.

# SEE ALSO

[bootc](/man/bootc)(1), [podman](/man/podman)(1), [skopeo](/man/skopeo)(1)

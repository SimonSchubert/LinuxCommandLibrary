# TAGLINE

Switch the base OS to a different container image

# TLDR

Change base OS to a **container image from registry**

```sudo bootc switch [image]```

Switch to a new image and **reboot immediately**

```sudo bootc switch --apply [image]```

Change to image from **local container storage**

```sudo bootc switch --transport containers-storage [image]```

Change to image from an **OCI archive**

```sudo bootc switch --transport oci-archive [path/to/image.tar]```

# SYNOPSIS

**bootc switch** [_options_] _image_

# DESCRIPTION

**bootc switch** changes the base operating system to a different container image. This allows switching between different OS variants or versions while maintaining a transactional, rollback-capable system.

The new image is staged and becomes active on the next reboot. The previous deployment is retained for rollback if needed. This operation is similar to `bootc upgrade` but additionally changes the container image reference.

# PARAMETERS

**--transport** _type_
> Image source type: registry (default), containers-storage, oci-archive

**--apply**
> Restart or reboot into the new target image immediately after staging. Currently always performs a full reboot; future versions may use a userspace-only restart when no kernel changes are queued.

**--soft-reboot** _mode_
> Controls soft reboot behaviour when used with --apply. Values: auto (use soft reboot if available, otherwise fall back to full reboot), required (fail if soft reboot is unavailable).

**--enforce-container-sigpolicy**
> Require that /etc/containers/policy.json includes a default policy enforcing image signatures.

**--retain**
> Retain a reference to the currently booted image.

**--quiet**
> Suppress progress output.

# CAVEATS

Switching to incompatible images may result in a non-bootable system. Ensure the target image is compatible with the system's architecture and configuration. Requires root privileges.

# SEE ALSO

[bootc](/man/bootc)(1), [podman](/man/podman)(1), [skopeo](/man/skopeo)(1), [rpm-ostree](/man/rpm-ostree)(1), [ostree](/man/ostree)(1)

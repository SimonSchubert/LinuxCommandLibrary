# TAGLINE

Transactional OS updates using container images

# TLDR

Show **deployments** in bootloader order

```bootc status```

Check if **updates are available**

```bootc upgrade --check```

Prepare a new **update and reboot**

```bootc upgrade --apply```

**Change OS** base to new container image

```bootc switch [image]```

**Reboot** into previous deployment

```bootc rollback```

Apply transactional **configuration changes**

```bootc edit```

**Install to a target block device**

```bootc install to-disk --target-no-signature-verification [/dev/sda]```

**Show status in JSON format**

```bootc status --format json```

# SYNOPSIS

**bootc** _command_ [_options_]

# DESCRIPTION

**bootc** manages transactional, in-place operating system updates using OCI/Docker container images. It enables atomic system upgrades where the entire OS is replaced by a new container image at boot time.

The tool works with image-based Linux distributions like Fedora CoreOS and RHEL and provides rollback capability if updates cause issues. It builds on OSTree for atomic deployments and uses standard container registries for image distribution.

# SUBCOMMANDS

**status**
> Show current deployments and their order in bootloader

**upgrade**
> Fetch and stage a new version of the OS

**switch**
> Change to a different container image

**rollback**
> Revert to the previous OS deployment

**edit**
> Apply configuration changes transactionally

**install to-disk**
> Install the container image to a target block device

**install to-filesystem**
> Install to an existing filesystem (supports LVM, LUKS, RAID)

# PARAMETERS

**--check**
> Check for updates without applying them (used with upgrade)

**--apply**
> Apply upgrade and reboot (used with upgrade)

**--format** _FORMAT_
> Output format for status: json or yaml

**--quiet**
> Suppress non-error output

# CAVEATS

Only works on systems designed for bootc (image-based Linux distributions). Changes to root filesystem are lost unless using configuration management. Requires container image infrastructure.

# HISTORY

**bootc** is part of the growing ecosystem of image-based Linux systems, building on technologies like OSTree and container images. It represents a modern approach to system updates pioneered by projects like CoreOS. Developed under the **containers** GitHub organization, it became a key component of RHEL image mode.

# SEE ALSO

[bootc-switch](/man/bootc-switch)(1), [rpm-ostree](/man/rpm-ostree)(1), [podman](/man/podman)(1), [skopeo](/man/skopeo)(1), [ostree](/man/ostree)(1)

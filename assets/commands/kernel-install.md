# TLDR

**Add** kernel and initramfs to bootloader

```sudo kernel-install add [kernel-version] [kernel-image] [path/to/initrd]```

**Remove** kernel from bootloader

```sudo kernel-install remove [kernel-version]```

**Inspect** configuration and auto-detected paths

```sudo kernel-install inspect [kernel-image]```

# SYNOPSIS

**kernel-install** _command_ [_options_]

# PARAMETERS

**add** _VERSION_ _KERNEL_ [_INITRD_...]
> Add kernel and optional initramfs images to boot partition

**remove** _VERSION_
> Remove kernel and associated files from boot partition

**inspect** [_KERNEL_]
> Display configured and auto-detected paths

# DESCRIPTION

**kernel-install** manages kernel images in the boot partition. It's part of systemd and handles the installation and removal of kernel images for systemd-boot and other bootloaders.

The tool runs plugins (install.d scripts) that handle tasks like copying files, generating bootloader entries, and updating the initramfs. It integrates with the Boot Loader Specification.

# CAVEATS

Requires root privileges. Behavior depends on installed plugins. Works best with systemd-boot but can support other bootloaders through plugins.

# HISTORY

kernel-install is part of systemd, providing a standardized way to manage kernel installation. It implements the Boot Loader Specification for portable boot configurations.

# SEE ALSO

[bootctl](/man/bootctl)(1), [systemd-boot](/man/systemd-boot)(7), [dracut](/man/dracut)(8)

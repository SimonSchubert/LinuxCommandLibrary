# TAGLINE

initramfs image generator

# TLDR

Generate initramfs for **current kernel**

```dracut```

Generate and **overwrite** existing

```dracut -f```

Generate for **specific kernel**

```dracut --kver [kernel_version]```

**List** available modules

```dracut --list-modules```

# SYNOPSIS

**dracut** [_options_] [_image_] [_kernel-version_]

# DESCRIPTION

**dracut** generates initramfs images to boot the Linux kernel. The initramfs contains modules and tools needed to mount the root filesystem.

Configuration files in /etc/dracut.conf, /etc/dracut.conf.d/, and /usr/lib/dracut/dracut.conf.d/ customize the initramfs content.

# PARAMETERS

**-f, --force**
> Overwrite existing initramfs

**--kver** _version_
> Generate for specific kernel version

**--list-modules**
> List available dracut modules

**--add** _modules_
> Add modules to initramfs

**--omit** _modules_
> Omit modules from initramfs

**-H, --hostonly**
> Only include drivers for current host

# CONFIGURATION

**/etc/dracut.conf**
> Main configuration file for dracut behavior and module selection.

**/etc/dracut.conf.d/**
> Directory for additional configuration files.

**/usr/lib/dracut/dracut.conf.d/**
> System-wide dracut configuration directory.

# CAVEATS

Used on Fedora, RHEL, and other distributions. Debian/Ubuntu typically use mkinitramfs instead. Improper configuration can make system unbootable.

# SEE ALSO

[mkinitramfs](/man/mkinitramfs)(8), [lsinitrd](/man/lsinitrd)(1)

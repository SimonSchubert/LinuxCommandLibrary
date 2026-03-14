# TAGLINE

creates an initial ramdisk image for Linux

# TLDR

**Generate initramfs for the current kernel**

```sudo mkinitramfs -o [/boot/initrd.img]```

**Generate initramfs for a specific kernel version**

```sudo mkinitramfs -o [/boot/initrd.img-5.10.0] [5.10.0-generic]```

**Generate with verbose output**

```sudo mkinitramfs -v -o [/boot/initrd.img]```

**Keep the temporary working directory for inspection**

```sudo mkinitramfs -k -o [/boot/initrd.img]```

**Use a specific configuration directory**

```sudo mkinitramfs -d [/etc/initramfs-tools] -o [/boot/initrd.img]```

# SYNOPSIS

**mkinitramfs** [_options_] **-o** _outfile_ [_version_]

# PARAMETERS

**-o** _FILE_
> Output file (required). The generated initramfs image path.

**-d** _CONFDIR_
> Use an alternate configuration directory (default: /etc/initramfs-tools).

**-k**
> Keep the temporary directory used during generation for debugging.

**-v**
> Verbose output showing files being added.

**-c** _COMPRESS_
> Override the compression method (gzip, lz4, lzma, lzop, xz, zstd).

_VERSION_
> Kernel version to generate initramfs for. Defaults to the currently running kernel.

# DESCRIPTION

**mkinitramfs** creates an initial ramdisk image (initramfs) for Linux. The initramfs contains essential drivers and scripts needed to mount the root filesystem during boot, including storage drivers, filesystem modules, and early userspace tools.

This tool is Debian/Ubuntu specific and is typically invoked indirectly via **update-initramfs**. Other distributions use different tools (mkinitcpio on Arch, dracut on Fedora/RHEL).

# CONFIGURATION

```
/etc/initramfs-tools/
├── initramfs.conf    # Main configuration (MODULES, COMPRESS, etc.)
├── modules           # Additional kernel modules to include
├── hooks/            # Scripts to customize initramfs contents
└── scripts/          # Boot scripts for the initramfs environment
```

# CAVEATS

Debian/Ubuntu specific (use mkinitcpio on Arch, dracut on Fedora/RHEL). The kernel version must match installed kernel modules in /lib/modules/. Requires root privileges. Prefer using **update-initramfs** instead of calling mkinitramfs directly, as it handles backup and bootloader integration.

# HISTORY

mkinitramfs is part of **initramfs-tools** developed for Debian-based systems, replacing the older initrd system with a more flexible cpio-based initramfs approach.

# SEE ALSO

[update-initramfs](/man/update-initramfs)(8), [mkinitcpio](/man/mkinitcpio)(8), [dracut](/man/dracut)(8)

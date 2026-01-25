# TLDR

**Generate initramfs for current kernel**

```mkinitramfs -o [/boot/initrd.img]```

**Generate for specific kernel**

```mkinitramfs -o [/boot/initrd.img-5.10.0] [5.10.0-generic]```

**Verbose output**

```mkinitramfs -v -o [/boot/initrd.img]```

**Keep temporary files**

```mkinitramfs -k -o [/boot/initrd.img]```

# SYNOPSIS

**mkinitramfs** [_options_] -o _outfile_ [_version_]

# PARAMETERS

**-o** _file_
> Output file.

**-d** _confdir_
> Config directory.

**-k**
> Keep temporary directory.

**-v**
> Verbose output.

**-c** _compress_
> Compression method.

# DESCRIPTION

**mkinitramfs** creates an initial ramdisk image (initramfs) for Linux. The initramfs contains essential drivers and scripts needed to mount the root filesystem during boot.

This tool is Debian/Ubuntu specific; other distributions use different tools.

# CONFIGURATION

```
/etc/initramfs-tools/
├── initramfs.conf
├── modules
├── hooks/
└── scripts/
```

# CAVEATS

Debian/Ubuntu specific (use mkinitcpio on Arch, dracut on Fedora). Must match kernel version. Requires root privileges.

# HISTORY

mkinitramfs is part of **initramfs-tools** developed for Debian-based systems, replacing the older initrd system with a more flexible initramfs approach.

# SEE ALSO

[update-initramfs](/man/update-initramfs)(8), [mkinitcpio](/man/mkinitcpio)(8), [dracut](/man/dracut)(8), [initramfs](/man/initramfs)(7)

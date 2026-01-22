# TLDR

Show contents of **current kernel** initramfs

```lsinitrd```

Show contents for **specific kernel**

```lsinitrd --kver [kernel_version]```

Show contents of **specific image**

```lsinitrd [path/to/initramfs.img]```

List **included modules**

```lsinitrd --mod```

**Unpack** initramfs to current directory

```lsinitrd --unpack```

# SYNOPSIS

**lsinitrd** [_options_] [_image_]

# DESCRIPTION

**lsinitrd** displays the contents of an initramfs (initial RAM filesystem) image. It lists files, modules, and drivers included in the image, which is essential for troubleshooting boot issues.

# PARAMETERS

**-k, --kver VERSION**
> Show initramfs for specified kernel version

**-m, --mod**
> List included kernel modules

**--unpack**
> Extract initramfs contents to current directory

**-f, --file FILE**
> Show contents of specific file in image

**-l, --list**
> List files in initramfs

# CAVEATS

Part of dracut tools. Initramfs location varies by distribution (/boot or /boot/efi). May require root for some operations.

# SEE ALSO

[dracut](/man/dracut)(8), [mkinitcpio](/man/mkinitcpio)(8), [update-initramfs](/man/update-initramfs)(8)

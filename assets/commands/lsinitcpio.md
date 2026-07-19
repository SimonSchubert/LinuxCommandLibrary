# TAGLINE

examine the contents of an mkinitcpio initramfs image

# TLDR

**List** the files inside an initramfs image

```lsinitcpio /boot/initramfs-linux.img```

**Analyze** an image (kernel version, modules, binaries, early CPIO)

```lsinitcpio --analyze /boot/initramfs-linux.img```

Show the **configuration** the image was built with

```lsinitcpio --config /boot/initramfs-linux.img```

**Extract** the image into the current directory

```lsinitcpio --extract /boot/initramfs-linux.img```

List contents with **verbose** long-style output

```lsinitcpio -v /boot/initramfs-linux.img```

List or extract only the **early CPIO** segment

```lsinitcpio --early /boot/initramfs-linux.img```

List or extract only the **main CPIO** segment

```lsinitcpio --cpio /boot/initramfs-linux.img```

# SYNOPSIS

**lsinitcpio** [*action*] [*options*] *image*

# DESCRIPTION

**lsinitcpio** examines the contents of an initcpio (initramfs) image produced by **mkinitcpio**. Without any action flags it lists the files stored in the image. It is part of the mkinitcpio package on Arch Linux and related distributions and is useful for verifying what hooks, modules, and binaries were included after building an image.

Images may contain an early CPIO archive (microcode, early firmware) followed by the main compressed CPIO. The **--early** and **--cpio** options restrict listing or extraction to one of those segments.

# ACTIONS

**-a**, **--analyze**

> Analyze the image and print a human-readable summary (kernel version, early CPIO presence, included modules and binaries, and similar metadata).

**-c**, **--config**

> Show the configuration file the given image was built with.

**-l**, **--list**

> List the contents of the archive. This is the default action. Pass **-v** for long-style output.

**-x**, **--extract**

> Extract the given image into the current working directory.

# OPTIONS

**-h**, **--help**

> Print a short overview of available command-line switches.

**-n**, **--nocolor**

> Disable color output.

**-V**, **--version**

> Display version information.

**-v**, **--verbose**

> Be more verbose. Shows long-style listing output, and when extracting, prints files as they are written.

**--cpio**

> List or extract only the main CPIO image.

**--early**

> List or extract only the early CPIO image if it exists. See **mkinitcpio**(8) for details on early CPIO images.

# CAVEATS

Requires an initramfs path as an argument (unlike some distro tools that default to the running kernel's image). Extraction writes into the current directory and can overwrite existing files; run from an empty or dedicated directory. Part of the Arch Linux **mkinitcpio** package, not a standalone utility on all distributions.

# SEE ALSO

[mkinitcpio](/man/mkinitcpio)(8), [lsinitrd](/man/lsinitrd)(1), [dracut](/man/dracut)(8), [cpio](/man/cpio)(1)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/archlinux/mkinitcpio/mkinitcpio)```

```[Homepage](https://wiki.archlinux.org/title/Mkinitcpio)```

```[Documentation](https://man.archlinux.org/man/lsinitcpio.1)```

<!-- verified: 2026-07-19 -->

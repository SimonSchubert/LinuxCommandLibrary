# TAGLINE

old kernel removal utility

# TLDR

**List** all kernel files

```sudo eclean-kernel -l```

Keep only **two newest** kernels

```sudo eclean-kernel -n 2```

**Preview** what would be removed

```sudo eclean-kernel -p -n 2```

Remove kernels with **confirmation**

```sudo eclean-kernel -A -n 2```

Remove all kernels **not referenced** by bootloader

```sudo eclean-kernel -a```

Keep two kernels but **preserve config** files

```sudo eclean-kernel -n 2 -x config```

# SYNOPSIS

**eclean-kernel** [_options_]

# DESCRIPTION

**eclean-kernel** removes old kernels in Gentoo Linux. It cleans up kernel images, modules, and related files while preserving a specified number of recent kernels.

Over time, /boot and /lib/modules accumulate old kernel versions from upgrades, consuming significant disk space. This is particularly problematic on systems with small boot partitions. eclean-kernel automatically identifies and removes old kernel files while protecting the running kernel and a configurable number of recent versions.

The tool handles all kernel-related components including the kernel image, System.map, initramfs, config files, module directories, and the source tree. It's safer than manual deletion as it understands kernel dependencies and prevents removing essential files.

# PARAMETERS

**-l, --list-kernels**
> List kernel files and exit

**-n, --num** _NUM_
> Leave only the newest NUM kernels (see **--sort-order**)

**-s, --sort-order** _ORDER_
> Kernel sort order: version (default) or mtime

**-A, --ask**
> Ask before removing each kernel

**-a, --all**
> Remove all kernels unless referenced by bootloader

**-d, --destructive**
> Destructive mode: remove kernels even when referenced by bootloader

**-p, --pretend**
> Print kernels to be removed and exit

**-b, --bootloader** _BOOTLOADER_
> Bootloader used (auto, lilo, grub2, grub, yaboot, symlinks)

**-L, --layout** _LAYOUT_
> /boot layout used (auto, blspec, std)

**-r, --root** _PATH_
> Alternate filesystem root to use

**-x, --exclude** _PARTS_
> Comma-separated kernel parts to keep: systemmap, config, initramfs, modules, build, misc, emptydir

**-M, --no-mount**
> Disable (re-)mounting /boot if necessary

**--no-bootloader-update**
> Do not update bootloader configuration after removal

**--no-kernel-install**
> Do not call kernel-install while removing kernels

**-D, --debug**
> Enable debugging output

# CONFIGURATION

**eclean-kernel.rc**
> Default command-line options in shell syntax, read from the XDG configuration directories (e.g. ~/.config/eclean-kernel.rc, /etc/xdg/eclean-kernel.rc). Command-line options override them.

# CAVEATS

Gentoo-specific. Always keep at least one working kernel. The currently running kernel is protected. Without **-a** or **-n**, only stray files of kernels with no vmlinuz are removed. Kernels referenced by the bootloader are kept even beyond **-n** unless **-d** is given.

# SEE ALSO

[eclean](/man/eclean)(1), [emerge](/man/emerge)(1)

# RESOURCES

```[Source code](https://github.com/gentoo/eclean-kernel)```

```[Documentation](https://wiki.gentoo.org/wiki/Eclean-kernel)```

<!-- verified: 2026-11-09 -->

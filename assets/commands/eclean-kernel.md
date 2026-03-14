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

# SYNOPSIS

**eclean-kernel** [_options_]

# DESCRIPTION

**eclean-kernel** removes old kernels in Gentoo Linux. It cleans up kernel images, modules, and related files while preserving a specified number of recent kernels.

Over time, /boot and /lib/modules accumulate old kernel versions from upgrades, consuming significant disk space. This is particularly problematic on systems with small boot partitions. eclean-kernel automatically identifies and removes old kernel files while protecting the running kernel and a configurable number of recent versions.

The tool handles all kernel-related components including the kernel image, System.map, initramfs, config files, and module directories. It's safer than manual deletion as it understands kernel dependencies and prevents removing essential files.

# PARAMETERS

**-l, --list-kernels**
> List all installed kernels and exit

**-n** _NUM_
> Keep N newest kernels

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

**-x, --exclude** _KERNEL_
> Exclude a specific kernel from removal

**--no-bootloader-update**
> Do not update bootloader configuration after removal

# CAVEATS

Gentoo-specific. Always keep at least one working kernel. The currently running kernel is protected.

# SEE ALSO

[eclean](/man/eclean)(1), [emerge](/man/emerge)(1)

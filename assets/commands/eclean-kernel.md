# TAGLINE

old kernel removal utility

# TLDR

**List** all kernel files

```sudo eclean-kernel -l```

Keep only **two newest** kernels

```sudo eclean-kernel -n 2```

Remove kernels with **confirmation**

```sudo eclean-kernel -a -n 2```

# SYNOPSIS

**eclean-kernel** [_options_]

# DESCRIPTION

**eclean-kernel** removes old kernels in Gentoo Linux. It cleans up kernel images, modules, and related files while preserving a specified number of recent kernels.

Over time, /boot and /lib/modules accumulate old kernel versions from upgrades, consuming significant disk space. This is particularly problematic on systems with small boot partitions. eclean-kernel automatically identifies and removes old kernel files while protecting the running kernel and a configurable number of recent versions.

The tool handles all kernel-related components including the kernel image, System.map, initramfs, config files, and module directories. It's safer than manual deletion as it understands kernel dependencies and prevents removing essential files.

# PARAMETERS

**-l, --list-kernels**
> List all installed kernels

**-n, --num** _n_
> Number of kernels to keep

**-a, --all**
> Ask before each removal

**-p, --pretend**
> Show what would be removed

**--no-mount**
> Don't mount /boot if unmounted

# CAVEATS

Gentoo-specific. Always keep at least one working kernel. The currently running kernel is protected.

# SEE ALSO

[eclean](/man/eclean)(1), [emerge](/man/emerge)(1)

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

Part of the eclean-kernel package.

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

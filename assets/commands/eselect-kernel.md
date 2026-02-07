# TAGLINE

Kernel source symlink manager for Gentoo

# TLDR

**List** available kernel symlink targets

```eselect kernel list```

**Set** the /usr/src/linux symlink

```eselect kernel set [name|number]```

**Show** current kernel symlink

```eselect kernel show```

**Update** symlink to running kernel

```eselect kernel update```

# SYNOPSIS

**eselect kernel** _action_ [_options_]

# DESCRIPTION

**eselect kernel** is a module of the eselect framework that manages the /usr/src/linux symlink on Gentoo systems. This symlink is critical as it determines which kernel source tree is used when building external kernel modules, configuring the kernel, or compiling software that needs kernel headers.

When multiple kernel source versions are installed (common during kernel upgrades or testing), this tool provides an easy way to switch between them without manually recreating the symlink. This is particularly important for maintaining external modules like graphics drivers or virtualization software that must be compiled against the correct kernel sources matching the running or target kernel version.

# PARAMETERS

**list**
> List available kernel sources

**set** _target_
> Set symlink to target

**show**
> Display current symlink target

**update**
> Set symlink to running kernel

# CAVEATS

Gentoo Linux specific. Requires kernel sources to be installed. Changes affect kernel module compilation paths.

# SEE ALSO

[eselect](/man/eselect)(1), [emerge](/man/emerge)(1)

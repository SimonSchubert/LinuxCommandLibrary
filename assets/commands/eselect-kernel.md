# TAGLINE

Kernel source symlink manager for Gentoo

# TLDR

**List** available kernel source targets

```eselect kernel list```

**Set** the /usr/src/linux symlink by number

```eselect kernel set [number]```

**Set** the /usr/src/linux symlink by name

```eselect kernel set [linux-6.1.0-gentoo]```

**Show** current kernel symlink target

```eselect kernel show```

# SYNOPSIS

**eselect kernel** _action_ [_options_]

# PARAMETERS

**list**
> List available kernel sources with numbers, asterisk marks current selection

**set** _target_
> Set /usr/src/linux symlink to target (name or number from list)

**show**
> Display the current symlink target

# DESCRIPTION

**eselect kernel** is a module of the eselect framework that manages the /usr/src/linux symlink on Gentoo systems. This symlink is critical as it determines which kernel source tree is used when building external kernel modules, configuring the kernel, or compiling software that needs kernel headers.

When multiple kernel source versions are installed (common during kernel upgrades or testing), this tool provides an easy way to switch between them without manually recreating the symlink. This is particularly important for maintaining external modules like graphics drivers or virtualization software that must be compiled against the correct kernel sources matching the running or target kernel version.

# CAVEATS

Gentoo Linux specific. Requires kernel sources to be installed via emerge. Changes affect kernel module compilation paths. Does not affect the currently running kernel, only which source tree is pointed to by /usr/src/linux.

# SEE ALSO

[eselect](/man/eselect)(1), [emerge](/man/emerge)(1)

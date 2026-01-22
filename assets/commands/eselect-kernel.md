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

**eselect kernel** manages the /usr/src/linux symlink on Gentoo systems. This symlink determines which kernel source tree is used when building external modules or configuring the kernel.

Part of the eselect framework for system configuration.

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

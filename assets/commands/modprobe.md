# TAGLINE

intelligently adds or removes modules from the Linux kernel

# TLDR

**Dry run** loading a module

```sudo modprobe -n module_name```

**Load** a module into kernel

```sudo modprobe module_name```

**Remove** a module from kernel

```sudo modprobe -r module_name```

Remove module and **dependents**

```sudo modprobe -r --remove-holders module_name```

Show module **dependencies**

```sudo modprobe -D module_name```

Show **configuration**

```modprobe -c```

# SYNOPSIS

**modprobe** [_-v_] [_-n_] [_-r_] [_modulename_] [_parameters_...]

# DESCRIPTION

**modprobe** intelligently adds or removes modules from the Linux kernel. It handles module dependencies automatically using modules.dep and searches for modules in /lib/modules/$(uname -r).

# PARAMETERS

**-v, --verbose**
> Print detailed information about operations

**-n, --dry-run**
> Preview actions without executing them

**-r, --remove**
> Remove module instead of inserting

**-f, --force**
> Force loading despite version mismatch

**-q, --quiet**
> Suppress errors for missing modules

**-b, --use-blacklist**
> Apply blacklist rules from configuration

**-c, --showconfig**
> Display effective configuration

**-D, --show-depends**
> List module dependencies

**--first-time**
> Fail if module already loaded/not loaded

**-i, --ignore-install**
> Ignore install commands in configuration

**-w, --wait=TIMEOUT**
> Wait and retry if module is busy (on removal)

**-S, --set-version**
> Use specified kernel version

**--remove-holders**
> Also remove dependent modules (with -r)

# CONFIGURATION

Configuration files in /etc/modprobe.d/ control module behavior including aliases, options, blacklists, and install/remove commands.

# CAVEATS

Module names treat underscores and dashes interchangeably. Some modules require parameters for proper operation. Blacklisted modules can still be loaded explicitly.

# HISTORY

**modprobe** is part of **kmod**, replacing the older module-init-tools. It provides intelligent module management with automatic dependency resolution.

# SEE ALSO

[lsmod](/man/lsmod)(8), [rmmod](/man/rmmod)(8), [insmod](/man/insmod)(8), [modinfo](/man/modinfo)(8), [depmod](/man/depmod)(8)

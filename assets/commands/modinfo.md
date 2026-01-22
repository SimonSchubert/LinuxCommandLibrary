# TLDR

List **all attributes** of a module

```modinfo module_name```

Show **specific field** only

```modinfo -F author module_name```

Show module **filename**

```modinfo -F filename module_name```

Show module **parameters**

```modinfo -F parm module_name```

Show module **license**

```modinfo -F license module_name```

# SYNOPSIS

**modinfo** [_-0_] [_-F field_] [_-k kernel_] _modulename_|_filename_...

# DESCRIPTION

**modinfo** extracts and displays information from Linux kernel modules. It can show all attributes or specific fields like author, description, license, parameters, and dependencies.

# PARAMETERS

**-F, --field FIELD**
> Show only specified field value

**-k, --set-version VERSION**
> Use modules from specified kernel version

**-b, --basedir DIR**
> Use specified directory as root for modules

**-0, --null**
> Separate field values with NUL instead of newline

**-a, --author**
> Shortcut for -F author

**-d, --description**
> Shortcut for -F description

**-l, --license**
> Shortcut for -F license

**-p, --parameters**
> Shortcut for -F parm

**-n, --filename**
> Shortcut for -F filename

# COMMON FIELDS

**filename**: Path to module file
**author**: Module author
**description**: Module description
**license**: License type (GPL, etc.)
**version**: Module version
**parm**: Module parameters and descriptions
**depends**: Module dependencies
**alias**: Module aliases
**srcversion**: Source version hash

# CAVEATS

Module information is embedded at compile time. Not all modules include all fields. Parameters shown by **parm** can be passed to modprobe.

# HISTORY

**modinfo** is part of **kmod**, the kernel module tools replacing older module-init-tools.

# SEE ALSO

[modprobe](/man/modprobe)(8), [lsmod](/man/lsmod)(8), [insmod](/man/insmod)(8)

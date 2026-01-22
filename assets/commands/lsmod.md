# TLDR

List all **loaded kernel modules**

```lsmod```

List modules and **filter** by name

```lsmod | grep nvidia```

Show modules **sorted by size**

```lsmod | sort -k 2 -n```

# SYNOPSIS

**lsmod**

# DESCRIPTION

**lsmod** shows the status of modules in the Linux kernel. It displays a formatted list from /proc/modules showing module name, size, use count, and dependencies.

# OUTPUT COLUMNS

**Module**: Name of the loaded module
**Size**: Amount of memory used by the module (in bytes)
**Used by**: Number of instances and names of dependent modules

# CAVEATS

The output shows the current state of loaded modules. Modules may be loaded automatically by the kernel or manually via modprobe. The "Used by" count indicates how many things are using the module.

# HISTORY

**lsmod** is part of **kmod**, the Linux kernel module tools. It replaced the older module-init-tools and provides a simple view of /proc/modules.

# SEE ALSO

[modprobe](/man/modprobe)(8), [rmmod](/man/rmmod)(8), [insmod](/man/insmod)(8), [modinfo](/man/modinfo)(8)

# TAGLINE

show the status of modules currently loaded in the Linux kernel

# TLDR

**List all loaded kernel modules**

```lsmod```

**Filter by name**

```lsmod | grep [nvidia]```

**Sort modules by size** (largest first)

```lsmod | sort -k 2 -n -r```

**Count loaded modules**

```lsmod | tail -n +2 | wc -l```

**Find who is using a module**

```lsmod | awk '$1 == "[btusb]" { print $4 }'```

# SYNOPSIS

**lsmod**

# DESCRIPTION

**lsmod** is a trivial program that nicely formats the contents of `/proc/modules`, showing which loadable kernel modules are currently in memory. It takes no arguments (apart from `--help` / `--version` on some distros).

The output has one module per line, with three columns:

- **Module** — name of the module
- **Size** — memory footprint in bytes
- **Used by** — reference count followed by a comma-separated list of modules or subsystems that depend on it

A reference count greater than zero means the module is in use and cannot simply be `rmmod`-ed without unloading its dependents first.

# OUTPUT COLUMNS

**Module**
> Module name as registered with the kernel.

**Size**
> Memory used by the module's code and data, in bytes.

**Used by**
> Use count followed by the names of modules that depend on this module. A dash (`-`) means nothing currently uses it.

# CAVEATS

`lsmod` only reports what the kernel has loaded; built-in modules compiled directly into the kernel image do not appear. For more detail on a specific module (author, license, parameters, dependencies), use `modinfo`.

# HISTORY

**lsmod** originally shipped with the older **modutils**/**module-init-tools** suites. It is now part of **kmod**, the current kernel module userspace tools written by **Lucas De Marchi** and others, which replaced module-init-tools around Linux 3.2.

# SEE ALSO

[modprobe](/man/modprobe)(8), [rmmod](/man/rmmod)(8), [insmod](/man/insmod)(8), [modinfo](/man/modinfo)(8), [depmod](/man/depmod)(8), [kmod](/man/kmod)(8)

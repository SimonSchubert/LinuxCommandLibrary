# TLDR

**List** currently loaded kernel modules

```kmod list```

Display **static device nodes** information

```kmod static-nodes```

# SYNOPSIS

**kmod** [_options_] _command_

# PARAMETERS

**list**
> List currently loaded kernel modules (like lsmod)

**static-nodes**
> Display static device nodes provided by kernel modules

# DESCRIPTION

**kmod** is the central utility for managing Linux kernel modules. It provides a unified interface that is typically accessed through symbolic links with more familiar names.

The following commands are symlinks to kmod:
- **lsmod** - List loaded modules
- **insmod** - Insert module
- **rmmod** - Remove module
- **modprobe** - Load module with dependencies
- **modinfo** - Display module information
- **depmod** - Generate module dependencies

# CAVEATS

Direct kmod usage is rare; symlinked commands are more common. Requires appropriate privileges for loading/unloading modules. Module operations affect entire system.

# HISTORY

kmod replaced the older module-init-tools package starting around **2011**. It was developed by Lucas De Marchi to provide a more maintainable and efficient kernel module management system.

# SEE ALSO

[lsmod](/man/lsmod)(8), [modprobe](/man/modprobe)(8), [insmod](/man/insmod)(8), [rmmod](/man/rmmod)(8), [modinfo](/man/modinfo)(8)

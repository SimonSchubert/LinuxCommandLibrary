# TAGLINE

generate kernel module dependency files

# TLDR

**Generate module dependencies**

```depmod```

**Generate for specific** kernel version

```depmod [5.15.0-generic]```

**Force regeneration** of all maps

```depmod -a```

**Show what would be done**

```depmod -n```

**Generate for modules** in specific directory

```depmod -b [/path/to/root]```

**Show verbose output**

```depmod -v```

# SYNOPSIS

**depmod** [_options_] [_kernel_version_]

# PARAMETERS

_KERNEL_VERSION_
> Kernel version to process (defaults to running kernel).

**-a**, **--all**
> Probe all modules.

**-n**, **--dry-run**
> Show what would be done without writing files.

**-b**, **--basedir** _DIR_
> Use directory as module tree root.

**-e**, **--errsyms**
> Report unresolved symbols.

**-v**, **--verbose**
> Verbose output.

**-w**
> Warn on duplicate modules.

**-C**, **--config** _FILE_
> Use specified configuration file.

**--help**
> Display help information.

# DESCRIPTION

**depmod** generates module dependency files (modules.dep and related files) used by modprobe to load kernel modules and their dependencies automatically. It analyzes all modules in the kernel module directory and determines their interdependencies.

The tool scans module files for exported and required symbols, building a dependency tree. This information allows modprobe to load prerequisite modules automatically when a module is requested.

depmod is typically run automatically during kernel installation or module updates. The generated files are stored in /lib/modules/<kernel_version>/.

# CONFIGURATION

**/etc/depmod.conf** or **/etc/depmod.d/*.conf**
> Configuration files specifying module search paths and overrides.

# CAVEATS

Requires root privileges to write dependency files. Should be run after adding or removing kernel modules. Running kernel modules cannot be unloaded without considering running processes.

# HISTORY

depmod is part of the **kmod** utilities (formerly module-init-tools), used for Linux kernel module management since the early days of loadable kernel modules in the 1990s.

# SEE ALSO

[modprobe](/man/modprobe)(8), [lsmod](/man/lsmod)(8), [insmod](/man/insmod)(8), [rmmod](/man/rmmod)(8)

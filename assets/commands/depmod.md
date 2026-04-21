# TAGLINE

generate kernel module dependency files

# TLDR

**Generate module dependencies** for the running kernel

```depmod```

**Generate for a specific kernel version**

```depmod [6.8.0-generic]```

**Probe all modules** (the default when no filename is given)

```depmod -a```

**Quick mode**: regenerate only if modules are newer than modules.dep

```depmod -A```

**Preview without writing** (prints to stdout)

```depmod -n```

**Use a staging module tree root**

```depmod -b [/path/to/root] [6.8.0-generic]```

**Report unresolved symbols** against a System.map

```depmod -e -F [/boot/System.map-6.8.0] [6.8.0-generic]```

# SYNOPSIS

**depmod** [**-aAenvw**] [**-b** _basedir_] [**-F** _System.map_] [**-C** _config_] [_kernel_version_]

**depmod** [_options_] _module_files_...

# PARAMETERS

_KERNEL_VERSION_
> Kernel version to process. Defaults to the running kernel (`uname -r`).

**-a**, **--all**
> Probe all modules. Enabled by default when no filenames are given.

**-A**, **--quick**
> Exit silently unless a module is newer than modules.dep.

**-b**, **--basedir** _DIR_
> Prepend _DIR_ to /lib/modules/<version>; useful for staging roots.

**-o**, **--outdir** _DIR_
> Write generated files to _DIR_ instead of the module tree.

**-e**, **--errsyms**
> Report symbols a module requires that are not provided by other modules or the kernel.

**-F**, **--filesyms** _System.map_
> Use _System.map_ to resolve kernel-provided symbols when using **-e**.

**-E**, **--symvers** _Module.symvers_
> With **-e**, also report symbol version (modversion) mismatches.

**-n**, **--show**, **--dry-run**
> Print resulting modules.dep and map files to stdout instead of writing them.

**-v**, **--verbose**
> Print each symbol dependency and providing module.

**-w**
> Warn about duplicate dependencies, aliases, or symbol versions.

**-C**, **--config** _FILE_
> Override the default configuration file or directory.

**-V**, **--version**
> Show version and exit.

**-h**, **--help**
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

[modprobe](/man/modprobe)(8), [lsmod](/man/lsmod)(8), [insmod](/man/insmod)(8), [rmmod](/man/rmmod)(8), [kmod](/man/kmod)(8)

# TAGLINE

Reconfigure Void Linux packages

# TLDR

**Reconfigure a package**

```sudo xbps-reconfigure [package_name]```

**Force reconfigure a package**

```sudo xbps-reconfigure -f [package_name]```

**Reconfigure all packages**

```sudo xbps-reconfigure -a```

**Reconfigure kernel**

```sudo xbps-reconfigure -f linux[5.15]```

**Verbose output**

```sudo xbps-reconfigure -v [package_name]```

**Reconfigure in alternate root**

```sudo xbps-reconfigure -r [/mnt] [package_name]```

# SYNOPSIS

**xbps-reconfigure** [_options_] _package_ | **-a**

# PARAMETERS

**-a**, **--all**
> Reconfigure all packages.

**-f**, **--force**
> Force reconfiguration even if already configured.

**-r** _rootdir_
> Use alternate root directory.

**-v**, **--verbose**
> Verbose output.

**-d**, **--debug**
> Debug mode.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# DESCRIPTION

**xbps-reconfigure** runs post-installation configuration scripts for packages on Void Linux. It's used to configure packages that weren't properly configured or to reconfigure after changing configuration files.

The tool is useful for recovering from interrupted installations, reconfiguring after manual config changes, or rebuilding kernel modules. By default, only unconfigured packages are processed; use -f to force reconfiguration.

Common use cases include reconfiguring the kernel after updates, rerunning DKMS module builds, and fixing packages with configuration issues.

# CAVEATS

Void Linux specific (XBPS package manager). Some packages may overwrite manual configuration changes when reconfigured. Kernel reconfiguration requires specifying exact version.

# HISTORY

**xbps-reconfigure** is part of XBPS (X Binary Package System), the package manager developed specifically for Void Linux. XBPS was designed from scratch to be fast, portable, and bug-free, providing a modern alternative to traditional package managers.

# SEE ALSO

[xbps-install](/man/xbps-install)(1), [xbps-remove](/man/xbps-remove)(1), [xbps-query](/man/xbps-query)(1), [xbps-pkgdb](/man/xbps-pkgdb)(1)

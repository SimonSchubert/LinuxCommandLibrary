# TAGLINE

Gentoo system configuration and management tool

# TLDR

List all **available modules**

```eselect modules list```

Display **help** for a specific module

```eselect [module] help```

**List** available options for a module

```eselect [module] list```

**Show** the current setting for a module

```eselect [module] show```

**Set** a target for a module

```sudo eselect [module] set [target]```

Select the active **kernel** sources

```sudo eselect kernel set [number]```

# SYNOPSIS

**eselect** [_global options_] _module_ _action_ [_options_]

# GLOBAL OPTIONS

**--brief**
> Reduce output verbosity.

**--colour=**_yes_|_no_|_auto_
> Control colored output (default: auto).

# DESCRIPTION

**eselect** is Gentoo Linux's multi-purpose configuration and system management tool. It provides a unified, modular framework for managing various system settings that would otherwise require editing configuration files or managing symlinks manually. Common uses include selecting kernel sources, switching compiler versions, managing Java implementations, configuring locales, and setting system profiles.

The tool's modular design means each aspect of system configuration is handled by a dedicated module with consistent syntax (list, set, show, help). This makes system administration more accessible and reduces the risk of configuration errors. Additional modules can be provided by packages, extending eselect's capabilities as needed for specific software.

# PARAMETERS

**list**
> List available options.

**set** _target_
> Set the specified target.

**show**
> Display current setting.

**help**
> Show module help.

**update**
> Refresh configuration if unset or invalid.

**version**
> Display module version.

# COMMON MODULES

**kernel**
> Configure /usr/src/linux symlink.

**profile**
> Manage the make.profile symlink.

**locale**
> Set the LANG environment variable.

**gcc**
> Select active GCC compiler version.

**editor**
> Manage the EDITOR environment variable.

**repository**
> Manage ebuild repositories.

**news**
> Read Gentoo news items.

# CAVEATS

Gentoo Linux specific. Available modules depend on installed packages. Some modules require root privileges.

# SEE ALSO

[eselect-kernel](/man/eselect-kernel)(1), [eselect-locale](/man/eselect-locale)(1), [eselect-profile](/man/eselect-profile)(1), [emerge](/man/emerge)(1)

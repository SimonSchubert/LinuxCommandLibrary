# TAGLINE

Gentoo system configuration and management tool

# TLDR

Display a list of **installed modules**

```eselect```

View documentation for a specific **module**

```tldr eselect [module]```

Display **help** for a specific module

```eselect [module] help```

# SYNOPSIS

**eselect** [_module_] [_action_] [_options_]

# DESCRIPTION

**eselect** is Gentoo Linux's multi-purpose configuration and system management tool. It provides a unified, modular framework for managing various system settings that would otherwise require editing configuration files or managing symlinks manually. Common uses include selecting kernel sources, switching compiler versions, managing Java implementations, configuring locales, and setting system profiles.

The tool's modular design means each aspect of system configuration is handled by a dedicated module with consistent syntax (list, set, show, help). This makes system administration more accessible and reduces the risk of configuration errors. Additional modules can be provided by packages, extending eselect's capabilities as needed for specific software.

# PARAMETERS

**list**
> List available options

**set** _target_
> Set the specified target

**show**
> Display current setting

**help**
> Show module help

# CAVEATS

Gentoo Linux specific. Available modules depend on installed packages. Some modules require root privileges.

# SEE ALSO

[eselect-kernel](/man/eselect-kernel)(1), [eselect-locale](/man/eselect-locale)(1), [eselect-profile](/man/eselect-profile)(1), [emerge](/man/emerge)(1)

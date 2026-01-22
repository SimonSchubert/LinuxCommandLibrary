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

**eselect** is Gentoo's multi-purpose configuration and management tool. It provides a modular framework for managing system configuration like kernel symlinks, compiler versions, locales, and profiles.

Each module handles specific administrative tasks with consistent syntax.

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

# TAGLINE

system-wide locale and language configuration

# TLDR

**List** available locales

```eselect locale list```

**Set** the LANG environment variable by name

```eselect locale set [en_US.utf8]```

**Set** the LANG environment variable by index number

```eselect locale set [4]```

**Display** current LANG value

```eselect locale show```

# SYNOPSIS

**eselect locale** _action_ [_options_]

# DESCRIPTION

**eselect locale** manages the LANG environment variable on Gentoo systems. It sets the system-wide language and locale by modifying /etc/env.d/02locale. After changes, run `env-update && source /etc/profile` to apply.

Part of the eselect framework for system configuration.

# PARAMETERS

**list**
> List available locales.

**set** _target_
> Set LANG to specified locale (by name or index number).

**show**
> Display current LANG setting.

# CAVEATS

Gentoo Linux specific. Locales must be generated first with locale-gen. Changes require running env-update and re-sourcing the profile or re-login to take effect.

# SEE ALSO

[eselect](/man/eselect)(1), [locale](/man/locale)(1), [locale-gen](/man/locale-gen)(8)

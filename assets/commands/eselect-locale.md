# TAGLINE

system-wide locale and language configuration

# TLDR

**List** available locales

```eselect locale list```

**Set** the LANG environment variable

```eselect locale set [name|index]```

**Display** current LANG value

```eselect locale show```

# SYNOPSIS

**eselect locale** _action_ [_options_]

# DESCRIPTION

**eselect locale** manages the $LANG environment variable on Gentoo systems. It sets the system-wide language and locale by modifying /etc/profile.env.

Part of the eselect framework for system configuration.

# PARAMETERS

**list**
> List available locales

**set** _locale_
> Set LANG to specified locale

**show**
> Display current LANG setting

# CAVEATS

Gentoo Linux specific. Locales must be generated first with locale-gen. Changes require re-login to take effect.

# SEE ALSO

[eselect](/man/eselect)(1), [locale](/man/locale)(1), [locale-gen](/man/locale-gen)(8)

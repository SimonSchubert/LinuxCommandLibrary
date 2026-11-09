# TAGLINE

system-wide locale and language configuration

# TLDR

**List** available locales

```eselect locale list```

**Set** the LANG environment variable by name

```eselect locale set [en_US.UTF-8]```

**Set** the LANG environment variable by index number

```eselect locale set [4]```

**Display** current LANG value

```eselect locale show```

# SYNOPSIS

**eselect locale** _action_ [_options_]

# DESCRIPTION

**eselect locale** manages the LANG environment variable on Gentoo systems. It sets the system-wide language and locale by modifying /etc/env.d/02locale, then runs `eselect env update` itself, so only `. /etc/profile` is needed to apply the change to the current shell.

Part of the eselect framework for system configuration.

# PARAMETERS

**list**
> List available targets: C, POSIX and the UTF-8 locales reported by **locale -a**.

**set** _target_
> Set LANG to the specified locale, by name or by index number from **list**. Any other locale name that passes validation is also accepted.

**show**
> Display current LANG setting.

# CAVEATS

Gentoo Linux specific. Locales must be generated first with locale-gen. Already running shells keep the old value until they source /etc/profile or the user logs in again. Requires superuser privileges for **set**.

# SEE ALSO

[eselect](/man/eselect)(1), [locale](/man/locale)(1), [locale-gen](/man/locale-gen)(8)

# RESOURCES

```[Source code](https://gitweb.gentoo.org/proj/eselect.git)```

```[Documentation](https://wiki.gentoo.org/wiki/Project:Eselect)```

<!-- verified: 2026-11-09 -->

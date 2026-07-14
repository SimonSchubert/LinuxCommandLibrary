# TAGLINE

Gentoo system profile management

# TLDR

**List** available profile symlink targets

```eselect profile list```

**Set** the /etc/portage/make.profile symlink

```eselect profile set [name|number]```

**Show** the current system profile

```eselect profile show```

# SYNOPSIS

**eselect profile** _action_ [_options_]

# DESCRIPTION

**eselect profile** manages the /etc/portage/make.profile symlink on Gentoo systems. This symlink determines the system profile, which affects default USE flags, masked packages, and other Portage settings.

Part of the eselect framework for system configuration.

# PARAMETERS

**list**
> List available profiles

**set** _target_
> Set profile symlink to target

**show**
> Display current profile

**--force**
> Allow setting a profile whose target does not currently exist

# CAVEATS

Gentoo Linux specific. Changing profiles affects default USE flags, masks and compiler settings, so run `emerge --update --deep --newuse @world` afterwards to rebuild anything affected. The profile module is part of the base eselect package, unlike the separately packaged repository module.

# SEE ALSO

[eselect](/man/eselect)(1), [eselect-repository](/man/eselect-repository)(1), [emerge](/man/emerge)(1)

# RESOURCES

```[Source code](https://gitweb.gentoo.org/proj/eselect.git/)```

```[Documentation](https://wiki.gentoo.org/wiki/Profile_(Portage))```

<!-- verified: 2026-07-14 -->

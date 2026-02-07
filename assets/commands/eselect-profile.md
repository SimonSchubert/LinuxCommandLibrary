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

# CAVEATS

Gentoo Linux specific. Changing profiles affects package compilation defaults. Run emerge --update --deep --newuse @world after changing profiles.

# SEE ALSO

[eselect](/man/eselect)(1), [emerge](/man/emerge)(1)

# TAGLINE

Run commands in managed chroot environments

# TLDR

**List** available chroots

```schroot --list```

Run **command** in specific chroot

```schroot --chroot chroot_name command```

Run command with **options** in chroot

```schroot --chroot chroot_name command -- command_options```

Run command in **all** chroots

```schroot --all command```

Start **interactive shell** as specific user

```schroot --chroot chroot_name --user user```

**Begin** new session

```schroot --begin-session --chroot chroot_name```

**Connect** to existing session

```schroot --run-session --chroot session_id```

**End** a session

```schroot --end-session --chroot session_id```

# SYNOPSIS

**schroot** [_options_] [_command_]

# PARAMETERS

**--list**
> List available chroots

**--chroot** _name_
> Specify chroot environment

**--user** _user_
> Run as specified user

**--all**
> Run in all available chroots

**--begin-session**
> Start new session

**--run-session**
> Connect to existing session

**--end-session**
> Terminate session

# DESCRIPTION

**schroot** runs commands or starts interactive shells in different root directory environments. It provides more features and customization than basic chroot, including session management and user mapping.

Configured via /etc/schroot/schroot.conf, it supports multiple chroot types and configurations.

# CONFIGURATION

**/etc/schroot/schroot.conf**
> Main configuration file defining available chroot environments, their types, locations, and access permissions.

**/etc/schroot/chroot.d/**
> Directory for individual chroot definition files, allowing modular configuration.

**/etc/schroot/setup.d/**
> Directory containing setup scripts executed when sessions begin and end, handling mount points, networking, and environment preparation.

# CAVEATS

Requires proper chroot configuration. Sessions must be ended to release resources.

# HISTORY

Developed for **Debian** as an improved chroot solution with better security and usability features.

# SEE ALSO

[chroot](/man/chroot)(8), [debootstrap](/man/debootstrap)(8)

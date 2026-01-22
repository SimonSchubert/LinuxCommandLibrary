# TLDR

**Open GDM configuration**

```gdmsetup```

# SYNOPSIS

**gdmsetup** [_options_]

# PARAMETERS

**--help**
> Display help information.

# DESCRIPTION

**gdmsetup** is the graphical configuration tool for GDM (GNOME Display Manager). It provides a GUI for managing login screen settings, including auto-login, user list display, and themes.

The tool modifies GDM's configuration without manual file editing. Settings affect the login screen appearance and behavior for all users.

gdmsetup is typically accessed through GNOME Settings on modern systems.

# CAVEATS

Requires administrative privileges. Deprecated in favor of GNOME Settings. May not be available on all distributions.

# HISTORY

gdmsetup was the traditional GDM configuration tool. Modern GNOME systems integrate GDM settings into the main Settings application, making the standalone tool less common.

# SEE ALSO

[gdm](/man/gdm)(1), [dconf](/man/dconf)(1)

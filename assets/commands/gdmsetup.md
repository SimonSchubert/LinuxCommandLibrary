# TAGLINE

graphical configuration tool for GDM

# TLDR

**Open GDM configuration**

```gdmsetup```

# SYNOPSIS

**gdmsetup** [_options_]

# PARAMETERS

**--help**
> Display help information.

# DESCRIPTION

**gdmsetup** is the legacy graphical configuration tool for GDM (GNOME Display Manager), providing a user-friendly interface for managing login screen settings without manual configuration file editing. It allows administrators to configure options like auto-login for specific users, control which users appear in the login list, customize login screen themes, and adjust session timeout behavior.

The tool presents GDM's configuration options through an intuitive GUI, making it accessible to administrators who prefer graphical tools over command-line configuration. Settings modified through gdmsetup affect the login screen appearance and behavior for all users on the system.

On modern GNOME systems (GNOME 3 and later), gdmsetup has largely been deprecated in favor of integrating GDM configuration directly into the main GNOME Settings application. Many distributions no longer include gdmsetup, instead providing GDM configuration through dconf-editor or system settings panels. For systems that still use it, gdmsetup requires administrative privileges to modify system-wide login settings.

# CAVEATS

Requires administrative privileges. Deprecated in favor of GNOME Settings. May not be available on all distributions.

# HISTORY

gdmsetup was the traditional GDM configuration tool. Modern GNOME systems integrate GDM settings into the main Settings application, making the standalone tool less common.

# SEE ALSO

[gdm](/man/gdm)(1), [dconf](/man/dconf)(1)

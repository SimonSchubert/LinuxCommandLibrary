# TLDR

Open settings **GUI**

```systemsettings```

**List** all KCM modules

```systemsettings --list```

Display **help**

```systemsettings -h```

# SYNOPSIS

**systemsettings** [_OPTIONS_] [_MODULE_]

# PARAMETERS

**--list**
> List all available KCM (KDE Control Module) modules

**-h, --help**
> Display help information

# DESCRIPTION

**systemsettings** is the central configuration program for KDE Plasma desktop. It provides a graphical interface to configure system settings including appearance, workspace behavior, hardware, network, and applications.

Settings are organized into categories with individual KCM modules handling specific configuration areas.

# CAVEATS

Requires KDE Plasma desktop environment. Some modules require root privileges for system-wide changes. Changes take effect immediately or after logout depending on the setting.

# HISTORY

**systemsettings** has been the primary configuration tool for KDE since KDE 4, replacing the earlier KControl application. It continues as the settings interface in KDE Plasma 5 and 6.

# SEE ALSO

[kcmshell5](/man/kcmshell5)(1), [kwriteconfig5](/man/kwriteconfig5)(1)

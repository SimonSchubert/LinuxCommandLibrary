# TAGLINE

Install, list, and remove KDE Plasma 6 packages

# TLDR

**List all available package types**

```kpackagetool6 --list-types```

**Install a package from a directory or file**

```kpackagetool6 -t [Plasma/Applet] -i [path/to/package]```

**Upgrade an installed package**

```kpackagetool6 -t [Plasma/Applet] -u [path/to/package]```

**List installed plasmoids (widgets)**

```kpackagetool6 -t Plasma/Applet -l```

**List globally installed plasmoids (all users)**

```kpackagetool6 -t Plasma/Applet -l -g```

**Remove a plasmoid by name**

```kpackagetool6 -t Plasma/Applet -r "[name]"```

**Show information about an installed package**

```kpackagetool6 -t [Plasma/Applet] -s "[name]"```

# SYNOPSIS

**kpackagetool6** [_options_]

# PARAMETERS

**--list-types**
> List all available package types.

**-t**, **--type** _TYPE_
> Package type (Plasma/Applet, Plasma/Theme, Plasma/Wallpaper, Plasma/LookAndFeel, etc.).

**-i**, **--install** _PATH_
> Install package from a directory or file.

**-u**, **--upgrade** _PATH_
> Upgrade an existing package.

**-r**, **--remove** _NAME_
> Remove an installed package.

**-l**, **--list**
> List installed packages of the given type.

**-s**, **--show** _NAME_
> Show information about an installed package.

**-g**, **--global**
> Operate on global (system-wide) packages.

**-p**, **--packageroot** _PATH_
> Absolute path to the package root instead of standard data directories.

**--appstream-metainfo** _PATH_
> Output AppStream metadata for the package.

# DESCRIPTION

**kpackagetool6** manages KDE Plasma 6 packages including plasmoids (widgets), themes, wallpapers, KWin scripts, and other Plasma components. It is the KDE Frameworks 6 version of the package management tool.

Package types include Plasma/Applet (widgets), Plasma/Theme, Plasma/Wallpaper, Plasma/LookAndFeel, KWin/Script, and more. User packages are stored in `~/.local/share/plasma/`. It manages packages installed via KPackage or store.kde.org, not system packages from distribution repositories.

# CAVEATS

KDE 6 specific; for KDE 5 use kpackagetool5. Some packages may require Plasma restart to take effect. Global installation requires root privileges.

# HISTORY

kpackagetool6 is part of KDE Frameworks 6, the successor to KDE Frameworks 5. It continues the modular package management system for Plasma components.

# SEE ALSO

[kpackagetool5](/man/kpackagetool5)(1)

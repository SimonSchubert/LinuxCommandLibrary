# TLDR

**List** all known package types

```kpackagetool6 --list-types```

**Install** a package from directory

```kpackagetool6 -t [package_type] -i [path/to/directory]```

**Update** an installed package

```kpackagetool6 -t [package_type] -u [path/to/directory]```

**List** installed plasmoids

```kpackagetool6 -t Plasma/Applet -l```

List **global** plasmoids (all users)

```kpackagetool6 -t Plasma/Applet -l -g```

**Remove** a plasmoid by name

```kpackagetool6 -t Plasma/Applet -r "[name]"```

# SYNOPSIS

**kpackagetool6** [_options_]

# PARAMETERS

**--list-types**
> List all available package types

**-t**, **--type** _TYPE_
> Package type (Plasma/Applet, Plasma/Theme, etc.)

**-i**, **--install** _PATH_
> Install package from directory

**-u**, **--upgrade** _PATH_
> Update existing package

**-r**, **--remove** _NAME_
> Remove installed package

**-l**, **--list**
> List installed packages

**-g**, **--global**
> Operate on global (system-wide) packages

# DESCRIPTION

**kpackagetool6** manages KDE Plasma 6 packages including plasmoids (widgets), themes, wallpapers, and other Plasma components. It is the KDE 6 version of the package management tool.

Package types include Plasma/Applet (widgets), Plasma/Theme, Plasma/Wallpaper, Plasma/LookAndFeel, and more. User packages are stored in ~/.local/share/plasma/.

# CAVEATS

KDE 6 specific; for KDE 5 use kpackagetool5. Some packages may require Plasma restart to take effect. Global installation requires root privileges.

# HISTORY

kpackagetool6 is part of KDE Frameworks 6, the successor to KDE Frameworks 5. It continues the modular package management system for Plasma components.

# SEE ALSO

[kpackagetool5](/man/kpackagetool5)(1), [plasmapkg2](/man/plasmapkg2)(1)

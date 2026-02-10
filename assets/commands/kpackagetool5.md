# TAGLINE

manages KDE Plasma packages including plasmoids, themes, wallpapers

# TLDR

**List** all known package types

```kpackagetool5 --list-types```

**Install** a package from directory

```kpackagetool5 -t [package_type] -i [path/to/directory]```

**Update** an installed package

```kpackagetool5 -t [package_type] -u [path/to/directory]```

**List** installed plasmoids

```kpackagetool5 -t Plasma/Applet -l```

List **global** plasmoids (all users)

```kpackagetool5 -t Plasma/Applet -l -g```

**Remove** a plasmoid by name

```kpackagetool5 -t Plasma/Applet -r "[name]"```

# SYNOPSIS

**kpackagetool5** [_options_]

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

**kpackagetool5** manages KDE Plasma packages including plasmoids (widgets), themes, wallpapers, and other Plasma components. It handles installation, removal, and listing of packages.

Package types include Plasma/Applet (widgets), Plasma/Theme, Plasma/Wallpaper, Plasma/LookAndFeel, and more. User packages are stored in ~/.local/share/plasma/.

# CAVEATS

KDE 5 specific; KDE 6 uses kpackagetool6. Some packages may require Plasma restart to take effect. Global installation requires root privileges.

# HISTORY

kpackagetool5 is part of KDE Frameworks 5, providing package management for Plasma's modular component system. It enables users to extend Plasma with community-created content.

# SEE ALSO

[kpackagetool6](/man/kpackagetool6)(1), [plasmapkg2](/man/plasmapkg2)(1)

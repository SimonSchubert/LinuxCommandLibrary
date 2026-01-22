# TLDR

**Install** application to menu

```xdg-desktop-menu install [path/to/file.desktop]```

Install **without vendor** check

```xdg-desktop-menu install --novendor [path/to/file.desktop]```

**Uninstall** from menu

```xdg-desktop-menu uninstall [path/to/file.desktop]```

**Force update** menu

```xdg-desktop-menu forceupdate --mode [user|system]```

# SYNOPSIS

**xdg-desktop-menu** _COMMAND_ [_OPTIONS_] [_FILE_]

# PARAMETERS

**install** _FILE_
> Install desktop file to menu system

**uninstall** _FILE_
> Remove desktop file from menu system

**forceupdate**
> Force menu system to update

**--novendor**
> Disable vendor prefix check

**--mode** _MODE_
> Specify user or system mode

# DESCRIPTION

**xdg-desktop-menu** installs and uninstalls desktop menu items conforming to the FreeDesktop.org Desktop Entry Specification. It handles the registration of applications with the desktop menu system.

The tool is part of the xdg-utils package that provides standardized desktop integration utilities.

# CAVEATS

Requires valid .desktop files. Menu system must be XDG compliant. Changes may require logout or menu refresh to appear.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [xdg-mime](/man/xdg-mime)(1), [desktop-file-validate](/man/desktop-file-validate)(1)

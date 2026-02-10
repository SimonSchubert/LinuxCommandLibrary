# TAGLINE

launches applications using their

# TLDR

**Launch** an application

```gtk-launch [Application_name]```

Display **help**

```gtk-launch -h```

# SYNOPSIS

**gtk-launch** _application_ [_URI_...]

# PARAMETERS

_application_
> Desktop file name (without .desktop extension)

_URI..._
> Optional URIs/files to open with the application

**-h**, **--help**
> Display help message

# DESCRIPTION

**gtk-launch** launches applications using their .desktop files from standard XDG locations (/usr/share/applications, ~/.local/share/applications, etc.). This is the programmatic equivalent of clicking an application icon.

The application parameter is the desktop file ID (filename without .desktop extension). For example, **gtk-launch firefox** launches the application defined in firefox.desktop.

This is useful for launching applications from scripts in a desktop-agnostic way, respecting the application's StartupNotify, exec parameters, and other desktop file settings.

# CAVEATS

Only works with applications that have .desktop files. Application names are case-sensitive and must match the desktop file name exactly (without extension). Requires GTK libraries to be installed.

# HISTORY

gtk-launch is part of GTK's command-line tools, providing a standard way to launch desktop applications. It supports the XDG Desktop Entry Specification for cross-desktop compatibility.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [gio](/man/gio)(1), [desktop-file-validate](/man/desktop-file-validate)(1)

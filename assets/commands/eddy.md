# TAGLINE

Debian package installer for elementary OS

# TLDR

**Install** a .deb package file

```eddy [package.deb]```

**Install** multiple .deb packages at once

```eddy [package1.deb] [package2.deb]```

**Launch** the graphical installer

```eddy```

# SYNOPSIS

**eddy** [_options_] [_files_]

# PARAMETERS

**--debug**
> Enable debug output for troubleshooting.

# DESCRIPTION

**eddy** is a graphical Debian package installer designed for elementary OS. It provides a simple GTK-based interface to install, update, uninstall, and view information about .deb packages. It uses PackageKit as its backend, which also provides limited support for other package formats like .rpm.

The application is intended as a user-friendly alternative to command-line package management for handling individual package files downloaded outside of the system package manager.

# CAVEATS

Designed primarily for elementary OS but may work on other GTK-based distributions. Requires PackageKit for its backend. Not a full package manager replacement; intended for installing individual package files.

# SEE ALSO

[dpkg](/man/dpkg)(1), [apt](/man/apt)(1), [gdebi](/man/gdebi)(1)
# TAGLINE

Build MIME type cache for desktop applications

# TLDR

**Update the MIME type cache** for the default directories

```sudo update-desktop-database```

**Update cache for a specific directory**

```update-desktop-database [path/to/applications]```

**Update in quiet mode** (suppress output)

```update-desktop-database -q```

**Update with verbose output**

```update-desktop-database -v```

**Update after installing a new .desktop file**

```sudo update-desktop-database /usr/share/applications```

# SYNOPSIS

**update-desktop-database** [**-q**|**--quiet**] [**-v**|**--verbose**] [_DIRECTORY_...]

# PARAMETERS

**-q**, **--quiet**
> Do not display any information about processing and updating progress.

**-v**, **--verbose**
> Display detailed information about processing and updating progress.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**update-desktop-database** builds a cache database of MIME types handled by desktop files. The cache contains a mapping between MIME types and the desktop files (applications) that can handle them.

This cache enables applications to quickly find which programs can open files of a specific MIME type without parsing every .desktop file on the system. The cache is stored in mimeinfo.cache within each applications directory.

If no directory is specified, the command processes desktop files in the standard XDG data directories ($XDG_DATA_DIRS/applications), typically /usr/share/applications and /usr/local/share/applications.

The command should be run after installing, removing, or modifying .desktop files to ensure the MIME type associations are current. Package managers typically run this automatically during software installation.

# CAVEATS

Invalid MIME types in desktop files are silently ignored. The cache only determines which applications can handle a MIME type; the preferred application order is controlled by external mechanisms like xdg-mime or desktop environment settings. Running without appropriate permissions for system directories will fail.

# HISTORY

**update-desktop-database** is part of the **desktop-file-utils** package from the **freedesktop.org** project. It was developed to support the Desktop Entry Specification, which standardizes how applications are described and launched in Linux desktop environments. The tool has been a standard component of Linux desktop systems since the early **2000s**.

# SEE ALSO

[update-mime-database](/man/update-mime-database)(1), [desktop-file-validate](/man/desktop-file-validate)(1), [xdg-mime](/man/xdg-mime)(1), [xdg-open](/man/xdg-open)(1)

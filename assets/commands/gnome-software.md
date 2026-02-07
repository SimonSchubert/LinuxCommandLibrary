# TAGLINE

GNOME graphical software manager

# TLDR

Launch the **GNOME Software GUI**

```gnome-software```

Launch and navigate to a **specific page**

```gnome-software --mode [updates|updated|installed|overview]```

Launch and view **details** of a specific package

```gnome-software --details [package]```

Display **version**

```gnome-software --version```

# SYNOPSIS

**gnome-software** [_options_]

# PARAMETERS

**--mode** _MODE_
> Start on specific page: updates, updated, installed, overview

**--details** _PACKAGE_
> Show details for specified package

**--search** _QUERY_
> Open with search results for query

**--install** _PACKAGE_
> Prompt to install specified package

**--local-filename** _FILE_
> Install from local package file

**--details-pkg** _PKGNAME_
> Show details by package name (not app ID)

# DESCRIPTION

**gnome-software** is GNOME's graphical application for managing software. It provides a user-friendly interface for browsing, installing, removing, and updating applications.

The application aggregates software from multiple sources including distribution repositories (via PackageKit), Flatpak, and Snap, presenting them in a unified app store interface. It also handles system and firmware updates (via fwupd).

# CAVEATS

Requires PackageKit, Flatpak, or Snap backends to be configured. Initial startup may be slow while loading metadata. Some repository operations require authentication via PolicyKit.

# HISTORY

gnome-software was introduced in GNOME 3.10 (**2013**) as a redesigned software center, replacing the older Ubuntu Software Center on GNOME-based distributions. It has evolved to support multiple package formats and provide a modern app store experience.

# SEE ALSO

[flatpak](/man/flatpak)(1), [snap](/man/snap)(1), [dnf](/man/dnf)(8), [apt](/man/apt)(8)

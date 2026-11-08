# TAGLINE

Interactive Slackware package management tool

# TLDR

Launch **interactive** package tool

```sudo pkgtool```

**Install** packages from a directory without the menu

```sudo pkgtool --source_dir [path/to/packages]```

Install only selected **series**

```sudo pkgtool --source_dir [path/to/packages] --sets [a#ap#d]```

Install while **ignoring tagfiles**

```sudo pkgtool --source_dir [path/to/packages] --ignore-tagfiles```

Install into an **alternate root**

```sudo pkgtool --source_dir [path/to/packages] --target_dir [/mnt]```

# SYNOPSIS

**pkgtool** [_options_]

# DESCRIPTION

**pkgtool** is an interactive menu-driven tool for managing Slackware packages. It provides a ncurses-based interface for installing, removing, and viewing packages.

# PARAMETERS

**--sets** _list_
> Package series to install, separated by #

**--source_dir** _dir_
> Directory containing the packages to install

**--target_dir** _dir_
> Root directory to install into

**--source_device** _device_
> Device holding the packages

**--source-mounted**
> Treat the package source as already mounted

**--ignore-tagfiles**
> Ignore tagfiles and install every package in the selected series

**--tagfile** _name_
> Use an alternate tagfile name

# CAVEATS

For command-line package management, use installpkg, removepkg, and upgradepkg directly. pkgtool requires a terminal capable of displaying ncurses dialogs.

# HISTORY

**pkgtool** is part of the Slackware package management system, providing a user-friendly interface for managing packages on Slackware Linux.

# SEE ALSO

[installpkg](/man/installpkg)(8), [removepkg](/man/removepkg)(8), [upgradepkg](/man/upgradepkg)(8), [makepkg](/man/makepkg)(8)

# TLDR

Launch **interactive** package tool

```sudo pkgtool```

**Remove** packages interactively

```sudo pkgtool --remove_menu```

**View** installed packages

```pkgtool --view_menu```

**Install** packages from current directory

```sudo pkgtool --install_menu```

**Setup** packages (run installation scripts)

```sudo pkgtool --setup_menu```

# SYNOPSIS

**pkgtool** [_options_]

# DESCRIPTION

**pkgtool** is an interactive menu-driven tool for managing Slackware packages. It provides a ncurses-based interface for installing, removing, and viewing packages.

# PARAMETERS

**--remove_menu**
> Open the remove packages menu

**--view_menu**
> Open the view installed packages menu

**--install_menu**
> Open the install packages menu (from current directory)

**--setup_menu**
> Open the setup menu (runs doinst.sh scripts)

# CAVEATS

For command-line package management, use installpkg, removepkg, and upgradepkg directly. pkgtool requires a terminal capable of displaying ncurses dialogs.

# HISTORY

**pkgtool** is part of the Slackware package management system, providing a user-friendly interface for managing packages on Slackware Linux.

# SEE ALSO

[installpkg](/man/installpkg)(8), [removepkg](/man/removepkg)(8), [upgradepkg](/man/upgradepkg)(8), [makepkg](/man/makepkg)(8)

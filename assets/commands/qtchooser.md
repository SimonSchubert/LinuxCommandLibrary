# TAGLINE

Switch between multiple Qt installations

# TLDR

**List** available Qt versions

```qtchooser --list-versions```

Print **environment** info

```qtchooser --print-env```

**Run tool** with specific Qt version

```qtchooser --run-tool=[qmake] --qt=[5]```

**Install** Qt version entry

```qtchooser --install [version_name] [path/to/qmake]```

Display **help**

```qtchooser --help```

# SYNOPSIS

**qtchooser** [**--list-versions**] [**--print-env**] [**--run-tool** _tool_ **--qt** _version_] [**--install** _name_ _path_]

# PARAMETERS

**--list-versions**
> List available Qt versions

**--print-env**
> Print Qt environment variables

**--run-tool _tool_**
> Run specified Qt tool

**--qt _version_**
> Select Qt version to use

**--install _name_ _path_**
> Register a Qt installation

# DESCRIPTION

**qtchooser** manages multiple Qt installations on a system. It allows developers to switch between different Qt versions (Qt4, Qt5, Qt6) for building applications.

The tool wraps Qt development binaries (qmake, moc, uic, etc.) and directs them to the selected Qt installation based on configuration files or command-line options.

# CONFIGURATION

**/usr/share/qtchooser/**
> System-wide Qt version configuration files, each specifying bin and lib paths for a Qt installation.

**~/.config/qtchooser/**
> User-level Qt version configuration files overriding system defaults.

**QT_SELECT**
> Environment variable selecting the default Qt version (e.g., qt5, qt6).

# CAVEATS

Not all distributions use qtchooser.

# HISTORY

**qtchooser** was created to handle the transition between Qt4 and Qt5 on Linux systems, allowing both versions to coexist while maintaining compatibility with build systems.

# SEE ALSO

[qmake](/man/qmake)(1), [moc](/man/moc)(1), [qt-select](/man/qt-select)(1)

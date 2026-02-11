# TAGLINE

Switch between Qt installation versions

# TLDR

**Show current Qt version**

```qtchooser -print-env```

**List available versions**

```qtchooser -l```

**Select Qt version**

```export QT_SELECT=[qt5]```

**Run tool with specific Qt**

```qtchooser -run-tool=[qmake] -qt=[5]```

# SYNOPSIS

**qtchooser** [_options_]

# PARAMETERS

**-l**, **--list-versions**
> List available Qt versions.

**-print-env**
> Print environment settings.

**-run-tool=**_tool_
> Run specific tool.

**-qt=**_version_
> Select Qt version.

# DESCRIPTION

**qtchooser** (or qt-select) allows switching between multiple Qt installations. It manages which Qt version's tools (qmake, moc, etc.) are used by default.

# EXAMPLES

```bash
# List available
qtchooser -l

# Show current
qtchooser -print-env

# Use Qt 5
export QT_SELECT=qt5
qmake --version

# Use Qt 6
export QT_SELECT=qt6
qmake --version

# Run specific qmake
qtchooser -run-tool=qmake -qt=5 --version
```

# CONFIGURATION

**/usr/share/qtchooser/**
> System-wide Qt version configuration files, each specifying bin and lib paths for a Qt installation.

**~/.config/qtchooser/**
> User-level Qt version configuration files overriding system defaults.

**QT_SELECT**
> Environment variable selecting the default Qt version (e.g., qt5, qt6).

**QTCHOOSER_NO_GLOBAL_DIR**
> Environment variable to ignore system-wide configuration directory when set to 1.

# CAVEATS

Not available on all distributions. May conflict with manually installed Qt. Use environment variable for persistent selection.

# HISTORY

qtchooser was created to manage multiple Qt installations on Linux systems with distribution packaging.

# SEE ALSO

[qmake](/man/qmake)(1), [update-alternatives](/man/update-alternatives)(1), [qt](/man/qt)(1)

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

```bash
# System configs
/usr/share/qtchooser/

# User config
~/.config/qtchooser/

# Config file format (qt5.conf):
/usr/lib/qt5/bin
/usr/lib/qt5/lib
```

# ENVIRONMENT

```bash
QT_SELECT=qt5     # Default version
QTCHOOSER_NO_GLOBAL_DIR=1  # Ignore system configs
```

# CAVEATS

Not available on all distributions. May conflict with manually installed Qt. Use environment variable for persistent selection.

# HISTORY

qtchooser was created to manage multiple Qt installations on Linux systems with distribution packaging.

# SEE ALSO

[qmake](/man/qmake)(1), [update-alternatives](/man/update-alternatives)(1), [qt](/man/qt)(1)

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

**-install** [**-f**] [**-local**] _name_ _path-to-qmake_
> Create a configuration entry for a Qt installation.

# DESCRIPTION

**qtchooser** switches between multiple Qt installations. It is usually reached through symlinks named after tools such as qmake and moc, and it picks the Qt version from **-qt=**, **QT_SELECT**, or the default configuration. There is no separate **qt-select** program; selection is done with **qtchooser** and the **QT_SELECT** variable.

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

**/etc/xdg/qtchooser/*.conf**
> System-wide configuration files. Each has two lines: the path to the binaries, then the path to the libraries. **default.conf** is used when nothing else is selected.

**~/.config/qtchooser/*.conf**
> User-level configuration files.

**QT_SELECT**
> Environment variable selecting the default Qt version (e.g., qt5, qt6).

**QTCHOOSER_RUNTOOL**
> Environment variable naming the tool to run, same as **-run-tool**.

**QTCHOOSER_NO_GLOBAL_DIR**
> When set, ignores the search paths compiled in with **QTCHOOSER_GLOBAL_DIR**, which some distributions use (for example /usr/share/qtchooser).

# CAVEATS

Not available on all distributions. A version can only be selected if a matching .conf file exists, and Qt 6 packages commonly install versioned tools such as **qmake6** instead of using qtchooser.

# HISTORY

qtchooser was written by **Thiago Macieira** of Intel to manage multiple Qt installations, such as Qt 4 and Qt 5 side by side.

# SEE ALSO

[qmake](/man/qmake)(1), [update-alternatives](/man/update-alternatives)(1), [qt](/man/qt)(1)

# RESOURCES

```[Source code](https://code.qt.io/cgit/qtsdk/qtchooser.git)```

<!-- verified: 2026-11-08 -->

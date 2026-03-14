# TAGLINE

command-line tool for querying KScreen display configuration

# TLDR

Show **output information**

```kscreen-console outputs```

Show **configuration file paths**

```kscreen-console config```

Output configuration as **JSON**

```kscreen-console json```

**Monitor** for display changes

```kscreen-console monitor```

Generate **bug report** data

```kscreen-console bug```

Display **help**

```kscreen-console --help```

# SYNOPSIS

**kscreen-console** [_command_] [_options_]

# DESCRIPTION

**kscreen-console** is a command-line tool for querying KScreen's display configuration on KDE Plasma. It provides diagnostic information about connected outputs, configuration files, and display changes. It communicates via DBus with the running KScreen service.

# PARAMETERS

**outputs**
> Show KScreen output information and configuration.

**config**
> Show paths to KScreen configuration files.

**json**
> Show current configuration in JSON format.

**monitor**
> Monitor for display configuration changes.

**bug**
> Generate output suitable for bug reports.

**-v**, **--version**
> Show version information.

**--help-all**
> Display help including Qt-specific options.

**-h**, **--help**
> Display help information.

# CAVEATS

Requires an active KDE Plasma session with KScreen enabled. Communicates via DBus with the running KScreen service.

# SEE ALSO

[kscreen-doctor](/man/kscreen-doctor)(1), [xrandr](/man/xrandr)(1)

# TAGLINE

filters and displays entries from the pacman log file

# TLDR

Show the **whole pacman log**

```paclog```

Read a **different log file**

```paclog --log [path/to/pacman.log]```

Show only the **pacman commands** that were run

```paclog --commandline```

Show everything that happened to **one package**

```paclog --package [package_name]```

Show only **installations**

```paclog --action install```

Show only **removals**

```paclog --action remove```

Show only **errors, warnings and notes**

```paclog --warnings```

Limit the output to entries **after a date**

```paclog --after [2026-01-01]```

Limit the output to entries **before a date**

```paclog --before [2026-06-01]```

Filter the log with a **regular expression**

```paclog --grep [pattern]```

Reconstruct the **installed package list** from the log

```paclog --pkglist```

# SYNOPSIS

**paclog** [_options_]

# PARAMETERS

**--commandline**
> Show command-line entries from log

**--package _name_**
> Filter entries for a specific package

**--action _type_**
> Filter by action: install, reinstall, upgrade, downgrade, remove, all

**--warnings**
> Show only warnings, errors, and notes

**--pkglist**
> List packages that are currently installed according to log

**--after _date_**
> Show entries after specified date

**--before _date_**
> Show entries before specified date

**--logfile _file_**
> Use alternate log file

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**paclog** filters and displays entries from the pacman log file (/var/log/pacman.log). It provides structured access to package management history, making it easy to see when packages were installed, upgraded, or removed.

Part of the **pacutils** collection, paclog can filter by package name, action type, date range, or severity level. This is useful for troubleshooting system issues by reviewing recent package changes or tracking the history of a specific package.

The **--pkglist** option reconstructs the current installed package list by replaying the log, useful for verification or recovery scenarios.

# CAVEATS

Depends on an intact pacman.log file. Log rotation or clearing will lose historical data. Part of the pacutils package (not installed by default on Arch). Date parsing requires specific formats.

# SEE ALSO

[pacman](/man/pacman)(8), [pactree](/man/pactree)(8), [pacsift](/man/pacsift)(1), [pacinfo](/man/pacinfo)(1)

# TLDR

Display the **entire pacman log**

```paclog```

Display pacman-style logged **commandline entries**

```paclog --commandline```

Display log events for a **specific package**

```paclog --package [package_name]```

Display package actions of a **specific type**

```paclog --action [install|reinstall|upgrade|downgrade|remove|all]```

Display only **errors, warnings, and notes**

```paclog --warnings```

Display the list of **installed packages** according to the log

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

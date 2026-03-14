# TAGLINE

generates reports about installed packages and system state

# TLDR

Generate a **summary** of installed packages

```pacreport```

List **unowned files**

```pacreport --unowned-files```

List **missing** package files

```pacreport --missing-files```

Search for **unmerged backup files** (.pacnew, .pacsave) in /etc

```pacreport --backups```

Display packages in a **group** that are not installed

```pacreport --group group_name```

# SYNOPSIS

**pacreport** [_options_]

# PARAMETERS

**--unowned-files**
> List files not owned by any package

**--missing-files**
> List files that should exist but are missing

**--backups**
> Find unmerged backup files in /etc

**--group** _name_
> Show uninstalled packages from specified group

**--config** _path_
> Set an alternate pacman configuration file

**--dbpath** _path_
> Set an alternate database location

**--root** _path_
> Set an alternate installation root

**--cachedir** _path_
> Set an alternate package cache location

# DESCRIPTION

**pacreport** generates reports about installed packages and system state. By default it produces a summary including packages sorted by size, optional dependencies, and group membership. It can also identify unowned files, missing package files, and pending configuration merges (.pacnew/.pacsave files).

This tool is useful for system maintenance and cleanup tasks on Arch Linux systems.

# CAVEATS

Scanning for unowned files can be slow on systems with many files. The tool only examines paths typically managed by packages. The **--unowned-files** option does not check inside home directories or temporary directories.

# HISTORY

Part of **pacutils**, a collection of utilities for Arch Linux package management built on libalpm.

# SEE ALSO

[pacman](/man/pacman)(8), [pacdiff](/man/pacdiff)(1), [pactree](/man/pactree)(1)

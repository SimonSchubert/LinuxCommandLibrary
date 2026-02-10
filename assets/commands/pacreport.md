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

# DESCRIPTION

**pacreport** generates reports about installed packages and system state. It can identify orphaned files, missing package files, pending configuration merges, and group membership status.

This tool is useful for system maintenance and cleanup tasks on Arch Linux systems.

# CAVEATS

Scanning for unowned files can be slow on systems with many files. The tool only examines paths typically managed by packages.

# HISTORY

Part of **pacutils**, a collection of utilities for Arch Linux package management built on libalpm.

# SEE ALSO

[pacman](/man/pacman)(8), [pacdiff](/man/pacdiff)(1)

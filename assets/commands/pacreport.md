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

```pacreport --group=[group_name]```

# SYNOPSIS

**pacreport** [_options_]

# PARAMETERS

**--unowned-files**
> List files not owned by any package

**--missing-files**
> List files that should exist but are missing

**--backups**
> Search for .pacsave, .pacorig and .pacnew files. Pass twice to search outside /etc

**--group**=_name_
> Show uninstalled packages from specified group. May be given multiple times

**--optional-for**
> Show which packages optionally depend on listed packages

**--optional-deps**
> Take optional dependencies into account when listing unneeded packages and dependency loops

**--config**=_path_
> Set an alternate pacman configuration file

**--dbpath**=_path_
> Set an alternate database location

**--root**=_path_
> Set an alternate installation root

**--sysroot**=_path_
> Set an alternate system root

**--dbext**=_extension_
> Set an alternate sync database extension

**--cachedir**=_path_
> Set an alternate package cache location

# DESCRIPTION

**pacreport** generates reports about installed packages and system state. By default it lists unneeded packages installed explicitly or as dependencies, unneeded packages in dependency cycles, installed packages not in a repository, and cache directory sizes. Package sizes include dependencies not needed by other packages. It can also identify unowned files, missing package files, and pending configuration merges (.pacnew/.pacsave files).

This tool is useful for system maintenance and cleanup tasks on Arch Linux systems.

# CAVEATS

Scanning for unowned files can be slow on systems with many files. Paths to skip with **--unowned-files** are set through **IgnoreUnowned** and **PkgIgnoreUnowned** in **/etc/pacreport.conf**.

# HISTORY

Part of **pacutils**, a collection of utilities for Arch Linux package management built on libalpm.

# SEE ALSO

[pacman](/man/pacman)(8), [pacdiff](/man/pacdiff)(1), [pactree](/man/pactree)(1)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

<!-- verified: 2026-11-09 -->

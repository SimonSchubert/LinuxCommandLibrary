# TAGLINE

synchronizes pacman package databases with remote repositories

# TLDR

Update **all** sync databases

```sudo pacsync```

Update **specific** repositories

```sudo pacsync [repo1] [repo2]```

**Force** update even if up-to-date

```sudo pacsync --force```

Use specific **config** file

```sudo pacsync --config=[path/to/pacman.conf]```

Return true only if database **was updated**

```sudo pacsync --updated```

# SYNOPSIS

**pacsync** [_options_] [_syncdb_...]

# PARAMETERS

**--config=**_path_
> Use alternate pacman configuration file

**--dbext=**_extension_
> Set an alternate sync database extension

**--dbpath=**_path_
> Use alternate database location

**--logfile=**_path_
> Set an alternate log file path

**--no-timeout**
> Disable low-speed timeouts for downloads

**--root=**_path_
> Set an alternate installation root

**--sysroot=**_path_
> Set an alternate system root

**--debug**
> Display additional debugging information

**--force**
> Force database sync even if up-to-date

**--updated**
> Exit successfully only if a database was actually updated

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pacsync** synchronizes pacman package databases with remote repositories. It is part of the pacutils collection of utilities that provide enhanced functionality for pacman.

When run without arguments, it updates all configured sync databases. Specific repositories can be targeted by providing their names as arguments. The --updated flag is useful for scripts that need to know if updates are actually available.

# CAVEATS

Requires root privileges to update system databases. Uses pacman's configuration for repository and mirror settings. Part of the pacutils package, not installed by default. Installing packages after a sync without a full upgrade results in a partial upgrade, which Arch Linux does not support.

# HISTORY

**pacsync** was created by **Andrew Gregory** as part of **pacutils**, a collection of helper utilities for pacman. It provides a simpler interface for database synchronization than calling pacman directly.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-08 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pactrans](/man/pactrans)(1), [pacinstall](/man/pacinstall)(1)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

```[Documentation](https://man.archlinux.org/man/pacsync.1)```

<!-- verified: 2026-11-08 -->

# TLDR

Update **all** sync databases

```sudo pacsync```

Update **specific** repositories

```sudo pacsync [repo1] [repo2]```

**Force** update even if up-to-date

```sudo pacsync --force```

Use specific **config** file

```sudo pacsync --config [path/to/pacman.conf]```

Return true only if database **was updated**

```sudo pacsync --updated```

# SYNOPSIS

**pacsync** [**--config** _file_] [**--dbpath** _path_] [**--force**] [**--updated**] [_repository_...]

# PARAMETERS

**--config _file_**
> Use alternate pacman configuration file

**--dbpath _path_**
> Use alternate database location

**--force**
> Force database sync even if up-to-date

**--updated**
> Exit successfully only if a database was actually updated

**--help**
> Display help information

# DESCRIPTION

**pacsync** synchronizes pacman package databases with remote repositories. It is part of the pacutils collection of utilities that provide enhanced functionality for pacman.

When run without arguments, it updates all configured sync databases. Specific repositories can be targeted by providing their names as arguments. The --updated flag is useful for scripts that need to know if updates are actually available.

# CAVEATS

Requires root privileges to update system databases. Uses pacman's configuration for repository and mirror settings. Part of the pacutils package, not installed by default.

# HISTORY

**pacsync** was created by **Andrew Gregory** as part of **pacutils**, a collection of helper utilities for pacman. It provides a simpler interface for database synchronization than calling pacman directly.

# SEE ALSO

[pacman](/man/pacman)(8), [pactrans](/man/pactrans)(1), [pacinstall](/man/pacinstall)(1)

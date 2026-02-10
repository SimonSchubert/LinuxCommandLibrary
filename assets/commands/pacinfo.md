# TAGLINE

displays detailed information about packages from the pacman database

# TLDR

Display information about a **specific package**

```pacinfo [package_name]```

Disable **low-speed timeouts** for downloads

```pacinfo --no-timeout [package_name]```

Display sizes in bytes and dates as **Unix timestamps**

```pacinfo --raw [package_name]```

Display **additional** package information

```pacinfo --verbose [package_name]```

Display **help**

```pacinfo --help```

# SYNOPSIS

**pacinfo** [_options_] _package_...

# PARAMETERS

**--raw**
> Display sizes in bytes and dates as Unix timestamps

**--verbose**
> Display additional package information

**--no-timeout**
> Disable low-speed download timeouts

**--config** _file_
> Use alternate pacman configuration file

**--dbpath** _path_
> Use alternate database path

**--root** _path_
> Use alternate installation root

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pacinfo** displays detailed information about packages from the pacman database. It shows package metadata including name, version, description, dependencies, install date, size, and other attributes stored in the package database.

The tool can query both locally installed packages and packages available in configured repositories. It provides more detailed output options than pacman's built-in query commands, with machine-readable raw output for scripting.

# CAVEATS

Requires packages to be in pacman's database (either installed or available in repositories). Network access needed for repository package queries if sync database is not current.

# HISTORY

Part of **pacutils**, a collection of helper utilities for pacman by Andrew Gregory. Provides enhanced package information display compared to standard **pacman -Qi** and **pacman -Si** commands.

# SEE ALSO

[pacman](/man/pacman)(8), [pacconf](/man/pacconf)(8), [pacsift](/man/pacsift)(8)

# TAGLINE

displays detailed information about packages from the pacman database

# TLDR

Display information about a **specific package**

```pacinfo [package_name]```

Show info for a package from a **specific repository**

```pacinfo [extra/package_name]```

Show **brief info** for many packages read from stdin

```pacsift --name [libreoffice] | pacinfo --short```

Display sizes in bytes and dates as **Unix timestamps**

```pacinfo --raw [package_name]```

Display **additional** info (required by, optional for, signature)

```pacinfo --verbose [package_name]```

Display **help**

```pacinfo --help```

# SYNOPSIS

**pacinfo** [_options_] (_pkgspec_ | _pkgname_)...

# PARAMETERS

**--short**
> Display brief information, suitable for many packages

**--verbose**
> Also display required by, optional for, and base64 signature

**--raw**
> Display raw numeric size and date values

**--removable-size**
> Include the size of removable dependencies in installed size

**--null**[=_sep_]
> Set the separator for package names read from stdin (NUL if _sep_ is omitted)

**--no-timeout**
> Disable low-speed download timeouts

**--config** _file_
> Use alternate pacman configuration file

**--dbpath** _path_
> Use alternate database path

**--dbext** _ext_
> Use alternate sync database extension

**--root** _path_
> Use alternate installation root

**--sysroot** _path_
> Use alternate system root (see pacutils-sysroot(7))

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pacinfo** displays detailed information about packages from the pacman database. It shows package metadata including name, version, description, dependencies, install date, size, and other attributes stored in the package database.

Given a bare _pkgname_, information for every matching package in all databases (local and sync) is shown; a _pkgspec_ such as **local/bash** or **core/bash** selects one database. If stdin is not a terminal, package names are read from it, so it pairs well with **pacsift**.

# CAVEATS

Whether to read from stdin is decided by a naive **isatty** check: inside scripts or pipes where stdin carries no package names, close stdin (**pacinfo foo <&-**) to avoid hanging. Sync database info is only as current as the last **pacman -Sy**.

# HISTORY

Part of **pacutils**, a collection of helper utilities for pacman by Andrew Gregory. Provides enhanced package information display compared to standard **pacman -Qi** and **pacman -Si** commands.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pacconf](/man/pacconf)(8), [pacsift](/man/pacsift)(8)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

<!-- verified: 2026-11-07 -->

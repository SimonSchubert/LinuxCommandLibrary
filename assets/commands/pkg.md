# TLDR

**Install package**

```pkg install [package]```

**Search packages**

```pkg search [query]```

**Update package database**

```pkg update```

**Upgrade packages**

```pkg upgrade```

**Remove package**

```pkg delete [package]```

**List installed**

```pkg info```

# SYNOPSIS

**pkg** [_command_] [_options_] [_package_...]

# PARAMETERS

**install** _PACKAGE_
> Install package.

**search** _QUERY_
> Search packages.

**update**
> Update database.

**upgrade**
> Upgrade packages.

**delete** _PACKAGE_
> Remove package.

**info**
> Show information.

**--help**
> Display help.

# DESCRIPTION

**pkg** is FreeBSD package manager. Binary package management.

The tool handles software installation. FreeBSD ports packages.

pkg manages FreeBSD packages.

# CAVEATS

FreeBSD specific. Root required for install. Repository based.

# HISTORY

pkg replaced pkg_add as the **FreeBSD package manager**.

# SEE ALSO

[pkg-add](/man/pkg-add)(8), [ports](/man/ports)(7)


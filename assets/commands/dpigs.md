# TLDR

Display **n largest** packages

```dpigs -n [n]```

Use **specific status file**

```dpigs -s [path/to/file]```

Display largest **source packages**

```dpigs -S```

Display in **human-readable** format

```dpigs -H```

# SYNOPSIS

**dpigs** [_options_]

# DESCRIPTION

**dpigs** shows which installed packages occupy the most disk space on apt-based systems. Useful for identifying large packages when freeing disk space.

Part of the debian-goodies package.

# PARAMETERS

**-n, --lines** _n_
> Show n largest packages (default: 10)

**-s, --status** _file_
> Use alternate dpkg status file

**-S, --source**
> Show source packages instead

**-H, --human-readable**
> Human-readable sizes

**-h, --help**
> Display help

# CAVEATS

Shows installed size, not download size. Debian/Ubuntu specific. Part of debian-goodies package.

# SEE ALSO

[dpkg-query](/man/dpkg-query)(1), [apt](/man/apt)(8), [du](/man/du)(1)

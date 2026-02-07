# TAGLINE

show largest installed packages

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

**dpigs** shows which installed packages occupy the most disk space on Debian-based systems. It queries the dpkg database to determine the installed size of each package and sorts them to identify space hogs.

The tool is particularly useful when disk space is limited and you need to identify candidates for removal. It can display either binary packages or aggregate source packages, making it easy to see which software projects consume the most space.

dpigs is part of the debian-goodies package, a collection of useful utilities for Debian system administrators.

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

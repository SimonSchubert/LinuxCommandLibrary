# TLDR

List **dependencies** of a package

```expac [-S|--sync] '%D' [package]```

List **optional dependencies**

```expac [-S|--sync] "%o" [package]```

List **download size** of packages in MiB

```expac [-S|--sync] [-H|--humansize] M '%k\t%n' [package1] [package2]```

List packages marked for **upgrade** with size

```expac [-S|--sync] [-H|--humansize] M '%k\t%n' $(pacman -Qqu) | sort [-sh|--sort --human-numeric-sort]```

List **explicitly-installed** packages with optional dependencies

```expac [-d|--delim] '\n\n' [-l|--listdelim] '\n\t' [-Q|--query] '%n\n\t%O' $(pacman -Qeq)```

# SYNOPSIS

**expac** [_options_] _format_ [_targets_]

# DESCRIPTION

**expac** extracts data from alpm databases using printf-like format strings. It provides flexible output formatting for pacman-based package queries.

Useful for scripting and generating custom package reports.

# PARAMETERS

**-S, --sync**
> Query sync database

**-Q, --query**
> Query local database

**-H, --humansize** _unit_
> Human-readable sizes (K, M, G)

**-d, --delim** _string_
> Delimiter between packages

**-l, --listdelim** _string_
> Delimiter for list items

# CAVEATS

Arch Linux and derivatives only. Format strings use % specifiers. Part of the pacman ecosystem.

# SEE ALSO

[pacman](/man/pacman)(8), [pactree](/man/pactree)(8)

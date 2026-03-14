# TAGLINE

pacman database query tool with custom formatting

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

The tool acts as a lightweight alternative to parsing pacman output, offering direct access to package metadata including dependencies, sizes, descriptions, and installation dates. Format specifiers like %n (name), %v (version), %D (dependencies) enable custom reports.

Useful for scripting, package analysis, and generating custom package reports. Particularly powerful when combined with other tools for filtering and processing package information.

# PARAMETERS

**-S, --sync**
> Query sync database

**-Q, --query**
> Query local database

**-H, --humansize** _unit_
> Human-readable sizes (K, M, G)

**-d, --delim** _string_
> Delimiter between packages (default: newline)

**-l, --listdelim** _string_
> Delimiter for list items (default: two spaces)

**-t, --timefmt** _format_
> Time output format string passed to strftime(3) (default: %c)

**-1, --readone**
> Stop after first match

**-p, --file** _pkgfile_
> Query a package file instead of the database

# FORMAT SPECIFIERS

Common format specifiers: %n (name), %v (version), %d (description), %D (depends), %E (depends, no version), %O (optional deps), %o (optional deps, no descriptions), %N (required by), %P (provides), %H (conflicts), %G (groups), %m (install size), %k (download size), %r (repo), %u (URL), %a (architecture), %l (install date), %w (install reason), %F (files).

# CAVEATS

Arch Linux and derivatives only. Format strings use % specifiers. Part of the pacman ecosystem. Use -H to format sizes in human-readable units (K, M, G, T).

# SEE ALSO

[pacman](/man/pacman)(8), [pactree](/man/pactree)(8)

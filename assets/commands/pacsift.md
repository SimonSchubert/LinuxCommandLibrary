# TAGLINE

queries and filters packages from pacman databases with flexible criteria

# TLDR

List **all available packages**

```pacsift```

Filter packages that **satisfy** a dependency

```pacsift --satisfies [package]```

Search **installed packages** by name

```pacsift --local --name [pattern]```

Find **large installed** packages

```pacsift --local --size '>[1.5GB]'```

Find the package that **owns a file**

```pacsift --local --exact --owns-file="$(which [command])"```

**Check** whether a package is installed

```pacsift --local --exists --satisfies [package] && echo "installed"```

Show matches with **brief details**

```pacsift --name [pattern] | pacinfo --short```

Combine filters with **exact** matching

```pacsift --exact --repo [extra] --name [package]```

# SYNOPSIS

**pacsift** [_options_] [_filters_]

# PARAMETERS

**--satisfies _dep_**
> Filter packages that satisfy a dependency

**--repo _name_**
> Filter by repository

**--local**
> Search only installed packages

**--sync**
> Search only sync databases

**--name _pattern_**
> Filter by package name

**--group _name_**
> Filter by group membership

**--provides _pkg_**
> Filter packages that provide something

**--depends _pkg_**
> Filter packages that depend on something

**--exact**
> Match values exactly

**--regex**
> Treat values as extended case-insensitive regular expressions

**--invert**
> Return packages that do NOT match

**--any**, **--or**
> Return the union rather than the intersection of matches

**--exists**
> Exit with a non-zero value if no matches are found

**--not-exists**
> Exit with a non-zero value if matches are found

**--cache**
> Search packages in cache directories (experimental)

**--base** _val_, **--description** _val_, **--packager** _val_, **--license** _val_, **--url** _val_, **--architecture** _val_
> Filter by the given string field

**--owns-file** _path_
> Filter by owned file path

**--conflicts** _pkg_, **--replaces** _pkg_, **--optdepends** _pkg_
> Filter by the given dependency field

**--size** _size_, **--installed-size** _size_, **--download-size** _size_
> Filter by size, optionally prefixed with a comparison (=, !=, <, <=, >, >=) and followed by a unit

**--install-date** _date_, **--build-date** _date_
> Filter by date, as epoch seconds or %Y-%m-%d [%H:%M[:%S]], with an optional comparison prefix

**--null**[=_sep_]
> Set alternate separator for stdin values (default: newline; NUL if no _sep_ is given)

**--config** _path_, **--dbpath** _path_, **--root** _path_, **--sysroot** _path_, **--dbext** _ext_
> Use an alternate configuration file, database path, installation root, system root or sync database extension

# DESCRIPTION

**pacsift** queries and filters packages from pacman databases with flexible criteria. Part of the **pacutils** collection, it provides more powerful filtering than basic pacman queries.

The tool can filter by various attributes: name patterns, repository, installation status, dependencies, groups, and more. Multiple filters can be combined to narrow down results.

By default the intersection of matches is returned; a field given multiple times matches the union for that field. Output is a list of packages suitable for piping to other pacutils commands or pacman. If stdin is not a terminal, packages to filter are read from stdin.

# CAVEATS

Part of the pacutils package, not installed by default on Arch. Filter syntax differs from pacman's built-in search. For simple searches, **pacman -Ss** may be more convenient, and **pacman -Qm** lists foreign packages, which pacsift has no filter for. In scripts or pipelines where stdin is not a terminal but holds no packages, close it with **<&-**.

# SEE ALSO

[pacman](/man/pacman)(8), [paclog](/man/paclog)(1), [pactree](/man/pactree)(8), [pacinfo](/man/pacinfo)(1)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

<!-- verified: 2026-11-09 -->

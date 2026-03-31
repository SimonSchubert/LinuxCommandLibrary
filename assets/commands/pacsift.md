# TAGLINE

queries and filters packages from pacman databases with flexible criteria

# TLDR

List **all available packages**

```pacsift```

Filter packages that **satisfy** a dependency

```pacsift --satisfies [package]```

Search **installed packages** by name

```pacsift --local --name [pattern]```

Find **foreign** (AUR/manually installed) packages

```pacsift --local --foreign```

Find **explicitly installed** packages

```pacsift --local --reason explicit```

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

**--any**
> Return the union rather than the intersection of matches

**--foreign**
> Show packages not found in sync databases (e.g., AUR packages)

**--native**
> Show packages found in sync databases

**--reason** _reason_
> Filter by install reason (explicit or depend)

**--null**[=_sep_]
> Set alternate separator for stdin values (default: NUL)

# DESCRIPTION

**pacsift** queries and filters packages from pacman databases with flexible criteria. Part of the **pacutils** collection, it provides more powerful filtering than basic pacman queries.

The tool can filter by various attributes: name patterns, repository, installation status, dependencies, groups, and more. Multiple filters can be combined to narrow down results.

Output is a list of package names suitable for piping to other pacutils commands or pacman.

# CAVEATS

Part of the pacutils package, not installed by default on Arch. Filter syntax differs from pacman's built-in search. For simple searches, **pacman -Ss** may be more convenient.

# SEE ALSO

[pacman](/man/pacman)(8), [paclog](/man/paclog)(1), [pactree](/man/pactree)(8), [pacinfo](/man/pacinfo)(1)

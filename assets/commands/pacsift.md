# TLDR

List **all available packages**

```pacsift```

Filter packages that **provide** a given package

```pacsift --satisfies [package]```

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

**--installed**
> Show only installed packages

**--explicit**
> Show only explicitly installed packages

**--orphans**
> Show orphan packages

# DESCRIPTION

**pacsift** queries and filters packages from pacman databases with flexible criteria. Part of the **pacutils** collection, it provides more powerful filtering than basic pacman queries.

The tool can filter by various attributes: name patterns, repository, installation status, dependencies, groups, and more. Multiple filters can be combined to narrow down results.

Output is a list of package names suitable for piping to other pacutils commands or pacman.

# CAVEATS

Part of the pacutils package, not installed by default on Arch. Filter syntax differs from pacman's built-in search. For simple searches, **pacman -Ss** may be more convenient.

# SEE ALSO

[pacman](/man/pacman)(8), [paclog](/man/paclog)(1), [pactree](/man/pactree)(8), [pacinfo](/man/pacinfo)(1)

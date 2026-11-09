# TAGLINE

Query Gentoo Portage package database

# TLDR

Display a **Portage environment variable** value

```portageq envvar [VARIABLE]```

Show **repository** configuration

```portageq repos_config /```

List **repository names**

```portageq get_repos /```

Print the **path of a repository**

```portageq get_repo_path / [gentoo]```

Check if a **package is installed**

```portageq has_version / [category]/[package]```

Find the **best visible version** of a package

```portageq best_visible / ebuild [category]/[package]```

Query package **metadata**

```portageq metadata / ebuild [category]/[package] [DEPEND]```

Find which **package owns a file**

```portageq owners / [/usr/bin/file]```

List **files installed** by a package

```portageq contents / [category]/[package]-[version]```

# SYNOPSIS

**portageq** _command_ [_root_] [_arguments_...]

# COMMANDS

**envvar** _variable_...
> Print Portage environment variables. Names can end with * to match several. Takes no root argument.

**repos_config** _root_
> Show detailed repository configuration (alias of repositories_configuration).

**get_repos** _root_
> List the names of all repositories.

**get_repo_path** _root_ _repo_...
> Print the path to the named repository.

**metadata** _root_ _pkgtype_ _package_ _key_...
> Print metadata values. pkgtype is ebuild, binary or installed.

**best_visible** _root_ [_pkgtype_] _atom_
> Find the best visible package version. pkgtype defaults to ebuild.

**match** _root_ _atom_
> List installed versions matching an atom. An empty string lists all installed packages.

**has_version** _root_ _atom_
> Check if a package is installed. Returns 0 if true, 1 otherwise.

**best_version** _root_ _atom_
> Return highest installed matching category/package-version.

**contents** _root_ _package_
> List the files installed by a package.

**owners** _root_ _file_...
> Print the packages that own the given files. Returns 1 if no owners are found.

**list_preserved_libs** _root_
> List libraries preserved during a package update.

**pquery** [_options_] [_atom_...]
> Emulate a subset of Pkgcore's pquery tool.

# PARAMETERS

**root**
> Root directory for queries (usually /)

**atom**
> Package dependency atom, such as category/package or >=category/package-1.0

**-h**, **--help**
> Show help for portageq and its commands.

**--version**
> Print the Portage version.

# DESCRIPTION

**portageq** queries Portage configuration and package database on Gentoo Linux. It provides programmatic access to Portage's internal data, useful for scripts and build automation.

The tool can retrieve environment variables, repository information, and detailed package metadata without parsing configuration files directly.

# CAVEATS

Gentoo-specific tool. Most commands take the root as their first argument. Output format varies by command.

# SEE ALSO

[emerge](/man/emerge)(1), [equery](/man/equery)(1), [eix](/man/eix)(1), [ebuild](/man/ebuild)(1)

# RESOURCES

```[Source code](https://github.com/gentoo/portage)```

```[Documentation](https://wiki.gentoo.org/wiki/Portage)```

<!-- verified: 2026-11-09 -->

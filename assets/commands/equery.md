# TAGLINE

Portage package information query tool

# TLDR

**List** all installed packages

```equery list '*'```

Search for packages in Portage tree and **overlays**

```equery list -po [package1] [package2]```

List all packages that **depend on** a package

```equery depends [package]```

List all packages that a package **depends on**

```equery depgraph [package]```

List all **files** installed by a package

```equery files --tree [package]```

# SYNOPSIS

**equery** _command_ [_options_] [_package_]

# DESCRIPTION

**equery** is a powerful query tool for viewing information about Portage packages on Gentoo Linux. It provides detailed information about installed packages, their dependencies, owned files, USE flag settings, and more. The tool can search both the local installed package database and the Portage tree including overlays.

As part of the gentoolkit package, equery offers a more user-friendly interface than raw Portage queries, making it easier to investigate package relationships, troubleshoot installation issues, and understand the state of the system. It's an essential tool for Gentoo system administration and package management.

# PARAMETERS

**list** _pattern_
> List packages matching pattern

**depends** _package_
> Show reverse dependencies

**depgraph** _package_
> Show dependency graph

**files** _package_
> List installed files

**-p, --portage-tree**
> Include Portage tree

**-o, --overlay-tree**
> Include overlays

**--tree**
> Display as tree

# CAVEATS

Gentoo Linux specific. Part of gentoolkit package. Only queries local database, not remote repositories.

# SEE ALSO

[emerge](/man/emerge)(1), [eix](/man/eix)(1), [qlist](/man/qlist)(1)

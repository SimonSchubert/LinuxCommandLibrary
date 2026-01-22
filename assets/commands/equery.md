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

**equery** views information about Portage packages on Gentoo. It queries installed packages, dependencies, files, and USE flags.

Part of the gentoolkit package providing Gentoo-specific utilities.

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

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

Show **USE flags** for a package

```equery uses [package]```

Find which package **owns** a file

```equery belongs [/path/to/file]```

Show the **ebuild path** Portage would use

```equery which [package]```

# SYNOPSIS

**equery** [_global-options_] _module_ [_local-options_] [_package_]

# PARAMETERS

**belongs** (**b**) _file_
> Find which package owns a file.

**check** (**k**) _package_
> Verify checksums and timestamps of installed files.

**depends** (**d**) _package_
> Show reverse dependencies. **-a** includes packages that are not installed.

**depgraph** (**g**) _package_
> Show dependency graph.

**files** (**f**) _package_
> List installed files. **--tree** displays them as a tree.

**has** (**a**) _key_ _value_
> List packages matching a VDB key and value.

**hasuse** (**h**) _flag_
> Find packages with a specific USE flag.

**keywords** (**y**) _package_
> Display keywords for specified packages.

**list** (**l**) _pattern_
> List packages matching pattern. **-p** includes the Portage tree and **-o** overlays.

**meta** (**m**) _package_
> Display metadata from metadata.xml.

**size** (**s**) _package_
> Show disk space used by a package.

**uses** (**u**) _package_
> Show USE flags and their descriptions.

**which** (**w**) _package_
> Print the path to the ebuild Portage would use.

**-q**, **--quiet**
> Be less verbose where possible.

**-C**, **--no-color**
> Do not colorize output.

**-N**, **--no-pipe**
> Turn off automatic pipe detection.

**-V**, **--version**
> Display Gentoolkit's version.

**-h**, **--help**
> Output a help message.

# DESCRIPTION

**equery** is a collection of modules for querying the state of Gentoo packages, files and USE flags. It provides detailed information about installed packages, their dependencies, owned files, USE flag settings, and more. Each module has a long and a one-letter short name, and `equery module --help` lists its local options.

# CAVEATS

Gentoo Linux specific. Works from the local package database and repositories on disk, so results for uninstalled packages are only as fresh as the last repository sync. **-p** and **-o** are options of the **list**, **has** and **hasuse** modules, not global options.

# HISTORY

Originally written by **Karl Trygve Kalleberg** in **2003** as part of Gentoo's gentoolkit.

# SEE ALSO

[emerge](/man/emerge)(1), [eix](/man/eix)(1), [euse](/man/euse)(1), [portageq](/man/portageq)(1)

# RESOURCES

```[Source code](https://github.com/gentoo/gentoolkit)```

```[Documentation](https://wiki.gentoo.org/wiki/Equery)```

<!-- verified: 2026-11-09 -->

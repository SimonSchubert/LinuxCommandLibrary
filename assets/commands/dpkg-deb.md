# TAGLINE

Debian archive manipulation tool

# TLDR

Display package **information**

```dpkg-deb -I [path/to/file.deb]```

Display package **name and version**

```dpkg-deb -W [path/to/file.deb]```

**List** package contents

```dpkg-deb -c [path/to/file.deb]```

**Extract** contents to directory

```dpkg-deb -x [path/to/file.deb] [path/to/directory]```

**Build** package from directory

```dpkg-deb -b [path/to/directory]```

# SYNOPSIS

**dpkg-deb** _action_ [_options_] _archive_|_directory_

# DESCRIPTION

**dpkg-deb** packs, unpacks, and provides information about Debian archives (.deb files). It's the low-level tool for working directly with the .deb file format without involving the package database.

The tool allows you to inspect package contents and metadata before installation, extract files from packages without installing them, or build new .deb archives from properly structured directory trees. Unlike dpkg itself, dpkg-deb operates purely on archive files and doesn't modify the system's package database.

Common use cases include examining unfamiliar packages for security auditing, extracting specific files from packages, and building custom .deb packages as part of a development workflow.

# PARAMETERS

**-I, --info** _archive_
> Show package information

**-W, --show** _archive_
> Show package name and version

**-c, --contents** _archive_
> List archive contents

**-x, --extract** _archive_ _dir_
> Extract files to directory

**-X, --vextract**
> Extract and list files

**-b, --build** _dir_
> Build package from directory

# CAVEATS

Lower-level than dpkg; use dpkg for installation. Building packages requires proper debian/ directory structure. Part of dpkg package.

# SEE ALSO

[dpkg](/man/dpkg)(1), [dpkg-query](/man/dpkg-query)(1), [ar](/man/ar)(1)

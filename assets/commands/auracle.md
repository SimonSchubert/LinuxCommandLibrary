# TAGLINE

Lightweight tool for querying the Arch User Repository.

# TLDR

**Search** for AUR packages matching a regex

```auracle search '[regex]'```

Display **information** about one or more AUR packages

```auracle info [package1] [package2] ...```

Display the **PKGBUILD** of one or more AUR packages

```auracle show [package1] [package2] ...```

Display **updates** for installed AUR packages

```auracle outdated```

**Clone** a package repository recursively with dependencies

```auracle clone --recurse [package]```

# SYNOPSIS

**auracle** _command_ [_options_] [_packages_]

# DESCRIPTION

**auracle** is a lightweight command-line tool for querying the Arch User Repository (AUR). It provides fast search, package information lookup, and update checking without building or installing packages.

Written in C++, auracle focuses on AUR queries rather than full package management. It is designed to be used with other tools or scripts for a complete AUR workflow.

# SUBCOMMANDS

**search** _pattern_
> Search the AUR for packages matching the pattern (regex)

**info** _packages_
> Display detailed information about specific packages

**show** _packages_
> Print the PKGBUILD file for packages

**outdated**
> List installed AUR packages with available updates

**clone** _packages_
> Clone package git repositories

**download** _packages_
> Download packages that are outdated, optionally with `--recurse` to also download new dependencies

**buildorder** _packages_
> Show the build order and origin of packages needed for a given set of AUR packages

**rawsearch** _pattern_
> Dump the raw JSON response from the AUR for a search request

**rawinfo** _packages_
> Dump the raw JSON response from the AUR for an info request

# PARAMETERS

**-q**, **--quiet**
> Limit output to package names only (used with `search` and `outdated`)

**--sort** _field_
> Sort search results by field (name, votes, popularity)

**--rsort** _field_
> Sort search results by field in reverse order

**--literal**
> Treat search terms as literal strings rather than regular expressions

**--recurse**
> Recursively follow and process dependencies (used with `clone` and `download`)

**--show-file** _file_
> Control which source file is displayed by the `show` subcommand

**--search-by** _field_
> Search by a specific field (name, name-desc, maintainer, depends, makedepends, optdepends, checkdepends)

**--color** _when_
> Control colored output: `auto`, `never`, or `always` (default: auto)

# CAVEATS

Does not build or install packages; use with **makepkg** or an AUR helper for installation. Regex patterns should be quoted to prevent shell expansion. Only queries the AUR API; does not access local package databases.

# SEE ALSO

[yay](/man/yay)(1), [paru](/man/paru)(1), [makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8)

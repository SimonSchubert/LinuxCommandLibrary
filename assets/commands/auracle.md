# TLDR

**Search** for AUR packages matching a regex

```auracle search '[regex]'```

Display **information** about one or more AUR packages

```auracle info [package1] [package2] ...```

Display the **PKGBUILD** of one or more AUR packages

```auracle show [package1] [package2] ...```

Display **updates** for installed AUR packages

```auracle outdated```

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
> Clone package repositories

# PARAMETERS

**-q, --quiet**
> Output less information

**--sort** _key_
> Sort search results by field (name, votes, popularity)

**--rsort** _key_
> Reverse sort by field

**--literal**
> Treat search pattern as literal string, not regex

# CAVEATS

Does not build or install packages; use with **makepkg** or an AUR helper for installation. Regex patterns should be quoted to prevent shell expansion. Only queries the AUR API; does not access local package databases.

# SEE ALSO

[yay](/man/yay)(1), [paru](/man/paru)(1), [makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8)

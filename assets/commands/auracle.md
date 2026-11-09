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

Search by **maintainer**

```auracle search --searchby=maintainer [name]```

Print the **build order** of a package and its dependencies

```auracle buildorder [package]```

Show a file **other than the PKGBUILD**

```auracle show --show-file=[.SRCINFO] [package]```

Print selected fields with a **custom format**

```auracle info -F '{name} {version}' [package]```

# SYNOPSIS

**auracle** [_options_] _command_ [_args_...]

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

**outdated** [_packages_]
> List installed foreign packages with newer versions in the AUR

**clone** _packages_
> Clone package git repositories, or update existing clones

**update** [_packages_]
> Like `outdated`, but download the outdated packages, optionally with `--recurse` to also download new dependencies

**resolve** _dependencies_
> Find AUR packages that satisfy dependency strings such as `foo>=1.0`

**buildorder** _packages_
> Show the build order and origin of packages needed for a given set of AUR packages

**rawsearch** _pattern_
> Dump the raw JSON response from the AUR for a search request

**rawinfo** _packages_
> Dump the raw JSON response from the AUR for an info request

# PARAMETERS

**-q**, **--quiet**
> Limit output to package names only (used with `search` and `outdated`)

**--sort=**_key_
> Sort search and info results ascending by key: name, popularity, votes, firstsubmitted, or lastmodified

**--rsort=**_key_
> Sort search and info results descending by key

**--literal**
> Treat search terms as literal strings rather than regular expressions

**-r**, **--recurse**
> Recursively follow and process dependencies (used with `clone` and `update`)

**--resolve-deps=**_deplist_
> Dependency kinds to consider when recursing: depends, makedepends, checkdepends (default: all)

**-C**, **--chdir=**_dir_
> Change to _dir_ before performing any actions (useful with `clone`)

**-F**, **--format=**_format_
> Custom output format for `info` and `search`, e.g. `{name} {version}`

**--show-file=**_file_
> Source file displayed by the `show` subcommand (default: PKGBUILD)

**--searchby=**_field_
> Search dimension: name, name-desc, maintainer, depends, makedepends, optdepends, checkdepends, submitter, provides, conflicts, replaces, keywords, groups, or comaintainers (default: name-desc)

**--color=**_when_
> Control colored output: `auto`, `never`, or `always` (default: auto)

# CAVEATS

Does not build or install packages; use with **makepkg** or an AUR helper for installation. Regex patterns should be quoted to prevent shell expansion. The AUR does not support regular expressions itself, so regex search is best-effort. The `outdated` and `buildorder` commands also consult the local pacman database.

# SEE ALSO

[yay](/man/yay)(1), [paru](/man/paru)(1), [makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8)

# RESOURCES

```[Source code](https://github.com/falconindy/auracle)```

<!-- verified: 2026-11-09 -->

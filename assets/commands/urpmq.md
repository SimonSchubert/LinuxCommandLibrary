# TAGLINE

Query Mageia package information

# TLDR

Display package **info**

```urpmq -i [package]```

Show **dependencies**

```urpmq --requires [package]```

Show **recursive** dependencies

```urpmq -d [package]```

List source URLs of missing dependencies for an **RPM**

```urpmq -m --sources [path/to/file.rpm]```

List **media** with URLs

```urpmq --list-url```

List available **packages**

```urpmq --list```

**Fuzzy** search with group and release

```urpmq -g -r -y [keyword]```

**Exact** name search

```urpmq -g -r [package]```

# SYNOPSIS

**urpmq** [_OPTIONS_] [_PACKAGE_ | _RPM_FILE_...]

# PARAMETERS

**-i**
> Display package information

**--requires**
> Show package requires

**-d, --requires-recursive**
> Show dependencies (maximal closure)

**-u**
> Deselect packages if a better version is already installed

**-m**
> Equivalent to -du

**--sources**
> Print source URLs or file names of selected packages

**--list**
> List available packages

**--list-media** [_TYPE_]
> List media; _TYPE_ is **all** (default), **update** or **active**

**--list-url**
> List media and their URLs

**-g**
> Show package group

**-r**
> Show version and release

**-f**
> Show version, release and architecture

**-l**
> List files in packages

**-p, --whatprovides**
> Search in provides

**--whatrequires**
> Reverse search for packages requiring the given one

**-y, --fuzzy**
> Fuzzy match package names

**-Y**
> Like --fuzzy, but case-insensitive

# DESCRIPTION

**urpmq** queries information about packages and media in Mageia Linux. It can display package details, dependencies, and configured repository information.

Part of the urpmi package management suite for Mageia.

# CAVEATS

Mageia specific. Recursive dependency queries may produce long output.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmf](/man/urpmf)(8), [urpme](/man/urpme)(8)

# RESOURCES

```[Source code](https://gitweb.mageia.org/software/rpm/urpmi/)```

```[Documentation](https://wiki.mageia.org/en/URPMI)```

<!-- verified: 2026-11-09 -->

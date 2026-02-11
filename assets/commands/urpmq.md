# TLDR

# TAGLINE

Query Mageia package information

# TLDR

Display package **info**

```urpmq -i [package]```

Show **dependencies**

```urpmq --requires [package]```

Show **recursive** dependencies

```urpmq -d [package]```

List missing dependencies for **RPM**

```sudo urpmq -d -m --sources [path/to/file.rpm]```

List **media** with URLs

```urpmq --list-media --list-url```

**Fuzzy** search with group and release

```urpmq -g -r -y [keyword]```

**Exact** name search

```urpmq -g -r [package]```

# SYNOPSIS

**urpmq** [_OPTIONS_] [_PACKAGE_...]

# PARAMETERS

**-i**
> Display package information

**--requires**
> Show direct dependencies

**-d, --requires-recursive**
> Show all dependencies recursively

**-m**
> Show sources for dependencies

**--sources**
> Print package sources

**--list-media**
> List configured media

**--list-url**
> Show media URLs

**-g**
> Show package group

**-r**
> Show release information

**-y, --fuzzy**
> Fuzzy match package names

# DESCRIPTION

**urpmq** queries information about packages and media in Mageia Linux. It can display package details, dependencies, and configured repository information.

Part of the urpmi package management suite for Mageia.

# CAVEATS

Mageia specific. Some operations require root privileges. Recursive dependency queries may produce long output.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmf](/man/urpmf)(8), [urpme](/man/urpme)(8)

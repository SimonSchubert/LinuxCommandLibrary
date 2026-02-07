# TAGLINE

query dpkg database information

# TLDR

**List** all installed packages

```dpkg-query -l```

List packages **matching pattern**

```dpkg-query -l '[libc6*]'```

List **files** installed by a package

```dpkg-query -L [libc6]```

Show package **information**

```dpkg-query -s [libc6]```

**Search** for packages owning files

```dpkg-query -S [/etc/ld.so.conf.d]```

# SYNOPSIS

**dpkg-query** _action_ [_options_] [_pattern_|_package_]

# DESCRIPTION

**dpkg-query** queries the dpkg database for information about installed packages on Debian-based systems. It provides a read-only interface to the package database, allowing you to search for packages, inspect their metadata, and determine file ownership.

The tool is essential for system administration tasks like verifying package installations, troubleshooting file conflicts, and generating package inventories. Unlike dpkg itself, dpkg-query only reads information and never modifies the package database, making it safe to use without elevated privileges.

Its custom output formatting capabilities make it particularly useful in scripts and automation workflows.

# PARAMETERS

**-l, --list** [_pattern_]
> List packages matching pattern

**-L, --listfiles** _package_
> List files installed by package

**-s, --status** _package_
> Show package status and information

**-S, --search** _pattern_
> Find packages owning files matching pattern

**-W, --show** _package_
> Show package in specified format

**-f, --showformat** _format_
> Custom output format

# CAVEATS

Only queries installed packages, not repositories. Pattern uses shell glob syntax, not regex. Part of dpkg package.

# SEE ALSO

[dpkg](/man/dpkg)(1), [apt-cache](/man/apt-cache)(8), [dpkg-deb](/man/dpkg-deb)(1)

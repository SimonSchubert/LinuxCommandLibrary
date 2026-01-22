# TLDR

Query package **dependencies**

```dnf repoquery --deplist [package]```

# SYNOPSIS

**dnf repoquery** [_options_] [_package_]

# DESCRIPTION

**dnf repoquery** queries packages from repositories and installed packages database. It provides detailed information about packages including dependencies, files, and changelogs.

# PARAMETERS

**--deplist**
> Show dependencies

**--provides**
> Show what package provides

**--requires**
> Show requirements

**--whatprovides** _file_
> Find package providing file

**--installed**
> Query installed packages only

**--available**
> Query available packages only

**-l, --list**
> List files in package

# CAVEATS

Can query both installed and repository packages. Output format can be customized with --queryformat.

# SEE ALSO

[dnf](/man/dnf)(8), [rpm](/man/rpm)(8)

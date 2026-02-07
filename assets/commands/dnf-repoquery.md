# TAGLINE

query package repository information

# TLDR

Query package **dependencies**

```dnf repoquery --deplist [package]```

# SYNOPSIS

**dnf repoquery** [_options_] [_package_]

# DESCRIPTION

**dnf repoquery** is a powerful query tool that searches both local installed packages and remote repository metadata without requiring installation. It provides detailed package information including dependencies, file lists, capabilities, and relationships between packages.

Unlike simple package listing commands, repoquery allows complex queries: finding which package provides a specific file or capability, showing all dependencies for a package, or listing all files within a package. The --whatprovides option is particularly useful for finding which package contains a missing library or command. Output formatting is highly customizable with --queryformat, making it suitable for scripting and automation. The tool doesn't require root privileges and can query repository packages without downloading them.

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

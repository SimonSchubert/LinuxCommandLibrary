# TAGLINE

checks each dependency specified and returns a list of dependencies that are

# TLDR

Print **package names** of dependencies that are not installed

```pacman -T package1 package2```

Check if installed package satisfies the given **minimum version**

```pacman -T "bash>=5"```

Check if a **later version** of a package is installed

```pacman -T "bash>5"```

Display **help**

```pacman -Th```

# SYNOPSIS

**pacman --deptest** [_options_] [_package(s)_]

# PARAMETERS

**-T**, **--deptest**
> Check dependencies specified and return unsatisfied ones

**-h**, **--help**
> Display help for this operation

# DESCRIPTION

**pacman --deptest** checks each dependency specified and returns a list of dependencies that are not currently satisfied on the system. This is useful for scripts to determine what packages need to be installed.

Version comparisons can use operators like >=, >, =, <, and <= to check for specific version requirements.

# CAVEATS

This operation only checks local database; it does not query sync databases for available packages.

# HISTORY

Part of **pacman**, the package manager for Arch Linux and derivatives.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-sync](/man/pacman-sync)(8)

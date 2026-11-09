# TAGLINE

Install packages on Mageia Linux

# TLDR

**Install** package

```sudo urpmi [package]```

Install from **local** RPM

```sudo urpmi [path/to/file.rpm]```

**Download** without installing

```sudo urpmi --no-install [package]```

**Update** all packages

```sudo urpmi --auto-select```

Refresh media and **update** all packages

```sudo urpmi --auto-update```

Install without **asking** about dependencies

```sudo urpmi --auto [package]```

**Test** an installation without changing the system

```sudo urpmi --test [package]```

Install on **multiple** machines

```sudo urpmi --parallel [alias] [package]```

# SYNOPSIS

**urpmi** [_OPTIONS_] [_PACKAGE_ | _RPM_FILE_...]

**urpmi** [_OPTIONS_] **--auto-select**

# PARAMETERS

**--no-install**
> Only download packages to /var/cache/urpmi/rpms, without installing them

**--auto-select**
> Select all packages that can be upgraded from the registered media

**--auto-update**
> Like --auto-select, but updates all relevant media first

**--auto**
> Install all required dependencies without asking

**--update**
> Use only update media

**--media** _MEDIA_,...
> Use only the specified media

**--test**
> Test the installation without installing anything (same as rpm --test)

**-y**, **--fuzzy**
> Propose all packages matching part of the name, even with an exact match

**--parallel** _ALIAS_
> Install on the machines defined by _ALIAS_ in /etc/urpmi/parallel.cfg

# DESCRIPTION

**urpmi** is the package installer for Mageia Linux. It can install packages from repositories or local RPM files, handling dependencies automatically.

The tool supports updating all installed packages and can manage packages across multiple machines using parallel configuration. It can also install the build dependencies of a source package or spec file.

# CAVEATS

Mageia specific. Run urpmi.update -a first to get latest package lists, or use **--auto-update**. Requires root privileges for installation.

# SEE ALSO

[urpme](/man/urpme)(8), [urpmq](/man/urpmq)(8), [urpmi.update](/man/urpmi.update)(8), [urpmi.addmedia](/man/urpmi.addmedia)(8)

# RESOURCES

```[Source code](https://gitweb.mageia.org/software/rpm/urpmi/)```

```[Documentation](https://wiki.mageia.org/en/URPMI)```

<!-- verified: 2026-11-09 -->

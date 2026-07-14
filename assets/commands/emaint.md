# TAGLINE

Portage system maintenance utility

# TLDR

Synchronize repositories set to **auto-sync**

```sudo emaint sync [-a|--auto]```

Synchronize a **specific** repository

```sudo emaint sync [-r|--repo] [repository]```

Synchronize **all** repositories

```sudo emaint sync [-A|--allrepos]```

**Clear** the Portage resume list

```sudo emaint cleanresume [-f|--fix]```

**Clean** Portage logs

```sudo emaint logs [-C|--clean]```

# SYNOPSIS

**emaint** _module_ [_options_]

# DESCRIPTION

**emaint** performs Portage maintenance tasks on Gentoo systems. It is organized into modules, each covering one area: repository synchronization, the resume list, log rotation, the binary package host, and consistency checks on Portage's own databases.

Most modules follow the same shape: **-c/--check** reports problems without touching anything, and **-f/--fix** applies the repair. Running `emaint --help` lists the modules available on the installed Portage version.

**emaint sync** is the modern front end for updating repositories and understands per-repository settings in repos.conf, which `emerge --sync` predates.

# PARAMETERS

**sync**
> Synchronize repositories

**-a, --auto**
> Sync only repositories that have auto-sync enabled

**-r, --repo** _name_
> Sync a specific repository

**-A, --allrepos**
> Sync all repositories regardless of auto-sync

**cleanresume**
> Clear Portage's resume list (what `emerge --resume` would replay)

**logs**
> Rotate and clean the Portage log directory

**merges**
> Detect and repair packages left half-merged by an interrupted emerge

**binhost**
> Regenerate the Packages index for a binary package host

**world**
> Check and fix the world file for invalid entries

**-c, --check**
> Report problems without changing anything

**-C, --clean**
> Clean old entries (logs module)

**-f, --fix**
> Apply the repair

# CONFIGURATION

**/etc/portage/repos.conf**
> Repository configuration for Portage, controlling which repositories are synchronized.

# CAVEATS

Gentoo Linux specific. Requires root privileges. Part of the Portage package management system.

# SEE ALSO

[emerge](/man/emerge)(1), [eselect](/man/eselect)(1), [eselect-repository](/man/eselect-repository)(1)

# RESOURCES

```[Source code](https://github.com/gentoo/portage)```

```[Documentation](https://wiki.gentoo.org/wiki/Portage)```

<!-- verified: 2026-07-14 -->

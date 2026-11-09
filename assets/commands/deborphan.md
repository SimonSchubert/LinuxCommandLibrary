# TAGLINE

find orphaned packages on Debian-based systems

# TLDR

Display **orphan library** packages

```deborphan```

List orphans across **all** package sections

```deborphan --all-packages```

List orphans including **library-like names** from all heuristics

```deborphan --guess-all```

Also report packages that are only **recommended or suggested** by others (turn off nice-mode)

```deborphan -n```

**Remove orphans** automatically using apt

```deborphan | xargs sudo apt-get -y remove --purge```

Show orphans with their **section** and **size**

```deborphan -sz```

Find removed packages with **leftover configuration** files

```deborphan --find-config```

**Never report** a package again

```sudo deborphan -A [package]```

# SYNOPSIS

**deborphan** [_options_] [_package_...]

# DESCRIPTION

**deborphan** finds orphaned packages on Debian-based systems. Orphaned packages are packages that no installed package depends on, typically libraries that were installed as dependencies and are no longer required.

By default, it checks only packages in the "libs", "oldlibs" and "introspection" sections. Use **-a** to check all sections. Packages listed in /var/lib/deborphan/keep are never reported.

# PARAMETERS

**-a**, **--all-packages**
> Check all packages, not just the library sections. Implies **--show-section**

**--guess-all**
> Enable all heuristics to find packages with library-like names in other sections

**-n**, **--nice-mode**
> Turn off nice-mode, so a package that is only recommended or suggested by another package no longer counts as in use

**-s**, **--show-section**
> Show the section of each package

**-z**, **--show-size**
> Show installed size of each package

**-d**, **--show-deps**
> Show all installed packages and the packages that depend on them

**-P**, **--show-priority**
> Show priority of each package

**--no-show-section**
> Don't show sections when they are shown by default (see **-a**)

**-f**, **--status-file** _file_
> Use alternate status file instead of /var/lib/dpkg/status

**-p**, **--priority** _priority_
> Only show packages with at least this priority (1-5 or required, important, standard, optional, extra)

**-e**, **--exclude** _list_
> Comma-separated packages to ignore as if they were not in the status file

**-H**, **--force-hold**
> Also display packages on hold

**--find-config**
> Search for uninstalled packages that still have configuration files. Implies **-a**

**--libdevel**
> Also search the libdevel section

**-A**, **--add-keep** _package_...
> Add packages to the list of packages never to report

**-R**, **--del-keep** _package_...
> Remove packages from the keep list

**-L**, **--list-keep**
> Show the keep list

# CAVEATS

Only shows libraries by default; use **-a** for a complete scan. Results should be reviewed before removal as some packages may be manually installed and still wanted. For automatic cleanup of unused dependencies, consider **apt autoremove** as a simpler alternative. deborphan has been removed from Debian development releases, with its last Debian version in oldstable; it remains available in some derivatives.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [aptitude](/man/aptitude)(8), [dpkg](/man/dpkg)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/deborphan)```

<!-- verified: 2026-11-09 -->

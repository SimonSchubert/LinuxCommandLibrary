# TAGLINE

find orphaned packages on Debian-based systems

# TLDR

Display **orphan library** packages

```deborphan```

List orphans across **all** package sections

```deborphan --all-packages```

List orphans including **library-like names** from all heuristics

```deborphan --guess-all```

Find packages only **recommended or suggested** (not hard dependencies)

```deborphan -n```

**Remove orphans** automatically using apt

```deborphan | xargs apt-get -y remove --purge```

Show orphans with their **section** and **size**

```deborphan -sz```

# SYNOPSIS

**deborphan** [_options_] [_package_...]

# DESCRIPTION

**deborphan** finds orphaned packages on Debian-based systems. Orphaned packages are typically libraries that were installed as dependencies but are no longer required by any installed package.

By default, it checks only packages in the "libs" and "oldlibs" sections. Use **-a** to check all sections.

# PARAMETERS

**-a**, **--all-packages**
> Check all packages, not just libs/oldlibs sections

**--guess-all**
> Enable all heuristics to find packages with library-like names in other sections

**-n**, **--nice-mode**
> Show packages that are only recommended or suggested, not hard-depended upon

**-H**, **--show-section**
> Show the section of each package

**-s** _section_
> Check only the specified section (can be used multiple times)

**-z**, **--show-size**
> Show installed size of each package

**-d**, **--show-deps**
> Show packages that depend on the orphan

**-P**, **--show-priority**
> Show priority of each package

**--no-show-section**
> Don't show section (default)

**-p** _file_, **--status-file** _file_
> Use alternate status file instead of /var/lib/dpkg/status

# CAVEATS

Only shows libraries by default; use **-a** for a complete scan. Results should be reviewed before removal as some packages may be manually installed and still wanted. For automatic cleanup of unused dependencies, consider **apt autoremove** as a simpler alternative.

# SEE ALSO

[apt](/man/apt)(8), [aptitude](/man/aptitude)(8), [dpkg](/man/dpkg)(1)

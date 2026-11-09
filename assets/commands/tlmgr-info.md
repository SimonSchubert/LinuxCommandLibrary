# TAGLINE

Display TeX Live package information

# TLDR

**Show package information**

```tlmgr info [package]```

**List all packages in the repository, marking installed ones with i**

```tlmgr info```

**List installed packages**

```tlmgr info --only-installed```

**Show package information and its files**

```tlmgr info --list [package]```

**List only the files of a package**

```tlmgr info --only-files [package]```

**List collections or schemes**

```tlmgr info [collections|schemes]```

**Output specific fields as CSV**

```tlmgr info --data [name,installed,localrev,remoterev] [package]```

# SYNOPSIS

**tlmgr info** [_options_] [_package_...]

**tlmgr info** [_options_] collections|schemes

**tlmgr info** [_options_] **--all**

# PARAMETERS

**--all**
> Print one line with name and short description per installed package.

**--list**
> With a package, also list contained files; with collections or schemes, list their dependencies.

**--only-files**
> List only the files of the given packages.

**--only-installed**
> Show only locally installed packages, without using the repository.

**--only-remote**
> Only list packages from the remote repository.

**--data** _fields_
> Output a comma or colon separated list of fields as CSV (name, category, localrev, remoterev, shortdesc, longdesc, installed, size, relocatable, depends, cat-version, cat-date, cat-license).

**--json**
> Output in JSON format; takes precedence over **--data**.

# DESCRIPTION

**tlmgr info** displays information about TeX Live packages. Shows descriptions, versions, sizes, and installation status. Part of TeX Live Manager. **list** and **show** are synonyms.

If a package is not installed locally, the repository is consulted; if it is not found there either, a search for matching packages and files is run instead.

# CAVEATS

Version, date and license come from the TeX Catalogue and are approximate; only the revision number comes directly from TeX Live. **--only-installed** and **--only-remote** cannot be combined.

# SEE ALSO

[tlmgr-search](/man/tlmgr-search)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->

# TAGLINE

TeX Live package manager

# TLDR

**Update TeX Live, including tlmgr itself**

```tlmgr update --self --all```

**Preview available updates**

```tlmgr update --list```

**Install package**

```tlmgr install [package-name]```

**Remove package**

```tlmgr remove [package-name]```

**Search packages**

```tlmgr search [pattern]```

**List installed packages**

```tlmgr list --only-installed```

**Show package info**

```tlmgr info [package-name]```

**Update tlmgr itself**

```tlmgr update --self```

**Backup package**

```tlmgr backup [package-name]```

**Use a nearby CTAN mirror for future updates**

```tlmgr option repository ctan```

# SYNOPSIS

**tlmgr** [_options_] _action_ [_options_] [_operands_]

# PARAMETERS

**install** _PKGS_
> Install packages and their dependencies.

**remove** _PKGS_
> Remove packages (**uninstall** is a synonym).

**update** [_PKGS_]
> Update the given packages, or everything with **--all**.

**search** _PATTERN_
> Search packages by Perl regular expression.

**info** [_PKGS_]
> Show package details, or list all packages (**list** and **show** are synonyms).

**backup**, **restore**
> Save and restore package backups.

**option**, **conf**, **paper**
> Change TeX Live settings, configuration files and default paper size.

**path** add|remove
> Add or remove symlinks in system directories.

**repository**, **pinning**, **candidates**
> Manage multiple package repositories.

**platform**
> Manage binaries for additional platforms (**arch** is a synonym).

**key**
> Manage the trusted GPG keys.

**check**
> Check the consistency of the installation.

**bug** [_STRING_]
> Show bug-reporting information for a package or file.

**init-usertree**
> Set up a tree for user mode.

**shell**
> Start an interactive mode for commands and scripting.

**gui**
> Start the built-in graphical interface.

**--repository** _URL|PATH_
> Use this package repository for the current run only (aliases: **--repo**, **--location**).

**--gui** [_ACTION_]
> Open the built-in GUI, optionally at the screen of _ACTION_.

**--usermode**
> Manage a per-user tree instead of the main installation.

**--usertree** _DIR_
> Tree to use in user mode.

**--verify-repo**=none|main|all
> Set the level of cryptographic repository verification.

**--machine-readable**
> Write output in a fixed format for scripts.

**--no-execute-actions**
> Skip post-install actions; formats and the filename database can go stale.

**-q**
> Suppress informational messages.

**-v**
> Show debugging messages; can be repeated.

**--version**
> Show TeX Live release and tlmgr version.

# DESCRIPTION

**tlmgr** (TeX Live Manager) is the package manager for the TeX Live distribution, handling installation, updates, and removal of LaTeX packages and fonts. It automatically resolves dependencies when installing new packages and can update the entire distribution with **update --all**.

The tool provides search and information commands to explore the thousands of available packages by name or description. Packages can be backed up before changes and restored if an update causes problems. The **--self** flag updates tlmgr itself separately from other packages.

TeX Live is organized into schemes, which contain collections and packages; a collection is a set of packages, and a package holds the actual files. Options can be given anywhere on the command line, and **-option** is equivalent to **--option**.

Running **tlmgr** requires a native TeX Live installation rather than a distribution-packaged version, as Linux distribution packages typically manage TeX packages through their own package manager instead.

# CONFIGURATION

**TEXMFCONFIG/tlmgr/config**
> User-specific tlmgr settings, shown and changed with **tlmgr conf tlmgr**.

**TEXMFSYSCONFIG/tlmgr/config**
> System-wide tlmgr settings.

# CAVEATS

Requires TeX Live (not distro packages). Some distributions manage separately. Network needed for updates.

**update --all** stops with an error while an update to tlmgr itself is pending; run **update --self** first or combine the two.

**mirror.ctan.org** resolves to hosts that are not perfectly synchronized, so updating more than daily is not recommended.

# HISTORY

**tlmgr** is part of **TeX Live**, the comprehensive TeX distribution. It provides package management for the LaTeX ecosystem.

# SEE ALSO

[latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1), [texdoc](/man/texdoc)(1), [install-tl](/man/install-tl)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

```[Source code](https://www.tug.org/texlive/svn/)```

<!-- verified: 2026-11-09 -->

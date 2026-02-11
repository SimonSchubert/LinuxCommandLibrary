# TAGLINE

TeX Live package manager

# TLDR

**Update TeX Live**

```tlmgr update --all```

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

# SYNOPSIS

**tlmgr** [_options_] _action_ [_args_]

# PARAMETERS

**install** _PKGS_
> Install packages.

**remove** _PKGS_
> Remove packages.

**update**
> Update packages.

**search** _PATTERN_
> Search packages.

**list**
> List packages.

**info** _PKG_
> Package info.

**--all**
> All packages.

**--self**
> Update tlmgr.

**--only-installed**
> Installed only.

# DESCRIPTION

**tlmgr** (TeX Live Manager) is the package manager for the TeX Live distribution, handling installation, updates, and removal of LaTeX packages and fonts. It automatically resolves dependencies when installing new packages and can update the entire distribution with **update --all**.

The tool provides search and information commands to explore the thousands of available packages by name or description. Packages can be backed up before changes and restored if an update causes problems. The **--self** flag updates tlmgr itself separately from other packages.

Running **tlmgr** requires a native TeX Live installation rather than a distribution-packaged version, as Linux distribution packages typically manage TeX packages through their own package manager instead.

# CAVEATS

Requires TeX Live (not distro packages). Some distributions manage separately. Network needed for updates.

# HISTORY

**tlmgr** is part of **TeX Live**, the comprehensive TeX distribution. It provides package management for the LaTeX ecosystem.

# SEE ALSO

[latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1), [texdoc](/man/texdoc)(1)

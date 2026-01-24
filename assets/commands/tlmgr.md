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

**tlmgr** (TeX Live Manager) manages TeX Live packages. It installs, updates, and removes LaTeX packages.

Update keeps packages current. Run periodically for latest versions.

Installation adds new packages. Dependencies resolved automatically.

Search finds packages by name or description. Explore available packages.

Backup saves packages before changes. Restore if needed.

# CAVEATS

Requires TeX Live (not distro packages). Some distributions manage separately. Network needed for updates.

# HISTORY

**tlmgr** is part of **TeX Live**, the comprehensive TeX distribution. It provides package management for the LaTeX ecosystem.

# SEE ALSO

[latex](/man/latex)(1), [pdflatex](/man/pdflatex)(1), [texdoc](/man/texdoc)(1)

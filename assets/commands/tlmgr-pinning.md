# TAGLINE

Pin TeX Live packages to repositories

# TLDR

**List pinned packages**

```tlmgr pinning show```

**Pin package to repository**

```tlmgr pinning add [repo] [package]```

**Unpin package**

```tlmgr pinning remove [repo] [package]```

**Remove all pinnings of a repository**

```tlmgr pinning remove [repo] --all```

# SYNOPSIS

**tlmgr pinning** show

**tlmgr pinning** add _repo_ _glob_...

**tlmgr pinning** remove _repo_ _glob_...

**tlmgr pinning** remove _repo_ **--all**

# PARAMETERS

**show**
> Show current pinnings. This is the default.

**add** _repo_ _glob_...
> Pin packages matching the globs to the repository.

**remove** _repo_ _glob_...
> Remove matching pinnings for the repository.

**remove** _repo_ **--all**
> Remove all pinning data for the repository.

# DESCRIPTION

**tlmgr pinning** manages package pinning to specific repositories. Ensures certain packages always come from preferred sources. Part of TeX Live Manager for multi-repository control.

A package pinned to a repository is not considered from any other repository, even one with a higher revision. By default everything is pinned to the main repository. Pinnings are stored in **TEXMFLOCAL/tlpkg/pinning.txt**, and _repo_ is the tag or URL set with **tlmgr repository**.

# CAVEATS

Requires more than one configured repository. A **check** subcommand is accepted but not implemented.

# SEE ALSO

[tlmgr-repository](/man/tlmgr-repository)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->

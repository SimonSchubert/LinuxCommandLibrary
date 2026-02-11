# TAGLINE

Pin TeX Live packages to repositories

# TLDR

**List pinned packages**

```tlmgr pinning show```

**Pin package to repository**

```tlmgr pinning add [repo] [package]```

**Unpin package**

```tlmgr pinning remove [repo] [package]```

# SYNOPSIS

**tlmgr pinning** _action_ [_repo_] [_glob_...]

# PARAMETERS

**show**
> Show current pinnings.

**add** _repo_ _glob_
> Pin packages matching glob to repository.

**remove** _repo_ _glob_
> Remove pinning.

# DESCRIPTION

**tlmgr pinning** manages package pinning to specific repositories. Ensures certain packages always come from preferred sources. Part of TeX Live Manager for multi-repository control.

# SEE ALSO

[tlmgr-repository](/man/tlmgr-repository)(1), [tlmgr](/man/tlmgr)(1)


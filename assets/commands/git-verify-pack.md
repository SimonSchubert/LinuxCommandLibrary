# TAGLINE

Validate packed Git archive files

# TLDR

**Verify pack file**

```git verify-pack [.pack file]```

**Verbose output**

```git verify-pack -v [pack]```

**Show statistics**

```git verify-pack -s [pack]```

# SYNOPSIS

**git** **verify-pack** [_options_] _pack_.idx...

# PARAMETERS

**-v**, **--verbose**
> Show objects in pack.

**-s**, **--stat-only**
> Statistics only.

# DESCRIPTION

**git verify-pack** validates packed Git archive files. It checks the integrity of pack files and their indices, reporting any corruption or inconsistencies.

Pack files are Git's efficient storage format that groups multiple objects together. This command is useful for diagnosing repository corruption or verifying backup integrity.

# SEE ALSO

[git-repack](/man/git-repack)(1), [git-index-pack](/man/git-index-pack)(1)

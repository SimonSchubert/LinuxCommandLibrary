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

**git verify-pack** validates packed Git archive files. Checks the integrity of pack files and their indices.

# SEE ALSO

[git-repack](/man/git-repack)(1), [git-index-pack](/man/git-index-pack)(1)


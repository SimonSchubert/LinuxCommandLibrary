# TAGLINE

Validate packed Git archive files

# TLDR

**Verify** a pack index file

```git verify-pack .git/objects/pack/pack-hash.idx```

Verify and **list all objects** in the pack

```git verify-pack -v .git/objects/pack/pack-hash.idx```

Show only **delta chain statistics** without verifying

```git verify-pack -s .git/objects/pack/pack-hash.idx```

# SYNOPSIS

**git** **verify-pack** [**-v** | **--verbose**] [**-s** | **--stat-only**] [**--**] _pack_.idx...

# PARAMETERS

**-v**, **--verbose**
> After verifying the pack, show the list of objects contained in the pack and a histogram of delta chain length

**-s**, **--stat-only**
> Do not verify the pack contents; only show the histogram of delta chain length. With **--verbose**, the list of objects is also shown

**--**
> Do not interpret any more arguments as options

# DESCRIPTION

**git verify-pack** reads each given idx file and verifies the corresponding pack file and its index. It reports any corruption or inconsistencies found.

With **-v**, for non-deltified objects it shows: object-name, type, size, size-in-packfile, offset-in-packfile. For deltified objects it additionally shows: depth and base-object-name.

# SEE ALSO

[git-repack](/man/git-repack)(1), [git-fsck](/man/git-fsck)(1)

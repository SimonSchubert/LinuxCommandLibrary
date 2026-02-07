# TAGLINE

ext4 filesystem defragmentation tool

# TLDR

**Defragment** the filesystem

```e4defrag [/dev/sdXN]```

Check **fragmentation level**

```e4defrag -c [/dev/sdXN]```

Print **verbose** information

```e4defrag -v [/dev/sdXN]```

# SYNOPSIS

**e4defrag** [_options_] _target_

# DESCRIPTION

**e4defrag** defragments an ext4 filesystem. It can operate on entire filesystems, directories, or individual files.

Unlike offline defragmenters, e4defrag can run while the filesystem is mounted and in use.

# PARAMETERS

**-c**
> Check fragmentation only, don't defragment

**-v**
> Verbose output showing before/after fragmentation

_target_
> Device, directory, or file to defragment

# CAVEATS

ext4 only (not ext2/ext3). Requires kernel support. Online defragmentation is generally safe but backup important data first. Limited effectiveness on nearly full filesystems.

# SEE ALSO

[e2freefrag](/man/e2freefrag)(8), [e2fsck](/man/e2fsck)(8), [filefrag](/man/filefrag)(8)

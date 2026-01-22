# TLDR

**Repair** partition

```sudo xfs_repair [path/to/partition]```

# SYNOPSIS

**xfs_repair** [_OPTIONS_] _DEVICE_

# PARAMETERS

**-n**
> No modify mode (check only)

**-L**
> Force log zeroing (data loss risk)

**-v**
> Verbose output

**-d**
> Repair dangerously (allow repair on mounted FS)

**-m** _MAXMEM_
> Maximum memory usage

# DESCRIPTION

**xfs_repair** repairs an XFS filesystem. It checks and fixes filesystem metadata, directory structures, and allocation information.

The filesystem must be unmounted before repair. A log replay may be needed first.

# CAVEATS

Requires unmounted filesystem. Using -L can cause data loss. Backup important data before repair. May require running multiple times.

# SEE ALSO

[xfs_admin](/man/xfs_admin)(8), [fsck](/man/fsck)(8), [mkfs.xfs](/man/mkfs.xfs)(8)

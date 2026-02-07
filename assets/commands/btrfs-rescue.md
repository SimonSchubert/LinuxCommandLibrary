# TAGLINE

Recovery tools for damaged btrfs filesystems

# TLDR

**Rebuild** the filesystem metadata tree (very slow)

```sudo btrfs rescue chunk-recover [path/to/partition]```

Fix **device size alignment** problems

```sudo btrfs rescue fix-device-size [path/to/partition]```

**Recover corrupted superblock** from copies

```sudo btrfs rescue super-recover [path/to/partition]```

Recover from **interrupted transactions**

```sudo btrfs rescue zero-log [path/to/partition]```

Create the **btrfs control device**

```sudo btrfs rescue create-control-device```

# SYNOPSIS

**btrfs rescue** _subcommand_ [_options_] _device_

# DESCRIPTION

**btrfs rescue** provides recovery tools for damaged btrfs filesystems. These are last-resort commands when normal mounting or btrfs check fails.

Each subcommand addresses specific failure modes like corrupted metadata, superblock damage, or interrupted transactions. The filesystem must be unmounted for all operations.

# SUBCOMMANDS

**chunk-recover**
> Scan and rebuild chunk tree (very slow, hours to days)

**fix-device-size**
> Fix device size mismatches preventing mount

**super-recover**
> Restore superblock from backup copies

**zero-log**
> Clear the transaction log to fix log replay failures

**create-control-device**
> Create /dev/btrfs-control when mknod unavailable

# CAVEATS

These are emergency recovery tools. Always backup any recoverable data first. chunk-recover can take extremely long on large filesystems. Some operations may cause data loss. The filesystem must be unmounted.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-check](/man/btrfs-check)(8), [btrfs-restore](/man/btrfs-restore)(8)

# TLDR

**Check** a btrfs filesystem

```sudo btrfs check [path/to/partition]```

Check and **repair** a btrfs filesystem (dangerous)

```sudo btrfs check --repair [path/to/partition]```

Show the **progress** of the check

```sudo btrfs check -p [path/to/partition]```

Verify the **checksum** of each data block

```sudo btrfs check --check-data-csum [path/to/partition]```

Use a specific **superblock** (0, 1, or 2)

```sudo btrfs check -s [n] [path/to/partition]```

**Rebuild** the checksum tree

```sudo btrfs check --repair --init-csum-tree [path/to/partition]```

**Rebuild** the extent tree

```sudo btrfs check --repair --init-extent-tree [path/to/partition]```

# SYNOPSIS

**btrfs check** [_options_] _device_

# DESCRIPTION

**btrfs check** examines btrfs filesystem structures for consistency errors and can optionally repair certain types of damage. It operates on unmounted filesystems only.

The check mode is non-destructive and reports issues. The repair mode attempts fixes but carries risk of data loss if used incorrectly.

# PARAMETERS

**--repair**
> Attempt to fix detected errors (dangerous, backup first)

**-p, --progress**
> Show progress during the check

**--check-data-csum**
> Verify data block checksums

**-s, --super** _num_
> Use the specified superblock copy (0, 1, or 2)

**--init-csum-tree**
> Rebuild the checksum tree from scratch

**--init-extent-tree**
> Rebuild the extent tree from scratch

**--readonly**
> Run in read-only mode (default)

# CAVEATS

The filesystem must be unmounted. Repair operations are dangerous and can cause data loss; always backup first. Running check on a mounted filesystem may report false errors. Tree rebuild operations are last-resort options.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-rescue](/man/btrfs-rescue)(8), [btrfs-restore](/man/btrfs-restore)(8)

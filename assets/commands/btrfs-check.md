# TAGLINE

Check and repair btrfs filesystem integrity

# TLDR

Check a filesystem **read-only**, which is the default and is safe

```sudo btrfs check [/dev/sda1]```

Show **progress** while it runs

```sudo btrfs check --progress [/dev/sda1]```

Verify the **data checksums** as well as the metadata

```sudo btrfs check --check-data-csum [/dev/sda1]```

Read a **backup superblock** when the first one is damaged

```sudo btrfs check --super [1] [/dev/sda1]```

Fall back to the **backup roots**

```sudo btrfs check --backup [/dev/sda1]```

Trade speed for **lower memory use** on a large filesystem

```sudo btrfs check --mode lowmem [/dev/sda1]```

Report **quota group** inconsistencies

```sudo btrfs check --qgroup-report [/dev/sda1]```

Attempt repairs, which **can destroy the filesystem**

```sudo btrfs check --repair [/dev/sda1]```

Discard and regenerate the **tree of data checksums**

```sudo btrfs check --repair --init-csum-tree [/dev/sda1]```

Discard and regenerate the **tree that tracks allocated extents**

```sudo btrfs check --repair --init-extent-tree [/dev/sda1]```

Drop the **free space cache** so it is rebuilt at the next mount

```sudo btrfs check --clear-space-cache v2 [/dev/sda1]```

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

# INSTALL

```apt: sudo apt install btrfs-progs```

```dnf: sudo dnf install btrfs-progs```

```pacman: sudo pacman -S btrfs-progs```

```apk: sudo apk add btrfs-progs```

```brew: brew install btrfs-progs```

```nix: nix profile install nixpkgs#btrfs-progs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-rescue](/man/btrfs-rescue)(8), [btrfs-restore](/man/btrfs-restore)(8)

# RESOURCES

```[Source code](https://github.com/kdave/btrfs-progs)```

```[Documentation](https://btrfs.readthedocs.io/)```

<!-- verified: 2026-06-22 -->

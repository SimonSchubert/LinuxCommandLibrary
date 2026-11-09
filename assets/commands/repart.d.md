# TAGLINE

Declarative disk partition definitions

# TLDR

**Preview** the changes (a dry run is the default)

```sudo systemd-repart```

**Apply** the partition definitions

```sudo systemd-repart --dry-run=no```

**Preview** without a pager

```systemd-repart --dry-run=yes --no-pager```

Use definitions from a **custom directory** on a specific device

```sudo systemd-repart --definitions=[path/to/repart.d] --dry-run=no [/dev/sdX]```

**Create a new disk image** from definitions

```sudo systemd-repart --definitions=[path/to/repart.d] --empty=create --size=auto --dry-run=no [image.raw]```

# SYNOPSIS

**/etc/repart.d/*.conf**

**/run/repart.d/*.conf**

**/usr/local/lib/repart.d/*.conf**

**/usr/lib/repart.d/*.conf**

# PARAMETERS

**Type=**
> GPT partition type UUID or identifier: esp, xbootldr, swap, home, srv, var, tmp (/var/tmp), linux-generic, root, or architecture-specific forms such as root-x86-64 and root-verity.

**Label=**
> Partition label for new or unlabelled partitions. Derived from the type if unset.

**Format=**
> File system to create on a new partition (ext4, btrfs, xfs, vfat, erofs, squashfs, swap, etc.). Cannot be combined with **CopyBlocks=**.

**SizeMinBytes=**, **SizeMaxBytes=**
> Minimum and maximum size constraints, with K, M, G, T suffixes. Set both to the same value for a fixed size.

**Weight=**
> Relative weight for distributing free space, 0 to 1000000 (default 1000).

**PaddingWeight=**
> Weight of the free space left after the partition (default 0).

**Priority=**
> Partitions with the highest numeric value are dropped first if not everything fits. Values of 0 or lower are never dropped.

**CopyFiles=**
> Copy files from the host into the new file system, as source[:target[:options]]. May be repeated.

**CopyBlocks=**
> Copy raw blocks from a path, device, or **auto** into a new partition.

**MakeDirectories=**
> Create whitespace-separated directories within the new file system, with mode 0755 owned by root.

**Encrypt=**
> LUKS2 encryption: off, key-file, tpm2, or key-file+tpm2 (default off).

**Verity=**
> dm-verity mode: off, data, hash, or signature (default off).

**FactoryReset=**
> Boolean. Mark the partition for removal during a factory reset (default off).

**GrowFileSystem=**
> Set the GPT flag that requests the file system be grown to fit the partition on mount.

# DESCRIPTION

**repart.d** files declare the partitions that should exist on a block device. **systemd-repart** reads them, adds partitions that are missing and grows existing ones. Operation is incremental: existing partitions are never shrunk, moved or deleted.

Definitions are sorted by file name and matched in order against existing partitions of the same type. Definitions with no match create new partitions, appended to the end of the partition table. This suits images shipped minimally sized that claim the remaining disk space on first boot.

# CONFIGURATION

```ini
# /etc/repart.d/50-root.conf
[Partition]
Type=root
Format=ext4
Label=root
SizeMinBytes=10G
SizeMaxBytes=50G
```

# CAVEATS

**systemd-repart** writes nothing unless **--dry-run=no** is given. Only GPT partition tables are supported. **Format=**, **Encrypt=**, **Verity=** and **CopyFiles=** apply only when the partition is newly created. Definitions affect partitions matched by type, so review the dry-run output before applying.

# HISTORY

**repart.d** and **systemd-repart** were introduced in **systemd 245**.

# SEE ALSO

[systemd-repart](/man/systemd-repart)(8), [mkosi](/man/mkosi)(1), [parted](/man/parted)(8), [gdisk](/man/gdisk)(8), [fdisk](/man/fdisk)(8), [lsblk](/man/lsblk)(8)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/repart.d.html)```

<!-- verified: 2026-11-09 -->

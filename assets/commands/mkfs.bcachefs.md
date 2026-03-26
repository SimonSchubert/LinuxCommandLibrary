# TAGLINE

creates a bcachefs filesystem on one or more devices

# TLDR

Create a **bcachefs filesystem** on a partition

```sudo mkfs.bcachefs [/dev/sdXY]```

Create a bcachefs filesystem with a **volume label**

```sudo mkfs.bcachefs -L [volume_label] [/dev/sdXY]```

Create a bcachefs filesystem with **zstd compression** enabled

```sudo mkfs.bcachefs --compression=zstd [/dev/sdXY]```

Create a bcachefs filesystem with **encryption** (prompts for passphrase)

```sudo mkfs.bcachefs --encrypted [/dev/sdXY]```

Create a **multi-device** bcachefs filesystem with 2 replicas

```sudo mkfs.bcachefs --replicas=2 [/dev/sdX] [/dev/sdY]```

Force creation even if the device **already contains a filesystem**

```sudo mkfs.bcachefs -f [/dev/sdXY]```

# SYNOPSIS

**mkfs.bcachefs** [_options_] _devices_...

# PARAMETERS

**-L, --fs_label=_label_**
> Set the filesystem volume label

**-U, --uuid=_uuid_**
> Create the filesystem with the specified UUID

**-f, --force**
> Force the filesystem to be created, even if the device already contains a filesystem

**-q, --quiet**
> Only print errors

**-v, --verbose**
> Verbose filesystem initialization

**--replicas=_n_**
> Set both data and metadata replicas (shorthand for setting both at once)

**--data_replicas=_n_**
> Number of data replicas

**--metadata_replicas=_n_**
> Number of metadata replicas

**--metadata_checksum=_type_**
> Metadata checksum algorithm (none, crc32c, crc64, xxhash); default: crc32c

**--data_checksum=_type_**
> Data checksum algorithm (none, crc32c, crc64, xxhash); default: crc32c

**--compression=_type_**
> Foreground compression algorithm (none, lz4, gzip, zstd); default: none

**--background_compression=_type_**
> Background compression algorithm applied to existing data (none, lz4, gzip, zstd)

**--encrypted**
> Enable whole-filesystem encryption (chacha20/poly1305); passphrase will be prompted for

**--no_passphrase**
> When used with --encrypted, do not encrypt the master encryption key

**--nocow**
> Enable no-copy-on-write mode: writes are done in-place when possible. Implicitly disables checksumming, compression, and encryption. Snapshots and reflinks still use COW.

**--errors=_action_**
> Action to take on filesystem error: continue, ro, or panic

**--metadata_target=_target_**
> Device or label to prefer for metadata writes (used in multi-device tiered setups)

**--foreground_target=_target_**
> Device or label to prefer for foreground (synchronous) writes

**--background_target=_target_**
> Device or label to move data to in the background

**--promote_target=_target_**
> Device or label to promote data to on read (SSD caching tier)

**--discard**
> Enable discard/TRIM support on the device

**--fs_size=_size_**
> Limit the filesystem to _size_ bytes on the subsequent device

**--bucket=_size_**
> Bucket size for the device; must be greater than the btree node size

**--durability=_n_**
> Consider data written to this device as already replicated _n_ times

**--btree_node_size=_size_**
> Btree node size; default: 256k

**--block_size=_size_**
> Filesystem block size in bytes (e.g. 4k)

**--acl**
> Enable POSIX ACL support

**--usrquota**
> Enable user quotas

**--grpquota**
> Enable group quotas

**--prjquota**
> Enable project quotas

# DESCRIPTION

**mkfs.bcachefs** creates a bcachefs filesystem on one or more devices. It is equivalent to **bcachefs format**. Bcachefs is a modern copy-on-write filesystem for Linux with features including checksumming, compression, encryption, snapshots, reflinks, and multi-device support with storage tiering.

The filesystem can span multiple devices with configurable replication, providing RAID-like redundancy without a separate volume manager. Different storage tiers (e.g. fast NVMe SSD and slow HDD) can be combined in a single filesystem using the target options (--foreground_target, --promote_target, --background_target).

All persistent filesystem-wide options can be set at format time and many can also be changed later with **bcachefs set-fs-option**.

# CAVEATS

**Destroys all data** on the target devices. Use **-f** to override the safety check if a device already has a filesystem. Encryption requires setting a passphrase at creation time; if lost, data cannot be recovered. The **--nocow** flag disables checksums and compression and cannot be selectively reversed per-file. The **--erasure_code** option exists but is not yet safe for use.

# HISTORY

Bcachefs was developed by Kent Overstreet, evolving from the bcache block caching layer. After years of out-of-tree development, it was merged into the Linux kernel mainline in version 6.7 (released December 2023).

# SEE ALSO

[bcachefs](/man/bcachefs)(8), [bcachefs-device](/man/bcachefs-device)(8), [mkfs](/man/mkfs)(8), [mount](/man/mount)(8), [blkid](/man/blkid)(8), [cryptsetup](/man/cryptsetup)(8)

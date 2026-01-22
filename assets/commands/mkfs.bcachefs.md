# TLDR

Create a **bcachefs filesystem** inside a partition

```sudo mkfs.bcachefs [/dev/sdXY]```

Create a bcachefs filesystem with a **volume label**

```sudo mkfs.bcachefs -L [volume_label] [/dev/sdXY]```

# SYNOPSIS

**mkfs.bcachefs** [_options_] _devices_...

# PARAMETERS

**-L, --fs_label _label_**
> Set the filesystem volume label

**--replicas _n_**
> Number of data replicas (for multi-device setups)

**--foreground_target _target_**
> Target for foreground writes

**--promote_target _target_**
> Target for promoting cached data

**--metadata_replicas _n_**
> Number of metadata replicas

**--data_checksum _type_**
> Data checksum algorithm (crc32c, crc64, xxhash, none)

**--compression _type_**
> Compression algorithm (lz4, gzip, zstd, none)

**--encrypted**
> Enable filesystem encryption

# DESCRIPTION

**mkfs.bcachefs** creates a bcachefs filesystem on one or more devices. Bcachefs is a modern copy-on-write filesystem for Linux with features including checksumming, compression, encryption, snapshots, and multi-device support with tiering.

The filesystem can span multiple devices with configurable replication, allowing for RAID-like redundancy without a separate volume manager. Different storage tiers (fast SSD, slow HDD) can be combined in a single filesystem.

Bcachefs aims to provide the features of ZFS and Btrfs with better performance and simpler administration.

# CAVEATS

**Destroys all data** on the target devices. Bcachefs was merged into the Linux kernel in version 6.7 but is still considered experimental. Multi-device configurations require careful planning for data safety. Encryption requires setting up a passphrase during creation.

# HISTORY

Bcachefs was developed by Kent Overstreet, evolving from the bcache block caching layer. After years of development, it was merged into the Linux kernel mainline in December 2023.

# SEE ALSO

[bcachefs](/man/bcachefs)(8), [mkfs](/man/mkfs)(8), [mount](/man/mount)(8)

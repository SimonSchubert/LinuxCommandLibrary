# TLDR

Create **Btrfs filesystem** on partition

```sudo mkfs.btrfs /dev/sdXY```

Create **single-device** filesystem

```sudo mkfs.btrfs -m single -d single /dev/sdX```

Create **RAID1** filesystem on multiple devices

```sudo mkfs.btrfs -m raid1 -d raid1 /dev/sdX /dev/sdY```

Set filesystem **label**

```sudo mkfs.btrfs -L "mylabel" /dev/sdX```

**Force** creation (overwrite existing)

```sudo mkfs.btrfs -f /dev/sdX```

Create with specific **node size**

```sudo mkfs.btrfs -n 32k /dev/sdX```

# SYNOPSIS

**mkfs.btrfs** [_options_] _device_ [_device_...]

# DESCRIPTION

**mkfs.btrfs** creates a Btrfs (B-tree filesystem) on one or more devices. Btrfs supports multiple device configurations, copy-on-write, snapshots, subvolumes, and various RAID levels.

# PARAMETERS

**-L, --label NAME**
> Set filesystem label (max 256 characters)

**-f, --force**
> Force overwrite of existing filesystem

**-m, --metadata PROFILE**
> Metadata profile (single, dup, raid0, raid1, raid10, raid5, raid6)

**-d, --data PROFILE**
> Data profile (single, dup, raid0, raid1, raid10, raid5, raid6)

**-n, --nodesize SIZE**
> Set node/leaf size (default 16KB)

**-s, --sectorsize SIZE**
> Set sector size

**-O, --features LIST**
> Enable or disable features

**-r, --rootdir DIR**
> Copy contents of directory to filesystem root

**-U, --uuid UUID**
> Specify filesystem UUID

**--mixed**
> Mix data and metadata in same block groups (for small devices)

# CAVEATS

Creating a filesystem destroys existing data. Default profile is raid1 for metadata and single for data when multiple devices are specified. RAID5/6 support is still considered experimental.

# HISTORY

**mkfs.btrfs** is part of **btrfs-progs**, the Btrfs filesystem utilities. Btrfs was developed as a modern copy-on-write filesystem for Linux.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-filesystem](/man/btrfs-filesystem)(8), [mkfs](/man/mkfs)(8)

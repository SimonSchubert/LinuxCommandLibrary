# TAGLINE

Manage devices in a btrfs filesystem

# TLDR

**Add** devices

```sudo btrfs device add /dev/sdb /dev/sdc path/to/filesystem```

**Remove** devices

```sudo btrfs device remove /dev/sdb path/to/filesystem```

Show error **statistics**

```sudo btrfs device stats path/to/filesystem```

**Scan** all disks

```sudo btrfs device scan --all-devices```

Show **usage** per device

```sudo btrfs device usage path/to/filesystem```

# SYNOPSIS

**btrfs device** _command_ [_OPTIONS_] [_device_|_path_]

# DESCRIPTION

**btrfs device** manages devices in a btrfs filesystem. It can add or remove devices, display statistics, and scan for btrfs filesystems. This enables dynamic resizing and RAID configuration changes.

# PARAMETERS

**add**
> Add one or more devices to the filesystem

**remove**
> Remove a device from the filesystem

**delete**
> Alias for remove

**stats**
> Show device error statistics

**scan**
> Scan devices for btrfs filesystems

**usage**
> Show detailed per-device allocation statistics

**ready**
> Check if a device is ready

**-d, --all-devices**
> Scan all devices for btrfs filesystems

# CAVEATS

Removing a device requires enough space on remaining devices to hold relocated data. The filesystem must be mounted to add or remove devices. Adding devices does not automatically balance data.

# HISTORY

**btrfs device** is part of the **btrfs-progs** package for managing btrfs filesystems on Linux.

# SEE ALSO

[btrfs](/man/btrfs)(8), [btrfs-balance](/man/btrfs-balance)(8), [btrfs-filesystem](/man/btrfs-filesystem)(8)

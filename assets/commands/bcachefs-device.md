# TAGLINE

Manage devices in a bcachefs filesystem

# TLDR

Format and **add a new device** to an existing filesystem

```sudo bcachefs device add --label [group].[name] [path/to/mountpoint] [path/to/device]```

**Migrate data off** a device to prepare for removal

```bcachefs device evacuate [path/to/device]```

Permanently **remove** a device from a filesystem

```bcachefs device remove [path/to/device]```

# SYNOPSIS

**bcachefs device** _command_ [_options_] _device_

# DESCRIPTION

**bcachefs device** manages devices within a running bcachefs filesystem. It allows adding new devices to expand storage, evacuating data before removal, and permanently removing devices.

Device labels organize storage into groups (like ssd or hdd) and individual device names, enabling tiered storage configurations.

# SUBCOMMANDS

**add**
> Add a device to an existing filesystem

**remove**
> Remove a device from a filesystem

**online**
> Re-add a device to a running filesystem

**offline**
> Take a device offline without removing it

**evacuate**
> Move all data off of a given device

**set-state** _new-state_ _device_
> Set the device state to rw, ro, failed, or spare

**resize**
> Resize the filesystem on a device

# PARAMETERS

**-l, --label** _label_
> Assign a disk label to categorize the device (e.g., ssd.cache, hdd.bulk)

**--fs_size** _size_
> Size of filesystem to use on the device (add)

**--bucket** _size_
> Set the bucket size (add)

**--discard**
> Enable discards on the device (add)

**-f, --force**
> Force the operation even if data redundancy would be degraded, or use a device that appears already formatted

**-F, --force-metadata**
> Force removal even if some metadata could not be migrated (remove)

**--force-if-data-lost**
> Force a state change even if data will be lost (set-state)

**-o, --offline**
> Operate on an offline device (set-state)

# CAVEATS

Removing devices may take considerable time depending on data volume. Ensure sufficient free space on remaining devices before evacuating. Device operations require the filesystem to be mounted.

# INSTALL

```dnf: sudo dnf install bcachefs-tools```

```pacman: sudo pacman -S bcachefs-tools```

```apk: sudo apk add bcachefs-tools```

```nix: nix profile install nixpkgs#bcachefs-tools```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[bcachefs](/man/bcachefs)(8), [mkfs](/man/mkfs)(8), [fsck](/man/fsck)(8), [mount](/man/mount)(8)

# RESOURCES

```[Homepage](https://bcachefs.org)```

```[Source code](https://evilpiepirate.org/git/bcachefs-tools.git)```

<!-- verified: 2026-06-19 -->

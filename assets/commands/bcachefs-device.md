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
> Add a new device to the filesystem

**evacuate**
> Move all data off a device in preparation for removal

**remove**
> Remove a device from the filesystem

**online**
> Bring an offline device back online

**offline**
> Take a device offline without removing it

# PARAMETERS

**--label** _group.name_
> Assign a label to categorize the device (e.g., ssd.cache, hdd.bulk)

**--force**
> Force device removal even if it would reduce redundancy

# CAVEATS

Removing devices may take considerable time depending on data volume. Ensure sufficient free space on remaining devices before evacuating. Device operations require the filesystem to be mounted.

# SEE ALSO

[bcachefs](/man/bcachefs)(8), [mount](/man/mount)(8)

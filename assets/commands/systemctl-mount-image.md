# TAGLINE

Mount disk image into unit namespace

# TLDR

**Mount** image into unit

```systemctl mount-image [unit] [/path/to/image] [/path/in/unit]```

Mount with **options**

```systemctl mount-image [unit] [/path/to/image] [/path/in/unit] root:ro,nosuid```

**Create** directory before mounting

```systemctl mount-image --mkdir [unit] [/path/to/image] [/path/in/unit]```

Mount as **read-only**

```systemctl mount-image --read-only [unit] [/path/to/image] [/path/in/unit]```

# SYNOPSIS

**systemctl mount-image** _UNIT_ _IMAGE_ [_PATH_ [_PARTITION:OPTIONS_]]

# PARAMETERS

**--mkdir**
> Create destination directory if it doesn't exist

**--read-only**
> Mount the image read-only

**--no-block**
> Do not wait for the operation to complete

# DESCRIPTION

**systemctl mount-image** mounts a disk image file into a running unit's mount namespace. This is only supported for units running with their own mount namespace (using RootImage=, PrivateMounts=, etc.). Added in systemd 248.

The image is dissected using systemd's Discoverable Disk Image (DDI) support, automatically finding and mounting the appropriate partitions. Partition names and mount options can be specified after the path using the `PARTITION:OPTIONS` syntax.

# CAVEATS

Requires the unit to have a separate mount namespace. Only works with running units. The mount is ephemeral and doesn't persist across unit restarts. Supports GPT-partitioned images and raw filesystems.

# HISTORY

The **mount-image** subcommand enables runtime injection of disk images into isolated services, supporting advanced container-like isolation without requiring full container runtimes.

# SEE ALSO

[systemctl-bind](/man/systemctl-bind)(1), [systemd-dissect](/man/systemd-dissect)(1), [systemctl](/man/systemctl)(1)

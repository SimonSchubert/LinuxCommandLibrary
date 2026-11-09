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

# DESCRIPTION

**systemctl mount-image** mounts a disk image file into a running unit's mount namespace. This is only supported for units running with their own mount namespace (using RootImage=, PrivateMounts=, etc.). The mount is added to the namespace of the main service process; processes started by ExecReload=, ExecStartPre= and similar run in distinct namespaces. If the kernel supports it, a prior mount on the target is replaced, otherwise it is over-mounted but stays pinned and inaccessible. Added in systemd 248.

The image is dissected using systemd's Discoverable Disk Image (DDI) support, automatically finding and mounting the appropriate partitions. Partition names and mount options can be specified after the path using the `PARTITION:OPTIONS` syntax.

# CAVEATS

Requires the unit to have a separate mount namespace. Only works with running units. The mount is ephemeral and doesn't persist across unit restarts. Supports GPT-partitioned images and raw filesystems.

# HISTORY

The **mount-image** subcommand enables runtime injection of disk images into isolated services, supporting advanced container-like isolation without requiring full container runtimes.

# SEE ALSO

[systemctl-bind](/man/systemctl-bind)(1), [systemd-dissect](/man/systemd-dissect)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->

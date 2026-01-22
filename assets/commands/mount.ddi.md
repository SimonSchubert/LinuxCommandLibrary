# TLDR

**Mount** a Discoverable Disk Image

```mount.ddi [path/to/image.raw] [/mnt/image]```

Mount using **standard mount command**

```mount -t ddi [path/to/image.raw] [/mnt/image]```

Mount **read-only**

```mount -t ddi -o ro [path/to/image.raw] [/mnt/image]```

# SYNOPSIS

**mount.ddi** _image-file_ _mount-directory_ [**-o** _options_]

# PARAMETERS

**ro**
> Mount read-only

**rw**
> Mount read-write

**discard**
> Enable block discarding

**nodiscard**
> Disable block discarding

**defaults**
> Use standard mount behavior

# DESCRIPTION

**mount.ddi** is a mount helper for Discoverable Disk Images (DDIs). It implements the mount(8) external helper interface, allowing DDI images to be mounted using standard mount syntax.

When systemd-dissect is symlinked to /sbin/mount.ddi, the system can mount DDI images directly through the mount command with -t ddi filesystem type. This enables automatic mounting at boot via /etc/fstab entries.

DDI images follow the Discoverable Partitions Specification, allowing automatic partition identification and mounting without manual configuration.

# FSTAB EXAMPLE

```
/path/to/image.raw /images/myimage/ ddi defaults 0 0
```

# CAVEATS

Requires systemd-dissect to be installed and symlinked to /sbin/mount.ddi. Use umount -R for recursive unmounting of nested filesystems within the image. The image must conform to the Discoverable Partitions Specification.

# HISTORY

**mount.ddi** is part of **systemd** and provides integration between DDI disk images and the standard Unix mount infrastructure. It was developed to simplify mounting of OS images and portable service images.

# SEE ALSO

[systemd-dissect](/man/systemd-dissect)(1), [mount](/man/mount)(8), [umount](/man/umount)(8)

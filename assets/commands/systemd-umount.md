# TAGLINE

Alias for systemd-mount --umount

# TLDR

**Unmount** a filesystem by mount point

```systemd-umount [/mnt/usb]```

**Unmount** a filesystem by device path

```systemd-umount [/dev/sdb1]```

**Unmount** and discover the mount point automatically

```systemd-umount --discover [/dev/sdb1]```

# SYNOPSIS

**systemd-umount** [_options_] _target_...

# DESCRIPTION

**systemd-umount** is equivalent to **systemd-mount --umount**. It unmounts filesystems by creating transient systemd `.mount` units that handle the unmount operation. It can unmount by mount point path or device path.

See the **systemd-mount** documentation for full details on options.

# PARAMETERS

**--discover**
> Discover the mount point for a device automatically

**--no-block**
> Do not wait for the unmount operation to complete

# SEE ALSO

[systemd-mount](/man/systemd-mount)(1), [umount](/man/umount)(8), [mount](/man/mount)(8)

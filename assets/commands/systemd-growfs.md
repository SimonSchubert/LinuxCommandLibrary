# TAGLINE

Grow filesystem to fill partition

# TLDR

**Grow root filesystem to fill partition**

```/usr/lib/systemd/systemd-growfs /```

**Grow filesystem at mount point**

```/usr/lib/systemd/systemd-growfs [/home]```

**Enable automatic grow at boot**

```systemctl enable systemd-growfs-root.service```

**Check service status**

```systemctl status systemd-growfs-root.service```

# SYNOPSIS

**/usr/lib/systemd/systemd-growfs** _mountpoint_

# DESCRIPTION

**systemd-growfs** is a systemd utility that instructs the kernel to grow a mounted filesystem to fill its underlying block device. It is typically used after partition resizing to expand the filesystem to use the newly available space.

The utility is usually invoked automatically by systemd services based on the **x-systemd.growfs** mount option in /etc/fstab. It can also be triggered by GPT partition flag 59 as defined in the Discoverable Partitions Specification.

Supported filesystems include ext4, btrfs, xfs, and dm-crypt encrypted partitions. The filesystem must already be mounted for the operation to succeed.

# FSTAB USAGE

Add x-systemd.growfs option to /etc/fstab:

```
/dev/sda2  /  ext4  defaults,x-systemd.growfs  0  1
```

# RELATED SERVICES

**systemd-growfs@.service**: Template service for arbitrary mount points.

**systemd-growfs-root.service**: Service for growing the root filesystem.

**systemd-makefs@.service**: Creates filesystems on first boot.

# CAVEATS

Only works with mounted filesystems. Only supports ext4, btrfs, xfs, and dm-crypt. The underlying partition must already be resized before growing the filesystem. Errors during filesystem growth produce warnings but don't fail the mount.

# HISTORY

**systemd-growfs** was introduced as part of systemd's image-based deployment and container features. It enables automatic filesystem expansion for cloud instances and embedded systems that need to grow their filesystem after initial provisioning.

# SEE ALSO

[systemd](/man/systemd)(1), [xfs_growfs](/man/xfs_growfs)(8), [resize2fs](/man/resize2fs)(8), [systemd-repart](/man/systemd-repart)(8)

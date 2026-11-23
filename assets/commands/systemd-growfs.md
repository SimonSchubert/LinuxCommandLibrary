# TAGLINE

Grow filesystem to fill partition

# TLDR

**Grow root filesystem to fill partition**

```/usr/lib/systemd/systemd-growfs /```

**Grow filesystem at mount point**

```/usr/lib/systemd/systemd-growfs [/home]```

**Show what would be done** without growing anything

```/usr/lib/systemd/systemd-growfs --dry-run [/home]```

**Grow a mount point** through its template service (here /srv/data)

```sudo systemctl start systemd-growfs@srv-data.service```

**Check whether the root filesystem was grown at boot**

```systemctl status systemd-growfs-root.service```

# SYNOPSIS

**/usr/lib/systemd/systemd-growfs** [**--dry-run**] _mountpoint_

# PARAMETERS

**-n**, **--dry-run**
> Just print what would be done.

**-h**, **--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**systemd-growfs** is a systemd utility that instructs the kernel to grow a mounted filesystem to fill its underlying block device. It is typically used after partition resizing to expand the filesystem to use the newly available space.

The utility is usually invoked automatically at boot: **systemd-fstab-generator** pulls in **systemd-growfs@.service** (or **systemd-growfs-root.service** for /) for mounts with the **x-systemd.growfs** option in /etc/fstab, and **systemd-gpt-auto-generator** pulls in **systemd-growfs-root.service** when the root partition has GPT attribute flag 59 (grow-file-system) set, as defined in the Discoverable Partitions Specification. The services are static and cannot be enabled with **systemctl enable**.

Supported filesystems are ext4, btrfs and xfs, and it also grows dm-crypt devices. The filesystem must already be mounted for the operation to succeed.

# FSTAB USAGE

Add x-systemd.growfs option to /etc/fstab:

```
/dev/sda2  /  ext4  defaults,x-systemd.growfs  0  1
```

# RELATED SERVICES

**systemd-growfs@.service**: Template service for arbitrary mount points.

**systemd-growfs-root.service**: Service for growing the root filesystem, ordered after **systemd-repart.service**.

**systemd-makefs@.service**: Creates filesystems on first boot.

# CAVEATS

Only works with mounted filesystems. Only supports ext4, btrfs, xfs, and dm-crypt. The underlying partition must already be resized before growing the filesystem. Errors during filesystem growth produce warnings but don't fail the mount. The binary is not on **PATH**; on some distributions it lives in /lib/systemd/.

# HISTORY

**systemd-growfs** and the **x-systemd.growfs** option were introduced in **systemd 236** (2017), together with **systemd-makefs**. It enables automatic filesystem expansion for cloud instances and embedded systems that need to grow their filesystem after initial provisioning.

# SEE ALSO

[systemctl](/man/systemctl)(1), [resize2fs](/man/resize2fs)(8), [systemd-repart](/man/systemd-repart)(8), [growpart](/man/growpart)(1), [parted](/man/parted)(8), [fstab](/man/fstab)(5)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemd-growfs.html)```

<!-- verified: 2026-11-23 -->

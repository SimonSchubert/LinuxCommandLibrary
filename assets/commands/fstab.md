# TAGLINE

filesystem mount configuration file

# TLDR

**View fstab**

```cat /etc/fstab```

**Check fstab syntax**

```sudo mount -a```

**Show mounted filesystems**

```findmnt```

# DESCRIPTION

**/etc/fstab** is a configuration file that defines how filesystems are mounted at boot time. Each line describes a filesystem, mount point, type, options, and backup/check settings.

The file is read by **mount** and **systemd** to automatically mount filesystems during system startup.

# FILE FORMAT

```
<device>        <mountpoint>  <type>  <options>           <dump> <pass>
/dev/sda1       /boot         ext4    defaults            0      2
UUID=abc123     /home         ext4    defaults,noatime    0      2
/dev/sda3       none          swap    sw                  0      0
//server/share  /mnt/share    cifs    credentials=/etc/creds  0  0
```

# FIELDS

**device**
> Device, UUID, LABEL, or network path.

**mountpoint**
> Where to mount (directory or "none" for swap).

**type**
> Filesystem type (ext4, xfs, btrfs, nfs, cifs, swap).

**options**
> Mount options, comma-separated.

**dump**
> Backup flag (usually 0).

**pass**
> fsck order (0=skip, 1=root, 2=other).

# COMMON OPTIONS

```
defaults    - rw,suid,dev,exec,auto,nouser,async
noauto      - Don't mount at boot
nofail      - Don't fail boot if device missing
ro          - Read-only
noexec      - Don't allow execution
nosuid      - Ignore setuid bits
noatime     - Don't update access times
```

# CAVEATS

Errors can prevent boot. Always test with `mount -a` before reboot. Use UUID or LABEL for reliable device identification. Network mounts need special handling.

# SEE ALSO

[mount](/man/mount)(8), [findmnt](/man/findmnt)(8), [blkid](/man/blkid)(8), [systemd.mount](/man/systemd.mount)(5)

# TAGLINE

filesystem mount configuration file

# TLDR

**View fstab**

```cat /etc/fstab```

**Verify fstab syntax**

```sudo findmnt --verify```

**Mount all entries** to test new ones

```sudo mount -a```

**Reload systemd** after editing

```sudo systemctl daemon-reload```

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
> Device, UUID=, LABEL=, PARTUUID=, PARTLABEL=, or network path. Escape spaces as \040.

**mountpoint**
> Where to mount (directory or "none" for swap).

**type**
> Filesystem type (ext4, xfs, btrfs, nfs, cifs, swap). Use subtypes such as fuse.sshfs; none suits bind mounts.

**options**
> Mount options, comma-separated.

**dump**
> Used by dump to decide what to back up (usually 0).

**pass**
> fsck order (0=skip, 1=root, 2=other).

# COMMON OPTIONS

```
defaults    - Kernel defaults, usually rw,suid,dev,exec,auto,nouser,async
noauto      - Don't mount at boot or with mount -a
nofail      - Don't fail boot if device missing
ro          - Read-only
noexec      - Don't allow execution
nosuid      - Ignore setuid bits
noatime     - Don't update access times
user        - Allow non-root users to mount
owner       - Allow the device owner to mount
_netdev     - Device needs network access
x-systemd.automount - Mount on first access
```

# CAVEATS

Errors can prevent boot. Always test with `findmnt --verify` and `mount -a` before reboot. On systemd-based systems, run `systemctl daemon-reload` after editing. Use UUID or LABEL for reliable device identification. Network mounts need special handling.

# HISTORY

The ancestor of the **fstab** file format appeared in **4.0BSD**.

# SEE ALSO

[mount](/man/mount)(8), [findmnt](/man/findmnt)(8), [blkid](/man/blkid)(8), [swapon](/man/swapon)(8), [crypttab](/man/crypttab)(5)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

```[Documentation](https://man7.org/linux/man-pages/man5/fstab.5.html)```

<!-- verified: 2026-11-09 -->

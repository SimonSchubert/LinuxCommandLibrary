# TAGLINE

removable media ejection utility

# TLDR

Display the **default** device

```eject [-d|--default]```

**Eject** the default device

```eject```

**Eject** a specific device

```eject [/dev/cdrom]```

**Toggle** tray open/closed

```eject [-T|--traytoggle] [/dev/cdrom]```

Eject a **cd** drive

```eject [-r|--cdrom] [/dev/cdrom]```

Eject a **floppy** drive

```eject [-f|--floppy] [/mnt/floppy]```

Eject a **tape** drive

```eject [-q|--tape] [/mnt/tape]```

Set whether physical button is **ignored**

```eject [-i|--manualeject] [on|off]```

# SYNOPSIS

**eject** [_options_] [_device_|_mountpoint_]

# DESCRIPTION

**eject** ejects removable media such as CDs, DVDs, floppy disks, and tape drives. It can also control the tray mechanism and lock/unlock devices.

The default order for device types is cd-rom, scsi, floppy, then tape.

# PARAMETERS

**-d, --default**
> Display the default device

**-T, --traytoggle**
> Toggle tray open/closed state

**-r, --cdrom**
> Eject using CD-ROM method

**-f, --floppy**
> Eject using floppy method

**-q, --tape**
> Eject using tape method

**-i, --manualeject** _on|off_
> Control whether physical button works

**-t, --trayclose**
> Close the tray

**-a, --auto** _on|off_
> Enable or disable the drive's auto-eject mode

**-m, --no-unmount**
> Do not unmount the device even if it is mounted

**-M, --no-partitions-unmount**
> Do not unmount other partitions on the same device

**-n, --noop**
> Show which device would be used without ejecting it

**-p, --proc**
> Use /proc/mounts instead of /etc/mtab

**-s, --scsi**
> Eject using SCSI commands

**-x, --cdspeed** _speed_
> Set the CD-ROM drive speed (0 selects the maximum)

**-X, --listspeed**
> List the speeds the drive supports

**-v, --verbose**
> Print more information about what is happening

# CAVEATS

eject unmounts the device (and, by default, all other partitions on it) before ejecting; use **-m** to skip that. Ejection fails if a process still holds a file open on the mounted filesystem. Many laptop and USB optical drives ignore the tray commands, and **-x** speed control depends on drive firmware. Part of the **util-linux** package.

# INSTALL

```apt: sudo apt install eject```

```apk: sudo apk add util-linux-misc```

```nix: nix profile install nixpkgs#eject```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mount](/man/mount)(8), [umount](/man/umount)(8), [lsblk](/man/lsblk)(8), [udisksctl](/man/udisksctl)(1)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

```[Documentation](https://man7.org/linux/man-pages/man1/eject.1.html)```

<!-- verified: 2026-07-14 -->

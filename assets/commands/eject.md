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

# CAVEATS

Device must be unmounted before ejection. Some drives don't support all features. Requires appropriate permissions on the device.

# SEE ALSO

[mount](/man/mount)(8), [umount](/man/umount)(8)

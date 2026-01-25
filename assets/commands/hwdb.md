# TLDR

**Update hardware database**

```sudo systemd-hwdb update```

**Query device properties**

```systemd-hwdb query [modalias]```

**Show hardware database path**

```systemd-hwdb --help```

# SYNOPSIS

**systemd-hwdb** [_options_] _command_

# PARAMETERS

**update**
> Compile hwdb files to binary.

**query** _modalias_
> Query properties for modalias.

**--path** _path_
> Custom hwdb path.

**--root** _root_
> Root directory.

**--strict**
> Strict parsing mode.

**--usr**
> Use /usr directory.

# DESCRIPTION

**hwdb** (Hardware Database) is a systemd component that maps hardware properties to udev device attributes. It matches hardware by modalias strings and sets properties like device names, permissions, and driver hints.

The database is compiled from text files in /usr/lib/udev/hwdb.d/ and /etc/udev/hwdb.d/ into a binary format for fast matching.

# HWDB FILE FORMAT

```
# /etc/udev/hwdb.d/70-custom.hwdb
# Match USB keyboard
usb:v04D9p1702*
 KEYBOARD_KEY_70039=leftctrl
 KEYBOARD_KEY_3a=capslock

# Match by PCI ID
pci:v00001234d00005678*
 ID_VENDOR=Custom Vendor
```

# USAGE

```bash
# Update after editing hwdb files
sudo systemd-hwdb update
sudo udevadm trigger

# Find modalias for device
udevadm info /dev/input/event0 | grep MODALIAS
```

# CAVEATS

Changes require hwdb update and udevadm trigger. Modalias format varies by bus type. Incorrect entries may cause device issues.

# SEE ALSO

[udevadm](/man/udevadm)(8), [udev](/man/udev)(7), [systemd-udevd](/man/systemd-udevd)(8)

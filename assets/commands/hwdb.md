# TAGLINE

systemd component that maps hardware properties to udev device attributes

# TLDR

**Update hardware database**

```sudo systemd-hwdb update```

**Query device properties**

```systemd-hwdb query [modalias]```

**Update with strict parsing** (non-zero exit on any parse error)

```sudo systemd-hwdb --strict update```

**Compile the database into /usr/lib/udev** instead of /etc/udev

```sudo systemd-hwdb --usr update```

**Find the modalias** of a device to write a match for

```udevadm info [/dev/input/event0] | grep MODALIAS```

# SYNOPSIS

**systemd-hwdb** [_options_] _command_

# PARAMETERS

**update**
> Compile hwdb files to binary.

**query** _modalias_
> Query properties for modalias.

**-r**, **--root**=_path_
> Alternate root path in the filesystem.

**-s**, **--strict**
> When updating, return a non-zero exit value on any parsing error.

**--usr**
> Generate the binary database in /usr/lib/udev instead of /etc/udev.

**-h**, **--help**
> Print a short help text and exit.

# DESCRIPTION

**hwdb** (Hardware Database) is a systemd component that maps hardware properties to udev device attributes. It matches hardware by modalias strings and sets properties like device names, permissions, and driver hints.

The database is compiled from **.hwdb** text files in /etc/udev/hwdb.d/, /run/udev/hwdb.d/ and /usr/lib/udev/hwdb.d/ into the binary file **hwdb.bin** (in /etc/udev/ by default, or /usr/lib/udev/ with **--usr**). Files in /etc override files with the same name in /usr/lib. Each record consists of one or more match lines (shell glob patterns, no leading whitespace) followed by property lines indented by exactly one space.

# HWDB FILE FORMAT

```
# /etc/udev/hwdb.d/70-custom.hwdb
# Remap keys on a USB keyboard
evdev:input:b0003v04D9p1702*
 KEYBOARD_KEY_70039=leftctrl
 KEYBOARD_KEY_700e0=capslock

# Match by PCI ID
pci:v00001234d00005678*
 ID_VENDOR_FROM_DATABASE=Custom Vendor
```

# USAGE

```bash
# Update after editing hwdb files
sudo systemd-hwdb update
sudo udevadm trigger

# Check which properties match a modalias
systemd-hwdb query 'evdev:input:b0003v04D9p1702e0110'

# Find modalias for device
udevadm info /dev/input/event0 | grep MODALIAS
```

# CAVEATS

Changes require **systemd-hwdb update** and **udevadm trigger** (or a reboot) to take effect. Modalias format varies by bus type. Property lines must be indented by exactly one space and records separated by an empty line, otherwise entries are silently skipped unless **--strict** is used. The older **udevadm hwdb** command is deprecated in favor of **systemd-hwdb**.

# SEE ALSO

[systemd-hwdb](/man/systemd-hwdb)(8), [udevadm](/man/udevadm)(8)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/hwdb.html)```

<!-- verified: 2026-11-23 -->

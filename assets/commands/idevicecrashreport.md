# TAGLINE

move crash reports from a device to a local directory

# TLDR

**Move crash reports** from device to a local directory (removes from device)

```idevicecrashreport [output-dir]```

**Copy crash reports** but keep them on the device

```idevicecrashreport -k [output-dir]```

**Extract raw crash reports** into separate .crash files

```idevicecrashreport -e [output-dir]```

**Filter crash reports** by name (case sensitive)

```idevicecrashreport -f [app-name] [output-dir]```

**Remove all crash logs** from device without copying

```idevicecrashreport --remove-all```

**Target a specific device** by UDID

```idevicecrashreport -u [device-udid] [output-dir]```

**Connect to a network device**

```idevicecrashreport -n [output-dir]```

# SYNOPSIS

**idevicecrashreport** [_OPTIONS_] _DIRECTORY_

# PARAMETERS

**-u**, **--udid** _UDID_
> Target specific device by UDID.

**-n**, **--network**
> Connect to network device.

**-e**, **--extract**
> Extract raw crash report into separate '.crash' files.

**-k**, **--keep**
> Copy but do not remove crash reports from device.

**-f**, **--filter** _NAME_
> Filter crash reports by NAME (case sensitive).

**--remove-all**
> Remove all crash log files without copying. Can be used with -f to only remove matching files.

**-d**, **--debug**
> Enable communication debugging.

**-h**, **--help**
> Print usage information.

**-v**, **--version**
> Print version information.

# DESCRIPTION

**idevicecrashreport** is a simple utility to move crash reports from an iOS device to a local directory. Part of the libimobiledevice suite. By default it moves reports (deleting them from the device); use **-k** to copy instead. It downloads .crash, .ips, and related diagnostic files. Useful for debugging app crashes without iTunes or Xcode.

Output lines are prefixed with "Link:", "Copy:", or "Move:" depending on whether a symlink was created, a file was copied, or moved from the device.

# SEE ALSO

[ideviceinfo](/man/ideviceinfo)(1), [idevicediagnostics](/man/idevicediagnostics)(1), [idevicesyslog](/man/idevicesyslog)(1)


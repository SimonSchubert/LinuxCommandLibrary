# TLDR

**Create backup**

```idevicebackup backup [backup-dir]```

**Restore from backup**

```idevicebackup restore [backup-dir]```

**Backup specific device**

```idevicebackup -u [device-udid] backup [backup-dir]```

# SYNOPSIS

**idevicebackup** [_options_] _command_ _directory_

# SUBCOMMANDS

**backup**
> Create device backup.

**restore**
> Restore from backup.

# PARAMETERS

**-u** _udid_
> Target specific device.

**-n**
> Connect over network.

**-d**
> Enable debug output.

# DESCRIPTION

**idevicebackup** creates and restores backups of iOS devices. Part of the libimobiledevice suite. Works with older iOS versions. For iOS 4 and later, use **idevicebackup2** instead.

# CAVEATS

Deprecated for newer iOS versions. Use idevicebackup2 for iOS 4+.

# SEE ALSO

[idevicebackup2](/man/idevicebackup2)(1), [ideviceinfo](/man/ideviceinfo)(1)


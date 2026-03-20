# TAGLINE

creates and restores backups of iOS devices running iOS 4 and later

# TLDR

**Create full backup**

```idevicebackup2 backup [backup-dir]```

**Restore from backup**

```idevicebackup2 restore [backup-dir]```

**List files in backup**

```idevicebackup2 list [backup-dir]```

**Backup specific device**

```idevicebackup2 -u [device-udid] backup [backup-dir]```

**Force full backup**

```idevicebackup2 backup --full [backup-dir]```

**Enable backup encryption**

```idevicebackup2 encryption on [password]```

# SYNOPSIS

**idevicebackup2** [_OPTIONS_] _CMD_ [_CMDOPTIONS_] _DIRECTORY_

# SUBCOMMANDS

**backup**
> Create device backup. Use --full to force full backup.

**restore**
> Restore from backup. Supports --system, --settings, --remove, --copy, --skip-apps, --no-reboot, --password.

**list**
> List files of last completed backup in CSV format.

**unback**
> Unpack a completed backup.

**encryption** on|off [_PWD_]
> Enable or disable backup encryption.

**changepw** [_OLD_] [_NEW_]
> Change backup password on target device.

**cloud** on|off
> Enable or disable cloud use (requires iCloud account).

**info**
> Show details about last completed backup.

# PARAMETERS

**-u**, **--udid** _UDID_
> Target specific device by UDID.

**-s**, **--source** _UDID_
> Use backup data from device specified by UDID.

**-i**, **--interactive**
> Request passwords interactively on the command line.

**-n**, **--network**
> Connect to network device.

**-d**, **--debug**
> Enable communication debugging.

# DESCRIPTION

**idevicebackup2** creates and restores backups of iOS devices running iOS 4 and later. Part of the libimobiledevice suite. Supports encrypted backups, incremental backups, and restoring backups from different devices.

# SEE ALSO

[ideviceinfo](/man/ideviceinfo)(1), [idevicebackup](/man/idevicebackup)(1)


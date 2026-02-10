# TAGLINE

creates and restores backups of iOS devices running iOS 4 and later

# TLDR

**Create full backup**

```idevicebackup2 backup [backup-dir]```

**Restore from backup**

```idevicebackup2 restore [backup-dir]```

**Encrypted backup**

```idevicebackup2 backup --full [backup-dir]```

**List backups**

```idevicebackup2 list [backup-dir]```

**Backup specific device**

```idevicebackup2 -u [device-udid] backup [backup-dir]```

**Enable encryption**

```idevicebackup2 encryption on [password]```

# SYNOPSIS

**idevicebackup2** [_options_] _command_ _directory_

# SUBCOMMANDS

**backup**
> Create device backup.

**restore**
> Restore from backup.

**list**
> List files in backup.

**unback**
> Extract backup files.

**encryption**
> Manage backup encryption.

**info**
> Show backup information.

# PARAMETERS

**-u** _udid_
> Target specific device.

**--full**
> Force full backup.

**--source** _udid_
> Restore from different device backup.

**-n**
> Connect over network.

# DESCRIPTION

**idevicebackup2** creates and restores backups of iOS devices running iOS 4 and later. Part of the libimobiledevice suite. Supports encrypted backups, incremental backups, and restoring backups from different devices.

# SEE ALSO

[ideviceinfo](/man/ideviceinfo)(1), [idevicebackup](/man/idevicebackup)(1)


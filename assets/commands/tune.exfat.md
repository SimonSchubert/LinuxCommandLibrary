# TLDR

Print volume **label**

```tune.exfat -l [/dev/sdXY]```

Set volume **label**

```tune.exfat -L [new_label] [/dev/sdXY]```

Print volume **GUID**

```tune.exfat -u [/dev/sdXY]```

Set volume **GUID**

```tune.exfat -U [new_guid] [/dev/sdXY]```

Print volume **serial**

```tune.exfat -i [/dev/sdXY]```

Set volume **serial**

```tune.exfat -I [new_serial] [/dev/sdXY]```

# SYNOPSIS

**tune.exfat** [_OPTIONS_] _DEVICE_

# PARAMETERS

**-l, --print-label**
> Print volume label

**-L, --set-label** _LABEL_
> Set volume label

**-u, --print-guid**
> Print volume GUID

**-U, --set-guid** _GUID_
> Set volume GUID

**-i, --print-serial**
> Print volume serial number

**-I, --set-serial** _SERIAL_
> Set volume serial number

# DESCRIPTION

**tune.exfat** adjusts tunable filesystem parameters on an exFAT filesystem. It can modify the volume label, GUID, and serial number without reformatting the filesystem.

The device must be unmounted before modifying parameters. This tool is useful for changing volume identification without losing data.

# CAVEATS

Filesystem must be unmounted for modifications. Requires root privileges. Incorrect GUID or serial changes may affect system recognition of the volume.

# SEE ALSO

[mkfs.exfat](/man/mkfs.exfat)(8), [fsck.exfat](/man/fsck.exfat)(8), [dump.exfat](/man/dump.exfat)(8)

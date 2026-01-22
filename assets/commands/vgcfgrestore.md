# TLDR

Restore from **last** backup

```sudo vgcfgrestore [vg_name]```

Restore from **file**

```sudo vgcfgrestore -f [path/to/file] [vg_name]```

**List** all backups

```sudo vgcfgrestore -l [vg_name]```

List **specific** backup file

```sudo vgcfgrestore -l -f [path/to/file] [vg_name]```

# SYNOPSIS

**vgcfgrestore** [_OPTIONS_] _VG_NAME_

# PARAMETERS

**-f, --file** _FILE_
> Restore from specified backup file

**-l, --list**
> List available backups

# DESCRIPTION

**vgcfgrestore** restores LVM volume group configuration from a text backup file produced by vgcfgbackup. This restores the volume group structure, not the actual user data.

The command is useful for recovering from metadata corruption or recreating volume group configurations after disk replacement.

# CAVEATS

Only restores metadata, not data. Requires root privileges. Physical volumes must exist for restore to succeed. Data may be lost if metadata is inconsistent with disk contents.

# SEE ALSO

[vgcfgbackup](/man/vgcfgbackup)(8), [vgdisplay](/man/vgdisplay)(8), [lvm](/man/lvm)(8)

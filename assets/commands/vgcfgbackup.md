# TAGLINE

Backup LVM volume group metadata

# TLDR

Backup **all** volume groups

```sudo vgcfgbackup```

Backup **specific** volume group

```sudo vgcfgbackup [vg_name]```

Backup to **file**

```sudo vgcfgbackup -f [path/to/backup] [vg_name]```

Backup **multiple** VGs with template

```sudo vgcfgbackup -f [/tmp/vg-backup-%s] [vg1] [vg2]```

**Verbose** output

```sudo vgcfgbackup -v [vg_name]```

# SYNOPSIS

**vgcfgbackup** [_OPTIONS_] [_VG_NAME_...]

# PARAMETERS

**-f, --file** _FILE_
> Write backup to specified file

**-v, --verbose**
> Increase verbosity (can be repeated)

# DESCRIPTION

**vgcfgbackup** backs up LVM volume group configuration metadata to files. This backs up the volume group structure, not the actual user data contained in logical volumes.

By default, backups are written to /etc/lvm/backup/. The %s placeholder in filenames is replaced with the volume group name.

# CAVEATS

Only backs up metadata, not data. Requires root privileges. Backup files should be stored securely off the system being backed up.

# SEE ALSO

[vgcfgrestore](/man/vgcfgrestore)(8), [vgdisplay](/man/vgdisplay)(8), [lvm](/man/lvm)(8)

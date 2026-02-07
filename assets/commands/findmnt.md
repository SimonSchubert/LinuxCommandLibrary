# TAGLINE

query and verify mounted filesystems

# TLDR

**List** all mounted filesystems

```findmnt```

Search by **device**

```findmnt /dev/sdb1```

Search by **mountpoint**

```findmnt /```

Filter by **type**

```findmnt -t ext4,btrfs```

Find by **label**

```findmnt LABEL=BigStorage```

**Verify** fstab

```findmnt -x --verbose```

# SYNOPSIS

**findmnt** [_OPTIONS_] [_device_|_mountpoint_]

# DESCRIPTION

**findmnt** lists all mounted filesystems or searches for a filesystem by device, mountpoint, label, or UUID. It can also verify the mount table and fstab configuration for errors.

# PARAMETERS

**-t, --types** _list_
> Limit output to filesystems of specified types

**-o, --output** _list_
> Define output columns

**-l, --list**
> Use list output format

**-D, --df**
> Imitate df output (show space usage)

**-x, --verify**
> Verify mount table content

**-n, --noheadings**
> Don't print column headings

**-r, --raw**
> Use raw output format

**-J, --json**
> Use JSON output format

**LABEL=**_label_
> Search by filesystem label

**UUID=**_uuid_
> Search by filesystem UUID

# CAVEATS

The verify option checks for configuration errors but does not mount anything. Output format may vary between systems and kernel versions.

# HISTORY

**findmnt** is part of the **util-linux** package, providing mount information querying on Linux systems.

# SEE ALSO

[mount](/man/mount)(8), [df](/man/df)(1), [lsblk](/man/lsblk)(8)

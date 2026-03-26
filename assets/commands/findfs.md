# TAGLINE

locate filesystems by label or UUID

# TLDR

**Find device by filesystem label**

```findfs LABEL=[label]```

**Find device by filesystem UUID**

```findfs UUID=[uuid]```

**Find device by GPT partition label**

```findfs PARTLABEL=[partition_label]```

**Find device by GPT partition UUID**

```findfs PARTUUID=[partition_uuid]```

# SYNOPSIS

**findfs** _tag_=_value_

# DESCRIPTION

**findfs** finds a filesystem by label or UUID and prints the device path. It searches all block devices for matching filesystem metadata.

Used in boot scripts and mount operations to locate filesystems reliably.

# PARAMETERS

**LABEL=**_label_
> Search by filesystem label

**UUID=**_uuid_
> Search by filesystem UUID

**PARTLABEL=**_label_
> Search by GPT/MAC partition label

**PARTUUID=**_uuid_
> Search by GPT partition UUID

# CAVEATS

Part of util-linux. PARTUUID only available on GPT partition tables. Labels and UUIDs must be unique for reliable matching.

# SEE ALSO

[blkid](/man/blkid)(8), [lsblk](/man/lsblk)(8), [fstab](/man/fstab)(5)

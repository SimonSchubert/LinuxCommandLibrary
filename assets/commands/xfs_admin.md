# TLDR

Display **label**

```sudo xfs_admin -l [/dev/sdX]```

Set **label**

```sudo xfs_admin -L "[label]" [/dev/sdX]```

Display **UUID**

```sudo xfs_admin -u [/dev/sdX]```

Set **UUID**

```sudo xfs_admin -U [uuid] [/dev/sdX]```

**Generate** new UUID

```sudo xfs_admin -U generate [/dev/sdX]```

# SYNOPSIS

**xfs_admin** [_OPTIONS_] _DEVICE_

# PARAMETERS

**-l, --list**
> Display filesystem label

**-L, --Label** _LABEL_
> Set filesystem label

**-u, --uuid**
> Display filesystem UUID

**-U, --UUID** _UUID_
> Set filesystem UUID (or "generate" for new)

**-c** _0|1_
> Enable/disable lazy-counters

# DESCRIPTION

**xfs_admin** modifies parameters of an XFS filesystem. It can change the label and UUID of unmounted XFS filesystems.

The filesystem must be unmounted before modifying parameters.

# CAVEATS

Changing UUID may affect fstab and boot configurations. Requires root privileges. XFS filesystems only.

# SEE ALSO

[xfs_repair](/man/xfs_repair)(8), [mkfs.xfs](/man/mkfs.xfs)(8), [tune2fs](/man/tune2fs)(8)

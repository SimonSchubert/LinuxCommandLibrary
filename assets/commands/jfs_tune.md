# TLDR

**Show filesystem info**

```sudo jfs_tune [/dev/sda1]```

**Set volume label**

```sudo jfs_tune -L [label] [/dev/sda1]```

**Change UUID**

```sudo jfs_tune -U [random] [/dev/sda1]```

**List filesystem options**

```jfs_tune -l [/dev/sda1]```

# SYNOPSIS

**jfs_tune** [_options_] _device_

# PARAMETERS

_DEVICE_
> JFS filesystem device.

**-L** _LABEL_
> Set volume label.

**-U** _UUID_
> Set or generate UUID.

**-l**
> List filesystem info.

**-J** _OPTIONS_
> External journal options.

**--help**
> Display help information.

# DESCRIPTION

**jfs_tune** adjusts parameters on JFS filesystems. It sets labels, UUIDs, and other filesystem metadata.

The tool works on unmounted filesystems. It's similar to tune2fs for ext filesystems.

jfs_tune configures JFS parameters.

# CAVEATS

JFS filesystems only. Unmount before use. Linux utility.

# HISTORY

jfs_tune is part of **jfsutils**, providing administration tools for the JFS filesystem ported from IBM's AIX.

# SEE ALSO

[mkfs.jfs](/man/mkfs.jfs)(8), [fsck.jfs](/man/fsck.jfs)(8), [tune2fs](/man/tune2fs)(8)

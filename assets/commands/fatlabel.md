# TAGLINE

FAT filesystem volume label utility

# TLDR

**Get** the label of a FAT32 partition

```fatlabel [/dev/sda1]```

**Set** the label of a FAT32 partition

```fatlabel [/dev/sdc3] "[new_label]"```

# SYNOPSIS

**fatlabel** _device_ [_label_]

# DESCRIPTION

**fatlabel** gets or sets the volume label of a FAT filesystem. Without a label argument, it displays the current label. With a label argument, it sets a new label.

Part of the dosfstools package for managing FAT filesystems.

# PARAMETERS

_device_
> FAT partition device

_label_
> New volume label (optional)

# CAVEATS

FAT labels limited to 11 characters. Requires unmounted filesystem for writing. Part of dosfstools package.

# SEE ALSO

[dosfslabel](/man/dosfslabel)(8), [e2label](/man/e2label)(8), [mlabel](/man/mlabel)(1)

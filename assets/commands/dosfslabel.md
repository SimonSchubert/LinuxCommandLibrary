# TLDR

**Display the label** of a FAT filesystem

```dosfslabel [/dev/sdXN]```

**Set a new label** on a FAT filesystem

```dosfslabel [/dev/sdXN] "[NEW_LABEL]"```

**Remove the filesystem label**

```dosfslabel -r [/dev/sdXN]```

**Display the volume ID** instead of label

```dosfslabel -i [/dev/sdXN]```

**Set a new volume ID** (hexadecimal)

```dosfslabel -i [/dev/sdXN] [12345678]```

**Use a specific codepage** for encoding

```dosfslabel -c [437] [/dev/sdXN] "[LABEL]"```

# SYNOPSIS

**dosfslabel** [_OPTIONS_] _DEVICE_ [_NEW_]

# PARAMETERS

**-i**, **--volume-id**
> Switch to volume ID mode instead of label mode.

**-r**, **--reset**
> Remove label in label mode, or generate a new random ID in volume ID mode.

**-c** _PAGE_, **--codepage**=_PAGE_
> Use DOS codepage PAGE to encode/decode label (default: 850).

**-h**, **--help**
> Display help message and exit.

**-V**, **--version**
> Show version number and exit.

# DESCRIPTION

**dosfslabel** displays or changes the volume label or volume ID on MS-DOS FAT filesystems (FAT12, FAT16, FAT32). It is a compatibility symlink to **fatlabel** from the dosfstools package.

If NEW is omitted, the current label or volume ID is printed to standard output. Labels cannot exceed 11 characters and should be uppercase for best compatibility. An empty string or whitespace-only label is not allowed. Volume IDs are specified as hexadecimal numbers (without 0x prefix) fitting in 32 bits.

For historical reasons, FAT labels are stored in two locations: the boot sector and as a special entry in the root directory. Modern Windows systems read labels from the root directory. Since version 4.2, dosfslabel reads from root directory but writes to both locations.

# CAVEATS

The filesystem should be unmounted before changing the label to avoid inconsistencies. Labels are limited to 11 characters. Using dosfslabel prior to version 3.0.16 is not recommended due to bugs. Some special characters may not be properly encoded without specifying the correct codepage.

# HISTORY

dosfslabel is part of the **dosfstools** package, which provides utilities for MS-DOS FAT filesystems on Linux. The package includes mkfs.fat for creating filesystems, fsck.fat for checking and repairing, and fatlabel for managing labels. The tools have been maintained since the early days of Linux to ensure compatibility with DOS/Windows filesystems.

# SEE ALSO

[fatlabel](/man/fatlabel)(8), [mkfs.fat](/man/mkfs.fat)(8), [fsck.fat](/man/fsck.fat)(8), [e2label](/man/e2label)(8)

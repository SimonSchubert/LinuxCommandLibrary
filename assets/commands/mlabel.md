# TLDR

**Set a volume label** on a FAT/VFAT filesystem

```mlabel -i [/dev/sda] ::"[new_label]"```

**Show current volume label**

```mlabel -s -i [/dev/sda] ::```

**Clear** existing volume label

```mlabel -c -i [/dev/sda] ::```

Set a **new random serial number**

```mlabel -n -i [/dev/sda] ::```

Set a **specific serial number** (8 hex digits)

```mlabel -N [12345678] -i [/dev/sda] ::```

# SYNOPSIS

**mlabel** [**-v**] [**-c**] [**-s**] [**-n**] [**-N** _serial_] _drive:_[_new_label_]

# PARAMETERS

**-c**
> Clear existing label without prompting

**-s**
> Show existing label without prompting

**-n**
> Assign new random serial number to disk

**-N _serial_**
> Set specific serial number; 8-digit hexadecimal, no spaces

**-v**
> Verbose mode; display new label if changed

**-i _device_**
> Specify device directly instead of using drive letter

# DESCRIPTION

**mlabel** adds, displays, or removes volume labels on MS-DOS FAT and VFAT filesystems. When invoked without options, it displays the current label and prompts for a new one.

Volume labels are limited to 11 single-byte characters. The tool validates and adjusts labels to ensure MS-DOS compatibility. An empty label input (pressing return at prompt) deletes the existing label.

mlabel is part of the **mtools** package, which provides utilities for accessing MS-DOS filesystems from Unix/Linux without mounting.

# CAVEATS

Labels are limited to 11 characters and must be valid MS-DOS format. Invalid characters are automatically corrected. The serial number is stored in the boot sector and used by Windows for volume identification.

# HISTORY

**mlabel** is part of **mtools**, originally developed by Emmet P. Gray in the late 1980s. Mtools provides MS-DOS file system utilities for Unix systems, allowing access to FAT filesystems without mounting.

# SEE ALSO

[fatlabel](/man/fatlabel)(8), [mtools](/man/mtools)(1), [mdir](/man/mdir)(1)

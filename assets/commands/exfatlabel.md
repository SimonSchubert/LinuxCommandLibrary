# TAGLINE

exFAT filesystem label utility

# TLDR

**Show volume label**

```exfatlabel [/dev/sda1]```

**Set volume label**

```exfatlabel [/dev/sda1] "[NEW_LABEL]"```

**Show volume serial number**

```exfatlabel -i [/dev/sda1]```

**Set volume serial number**

```exfatlabel -i [/dev/sda1] [0x12345678]```

# SYNOPSIS

**exfatlabel** [_options_] _device_ [_label_]

# PARAMETERS

**-i**, **--volume-serial**
> Switch to volume serial mode to get or set the volume serial number.

**-V**
> Print version number and exit.

# DESCRIPTION

**exfatlabel** displays or sets the volume label or volume serial of an exFAT filesystem. If no label argument is given, displays the current label. Labels can be up to 15 characters.

# CAVEATS

The filesystem must be unmounted before changing the label or serial number.

# SEE ALSO

[mkfs.exfat](/man/mkfs.exfat)(8), [fsck.exfat](/man/fsck.exfat)(8), [e2label](/man/e2label)(8)

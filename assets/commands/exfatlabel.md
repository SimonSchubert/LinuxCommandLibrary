# TAGLINE

get or set an exFAT filesystem label or serial number

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

**exfatlabel** displays or sets the volume label or volume serial of an exFAT filesystem. If no label argument is given, displays the current label. Labels can be up to 15 characters (fewer if characters beyond Unicode BMP are used, since labels are stored internally as UTF-16). An empty label (`''`) removes the volume name.

# CAVEATS

The filesystem must be unmounted before changing the label or serial number. Zero is returned on success, non-zero on failure.

# SEE ALSO

[mkfs.exfat](/man/mkfs.exfat)(8), [fsck.exfat](/man/fsck.exfat)(8), [e2label](/man/e2label)(8)

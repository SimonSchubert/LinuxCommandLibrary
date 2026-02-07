# TAGLINE

exFAT filesystem label utility

# TLDR

**Show volume label**

```exfatlabel [/dev/sda1]```

**Set volume label**

```exfatlabel [/dev/sda1] "[NEW_LABEL]"```

# SYNOPSIS

**exfatlabel** [_options_] _device_ [_label_]

# DESCRIPTION

**exfatlabel** displays or sets the volume label of an exFAT filesystem. If no label is given, displays the current label.

# CAVEATS

The filesystem must be unmounted before changing the label. Maximum label length is 11 characters.

# SEE ALSO

[exfatprogs](/man/exfatprogs)(8), [mkfs.exfat](/man/mkfs.exfat)(8)

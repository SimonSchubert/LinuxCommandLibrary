# TLDR

**Create keyboard layout**

```grub-mklayout -o [layout.gkb] < [layout.ckb]```

**Convert from console layout**

```ckbcomp [us] | grub-mklayout -o [us.gkb]```

**Verbose output**

```grub-mklayout -v -o [layout.gkb] < [input]```

# SYNOPSIS

**grub-mklayout** [_options_]

# PARAMETERS

**-o**, **--output** _FILE_
> Output GKB file.

**-v**, **--verbose**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**grub-mklayout** creates keyboard layout files for GRUB. It converts console keyboard maps to GRUB's GKB format.

The tool enables non-US keyboard layouts in GRUB. It reads from stdin and produces a binary layout file for use during boot.

grub-mklayout creates GRUB keyboard layouts.

# CAVEATS

Part of GRUB package. Requires ckbcomp for console layouts. Limited layout options.

# HISTORY

grub-mklayout was developed as part of **GNU GRUB 2** to support international keyboard layouts in the boot menu.

# SEE ALSO

[grub](/man/grub)(8), [ckbcomp](/man/ckbcomp)(1), [loadkeys](/man/loadkeys)(1)

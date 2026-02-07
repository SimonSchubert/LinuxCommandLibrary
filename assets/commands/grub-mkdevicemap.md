# TAGLINE

create GRUB device mapping file

# TLDR

**Generate device map**

```sudo grub-mkdevicemap```

**Specify output file**

```sudo grub-mkdevicemap -m /boot/grub/device.map```

**Verbose output**

```sudo grub-mkdevicemap -v```

# SYNOPSIS

**grub-mkdevicemap** [_options_]

# PARAMETERS

**-m**, **--device-map** _FILE_
> Output device map file.

**-n**, **--no-floppy**
> Skip floppy detection.

**-v**, **--verbose**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**grub-mkdevicemap** creates a device map file for GRUB that maps BIOS drive numbers to Linux device names. The device map helps GRUB understand disk ordering.

The map is automatically generated but can be customized for special configurations where disk ordering needs to be explicitly controlled.

# CAVEATS

Deprecated in GRUB 2. May be needed for legacy setups. Disk order detection may vary.

# HISTORY

grub-mkdevicemap was developed as part of **GNU GRUB** for device mapping between BIOS and Linux.

# SEE ALSO

[grub-install](/man/grub-install)(8), [grub-mkconfig](/man/grub-mkconfig)(8), [grub](/man/grub)(8)

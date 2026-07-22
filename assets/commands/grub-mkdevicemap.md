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
> Output device map file (default: /boot/grub/device.map).

**-n**, **--no-floppy**
> Skip floppy detection.

**-s**, **--probe-second-floppy**
> Also probe the second floppy drive.

**-v**, **--verbose**
> Verbose mode.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**grub-mkdevicemap** creates a device map file for GRUB that maps BIOS drive numbers to Linux device names. The device map helps GRUB understand disk ordering.

The map is automatically generated but can be customized for special configurations where disk ordering needs to be explicitly controlled.

# CAVEATS

Mostly unnecessary today since GRUB generates a device map on the fly and identifies disks by UUID or label in grub.cfg. Still useful to override detection, such as when a partition or logical volume is used as a virtual machine's disk.

# HISTORY

grub-mkdevicemap was developed as part of **GNU GRUB** for device mapping between BIOS and Linux.

# INSTALL

```apt: sudo apt install grub-common```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[grub-install](/man/grub-install)(8), [grub-mkconfig](/man/grub-mkconfig)(8), [grub](/man/grub)(8)

# RESOURCES

```[Homepage](https://www.gnu.org/software/grub/)```

```[Source code](https://git.savannah.gnu.org/cgit/grub.git)```

```[Documentation](https://www.gnu.org/software/grub/manual/grub/grub.html)```

<!-- verified: 2026-07-17 -->

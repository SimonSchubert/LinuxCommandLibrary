# TAGLINE

combine 32-bit and 64-bit EFI binaries

# TLDR

**Glue EFI binaries**

```grub-glue-efi -3 [ia32.efi] -6 [x64.efi] -o [boot.efi]```

**Create fat binary**

```grub-glue-efi --input32 [grub32.efi] --input64 [grub64.efi] --output [grub.efi]```

# SYNOPSIS

**grub-glue-efi** [_options_]

# PARAMETERS

**-3**, **--input32** _FILE_
> 32-bit EFI input.

**-6**, **--input64** _FILE_
> 64-bit EFI input.

**-o**, **--output** _FILE_
> Output file.

**-v**, **--verbose**
> Print verbose messages.

**--help**
> Display help information.

# DESCRIPTION

**grub-glue-efi** processes ia32 and amd64 EFI images and glues them according to Apple format, creating an Apple fat EFI binary from two EFI binaries. This enables booting on systems with either 32-bit or 64-bit EFI firmware from a single file.

The tool is primarily useful for creating universal EFI binaries for GRUB bootloaders on removable media that must boot on diverse hardware.

# CAVEATS

Part of GRUB package. Requires both architecture binaries. For special bootloader scenarios only.

# HISTORY

grub-glue-efi was developed as part of **GNU GRUB** to support universal EFI boot media creation.

# SEE ALSO

[grub](/man/grub)(8), [grub-install](/man/grub-install)(8)

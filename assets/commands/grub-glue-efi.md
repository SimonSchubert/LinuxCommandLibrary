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

**--help**
> Display help information.

# DESCRIPTION

**grub-glue-efi** combines 32-bit and 64-bit EFI binaries into a single fat binary. This enables booting on systems with either architecture.

The tool creates universal EFI binaries for GRUB bootloaders, which is useful for removable media that must boot on diverse hardware.

# CAVEATS

Part of GRUB package. Requires both architecture binaries. For special bootloader scenarios only.

# HISTORY

grub-glue-efi was developed as part of **GNU GRUB** to support universal EFI boot media creation.

# SEE ALSO

[grub-install](/man/grub-install)(8), [grub-mkimage](/man/grub-mkimage)(1), [grub](/man/grub)(8)

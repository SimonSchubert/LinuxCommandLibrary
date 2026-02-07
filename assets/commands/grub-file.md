# TAGLINE

check boot image file type

# TLDR

Check if a file is an **ARM EFI** image

```grub-file --is-arm-efi [path/to/file]```

Check if a file is an **i386 EFI** image

```grub-file --is-i386-efi [path/to/file]```

Check if a file is an **x86_64 EFI** image

```grub-file --is-x86_64-efi [path/to/file]```

Check if a file is an **ARM Linux** kernel

```grub-file --is-arm-linux [path/to/file]```

Check if a file is an **x86 Linux** kernel

```grub-file --is-x86-linux [path/to/file]```

Check if a file is an **x86_64 XNU** (macOS) kernel

```grub-file --is-x86_64-xnu [path/to/file]```

# SYNOPSIS

**grub-file** _--is-TYPE_ _file_

# PARAMETERS

**--is-arm-efi**
> Check for ARM EFI image

**--is-arm64-efi**
> Check for ARM64 EFI image

**--is-i386-efi**
> Check for i386 EFI image

**--is-x86_64-efi**
> Check for x86_64 EFI image

**--is-arm-linux**
> Check for ARM Linux kernel

**--is-x86-linux**
> Check for x86 Linux kernel

**--is-x86_64-linux**
> Check for x86_64 Linux kernel

**--is-x86_64-xnu**
> Check for macOS XNU kernel

**--is-multiboot**
> Check for Multiboot image

# DESCRIPTION

**grub-file** checks whether a file is a bootable image of a specific type. It examines file headers and signatures to identify kernel images, EFI applications, and other bootable formats.

The command returns exit code 0 (success) if the file matches the specified type, or 1 (failure) if it does not. This is useful in scripts for validating boot images or determining the correct boot method.

# CAVEATS

Only checks file type signatures; doesn't verify if the image is actually bootable or valid. Some specialized or custom kernels may not be recognized correctly.

# HISTORY

grub-file is part of GRUB 2, providing a utility for image type detection. This is useful during installation and configuration to ensure the correct bootloader setup for the target architecture.

# SEE ALSO

[grub-install](/man/grub-install)(8), [grub-probe](/man/grub-probe)(8), [file](/man/file)(1)

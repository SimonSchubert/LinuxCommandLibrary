# TAGLINE

modern, advanced, portable, multiprotocol bootloader and boot manager

# TLDR

Install on **MBR** partitioned device

```limine bios-install [/dev/sdX]```

Install on **GPT** partitioned device with stage 2 partition

```limine bios-install [/dev/sdX] [partition_number]```

Install to a **disk image** file

```limine bios-install [path/to/image.iso]```

Enroll config hash into **Limine EFI executable** for Secure Boot

```limine enroll-config [path/to/BOOTX64.EFI]```

# SYNOPSIS

**limine** _command_ [_arguments_]

# DESCRIPTION

**limine** is a modern, advanced, portable, multiprotocol bootloader and boot manager supporting BIOS and UEFI systems. It can boot operating systems and kernels using the Limine Boot Protocol, Multiboot 1 and 2, Linux boot protocol, and chainloading.

For BIOS systems, use **limine bios-install** to write the bootloader to a device or image. The boot device must contain limine-bios.sys and limine.conf in a /boot/limine, /boot, /limine, or root directory of one of the partitions.

For UEFI systems, copy the appropriate BOOT*.EFI file to the EFI System Partition. Use **limine enroll-config** to enroll a configuration hash for Secure Boot verification.

# PARAMETERS

**bios-install** _DEVICE_ [_PARTITION_]
> Install Limine BIOS bootloader to a device or image. For GPT disks, optionally specify a 1-based stage 2 partition number (at least 32 KiB). If omitted on GPT, automatic detection is attempted.

**enroll-config** _EFI_FILE_
> Enroll the BLAKE2B hash of the Limine config file into the Limine EFI executable image for verification purposes (Secure Boot).

# CAVEATS

For GPT BIOS installations, a dedicated partition of at least 32 KiB is needed for stage 2. UEFI Secure Boot requires enrolling the config hash with **limine enroll-config**. Always back up existing bootloaders before installation.

# SEE ALSO

[limine-enroll-config](/man/limine-enroll-config)(1), [limine-entry-tool](/man/limine-entry-tool)(1), [grub-install](/man/grub-install)(8)

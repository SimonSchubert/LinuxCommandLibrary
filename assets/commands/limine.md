# TAGLINE

advanced, portable, multiprotocol bootloader supporting BIOS and UEFI systems

# TLDR

Install on **MBR disk**

```limine bios-install /dev/sdX```

Install on **GPT disk** with partition

```limine bios-install /dev/sdX [partition_number]```

Install to **disk image**

```limine bios-install [path/to/image.iso]```

Install for **UEFI** systems

```limine-install```

**Update** boot entries

```limine-update```

**Scan** for other operating systems

```limine-scan```

# SYNOPSIS

**limine** _command_ [_options_]

# DESCRIPTION

**limine** is an advanced, portable, multiprotocol bootloader supporting BIOS and UEFI systems. It can boot various operating systems and kernels using the Limine Boot Protocol, Multiboot 1 and 2, and chainloading.

# PARAMETERS

**bios-install DEVICE**
> Install Limine bootloader to BIOS system

**uefi-install**
> Install Limine for UEFI systems

**partition_number**
> Specify BIOS boot partition for GPT disks

# CAVEATS

UEFI installation requires limine-entry-tool package. Backup existing bootloaders before installation.

# SEE ALSO

[limine-enroll-config](/man/limine-enroll-config)(1), [limine-entry-tool](/man/limine-entry-tool)(1), [grub-install](/man/grub-install)(8)

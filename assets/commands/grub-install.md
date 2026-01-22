# TLDR

Install GRUB on a **BIOS system**

```sudo grub-install [/dev/device]```

Install GRUB on a BIOS system with **specific architecture**

```sudo grub-install --target i386-pc [/dev/device]```

Install GRUB on an **UEFI system**

```sudo grub-install --efi-directory [/path/to/efi]```

Install GRUB on UEFI with **architecture and bootloader ID**

```sudo grub-install --target x86_64-efi --efi-directory [/path/to/efi] --bootloader-id GRUB```

Install GRUB **pre-loading specific modules**

```sudo grub-install --target x86_64-efi --efi-directory [/path/to/efi] --modules "part_gpt part_msdos"```

Display **help**

```grub-install --help```

# SYNOPSIS

**grub-install** [_options_] _device_

# PARAMETERS

**--target** _PLATFORM_
> Installation target: i386-pc (BIOS), x86_64-efi, i386-efi, arm-efi

**--efi-directory** _DIR_
> EFI System Partition mount point

**--bootloader-id** _ID_
> Boot manager identifier in EFI menu

**--boot-directory** _DIR_
> Directory containing boot files (default: /boot)

**--modules** _MODULES_
> Pre-load specified GRUB modules

**--recheck**
> Delete device map and regenerate

**--removable**
> Install to removable media path

**--force**
> Install even if problems detected

# DESCRIPTION

**grub-install** installs the GRUB bootloader to a disk device or EFI System Partition. The installation method differs between BIOS/legacy and UEFI systems.

For **BIOS systems**, GRUB is installed to the Master Boot Record (MBR) or a BIOS Boot Partition on GPT disks.

For **UEFI systems**, GRUB is installed to the EFI System Partition (ESP). The **--bootloader-id** option sets the name shown in the UEFI boot menu.

After installation, run **grub-mkconfig** to generate the configuration file.

# CAVEATS

Requires root privileges. Incorrect installation can make system unbootable - have recovery media ready. UEFI installation requires the ESP to be mounted. Secure Boot may require signed GRUB binaries.

# HISTORY

GRUB 2 grub-install replaced the older GRUB Legacy installation method around **2009**. It supports modern features like GPT partition tables, UEFI, and modular design.

# SEE ALSO

[grub-mkconfig](/man/grub-mkconfig)(8), [grub-set-default](/man/grub-set-default)(8), [efibootmgr](/man/efibootmgr)(8)

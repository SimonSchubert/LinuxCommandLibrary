# TAGLINE

helper script for managing Limine bootloader entries on UEFI systems

# TLDR

**Scan** for other active UEFI boot entries and add them to Limine menu

```limine-entry-tool --scan```

**Add** a new kernel boot entry with initramfs and kernel file

```limine-entry-tool --add "[kernel_name]" "[path/to/initramfs]" "[path/to/vmlinuz]"```

Add a new **Unified Kernel Image** (UKI) boot entry

```limine-entry-tool --add-uki "[kernel_name]" "[path/to/uki.efi]"```

**Remove** a kernel boot entry and its associated files from the ESP

```limine-entry-tool --remove "[kernel_name]"```

Remove an **entire OS entry** by its name or machine ID

```limine-entry-tool --remove-os "[OS_name|machine_id]"```

Add an **EFI boot entry** for an alternative bootloader (e.g., Windows)

```limine-entry-tool --add-efi "[EFI_entry_name]" "[path/to/loader.efi]"```

# SYNOPSIS

**limine-entry-tool** _--option_ [_arguments_]

# PARAMETERS

**--scan**
> Scan for active UEFI boot entries and add them to the Limine configuration

**--add _name_ _initramfs_ _vmlinuz_**
> Add a new kernel boot entry with the specified name, initramfs, and kernel file

**--add-uki _name_ _uki.efi_**
> Add a Unified Kernel Image boot entry

**--remove _name_**
> Remove a kernel boot entry and its files from the EFI System Partition

**--remove-os _name|machine_id_**
> Remove an entire operating system entry by name or machine ID

**--add-efi _name_ _loader.efi_**
> Add an EFI boot entry for another bootloader (chainloading)

# DESCRIPTION

**limine-entry-tool** is a helper script for managing Limine bootloader entries on UEFI systems. It automates the process of adding, removing, and discovering boot entries in the Limine configuration.

The tool can detect existing UEFI boot entries (including other operating systems like Windows) and add them to Limine's boot menu. It supports both traditional kernel/initramfs pairs and modern Unified Kernel Images (UKI).

Boot entries are stored on the EFI System Partition (ESP), and the tool manages both the configuration and the actual kernel files.

# CAVEATS

Requires write access to the EFI System Partition. Changes to Limine configuration may require re-enrollment of the config hash if Secure Boot is enabled (see **limine-enroll-config**). The ESP must be mounted before running this tool.

# SEE ALSO

[limine](/man/limine)(1), [limine-enroll-config](/man/limine-enroll-config)(1), [limine-snapper-sync](/man/limine-snapper-sync)(1), [efibootmgr](/man/efibootmgr)(8)

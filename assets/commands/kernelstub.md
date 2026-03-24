# TAGLINE

Automatic kernel EFI stub manager

# TLDR

**Print the current configuration**

```sudo kernelstub -p```

**Copy kernel and initrd to ESP** and set up NVRAM boot entry

```sudo kernelstub```

**Set kernel boot options**

```sudo kernelstub -o "quiet splash"```

**Add a kernel boot option** without replacing existing ones

```sudo kernelstub -a "nomodeset"```

**Remove a kernel boot option**

```sudo kernelstub -d "quiet"```

**Simulate actions** without making changes (dry run)

```sudo kernelstub -c```

# SYNOPSIS

**kernelstub** [**-h**] [**-c**] [**-p**] [**-e** _ESP_PATH_] [**-r** _ROOT_PATH_] [**-k** _KERNEL_PATH_] [**-i** _INITRD_PATH_] [**-o** _OPTIONS_] [**-a** _OPTIONS_] [**-d** _OPTIONS_] [**-g** _LOG_FILE_] [**-l**] [**-n**] [**-s**] [**-m**] [**-f**] [**-v**]

# PARAMETERS

**-h**, **--help**
> Display help text and exit.

**-c**, **--dry-run**
> Simulate all actions without actually performing them.

**-p**, **--print-config**
> Print the current configuration and exit.

**-e** _PATH_, **--esp-path** _PATH_
> Manually specify the path to the EFI System Partition (default: /boot/efi).

**-r** _PATH_, **--root-path** _PATH_
> The path where the root filesystem to use is mounted.

**-k** _PATH_, **--kernel-path** _PATH_
> The path to the kernel image.

**-i** _PATH_, **--initrd-path** _PATH_
> The path to the initrd image.

**-o** _OPTIONS_, **--options** _OPTIONS_
> Set the complete kernel boot options (saves to config).

**-a** _OPTIONS_, **--add-options** _OPTIONS_
> Add boot options to the configuration if not already present.

**-d** _OPTIONS_, **--delete-options** _OPTIONS_
> Remove boot options from the configuration if present.

**-g** _FILE_, **--log-file** _FILE_
> Path to the log file (default: /var/log/kernelstub.log).

**-l**, **--loader**
> Create a systemd-boot compatible loader configuration (saves to config).

**-n**, **--no-loader**
> Turn off creating loader configuration.

**-s**, **--stub**
> Set up NVRAM entries for the copied kernel (saves to config).

**-m**, **--manage-only**
> Only copy entries to ESP, do not set up NVRAM entries (saves to config).

**-f**, **--force-update**
> Forcibly update loader.conf to set the new entry as default.

**-v**, **--verbose**
> Increase verbosity. Use **-vv** for debug output.

# DESCRIPTION

**kernelstub** is an automatic EFI System Partition (ESP) manager for booting Linux on UEFI systems. It copies the current kernel and initramfs images to the ESP so they are discoverable by EFI firmware and boot loaders, and sets up NVRAM boot menu entries for direct kernel booting (EFI stub booting).

The tool automatically updates these entries when new kernel versions are installed. It can create systemd-boot compatible loader configurations and manages kernel boot parameters persistently via configuration files. It is primarily used on Pop!_OS, which uses systemd-boot instead of GRUB as its default bootloader.

# CONFIGURATION

Configuration stored in **/etc/kernelstub/configuration** (auto-created if missing). The distributor template lives at **/etc/default/kernelstub** (read-only). A sample config is provided at **/etc/kernelstub/SAMPLE**. The **-o**, **-l**, **-s**, and **-m** flags persist their values to the config file, affecting future invocations.

# CAVEATS

Must be run as **root** (exit code 176 if not). UEFI-only — has no purpose on legacy BIOS systems. The **-f** flag can overwrite another OS's boot configuration on dual-boot systems. Command-line options override configuration file settings, and some flags (**-o**, **-l**, **-s**, **-m**) persist changes to the config file.

# HISTORY

**kernelstub** was created by **Ian Santopietro** in **2017** to simplify and automate EFI stub booting on Linux. Written in **Python 3**, it was developed in the context of **Pop!_OS** at **System76**, which uses systemd-boot as its default bootloader. The project is maintained under the pop-os organization on GitHub.

# SEE ALSO

[bootctl](/man/bootctl)(1), [efibootmgr](/man/efibootmgr)(8), [update-initramfs](/man/update-initramfs)(8)

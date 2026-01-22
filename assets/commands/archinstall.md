# TLDR

Start the **interactive installer**

```archinstall```

# SYNOPSIS

**archinstall** [_options_]

# DESCRIPTION

**archinstall** is a guided Arch Linux installer that provides an interactive menu-driven installation experience. It simplifies the Arch Linux installation process while still providing flexibility and customization options.

# PARAMETERS

**--config path**
> Load configuration from a file

**--creds path**
> Load credentials from a file

**--disk_layouts path**
> Load disk layout configuration from a file

**--script name**
> Run a specific installation profile/script

**--silent**
> Run without user prompts (requires configuration)

**--dry-run**
> Test the installation without making changes

**--advanced**
> Show advanced options in the menu

# CAVEATS

Requires network connectivity. Should only be run from the Arch Linux live installation environment. Creates partitions and formats disks; data loss may occur.

# HISTORY

Developed by the **Arch Linux** community and officially included in the installation ISO since **2021** as an alternative to the traditional manual installation process.

# SEE ALSO

[arch-chroot](/man/arch-chroot)(8), [pacstrap](/man/pacstrap)(8), [genfstab](/man/genfstab)(8)

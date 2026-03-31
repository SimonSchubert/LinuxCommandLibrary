# TAGLINE

Guided Arch Linux installer with interactive menus

# TLDR

Start the **interactive installer**

```archinstall```

Run a specific **installation profile**

```archinstall --script [minimal]```

Run with a **configuration file**

```archinstall --config [/path/to/config.json]```

Run in **silent mode** with predefined config

```archinstall --config [/path/to/config.json] --silent```

# SYNOPSIS

**archinstall** [_options_]

# DESCRIPTION

**archinstall** is a guided Arch Linux installer that provides an interactive menu-driven installation experience. It simplifies the Arch Linux installation process while still providing flexibility and customization options.

# PARAMETERS

**--config** _path_
> Load configuration from a JSON file.

**--creds** _path_
> Load credentials (passwords, keys) from a file.

**--disk-layout** _path_
> Load disk layout configuration from a file.

**--script** _name_
> Run a specific installation profile (e.g., minimal, desktop).

**--silent**
> Run without user prompts (requires --config).

**--dry-run**
> Test the installation without making changes.

# CAVEATS

Requires network connectivity. Should only be run from the Arch Linux live installation environment. Creates partitions and formats disks; data loss may occur.

# HISTORY

Developed by the **Arch Linux** community and officially included in the installation ISO since **2021** as an alternative to the traditional manual installation process.

# SEE ALSO

[pacman](/man/pacman)(8), [arch-chroot](/man/arch-chroot)(8), [pacstrap](/man/pacstrap)(8), [genfstab](/man/genfstab)(8)

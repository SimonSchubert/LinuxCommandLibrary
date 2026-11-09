# TAGLINE

Complete SteamOS installation setup

# TLDR

**Finalize** installation

```sudo steamos-finalize-install --no-kernel```

Finalize without **bootloaders** or kernel

```sudo steamos-finalize-install --no-bootloaders --no-kernel```

Skip **migration** steps

```sudo steamos-finalize-install --no-kernel --no-migrate```

Set specific **root hash**

```sudo steamos-finalize-install --no-kernel --roothash [hash]```

**Force** migration steps outside a chroot

```sudo steamos-finalize-install --no-kernel --force```

# SYNOPSIS

**steamos-finalize-install** [_OPTIONS_]

# PARAMETERS

**--no-bootloaders**
> Skip bootloader setup

**--no-kernel**
> Skip kernel installation

**--no-boot-install**
> Skip the whole boot artifact installation step

**--no-migrate**
> Skip all migration steps

**--roothash** _HASH_
> Record the given root hash on the EFI partition

**-f**, **--force**
> Run the migration steps even when not in a chroot

**-h**, **--help**
> Show usage and exit

# DESCRIPTION

**steamos-finalize-install** performs post-update migration steps before a new SteamOS installation is marked ready, and installs boot artifacts on the device. The bootloader step installs the SteamOS chainloader and GRUB and sets up the boot configuration for the current image.

The migration steps convert saved configuration, such as Wi-Fi connections and pacman settings, for the new image. They run only inside a chroot unless **--force** is used. When run inside a chroot, the command also triggers the post-update service for the next boot.

# CAVEATS

Requires root privileges. Incorrect use may render the system unbootable. Current versions refuse to run the boot installation step without **--no-kernel**, unless **--no-boot-install** skips it entirely. This command is specific to SteamOS 3.x on Steam Deck and compatible hardware. It has no official documentation; options are taken from the script.

# HISTORY

**steamos-finalize-install** is part of Valve's **steamos-customizations** package and was formerly named **steamos-boot-install**, which remains as a compatibility wrapper. It handles the final stage of the A/B partition installation system used by SteamOS 3.0 on the Steam Deck.

# SEE ALSO

[steamos-update](/man/steamos-update)(1), [steamos-chroot](/man/steamos-chroot)(1), [steamos-boot-install](/man/steamos-boot-install)(1)

# RESOURCES

```[Source code](https://gitlab.com/evlaV/steamos-customizations)```

<!-- verified: 2026-11-09 -->

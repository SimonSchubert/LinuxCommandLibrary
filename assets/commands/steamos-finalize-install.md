# TLDR

**Finalize** installation

```sudo steamos-finalize-install```

Finalize without **bootloaders** or kernel

```sudo steamos-finalize-install --no-bootloaders --no-kernel```

Skip **migration** steps

```sudo steamos-finalize-install --no-migrate```

Set specific **root hash**

```sudo steamos-finalize-install --roothash [hash]```

**Force** migration regardless of environment

```sudo steamos-finalize-install --force```

# SYNOPSIS

**steamos-finalize-install** [_OPTIONS_]

# PARAMETERS

**--no-bootloaders**
> Skip bootloader setup

**--no-kernel**
> Skip kernel installation

**--no-migrate**
> Skip all migration steps

**--roothash** _HASH_
> Set specific root hash during finalization

**--force**
> Force system migration regardless of environment

# DESCRIPTION

**steamos-finalize-install** completes a SteamOS installation by setting up bootloaders, installing the kernel, and applying system updates. It performs necessary migration steps to transition from an incomplete installation to a fully bootable system.

This command is typically run as part of the installation process but can be manually invoked to repair or reconfigure boot components.

# CAVEATS

Requires root privileges. Incorrect use may render the system unbootable. The --force flag should be used with caution as it bypasses safety checks.

# HISTORY

**steamos-finalize-install** is part of the **SteamOS** utilities developed by **Valve**. It handles the final stage of the A/B partition installation system used by SteamOS 3.0 on the Steam Deck.

# SEE ALSO

[steamos-update](/man/steamos-update)(1), [steamos-chroot](/man/steamos-chroot)(1)

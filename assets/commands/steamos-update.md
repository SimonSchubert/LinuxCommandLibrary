# TAGLINE

Update SteamOS system image

# TLDR

**Update** SteamOS to the latest version

```sudo steamos-update```

**Check** if updates are available without installing

```sudo steamos-update check```

**Check in a script** (exit code 7 means already up to date)

```sudo steamos-update check; echo $?```

**Switch the update branch** before updating

```steamos-select-branch [beta]```

**Enable read-write** mode first (if modifying root filesystem before updates)

```sudo steamos-readonly disable```

# SYNOPSIS

**steamos-update** [_COMMAND_]

# COMMANDS

(no argument)
> Download and install available updates

**check**
> Check if updates are available without installing

# DESCRIPTION

**steamos-update** updates SteamOS to the latest available version on the selected branch. It is the same command the Steam client runs from **Settings > System**. Internally it calls **steamos-atomupd-client**, which queries Valve's update server, downloads the image with RAUC and casync, and writes it to the inactive A/B partition. The new version becomes active after the next reboot.

The A/B partition scheme ensures a reliable fallback if an update fails - the previous working partition remains available for recovery.

**steamos-update** returns exit code **0** when an update was applied or is available (depending on subcommand), and **7** when the system is already up to date (useful for scripting). Other non-zero codes indicate a failed check or update.

# CAVEATS

Requires network connectivity and root privileges to apply updates. Updates can be large. The system does not switch to the new image until it is rebooted. Changes made to the root filesystem after **steamos-readonly disable** are lost on update, because the whole image is replaced. Update availability depends on the selected branch (e.g. stable, beta, preview, or main), chosen with **steamos-select-branch**. Running on non-SteamOS systems is not supported.

# HISTORY

**steamos-update** is part of **steamos-customizations**, developed by **Valve** and **Collabora**. SteamOS 3, released with the Steam Deck in 2022, uses an image-based A/B update system similar to Chrome OS and Android, ensuring atomic updates and easy rollback. The older **steamos-update-os** wrapper is deprecated in favor of **steamos-update**.

# SEE ALSO

[steamos-select-branch](/man/steamos-select-branch)(1), [steamos-finalize-install](/man/steamos-finalize-install)(1), [steamos-readonly](/man/steamos-readonly)(1), [steamos-devmode](/man/steamos-devmode)(1)

# RESOURCES

```[Homepage](https://store.steampowered.com/steamos)```

<!-- verified: 2026-11-23 -->

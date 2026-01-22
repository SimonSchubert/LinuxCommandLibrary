# TLDR

**Update** SteamOS

```steamos-update```

**Check** for updates

```steamos-update check```

# SYNOPSIS

**steamos-update** [_COMMAND_]

# COMMANDS

(no argument)
> Download and install available updates

**check**
> Check if updates are available without installing

# DESCRIPTION

**steamos-update** updates SteamOS to the latest available version on the selected branch. Updates are downloaded and installed to the inactive A/B partition, then the system reboots to the updated partition.

The A/B partition scheme ensures a reliable fallback if an update fails - the previous working partition remains available for recovery.

# CAVEATS

Requires network connectivity. Updates may require significant download sizes. The system will reboot after installation. Update availability depends on the selected branch (stable, beta, or main).

# HISTORY

**steamos-update** is part of the **SteamOS** utilities developed by **Valve**. SteamOS 3.0 uses an image-based update system similar to Chrome OS and Android, ensuring atomic updates and easy rollback.

# SEE ALSO

[steamos-select-branch](/man/steamos-select-branch)(1), [steamos-finalize-install](/man/steamos-finalize-install)(1)

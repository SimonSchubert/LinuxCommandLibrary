# TAGLINE

Update SteamOS system image

# TLDR

**Update** SteamOS to the latest version

```sudo steamos-update```

**Check** if updates are available without installing

```steamos-update check```

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

**steamos-update** updates SteamOS to the latest available version on the selected branch. Updates are downloaded and installed to the inactive A/B partition, then the system reboots to the updated partition.

The A/B partition scheme ensures a reliable fallback if an update fails - the previous working partition remains available for recovery.

**steamos-update** returns exit code **0** when an update was applied or is available (depending on subcommand), and **7** when the system is already up to date (useful for scripting).

# CAVEATS

Requires network connectivity and root privileges to apply updates. Updates can be large. The system reboots into the updated partition after installation. Update availability depends on the selected branch (stable, beta, or main), chosen with **steamos-select-branch**. Running on non-SteamOS systems is not supported.

# HISTORY

**steamos-update** is part of the **SteamOS** utilities developed by **Valve**. SteamOS 3.0 uses an image-based update system similar to Chrome OS and Android, ensuring atomic updates and easy rollback.

# SEE ALSO

[steamos-select-branch](/man/steamos-select-branch)(1), [steamos-finalize-install](/man/steamos-finalize-install)(1), [steamos-readonly](/man/steamos-readonly)(1)

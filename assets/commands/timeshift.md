# TAGLINE

System backup and restore using snapshots

# TLDR

**List** all snapshots

```sudo timeshift --list```

**Create** a snapshot with a description

```sudo timeshift --create --comments "[description]"```

**Create** a snapshot with a specific **tag**

```sudo timeshift --create --tags D```

**Check** and create a snapshot if scheduled

```sudo timeshift --check```

**Restore** a specific snapshot

```sudo timeshift --restore --snapshot '[snapshot_name]'```

**Restore** a snapshot to a specific **target device**

```sudo timeshift --restore --snapshot '[snapshot_name]' --target-device [/dev/sda1]```

**Delete** a specific snapshot

```sudo timeshift --delete --snapshot '[snapshot_name]'```

**Delete all** snapshots

```sudo timeshift --delete-all```

# SYNOPSIS

**timeshift** [_OPTIONS_]

# PARAMETERS

**--list**
> List all snapshots.

**--list-devices**
> List available devices.

**--check**
> Create snapshot if one is scheduled.

**--create**
> Create a new snapshot (even if not scheduled).

**--restore**
> Restore a snapshot.

**--delete**
> Delete a snapshot.

**--delete-all**
> Delete all snapshots.

**--snapshot** _NAME_
> Specify the snapshot to restore or delete.

**--comments** _TEXT_
> Set snapshot description.

**--tags** _{O,B,H,D,W,M}_
> Add tags to snapshot: Ondemand, Boot, Hourly, Daily, Weekly, Monthly (default: O).

**--target-device** _DEVICE_
> Specify target device for restore.

**--grub-device** _DEVICE_
> Specify device for installing GRUB2 bootloader.

**--skip-grub**
> Skip GRUB2 reinstallation during restore.

**--snapshot-device** _DEVICE_
> Specify backup device (default: from config).

**--btrfs**
> Switch to BTRFS mode.

**--rsync**
> Switch to RSYNC mode.

**--yes**
> Answer YES to all confirmation prompts.

**--scripted**
> Run in non-interactive mode.

# DESCRIPTION

**timeshift** is a system restore utility for Linux that creates incremental snapshots of the filesystem using rsync or btrfs snapshots. It allows rolling back system changes while preserving user data.

Similar to Windows System Restore or macOS Time Machine for system files.

# CAVEATS

Requires sufficient storage space. BTRFS snapshots are more space-efficient than rsync. User data in /home is excluded by default for safety. Restoring typically requires a reboot. Requires root privileges for all operations.

# HISTORY

**Timeshift** was created by **Tony George** as a GUI and CLI tool for system backup on Linux, originally released in **2014**.

# SEE ALSO

[rsync](/man/rsync)(1), [btrfs](/man/btrfs)(8), [snapper](/man/snapper)(1), [btrbk](/man/btrbk)(1), [restic](/man/restic)(1)

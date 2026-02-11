# TAGLINE

System backup and restore using snapshots

# TLDR

**List** snapshots

```sudo timeshift --list```

**Check** and create if scheduled

```sudo timeshift --check```

**Create** snapshot

```sudo timeshift --create```

**Restore** interactively

```sudo timeshift --restore```

Restore **specific** snapshot

```sudo timeshift --restore --snapshot '[snapshot]'```

**Delete** snapshot

```sudo timeshift --delete --snapshot '[snapshot]'```

# SYNOPSIS

**timeshift** [_OPTIONS_]

# PARAMETERS

**--list**
> List all snapshots

**--check**
> Create snapshot if scheduled

**--create**
> Create new snapshot

**--restore**
> Restore a snapshot

**--delete**
> Delete a snapshot

**--snapshot** _NAME_
> Specify snapshot name

**--comments** _TEXT_
> Add comment to snapshot

**--skip-grub**
> Skip GRUB reinstallation during restore

# DESCRIPTION

**timeshift** is a system restore utility for Linux that creates incremental snapshots of the filesystem using rsync or btrfs snapshots. It allows rolling back system changes while preserving user data.

Similar to Windows System Restore or macOS Time Machine for system files.

# CAVEATS

Requires sufficient storage space. BTRFS snapshots are more efficient than rsync. User data in /home is excluded by default for safety. Restoring requires reboot.

# HISTORY

**Timeshift** was created by **Tony George** as a GUI and CLI tool for system backup on Linux, originally released in **2014**.

# SEE ALSO

[rsync](/man/rsync)(1), [btrfs](/man/btrfs)(8)

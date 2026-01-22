# TLDR

Manually **synchronize Snapper snapshots** to create boot entries in Limine

```limine-snapper-sync```

**List** the current snapshot entries managed by Limine

```limine-snapper-list```

Display **detailed information** about bootable snapshots and their files

```limine-snapper-info```

**Restore** the system from a selected bootable snapshot

```limine-snapper-restore```

Start the **watcher process** to monitor for Snapper snapshot changes

```limine-snapper-watcher```

# SYNOPSIS

**limine-snapper-sync**

**limine-snapper-list**

**limine-snapper-info**

**limine-snapper-restore**

**limine-snapper-watcher**

# DESCRIPTION

**limine-snapper-sync** synchronizes Limine bootloader menu entries with Btrfs snapshots managed by Snapper. This allows users to boot directly into previous system states from the Limine boot menu.

The toolset includes several commands: **limine-snapper-sync** performs manual synchronization, **limine-snapper-list** shows current bootable snapshots, **limine-snapper-info** displays detailed snapshot information, **limine-snapper-restore** recovers the system from a snapshot, and **limine-snapper-watcher** monitors for snapshot changes in real-time.

When snapshots are created or deleted via Snapper, running sync updates the Limine boot menu to reflect available restore points.

# CAVEATS

Requires a Btrfs filesystem with Snapper configured for snapshot management. The Limine bootloader must be properly installed and configured. Restoring from a snapshot will revert system files to the snapshot state, potentially losing recent changes.

# SEE ALSO

[limine](/man/limine)(1), [limine-entry-tool](/man/limine-entry-tool)(1), [snapper](/man/snapper)(8), [btrfs](/man/btrfs)(8)

# TAGLINE

synchronizes Limine bootloader menu entries with Btrfs snapshots

# TLDR

Sync Snapper snapshots into **Limine boot entries**

```limine-snapper-sync```

**List** snapshot boot entries managed for Limine

```limine-snapper-list```

Show **details** of bootable snapshots

```limine-snapper-info```

**Restore** the system from a bootable snapshot

```limine-snapper-restore```

Run the **background watcher** for new Snapper snapshots

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

# INSTALL

```aur: yay -S limine-snapper-sync```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[limine](/man/limine)(1), [limine-entry-tool](/man/limine-entry-tool)(1), [snapper](/man/snapper)(8), [btrfs](/man/btrfs)(8)

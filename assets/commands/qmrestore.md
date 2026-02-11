# TAGLINE

Restore Proxmox VMs from backup archives

# TLDR

**Restore** VM from backup on original storage

```qmrestore path/to/vzdump-qemu-100.vma.lzo 100```

**Force** overwrite existing VM

```qmrestore path/to/vzdump-qemu-100.vma.lzo 100 --force true```

Restore to **specific storage**

```qmrestore path/to/vzdump-qemu-100.vma.lzo 100 --storage local```

**Live restore** from Proxmox Backup Server

```qmrestore path/to/vzdump-qemu-100.vma.lzo 100 --live-restore true```

# SYNOPSIS

**qmrestore** _archive_ _vmid_ [_options_]

# PARAMETERS

**--force** _true|false_
> Overwrite existing VM with same ID

**--storage** _name_
> Target storage for restored disks

**--live-restore** _true|false_
> Start VM immediately while restoring in background (PBS only)

# DESCRIPTION

**qmrestore** restores QEMU virtual machines from vzdump backup archives. It can restore to the original storage or a different target storage.

Live restore feature allows starting the VM immediately while the restore continues in the background, available only with Proxmox Backup Server.

# CAVEATS

The VM ID must be available unless --force is used. Live restore is only available with Proxmox Backup Server backups.

# HISTORY

Part of **Proxmox VE** backup and restore infrastructure. Works with vzdump backup files and Proxmox Backup Server.

# SEE ALSO

[qm](/man/qm)(1), [vzdump](/man/vzdump)(1), [pct-restore](/man/pct-restore)(1)

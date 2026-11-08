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

```qmrestore [pbs-storage]:backup/vm/100/[2026-01-01T00:00:00Z] 100 --live-restore true```

**Start** the VM after restoring, with new MAC addresses

```qmrestore path/to/vzdump-qemu-100.vma.lzo 101 --start true --unique true```

# SYNOPSIS

**qmrestore** _archive_ _vmid_ [_options_]

# PARAMETERS

**--force** _true|false_
> Overwrite existing VM with same ID

**--storage** _name_
> Target storage for restored disks

**--live-restore** _true|false_
> Start VM immediately while restoring in background (PBS only)

**--bwlimit** _KiB/s_
> Override the I/O bandwidth limit

**--unique** _true|false_
> Assign a unique random ethernet address

**--start** _true|false_
> Start the VM after a successful restore (default: false)

**--pool** _name_
> Add the VM to the specified pool

**--ha-managed** _true|false_
> Add the VM as an HA resource after restoring (default: false)

# DESCRIPTION

**qmrestore** restores QEMU virtual machines from vzdump backup archives. Volumes are allocated on the original storage unless **--storage** names another one. Passing **-** as the archive reads the backup from standard input.

Live restore feature allows starting the VM immediately while the restore continues in the background, available only with Proxmox Backup Server.

# CAVEATS

The VM ID must be available unless --force is used. Live restore is only available with Proxmox Backup Server backups.

# HISTORY

Part of **Proxmox VE** backup and restore infrastructure. Works with vzdump backup files and Proxmox Backup Server.

# SEE ALSO

[qm](/man/qm)(1), [vzdump](/man/vzdump)(1), [pct-restore](/man/pct-restore)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=qemu-server.git)```

```[Homepage](https://www.proxmox.com/en/proxmox-virtual-environment/overview)```

```[Documentation](https://pve.proxmox.com/pve-docs/qmrestore.1.html)```

<!-- verified: 2026-11-08 -->

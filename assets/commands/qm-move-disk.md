# TAGLINE

Move Proxmox VM disk between storages

# TLDR

This command is an alias of **qm disk move**

View documentation for the original command

```tldr qm disk```

# SYNOPSIS

**qm move-disk** _vmid_ _disk_ [_storage_] [_options_]

# PARAMETERS

**--delete** _0|1_
> Delete the original disk after a successful copy (default 0, kept as unused disk).

**--format** _qcow2|raw|vmdk_
> Target disk format when moving to a different storage.

**--bwlimit** _KiB/s_
> Override the I/O bandwidth limit.

**--target-vmid** _vmid_
> Reassign the disk to another VM.

**--target-disk** _key_
> Config key on the target VM, for example scsi3.

# DESCRIPTION

**qm move-disk** is an alternative form of **qm disk move** that moves virtual machine disks between storage backends. **qm move_disk** is a further alias. It can also reassign a disk to a different VM.

# SEE ALSO

[qm](/man/qm)(1), [qm-disk](/man/qm-disk)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=qemu-server.git)```

```[Documentation](https://pve.proxmox.com/pve-docs/qm.1.html)```

<!-- verified: 2026-11-08 -->

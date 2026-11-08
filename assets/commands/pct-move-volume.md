# TAGLINE

moves a container's storage volume to a different Proxmox storage location

# TLDR

**Move** rootfs to different storage

```pct move-volume 100 rootfs storage_id```

Move and **delete** old volume

```pct move-volume 100 rootfs storage_id --delete```

# SYNOPSIS

**pct move-volume** _vmid_ _volume_ [_storage_] [_target-vmid_] [_target-volume_] [_OPTIONS_]

# DESCRIPTION

**pct move-volume** moves a container's storage volume to a different Proxmox storage location. This is useful for migrating containers between storage backends or freeing up space on a particular storage.

# PARAMETERS

**vmid**
> The numeric ID of the container

**volume**
> The volume to move (rootfs or mpN for mount points)

**storage**
> The target storage ID

**--delete**
> Delete the source volume after successful move

**target-vmid**
> Optional positional argument: container to move the volume to

**target-volume**
> Optional positional argument: config key for the volume on the target container

**--bwlimit** _KiB/s_
> Override the I/O bandwidth limit

**--digest** _sha1_
> Prevent changes if the configuration file has a different SHA1 digest

# CAVEATS

Without **--delete**, the original volume is kept as an unused volume entry and must be removed separately. Moving to a different storage type may affect performance.

# HISTORY

**pct move-volume** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-resize](/man/pct-resize)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

<!-- verified: 2026-11-08 -->

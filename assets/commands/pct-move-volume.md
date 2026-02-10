# TAGLINE

moves a container's storage volume to a different Proxmox storage location

# TLDR

**Move** rootfs to different storage

```pct move-volume 100 rootfs storage_id```

Move and **delete** old volume

```pct move-volume 100 rootfs storage_id --delete```

# SYNOPSIS

**pct move-volume** _vmid_ _volume_ _storage_ [_OPTIONS_]

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

**--target-vmid** _id_
> Move volume to a different container

# CAVEATS

The container should be stopped for safe volume moves. Without **--delete**, the old volume remains and must be manually removed. Moving to a different storage type may affect performance.

# HISTORY

**pct move-volume** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-resize](/man/pct-resize)(1)

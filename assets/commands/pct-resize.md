# TAGLINE

changes the size of a Proxmox LXC container's storage volume

# TLDR

**Resize** to absolute size

```pct resize 100 rootfs 20G```

**Add** to existing size

```pct resize 100 rootfs +10G```

# SYNOPSIS

**pct resize** _vmid_ _disk_ _size_

# DESCRIPTION

**pct resize** changes the size of a Proxmox LXC container's storage volume. The filesystem inside the container is automatically resized along with the underlying storage.

# PARAMETERS

**vmid**
> The numeric ID of the container

**disk**
> The disk to resize (rootfs or mpN for mount points)

**size**
> New size (absolute like 20G) or relative (like +10G)

# CAVEATS

Only size increases are supported for most storage types. Shrinking volumes may cause data loss and is not supported for all storage backends. The container can be running during resize.

# HISTORY

**pct resize** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-set](/man/pct-set)(1)

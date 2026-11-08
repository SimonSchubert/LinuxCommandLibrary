# TAGLINE

mounts a stopped container's filesystem on the Proxmox host

# TLDR

**Mount** container filesystem

```pct mount 100```

# SYNOPSIS

**pct mount** _vmid_

# DESCRIPTION

**pct mount** mounts a stopped container's filesystem on the Proxmox host. This allows direct access to container files for maintenance, recovery, or inspection without starting the container.

# PARAMETERS

**vmid**
> The numeric ID of the container

# CAVEATS

The container must be stopped to mount its filesystem. The mount point is typically at /var/lib/lxc/VMID/rootfs. Mounting holds a lock on the container and is meant for emergency maintenance only. Always unmount with **pct unmount** before starting the container.

# HISTORY

**pct mount** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-unmount](/man/pct-unmount)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

<!-- verified: 2026-11-08 -->

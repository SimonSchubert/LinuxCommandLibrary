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

The container must be stopped to mount its filesystem. The mount point is typically at /var/lib/lxc/VMID/rootfs. Always unmount with **pct unmount** before starting the container.

# HISTORY

**pct mount** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-unmount](/man/pct-unmount)(1)

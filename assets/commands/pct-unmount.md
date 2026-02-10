# TAGLINE

unmounts a container's filesystem that was previously mounted on the Proxmox

# TLDR

**Unmount** container filesystem

```pct unmount 100```

# SYNOPSIS

**pct unmount** _vmid_

# DESCRIPTION

**pct unmount** unmounts a container's filesystem that was previously mounted on the Proxmox host using **pct mount**. This is required before starting the container again.

# PARAMETERS

**vmid**
> The numeric ID of the container

# CAVEATS

Ensure no processes are accessing the mounted filesystem before unmounting. Failing to unmount before starting the container can cause corruption.

# HISTORY

**pct unmount** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-mount](/man/pct-mount)(1)

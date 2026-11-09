# TAGLINE

reboots a Proxmox LXC container

# TLDR

**Reboot** a container

```pct reboot 100```

Reboot with a **timeout** of 60 seconds

```pct reboot 100 --timeout 60```

# SYNOPSIS

**pct reboot** _vmid_ [_OPTIONS_]

# DESCRIPTION

**pct reboot** shuts down and restarts a Proxmox LXC container, applying pending configuration changes. The command first requests a graceful shutdown, then starts the container again. If the container does not stop within the timeout, it is killed before being started again.

# PARAMETERS

**vmid**
> The numeric ID of the container (100 or higher)

**--timeout** _seconds_
> Wait at most this many seconds for the shutdown before killing the container. If omitted, the default timeout of **lxc-stop** applies.

# CAVEATS

The container must be running for a reboot to succeed. Processes that block shutdown until the timeout are killed, so services may not exit cleanly.

# HISTORY

**pct reboot** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-status](/man/pct-status)(1), [pct-start](/man/pct-start)(1), [pct-stop](/man/pct-stop)(1), [pct-shutdown](/man/pct-shutdown)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

```[Homepage](https://www.proxmox.com/en/products/proxmox-virtual-environment/overview)```

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

<!-- verified: 2026-11-09 -->

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

**pct reboot** shuts down and restarts a Proxmox LXC container. The command performs a clean reboot by first requesting the container to shut down gracefully, then starting it again. If the container does not stop within the timeout period, the operation fails.

# PARAMETERS

**vmid**
> The numeric ID of the container (100 or higher)

**--timeout** _seconds_
> Wait this many seconds for the shutdown before failing. The default is 60 seconds.

# CAVEATS

The container must be running for a reboot to succeed. If the container has processes that block shutdown, the reboot may time out. Unlike a hard reset, this performs a graceful shutdown first, so unresponsive containers may need to be stopped and started manually instead.

# HISTORY

**pct reboot** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-status](/man/pct-status)(1)

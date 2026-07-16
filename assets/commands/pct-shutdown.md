# TAGLINE

gracefully shuts down a Proxmox LXC container

# TLDR

**Shutdown** a container cleanly

```pct shutdown 100```

Shutdown with a **timeout** of 30 seconds

```pct shutdown 100 --timeout 30```

Force the container to **stop** if graceful shutdown fails

```pct shutdown 100 --forceStop```

# SYNOPSIS

**pct shutdown** _vmid_ [_OPTIONS_]

# PARAMETERS

**vmid**
> The numeric ID of the container (100–999999999)

**--timeout** _seconds_
> Wait maximal timeout seconds for a clean shutdown (default 60)

**--forceStop**
> Make sure the container stops even if graceful shutdown fails

# DESCRIPTION

**pct shutdown** triggers a clean shutdown of a Proxmox VE LXC container (via **lxc-stop**). Unlike **pct stop**, which abruptly kills all processes, this requests a graceful power-off so services can exit cleanly.

If the container does not stop within the timeout, the command fails unless **--forceStop** is set.

# CAVEATS

The container must be running. Processes that ignore SIGTERM can block shutdown until the timeout. For an immediate hard stop, use **pct stop** instead.

# HISTORY

**pct shutdown** is part of the **Proxmox VE** **pct** tool for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-stop](/man/pct-stop)(1), [pct-start](/man/pct-start)(1), [pct-reboot](/man/pct-reboot)(1), [lxc-stop](/man/lxc-stop)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-16 -->

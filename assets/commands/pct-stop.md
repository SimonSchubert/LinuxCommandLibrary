# TAGLINE

abruptly stops a Proxmox LXC container

# TLDR

**Stop** a container immediately

```pct stop 100```

Abort active **shutdown** tasks before stopping

```pct stop 100 --overrule-shutdown```

# SYNOPSIS

**pct stop** _vmid_ [_OPTIONS_]

# PARAMETERS

**vmid**
> The numeric ID of the container (100–999999999)

**--overrule-shutdown**
> Try to abort active vzshutdown tasks before stopping (default off)

**--skiplock**
> Ignore locks; only root is allowed to use this option

# DESCRIPTION

**pct stop** abruptly stops all processes running in a Proxmox VE LXC container. Unlike **pct shutdown**, which requests a clean power-off, this is a hard stop comparable to pulling the plug: processes do not get a normal chance to flush data or exit cleanly.

Use **pct shutdown** when you want a graceful stop, and **pct stop** when the container is unresponsive or you need an immediate halt.

# CAVEATS

A hard stop can leave applications with unsaved data or inconsistent files. Prefer **pct shutdown** for normal operations. Locks from concurrent management tasks may block the command unless **--skiplock** is used carefully by root.

# HISTORY

**pct stop** is part of the **Proxmox VE** **pct** tool for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-shutdown](/man/pct-shutdown)(1), [pct-start](/man/pct-start)(1), [pct-status](/man/pct-status)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-16 -->

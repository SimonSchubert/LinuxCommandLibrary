# TAGLINE

starts a Proxmox LXC container

# TLDR

**Start** a container

```pct start 100```

Start with **verbose debug** logging

```pct start 100 --debug```

# SYNOPSIS

**pct start** _vmid_ [_OPTIONS_]

# PARAMETERS

**vmid**
> The numeric ID of the container (100–999999999)

**--debug**
> Enable very verbose debug log-level on start (default off)

**--skiplock**
> Ignore locks; only root is allowed to use this option

# DESCRIPTION

**pct start** starts a Proxmox VE LXC container that is currently stopped. It applies pending configuration changes, sets up the container environment, and launches the guest init process.

If startup fails, **--debug** produces more detailed logs. You can also start in foreground/debug mode via related LXC tooling when diagnosing boot issues.

# CAVEATS

The container must not already be running. Locks from other **pct** operations (backup, migrate, snapshot, and so on) can block start unless **--skiplock** is used carefully by root. Resource limits (memory, CPU, storage) and missing volumes can cause start to fail.

# HISTORY

**pct start** is part of the **Proxmox VE** **pct** tool for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-stop](/man/pct-stop)(1), [pct-shutdown](/man/pct-shutdown)(1), [pct-status](/man/pct-status)(1), [pct-reboot](/man/pct-reboot)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-16 -->

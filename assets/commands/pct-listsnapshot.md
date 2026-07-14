# TAGLINE

list snapshots of a Proxmox LXC container

# TLDR

**List** all snapshots for a container

```pct listsnapshot [vmid]```

# SYNOPSIS

**pct listsnapshot** _vmid_

# PARAMETERS

**vmid**
> Numeric ID of the container (100–999999999)

# DESCRIPTION

**pct listsnapshot** lists all snapshots for a Proxmox VE LXC container. Output typically includes snapshot names and related metadata so you can choose a snapshot for **pct rollback** or **pct delsnapshot**.

# HISTORY

**pct listsnapshot** is part of the **Proxmox VE** **pct** tool for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-delsnapshot](/man/pct-delsnapshot)(1), [pct-rollback](/man/pct-rollback)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-14 -->

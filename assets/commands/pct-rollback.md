# TAGLINE

restore a Proxmox LXC container to a snapshot

# TLDR

**Rollback** a container to a named snapshot

```pct rollback [vmid] [snapname]```

Rollback and **start** the container after restore

```pct rollback [vmid] [snapname] --start```

# SYNOPSIS

**pct rollback** _vmid_ _snapname_ [_OPTIONS_]

# PARAMETERS

**vmid**
> Numeric ID of the container (100–999999999)

**snapname**
> Name of the snapshot to restore

**--start**
> Start the container after a successful rollback (default: off)

# DESCRIPTION

**pct rollback** restores an LXC container on Proxmox VE to the disk and configuration state captured in a named snapshot. Current container state after the snapshot is discarded.

Use **pct listsnapshot** to see available snapshot names. Rollback can require the container to be stopped depending on storage and snapshot type; check Proxmox documentation for your storage backend.

# CAVEATS

Rollback is destructive for changes made after the snapshot. Ensure you have selected the correct **snapname**. Newer snapshots may be affected when rolling back depending on storage features (for example, linear snapshot chains).

# HISTORY

**pct rollback** is part of the **Proxmox VE** **pct** tool for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-listsnapshot](/man/pct-listsnapshot)(1), [pct-delsnapshot](/man/pct-delsnapshot)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-14 -->

# TAGLINE

delete a Proxmox LXC container snapshot

# TLDR

**Delete** a named snapshot from a container

```pct delsnapshot [vmid] [snapname]```

Delete and **force** removal from the config if disk snapshot cleanup fails

```pct delsnapshot [vmid] [snapname] --force```

# SYNOPSIS

**pct delsnapshot** _vmid_ _snapname_ [_OPTIONS_]

# PARAMETERS

**vmid**
> Numeric ID of the container (100–999999999)

**snapname**
> Name of the snapshot to delete

**--force**
> Remove the snapshot from the config file even if removing disk snapshots fails

# DESCRIPTION

**pct delsnapshot** deletes an LXC snapshot from a Proxmox VE container. It removes the named snapshot's disk state and configuration entry for the given **vmid**.

Snapshots are point-in-time copies of container disks and config. Deleting a snapshot frees storage used by that snapshot and is irreversible. Use **pct listsnapshot** to list available snapshot names before deleting.

# CAVEATS

Deleting a snapshot cannot be undone. If disk snapshot removal fails, the config entry may remain unless **--force** is used; use force carefully to avoid config/disk mismatches.

# HISTORY

**pct delsnapshot** is part of the **Proxmox VE** **pct** tool for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-listsnapshot](/man/pct-listsnapshot)(1), [pct-rollback](/man/pct-rollback)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-14 -->

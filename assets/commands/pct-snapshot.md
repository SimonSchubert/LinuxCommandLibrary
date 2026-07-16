# TAGLINE

create a snapshot of a Proxmox LXC container

# TLDR

**Create** a snapshot named pre-upgrade

```pct snapshot 100 pre-upgrade```

Create a snapshot with a **description**

```pct snapshot 100 pre-upgrade --description "before package upgrade"```

# SYNOPSIS

**pct snapshot** _vmid_ _snapname_ [_OPTIONS_]

# PARAMETERS

**vmid**
> The numeric ID of the container (100–999999999)

**snapname**
> Name of the new snapshot

**--description** _text_
> A textual description or comment for the snapshot

# DESCRIPTION

**pct snapshot** creates a snapshot of a Proxmox VE LXC container, capturing its disk and configuration state under the given name. Snapshots can later be listed with **pct listsnapshot**, restored with **pct rollback**, or removed with **pct delsnapshot**.

# CAVEATS

Snapshot support depends on the underlying storage (for example LVM-thin, ZFS, or Ceph). Not all storage types support snapshots. Taking a snapshot while the container is under heavy write load may briefly affect I/O.

# HISTORY

**pct snapshot** is part of the **Proxmox VE** **pct** tool for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-listsnapshot](/man/pct-listsnapshot)(1), [pct-rollback](/man/pct-rollback)(1), [pct-delsnapshot](/man/pct-delsnapshot)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-16 -->

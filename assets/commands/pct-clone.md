# TAGLINE

creates a copy of an existing Proxmox LXC container

# TLDR

**Clone** a container (full copy; linked clone if the source is a template)

```pct clone [source_id] [new_id]```

Clone with custom **hostname**

```pct clone [template_id] [new_id] --hostname [name]```

Create a **full (independent) copy** of a template

```pct clone [template_id] [new_id] --full```

Clone from a **snapshot**

```pct clone [source_id] [new_id] --snapname [snapshot]```

Clone to a **specific storage**

```pct clone [template_id] [new_id] --full --storage [storage_name]```

Clone with a **descriptive note**

```pct clone [template_id] [new_id] --description "[note]"```

# SYNOPSIS

**pct clone** _vmid_ _newid_ [_OPTIONS_]

# DESCRIPTION

**pct clone** creates a copy of an existing Proxmox LXC container. This is useful for creating multiple containers from a configured template container or for backup purposes.

# PARAMETERS

**vmid**
> The numeric ID of the source container

**newid**
> The numeric ID for the cloned container

**--hostname** _name_
> Set a custom hostname for the clone

**--full**
> Create a full copy of all disks. Always done for normal containers; for templates a linked clone is tried by default

**--storage** _storage_
> Target storage for a full clone

**--target** _node_
> Target node. Only allowed if the source container is on shared storage

**--snapname** _name_
> Clone from the given snapshot

**--pool** _pool_
> Add the new container to the specified resource pool

**--description** _text_
> Description for the new container

**--bwlimit** _KiB/s_
> Override the I/O bandwidth limit (default from datacenter or storage config)

# CAVEATS

Linked clones are only possible from templates (see **pct template**) and depend on the template's base volumes, so the template cannot be removed while clones exist. Full clones are independent but require more disk space and time. Clone a stopped container or use **--snapname** for a consistent copy. The clone keeps the source's network config, so adjust MAC/IP addresses if needed.

# HISTORY

**pct clone** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-create](/man/pct-create)(1), [pct-config](/man/pct-config)(1), [qm-clone](/man/qm-clone)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

```[Homepage](https://www.proxmox.com/en/products/proxmox-virtual-environment/overview)```

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

<!-- verified: 2026-11-23 -->

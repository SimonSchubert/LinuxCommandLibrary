# TLDR

**Clone** a container

```pct clone template_id new_id```

Clone with custom **hostname**

```pct clone template_id new_id --hostname name```

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
> Create a full copy instead of linked clone

**--target** _node_
> Target node for the clone

**--storage** _storage_
> Storage for the clone's disks

# CAVEATS

The source container should be stopped for a consistent clone. Linked clones share base storage with the original. Full clones are independent but require more disk space.

# HISTORY

**pct clone** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-create](/man/pct-create)(1)

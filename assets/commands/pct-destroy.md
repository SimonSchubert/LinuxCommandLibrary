# TLDR

**Destroy** container

```pct destroy 100```

**Force** destroy running container

```pct destroy 100 --force```

Destroy and **purge** references

```pct destroy 100 --purge```

# SYNOPSIS

**pct destroy** _vmid_ [_OPTIONS_]

# DESCRIPTION

**pct destroy** removes a Proxmox LXC container and its associated storage. By default, the container must be stopped first unless the force option is used.

# PARAMETERS

**vmid**
> The numeric ID of the container

**--force**
> Destroy even if the container is running

**--purge**
> Also remove all references to this container (jobs, replication, etc.)

# CAVEATS

This operation is irreversible. All container data will be lost. Snapshots associated with the container are also removed. Use **--purge** to clean up scheduled jobs and replication configurations.

# HISTORY

**pct destroy** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-create](/man/pct-create)(1)

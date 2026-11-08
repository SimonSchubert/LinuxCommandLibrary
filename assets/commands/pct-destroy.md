# TAGLINE

removes a Proxmox LXC container and its associated storage

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
> Remove the container from all related configurations, such as backup jobs, replication jobs and HA

**--destroy-unreferenced-disks**
> Also destroy all disks with this VMID on enabled storages that are not referenced in the config

# CAVEATS

This operation is irreversible. All container data will be lost. Snapshots associated with the container are also removed. Use **--purge** to clean up scheduled jobs and replication configurations.

# HISTORY

**pct destroy** is part of the **Proxmox VE** virtualization platform for managing LXC containers.

# SEE ALSO

[pct](/man/pct)(1), [pct-create](/man/pct-create)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

<!-- verified: 2026-11-08 -->

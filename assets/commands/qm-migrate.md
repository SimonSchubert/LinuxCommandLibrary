# TLDR

**Migrate** a virtual machine to another node

```qm migrate 100 target_node```

Migrate with **bandwidth limit** (10 KiB/s)

```qm migrate 100 target_node --bwlimit 10```

**Force** migration with local devices

```qm migrate 100 target_node --force true```

Use **online/live** migration for running VMs

```qm migrate 100 target_node --online true```

Enable live **storage migration** for local disks

```qm migrate 100 target_node --with-local-disks true```

# SYNOPSIS

**qm migrate** _vmid_ _target_ [_options_]

# PARAMETERS

**--bwlimit** _kbps_
> Bandwidth limit in KiB/s

**--force** _true|false_
> Allow migration with local devices (root only)

**--online** _true|false_
> Use online/live migration for running VMs

**--with-local-disks** _true|false_
> Enable live storage migration for local disks

# DESCRIPTION

**qm migrate** migrates a virtual machine to another node in the Proxmox VE cluster. It supports both offline and online (live) migration for running VMs.

Live migration allows moving VMs between nodes with minimal downtime. Storage migration enables moving VMs with local disks.

# CAVEATS

Online migration requires shared storage or --with-local-disks option. Network bandwidth and latency affect migration time. Force option requires root privileges.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools. VM migration is essential for cluster maintenance and load balancing.

# SEE ALSO

[qm](/man/qm)(1), [pvecm](/man/pvecm)(1)

# TLDR

**Show HA status**

```ha-manager status```

**Enable HA for VM**

```ha-manager add [vm:100]```

**Remove from HA**

```ha-manager remove [vm:100]```

**Set HA group**

```ha-manager set [vm:100] --group [hagroup1]```

**Migrate service**

```ha-manager migrate [vm:100] [target-node]```

# SYNOPSIS

**ha-manager** _command_ [_options_]

# PARAMETERS

**status**
> Show HA manager status.

**add** _sid_
> Add service to HA.

**remove** _sid_
> Remove service from HA.

**set** _sid_ [_options_]
> Configure service options.

**migrate** _sid_ _node_
> Migrate service to node.

**relocate** _sid_ _node_
> Request relocation.

**--group** _name_
> HA group assignment.

**--state** _state_
> Desired state (started, stopped, disabled).

**--max_restart** _n_
> Maximum restart attempts.

**--max_relocate** _n_
> Maximum relocate attempts.

# DESCRIPTION

**ha-manager** manages Proxmox VE High Availability services. It controls which VMs and containers are protected by HA, ensuring they're automatically restarted or migrated if a node fails.

HA requires a cluster of at least three nodes for proper quorum. Services are monitored and automatically recovered based on configured policies.

# SERVICE ID FORMAT

```
vm:100        Virtual machine ID 100
ct:101        Container ID 101
```

# CAVEATS

Requires Proxmox cluster. Minimum 3 nodes for quorum. Shared storage needed for VM migration. Network fencing recommended. HA manager must be running.

# HISTORY

ha-manager is part of **Proxmox VE**, an open-source virtualization platform. Proxmox HA provides automatic failover using the Corosync cluster engine.

# SEE ALSO

[pve-ha-manager](/man/pve-ha-manager)(1), [pvecm](/man/pvecm)(1), [qm](/man/qm)(1)

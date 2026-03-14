# TAGLINE

Rescan Proxmox VM storage volumes

# TLDR

**Rescan all storages** and update disk sizes for all VMs

```qm rescan```

**Rescan storage for a specific VM**

```qm rescan --vmid [100]```

**Perform a dry run** without writing changes

```qm rescan --dryrun 1```

This command is an alias of **qm disk rescan**

View documentation for the original command

```tldr qm disk```

# SYNOPSIS

**qm rescan** [_options_]

# PARAMETERS

**--dryrun** _boolean_
> Execute a test run without writing changes to VM configurations (default: **0**).

**--vmid** _integer_
> The unique ID of the VM (100-999999999). If omitted, all VMs are rescanned.

# DESCRIPTION

**qm rescan** is an alias for **qm disk rescan** that rescans all storages and updates disk sizes and unused disk images for virtual machines. When run without **--vmid**, it rescans storage for all VMs on the node.

# SEE ALSO

[qm](/man/qm)(1), [qm-disk](/man/qm-disk)(1), [pvesm](/man/pvesm)(1)

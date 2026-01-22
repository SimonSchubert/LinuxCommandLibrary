# TLDR

**Show** VM configuration

```qm config vm_id```

Show **current** values only

```qm config --current true vm_id```

Show **snapshot** configuration

```qm config --snapshot snapshot_name vm_id```

# SYNOPSIS

**qm config** [_OPTIONS_] _vmid_

# DESCRIPTION

**qm config** displays the configuration of a QEMU/KVM virtual machine in Proxmox VE. By default, it shows pending configuration changes that will be applied on the next start.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine

**--current** _boolean_
> Show current configuration values instead of pending

**--snapshot** _name_
> Display configuration from a specific snapshot

# CAVEATS

The default output includes pending changes. Use **--current** to see only the active configuration. For comparing current and pending values, use **qm pending** instead.

# HISTORY

**qm config** is part of the **Proxmox VE** virtualization platform for managing QEMU/KVM virtual machines.

# SEE ALSO

[qm](/man/qm)(1), [qm-set](/man/qm-set)(1), [qm-pending](/man/qm-pending)(1)

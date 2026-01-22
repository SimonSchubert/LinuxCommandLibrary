# TLDR

**Show** pending VM configuration

```qm pending vm_id```

# SYNOPSIS

**qm pending** _vmid_

# DESCRIPTION

**qm pending** displays the virtual machine configuration showing both current values and pending changes that will be applied on the next VM start. This is useful for reviewing configuration changes before they take effect.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine

# CAVEATS

Some configuration changes require a VM restart to take effect. The pending command shows which values differ between the current running state and what will be applied next.

# HISTORY

**qm pending** is part of the **Proxmox VE** virtualization platform for managing QEMU/KVM virtual machines.

# SEE ALSO

[qm](/man/qm)(1), [qm-config](/man/qm-config)(1), [qm-set](/man/qm-set)(1)

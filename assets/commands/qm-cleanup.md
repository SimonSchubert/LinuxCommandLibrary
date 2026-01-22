# TLDR

**Clean up** VM resources

```qm cleanup vmid clean-shutdown guest-requested```

# SYNOPSIS

**qm cleanup** _vmid_ _clean-shutdown_ _guest-requested_

# DESCRIPTION

**qm cleanup** cleans up resources associated with a QEMU/KVM virtual machine in Proxmox VE. It handles cleanup of tap devices, VGPUs, and other resources after a VM shuts down, crashes, or is stopped.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine

**clean-shutdown**
> Whether this was a clean shutdown (0 or 1)

**guest-requested**
> Whether the guest initiated the shutdown (0 or 1)

# CAVEATS

This command is typically called automatically by Proxmox VE after VM shutdown events. Manual invocation is rarely needed. It is part of the VM lifecycle management system.

# HISTORY

**qm cleanup** is part of the **Proxmox VE** virtualization platform, managing QEMU/KVM virtual machines and their associated resources.

# SEE ALSO

[qm](/man/qm)(1), [qm-start](/man/qm-start)(1), [qm-stop](/man/qm-stop)(1)

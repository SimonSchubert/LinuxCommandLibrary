# TAGLINE

Start a Proxmox virtual machine

# TLDR

**Start** a VM

```qm start 100```

Specify **machine** type

```qm start 100 --machine q35```

Start with **timeout**

```qm start 100 --timeout 60```

# SYNOPSIS

**qm start** [_OPTIONS_] _vmid_

# DESCRIPTION

**qm start** starts a QEMU/KVM virtual machine in Proxmox VE. The VM must exist and not already be running. Various startup options can control the emulated machine type, timeout, and other parameters.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine

**--machine** _type_
> Specify the QEMU machine type (e.g., q35, pc, pc-i440fx)

**--timeout** _seconds_
> Timeout in seconds for the start operation

**--skiplock** _boolean_
> Skip lock check (root only)

**--stateuri** _uri_
> URI to restore state from a migration or snapshot

# CAVEATS

The VM must be in a stopped state to start. If the VM has pending configuration changes, they will be applied on start. Ensure sufficient resources (CPU, memory, storage) are available.

# HISTORY

**qm start** is part of the **Proxmox VE** virtualization platform for managing QEMU/KVM virtual machines.

# SEE ALSO

[qm](/man/qm)(1), [qm-stop](/man/qm-stop)(1), [qm-shutdown](/man/qm-shutdown)(1)

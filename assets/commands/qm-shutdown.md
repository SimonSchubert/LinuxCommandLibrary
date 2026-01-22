# TLDR

**Shutdown** a VM

```qm shutdown vm_id```

Shutdown with **timeout**

```qm shutdown --timeout 10 vm_id```

**Keep** storage active

```qm shutdown --keepActive true vm_id```

**Skip** lock check

```qm shutdown --skiplock true vm_id```

**Force** stop after shutdown

```qm shutdown --forceStop true vm_id```

# SYNOPSIS

**qm shutdown** [_OPTIONS_] _vmid_

# DESCRIPTION

**qm shutdown** sends an ACPI shutdown signal to gracefully shut down a QEMU/KVM virtual machine in Proxmox VE. The guest operating system must respond to ACPI events for this to work properly.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine

**--timeout** _seconds_
> Maximum time to wait for the VM to shut down

**--keepActive** _boolean_
> Do not deactivate storage volumes after shutdown

**--skiplock** _boolean_
> Skip lock check (root only)

**--forceStop** _boolean_
> Force stop the VM if it doesn't respond to shutdown

# CAVEATS

The guest OS must have ACPI support enabled and respond to shutdown events. If the guest ignores the ACPI signal, use **--forceStop** or **qm stop** instead. Windows guests may require proper ACPI drivers.

# HISTORY

**qm shutdown** is part of the **Proxmox VE** virtualization platform for managing QEMU/KVM virtual machines.

# SEE ALSO

[qm](/man/qm)(1), [qm-start](/man/qm-start)(1), [qm-stop](/man/qm-stop)(1)

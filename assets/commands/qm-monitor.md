# TAGLINE

Access QEMU monitor console for a VM

# TLDR

Enter the **QEMU Monitor** interface for a VM

```qm monitor 100```

# SYNOPSIS

**qm monitor** _vmid_

# DESCRIPTION

**qm monitor** enters the QEMU Monitor interface for a specific virtual machine. The QEMU Monitor provides low-level access to the VM's hypervisor for advanced debugging and management.

Through the monitor, you can inspect VM state, manage devices, and execute QEMU commands directly.

# CAVEATS

The QEMU Monitor is a powerful interface. Incorrect commands may crash or corrupt the VM. Use with caution and proper knowledge of QEMU internals.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools. The QEMU Monitor provides direct access to QEMU's management interface.

# SEE ALSO

[qm](/man/qm)(1), [qm-terminal](/man/qm-terminal)(1)

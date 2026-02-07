# TAGLINE

Access the serial console of Azure virtual machines

# TLDR

**Connect to a VM's serial console**

```az serial-console connect --name [MyVM] --resource-group [MyResourceGroup]```

**Enable serial console** for a VM

```az serial-console enable --name [MyVM] --resource-group [MyResourceGroup]```

**Disable serial console** for a VM

```az serial-console disable --name [MyVM] --resource-group [MyResourceGroup]```

**Send NMI** (Non-Maskable Interrupt) to a VM

```az serial-console send nmi --name [MyVM] --resource-group [MyResourceGroup]```

# SYNOPSIS

**az** **serial-console** _subcommand_ [_options_]

# SUBCOMMANDS

**connect**
> Connect to the serial console of a VM or VMSS instance.

**enable**
> Enable serial console for a VM.

**disable**
> Disable serial console for a VM.

**send nmi**
> Send a Non-Maskable Interrupt to a VM.

# PARAMETERS

**--name** **-n**
> Name of the virtual machine.

**--resource-group** **-g**
> Name of resource group.

# DESCRIPTION

**az serial-console** provides direct serial console access to Azure VMs for troubleshooting. Serial console enables text-based access to VMs when network connectivity or SSH/RDP is unavailable.

This is useful for debugging boot issues, network misconfigurations, or when the VM's operating system is unresponsive.

# CAVEATS

Requires Azure CLI and appropriate RBAC permissions. Serial console access requires boot diagnostics to be enabled on the VM. Not available for all VM sizes or regions.

# SEE ALSO

[az](/man/az)(1), [az-vm](/man/az-vm)(1)

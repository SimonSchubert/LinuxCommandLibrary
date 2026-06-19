# TAGLINE

Access the serial console of Azure virtual machines

# TLDR

**Connect to a VM's serial console**

```az serial-console connect --name [MyVM] --resource-group [MyResourceGroup]```

**Connect to a VMSS instance**

```az serial-console connect --name [MyVMSS] --resource-group [MyResourceGroup] --instance-id [2]```

**Enable serial console** for the whole subscription

```az serial-console enable```

**Disable serial console** for the whole subscription

```az serial-console disable```

**Send NMI** (Non-Maskable Interrupt) to a VM

```az serial-console send nmi --name [MyVM] --resource-group [MyResourceGroup]```

**Send a SysRq sequence** to a VM

```az serial-console send sysrq --input [b] --name [MyVM] --resource-group [MyResourceGroup]```

**Hard-reset** a VM

```az serial-console send reset --name [MyVM] --resource-group [MyResourceGroup]```

# SYNOPSIS

**az** **serial-console** _subcommand_ [_options_]

# SUBCOMMANDS

**connect**
> Connect to the serial console of a VM or VMSS instance.

**enable**
> Enable the serial console service for the entire subscription.

**disable**
> Disable the serial console service for the entire subscription.

**send nmi**
> Send a Non-Maskable Interrupt (NMI) to a VM or VMSS instance.

**send sysrq**
> Send a SysRq sequence to a VM or VMSS instance.

**send reset**
> Perform a "hard" restart of a VM or VMSS instance.

# PARAMETERS

**--name** **-n**
> Name of the virtual machine or virtual machine scale set.

**--resource-group** **-g**
> Name of the resource group.

**--instance-id**
> ID of the VMSS instance. Not needed when connecting to a single virtual machine.

# DESCRIPTION

**az serial-console** provides text-based serial console access to Azure Linux and Windows VMs and VMSS instances for troubleshooting. The connection attaches to the ttyS0 serial port, working independently of network connectivity and the operating system state.

This is useful for debugging boot issues, network misconfigurations, or when the VM is otherwise unreachable over SSH or RDP. While connected, type **Ctrl + ]** then **q** to quit, or **n**, **s**, or **r** to send an NMI, SysRq, or reset.

# CAVEATS

Part of the **serial-console** extension (Azure CLI 2.15.0 or higher); it installs automatically the first time an **az serial-console** command runs, or install it manually with **az extension add --name serial-console**. Serial console access requires boot diagnostics to be enabled on the VM and appropriate RBAC permissions. The **enable** and **disable** commands toggle the service for the entire subscription, not per VM.

# SEE ALSO

[azure-cli](/man/azure-cli)(1), [az-vm](/man/az-vm)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/serial-console)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->

# TAGLINE

Manage Proxmox VE virtual machines

# TLDR

**List** all VMs

```qm list```

**Create** a VM

```qm create 100 --scsi0 local-lvm:4 --net0 e1000 --cdrom local:iso/image.iso```

**Show** VM configuration

```qm config 100```

**Start** a VM

```qm start 100```

**Shutdown** and **wait**

```qm shutdown 100 && qm wait 100```

**Destroy** a VM

```qm destroy 100 --purge```

# SYNOPSIS

**qm** _command_ [_OPTIONS_] [_vmid_]

# DESCRIPTION

**qm** is the QEMU/KVM Virtual Machine Manager for Proxmox VE. It provides a comprehensive command-line interface for creating, configuring, starting, stopping, and managing virtual machines.

# PARAMETERS

**list**
> List all virtual machines

**create** _vmid_
> Create a new virtual machine

**config** _vmid_
> Display VM configuration

**set** _vmid_
> Modify VM configuration

**start** _vmid_
> Start a virtual machine

**stop** _vmid_
> Stop a virtual machine (hard shutdown)

**shutdown** _vmid_
> Gracefully shutdown via ACPI

**destroy** _vmid_
> Remove a virtual machine

**snapshot** _vmid_ _name_
> Create a snapshot

**rollback** _vmid_ _name_
> Rollback to a snapshot

**clone** _vmid_ _newid_
> Clone a virtual machine

**migrate** _vmid_ _target_
> Migrate VM to another node

**--purge**
> Remove all related resources when destroying

# CONFIGURATION

**/etc/pve/qemu-server/<vmid>.conf**
> Per-VM configuration file containing hardware settings, disk definitions, network interfaces, and boot options.

**/etc/pve/datacenter.cfg**
> Cluster-wide datacenter configuration affecting default VM settings and migration behavior.

# CAVEATS

VM IDs must be unique across the Proxmox cluster. Operations may require root privileges. Some commands require the VM to be in a specific state (running or stopped).

# HISTORY

**qm** is part of the **Proxmox VE** virtualization platform, which combines KVM hypervisor and LXC containers with a web-based management interface.

# SEE ALSO

[qm-start](/man/qm-start)(1), [qm-stop](/man/qm-stop)(1), [qm-config](/man/qm-config)(1), [pct](/man/pct)(1)

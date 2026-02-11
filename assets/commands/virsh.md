# TAGLINE

Libvirt virtualization management CLI

# TLDR

**List running VMs**

```virsh list```

**List all VMs**

```virsh list --all```

**Start VM**

```virsh start [vm-name]```

**Shutdown VM**

```virsh shutdown [vm-name]```

**Force stop VM**

```virsh destroy [vm-name]```

**Connect to console**

```virsh console [vm-name]```

**Show VM info**

```virsh dominfo [vm-name]```

**Define VM from XML**

```virsh define [vm.xml]```

# SYNOPSIS

**virsh** [_-c uri_] _command_ [_args_]

# PARAMETERS

**list**
> List domains.

**start** _NAME_
> Start domain.

**shutdown** _NAME_
> Graceful shutdown.

**destroy** _NAME_
> Force stop.

**console** _NAME_
> Serial console.

**dominfo** _NAME_
> Domain info.

**define** _XML_
> Define domain.

**undefine** _NAME_
> Remove domain.

**-c** _URI_
> Connection URI.

# DESCRIPTION

**virsh** is the command-line interface for managing virtual machines through the libvirt virtualization API. It provides unified control over KVM, QEMU, Xen, and other hypervisors, handling domain lifecycle operations, storage pools, virtual networks, and snapshots.

Domains (VMs) can be started, stopped, paused, and migrated. The **console** command provides serial access to running VMs (exit with Ctrl+]). Domain configurations are defined in XML and can be created, modified, and exported. The tool also manages storage pools, volumes, and virtual networks for complete virtualization infrastructure control.

# CAVEATS

Requires libvirt daemon. Root for system VMs. XML syntax complex.

# HISTORY

**virsh** is the command-line interface for **libvirt**, the virtualization API. It provides unified management for multiple hypervisors.

# SEE ALSO

[virt-manager](/man/virt-manager)(1), [qemu](/man/qemu)(1), [kvm](/man/kvm)(1)

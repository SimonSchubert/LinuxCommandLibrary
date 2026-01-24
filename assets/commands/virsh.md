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

**virsh** manages libvirt virtualization. It controls VMs on KVM, QEMU, Xen.

Domain listing shows VM status. Running, paused, shut off.

Start and stop manage VM lifecycle. Graceful or forced options.

Console access provides serial connection. Exit with Ctrl+].

Domain definition uses XML. Persistent configuration.

Network and storage also managed. Complete virtualization control.

# CAVEATS

Requires libvirt daemon. Root for system VMs. XML syntax complex.

# HISTORY

**virsh** is the command-line interface for **libvirt**, the virtualization API. It provides unified management for multiple hypervisors.

# SEE ALSO

[virt-manager](/man/virt-manager)(1), [qemu](/man/qemu)(1), [kvm](/man/kvm)(1)

# TAGLINE

Graphical virtual machine manager

# TLDR

Launch **GUI**

```virt-manager```

**Connect** to hypervisor

```virt-manager --connect [hypervisor_uri]```

Run in **foreground**

```virt-manager --no-fork```

**Debug** mode

```virt-manager --debug```

Open **New VM** wizard

```virt-manager --show-domain-creator```

Show VM **details**

```virt-manager --show-domain-editor [name|id|uuid]```

Show VM **performance**

```virt-manager --show-domain-performance [name|id|uuid]```

Show **connection** details

```virt-manager --show-host-summary```

# SYNOPSIS

**virt-manager** [_OPTIONS_]

# PARAMETERS

**--connect** _URI_
> Connect to specified hypervisor

**--no-fork**
> Don't fork into background

**--debug**
> Print debug output

**--show-domain-creator**
> Open new VM wizard

**--show-domain-editor** _VM_
> Show VM details window

**--show-domain-performance** _VM_
> Show VM performance window

**--show-host-summary**
> Show connection details

# DESCRIPTION

**virt-manager** is a desktop user interface for managing KVM and Xen virtual machines and LXC containers. It provides a graphical interface for creating, configuring, and monitoring virtual machines.

The tool connects to libvirt and can manage both local and remote hypervisors.

# CAVEATS

Requires libvirt and a hypervisor (KVM, Xen, etc.). Remote management requires proper libvirt configuration. Hardware virtualization support recommended.

# SEE ALSO

[virsh](/man/virsh)(1), [virt-install](/man/virt-install)(1), [virt-clone](/man/virt-clone)(1)

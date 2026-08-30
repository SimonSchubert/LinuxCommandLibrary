# TAGLINE

Graphical virtual machine manager

# TLDR

Start the manager

```virt-manager```

Manage the **system** libvirt daemon explicitly

```virt-manager --connect qemu:///system```

Manage a **remote host over SSH**

```virt-manager --connect qemu+ssh://[user]@[host]/system```

Open straight into a machine's **graphical console**

```virt-manager --show-domain-console [vm_name]```

Open a machine's **hardware settings**

```virt-manager --show-domain-editor [vm_name]```

Open a machine's **performance graphs**

```virt-manager --show-domain-performance [vm_name]```

Jump straight to the **new machine wizard**

```virt-manager --show-domain-creator```

Open the **delete confirmation** for a machine

```virt-manager --show-domain-delete [vm_name]```

Keep the process in the **foreground with debug logging**

```virt-manager --no-fork --debug```

Stop SPICE from **redirecting USB devices automatically**

```virt-manager --spice-disable-auto-usbredir```

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

**--show-domain-console** _VM_
> Open the console window for a domain

**--spice-disable-auto-usbredir**
> Disable automatic USB redirection via SPICE

**--version**
> Show program version and exit

# DESCRIPTION

**virt-manager** is a desktop user interface for managing KVM and Xen virtual machines and LXC containers. It provides a graphical interface for creating, configuring, and monitoring virtual machines.

The tool connects to libvirt and can manage both local and remote hypervisors.

# CAVEATS

Requires libvirt and a hypervisor (KVM, Xen, etc.). Remote management requires proper libvirt configuration. Hardware virtualization support recommended.

# INSTALL

```dnf: sudo dnf install virt-manager```

```pacman: sudo pacman -S virt-manager```

```apk: sudo apk add virt-manager```

```zypper: sudo zypper install virt-manager```

```brew: brew install virt-manager```

```nix: nix profile install nixpkgs#virt-manager```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[virsh](/man/virsh)(1), [virt-install](/man/virt-install)(1), [virt-clone](/man/virt-clone)(1), [virt-viewer](/man/virt-viewer)(1), [qemu](/man/qemu)(1), [kvm](/man/kvm)(1)

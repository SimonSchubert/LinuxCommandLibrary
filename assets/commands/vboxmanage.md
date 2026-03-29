# TAGLINE

VirtualBox command-line management interface

# TLDR

**List VMs**

```vboxmanage list vms```

**Start VM**

```vboxmanage startvm [vmname]```

**Start headless**

```vboxmanage startvm [vmname] --type headless```

**Stop VM**

```vboxmanage controlvm [vmname] poweroff```

**Create VM**

```vboxmanage createvm --name [vmname] --register```

**Snapshot**

```vboxmanage snapshot [vmname] take [snapname]```

# SYNOPSIS

**vboxmanage** _command_ [_options_]

# PARAMETERS

**list**
> List objects.

**startvm**
> Start VM.

**controlvm**
> Control running VM.

**createvm**
> Create VM.

**modifyvm**
> Modify settings.

**snapshot**
> Snapshot operations.

**showvminfo**
> Display VM configuration details.

**clonevm**
> Clone an existing VM.

**storagectl**
> Manage storage controllers.

**storageattach**
> Attach storage media to a VM.

**sharedfolder**
> Manage shared folders between host and guest.

**guestcontrol**
> Execute commands within guest OS.

**--type** _TYPE_
> Start type (gui, headless, separate).

**-q**, **--nologo**
> Suppress logo output for scripting.

**--machinereadable**
> Machine-parsable output format.

# DESCRIPTION

**vboxmanage** is the command-line interface for Oracle VirtualBox, providing complete control over virtual machine creation, configuration, and operation. It exposes every feature available in the graphical interface and many that are only accessible from the command line.

The tool uses subcommands for different operations: **createvm** and **modifyvm** for setup, **startvm** and **controlvm** for runtime management, **snapshot** for state saving, and **list** for querying registered objects. Most configuration changes via **modifyvm** require the VM to be powered off. VMs can be identified by name or UUID.

# CAVEATS

VirtualBox must be installed. Most **modifyvm** changes require the VM to be powered off. Guest Additions must be installed for advanced features like shared folders and guest control.

# SEE ALSO

[qemu](/man/qemu)(1), [virsh](/man/virsh)(1)

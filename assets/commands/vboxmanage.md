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

**--type** _TYPE_
> Start type (gui, headless).

# DESCRIPTION

**vboxmanage** is the command-line interface for Oracle VirtualBox, providing complete control over virtual machine creation, configuration, and operation. It exposes every feature available in the graphical interface and many that are only accessible from the command line.

The tool uses subcommands for different operations: **createvm** and **modifyvm** for setup, **startvm** and **controlvm** for runtime management, **snapshot** for state saving, and **list** for querying registered objects. It is essential for headless server environments, scripted VM provisioning, and automation workflows where GUI access is unavailable.

# CAVEATS

VirtualBox required. Complex syntax. Many subcommands.

# HISTORY

**VBoxManage** is the command-line interface for **Oracle VirtualBox**, providing full VM management capabilities.

# SEE ALSO

[virtualbox](/man/virtualbox)(1), [qemu](/man/qemu)(1), [virsh](/man/virsh)(1)

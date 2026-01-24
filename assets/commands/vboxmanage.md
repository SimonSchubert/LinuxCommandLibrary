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

**vboxmanage** controls VirtualBox. It's the CLI interface.

VM management. Create, start, stop.

Configuration. Settings modification.

Snapshots. State saving.

Full control. All VirtualBox features.

# CAVEATS

VirtualBox required. Complex syntax. Many subcommands.

# HISTORY

**VBoxManage** is the command-line interface for **Oracle VirtualBox**, providing full VM management capabilities.

# SEE ALSO

[virtualbox](/man/virtualbox)(1), [qemu](/man/qemu)(1), [virsh](/man/virsh)(1)

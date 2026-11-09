# TAGLINE

VirtualBox command-line management interface

# TLDR

**List VMs**

```vboxmanage list vms```

**Start VM**

```vboxmanage startvm [vmname]```

**Start headless**

```vboxmanage startvm [vmname] --type headless```

**List running VMs**

```vboxmanage list runningvms```

**Stop VM** immediately

```vboxmanage controlvm [vmname] poweroff```

**Shut down VM** gracefully via ACPI

```vboxmanage controlvm [vmname] acpipowerbutton```

**Save VM state** and stop it

```vboxmanage controlvm [vmname] savestate```

**Show VM details** in a parsable format

```vboxmanage showvminfo [vmname] --machinereadable```

**Create VM**

```vboxmanage createvm --name [vmname] --register```

**Take a snapshot**

```vboxmanage snapshot [vmname] take [snapname]```

**Restore a snapshot**

```vboxmanage snapshot [vmname] restore [snapname]```

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
> Start type (gui, headless, sdl, separate).

**-q**, **--nologo**
> Suppress logo output for scripting.

**--machinereadable**
> Machine-parsable output format.

**--settingspw** _PASSWORD_, **--settingspwfile** _FILE_
> Supply the settings password as a value or from a file.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**vboxmanage** is the command-line interface for Oracle VirtualBox, providing complete control over virtual machine creation, configuration, and operation. It exposes every feature available in the graphical interface and many that are only accessible from the command line.

The tool uses subcommands for different operations: **createvm** and **modifyvm** for setup, **startvm** and **controlvm** for runtime management, **snapshot** for state saving, and **list** for querying registered objects. Most configuration changes via **modifyvm** require the VM to be powered off. VMs can be identified by name or UUID.

# CAVEATS

VirtualBox must be installed. Most **modifyvm** changes require the VM to be powered off. Guest Additions must be installed for advanced features like shared folders and guest control. The binary is named **VBoxManage**; the lowercase **vboxmanage** name is provided on Linux.

# SEE ALSO

[vboxmanage-list](/man/vboxmanage-list)(1), [vboxmanage-startvm](/man/vboxmanage-startvm)(1), [vboxmanage-controlvm](/man/vboxmanage-controlvm)(1), [vboxmanage-createvm](/man/vboxmanage-createvm)(1), [vboxmanage-modifyvm](/man/vboxmanage-modifyvm)(1), [vboxmanage-showvminfo](/man/vboxmanage-showvminfo)(1), [qemu](/man/qemu)(1), [virsh](/man/virsh)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html)```

<!-- verified: 2026-11-09 -->

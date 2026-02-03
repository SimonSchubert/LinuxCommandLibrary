# TLDR

**Set memory**

```vboxmanage modifyvm [vmname] --memory [2048]```

**Set CPUs**

```vboxmanage modifyvm [vmname] --cpus [2]```

**Enable nested virtualization**

```vboxmanage modifyvm [vmname] --nested-hw-virt on```

**Configure network**

```vboxmanage modifyvm [vmname] --nic1 nat```

**Set boot order**

```vboxmanage modifyvm [vmname] --boot1 dvd --boot2 disk```

# SYNOPSIS

**vboxmanage** **modifyvm** _vmname_ [_options_]

# PARAMETERS

**--name** _name_
> Rename VM.

**--memory** _mb_
> RAM size in MB.

**--cpus** _n_
> Number of CPUs.

**--nic1** _type_
> Network adapter type.

**--boot1** _device_
> First boot device.

**--nested-hw-virt** _on|off_
> Nested virtualization.

**--vram** _mb_
> Video memory.

**--accelerate3d** _on|off_
> 3D acceleration.

**--clipboard** _mode_
> Clipboard mode.

# DESCRIPTION

**vboxmanage modifyvm** configures virtual machine settings. Modify CPU, memory, network, storage, and display settings. VM must be powered off for most changes.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-createvm](/man/vboxmanage-createvm)(1)


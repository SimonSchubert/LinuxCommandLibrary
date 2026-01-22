# TLDR

Set VM **name**

```qm set 100 --name vm_name```

Enable **autostart**

```qm set 100 --autostart 1```

Set **CPU cores**

```qm set 100 --cores 4```

Set **memory** (MB)

```qm set 100 --memory 8192```

Add **network** device

```qm set 100 --net0 virtio,bridge=vmbr0```

**Delete** device

```qm set 100 --delete device_name```

**GPU passthrough**

```qm set 100 --hostpci0 0000:00:02,x-vga=1 --bios ovmf```

# SYNOPSIS

**qm set** [_OPTIONS_] _vmid_

# DESCRIPTION

**qm set** modifies the configuration of a QEMU/KVM virtual machine in Proxmox VE. Changes may require a VM restart to take effect. This command can configure CPU, memory, storage, network, and hardware passthrough options.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine

**--name** _string_
> Set the VM name displayed in the GUI

**--autostart** _boolean_
> Start VM automatically on host boot

**--cores** _number_
> Number of CPU cores

**--memory** _megabytes_
> Amount of RAM in MB

**--net**_N_ _config_
> Network device configuration (N=0-31)

**--scsi**_N_ _config_
> SCSI disk configuration

**--hostpci**_N_ _config_
> PCI device passthrough configuration

**--delete** _list_
> Comma-separated list of settings to delete

# CAVEATS

Some changes require stopping the VM first. Hardware passthrough requires IOMMU support. Changes that affect running VMs may be marked as pending until restart.

# HISTORY

**qm set** is part of the **Proxmox VE** virtualization platform for managing QEMU/KVM virtual machines.

# SEE ALSO

[qm](/man/qm)(1), [qm-config](/man/qm-config)(1), [qm-pending](/man/qm-pending)(1)

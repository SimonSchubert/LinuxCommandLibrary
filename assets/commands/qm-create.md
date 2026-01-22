# TLDR

Create a VM with **default settings** (512MiB memory, 1 CPU)

```qm create 100```

Create with **name** and **start** automatically

```qm create 100 --name vm_name --start```

Create with specific **memory** and **CPUs**

```qm create 100 --memory 8192 --cores 4```

Specify the **OS type**

```qm create 100 --ostype win10```

**Replace** an existing machine from archive

```qm create 100 --archive path/to/backup.tar --force 1```

Specify **install media**

```qm create 100 --cdrom local:iso/install.iso```

Create with **network bridge**

```qm create 100 --net0 virtio,bridge=vmbr0```

# SYNOPSIS

**qm create** _vmid_ [_options_]

# PARAMETERS

**--name** _name_
> Set VM name

**--memory** _mb_
> RAM size in megabytes

**--cores** _count_
> Number of CPU cores

**--ostype** _type_
> Operating system type (l24, l26, win10, etc.)

**--cdrom** _volume_
> ISO image for installation

**--net0** _config_
> Network adapter configuration

**--start**
> Start VM after creation

**--archive** _file_
> Restore from backup archive

**--force** _1|0_
> Force overwrite existing VM

# DESCRIPTION

**qm create** creates or restores a virtual machine on QEMU/KVM in Proxmox VE. It supports extensive configuration options for CPU, memory, storage, and networking.

VMs can be created from scratch or restored from backup archives.

# CAVEATS

VM IDs must be unique across the cluster. Some options require additional storage or network configuration.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-clone](/man/qm-clone)(1), [qm-destroy](/man/qm-destroy)(1)

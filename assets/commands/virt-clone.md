# TAGLINE

Clone libvirt virtual machines

# TLDR

**Clone** a VM with automatically generated name, storage, and MAC

```virt-clone -o [vm_name] --auto-clone```

**Clone** a VM with specific new name, storage path, and MAC

```virt-clone -o [vm_name] -n [new_vm_name] -f [path/to/new_storage] -m [ff:ff:ff:ff:ff:ff|RANDOM]```

# SYNOPSIS

**virt-clone** [_options_]

# PARAMETERS

**-o, --original _name_**
> Name of the original VM to clone

**-n, --name _name_**
> Name for the new cloned VM

**--auto-clone**
> Automatically generate new name, storage, and MAC

**-f, --file _path_**
> Path for the new disk image

**-m, --mac _address_**
> MAC address for the new VM (or RANDOM)

**--preserve-data**
> Don't clone disk images, just update paths

**--reflink**
> Use copy-on-write reflinks if supported

**-c, --connect _uri_**
> Connect to specified hypervisor URI

# DESCRIPTION

**virt-clone** creates a copy of an existing libvirt virtual machine. It clones the VM configuration and can duplicate or create new disk images, generating unique identifiers for the clone.

The tool handles creating new UUIDs, MAC addresses, and storage paths to avoid conflicts with the original VM. It's commonly used for creating test environments or deploying multiple similar VMs.

# CAVEATS

Requires libvirt and appropriate virtualization backend (KVM, QEMU, etc.). Cloning large disk images can take significant time. The original VM should be shut down for consistent clones. Storage paths must have sufficient space.

# SEE ALSO

[virt-install](/man/virt-install)(1), [virsh](/man/virsh)(1), [virt-manager](/man/virt-manager)(1)

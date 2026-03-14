# TAGLINE

Clone libvirt virtual machines

# TLDR

**Clone** a VM with automatically generated name, storage, and MAC

```virt-clone --original [vm_name] --auto-clone```

**Clone** a VM with a specific new name and storage path

```virt-clone --original [vm_name] --name [new_vm_name] --file [path/to/new_disk.qcow2]```

**Clone** a VM with a random MAC address

```virt-clone --original [vm_name] --name [new_vm_name] --auto-clone --mac RANDOM```

**Clone and replace** an existing VM with the same name

```virt-clone --original [vm_name] --name [new_vm_name] --auto-clone --replace```

**Clone without copying storage** (reference existing disks)

```virt-clone --original [vm_name] --name [new_vm_name] --preserve-data```

**Print the generated clone XML** without performing the clone

```virt-clone --original [vm_name] --auto-clone --print-xml```

# SYNOPSIS

**virt-clone** [_options_]

# PARAMETERS

**-o**, **--original** _name_
> Name of the original VM to clone (must be shut off).

**--original-xml** _file_
> Libvirt guest XML file to use as the original guest.

**-n**, **--name** _name_
> Name for the new cloned VM.

**--auto-clone**
> Automatically generate new name, storage, and MAC.

**-f**, **--file** _path_
> Path for the new disk image. Repeat for multi-disk guests.

**-m**, **--mac** _address_
> MAC address for the new VM (or RANDOM).

**-u**, **--uuid** _uuid_
> UUID for the new guest (default: randomly generated).

**--preserve-data**
> Do not clone storage; preserve disk images and reference them.

**--reflink**
> Use copy-on-write reflinks if the filesystem supports it.

**--nonsparse**
> Fully allocate new storage instead of creating sparse files.

**--force-copy** _target_
> Force cloning of the specified disk target (e.g. 'hdc', 'sda').

**--replace**
> Shut down and remove any existing guest with the target name.

**--print-xml**
> Print generated clone XML and exit without cloning.

**-c**, **--connect** _uri_
> Connect to specified hypervisor URI.

**-d**, **--debug**
> Print debugging information.

# DESCRIPTION

**virt-clone** creates a copy of an existing libvirt virtual machine. It clones the VM configuration and can duplicate or create new disk images, generating unique identifiers for the clone.

The tool handles creating new UUIDs, MAC addresses, and storage paths to avoid conflicts with the original VM. It is commonly used for creating test environments or deploying multiple similar VMs. Disks marked as readonly or shareable are skipped by default unless **--force-copy** is used.

# CAVEATS

Requires libvirt and an appropriate virtualization backend (KVM, QEMU, etc.). The original VM must be shut off for a consistent clone. Cloning large disk images can take significant time and requires sufficient storage space. Use **--nonsparse** for full allocation if the filesystem does not support sparse files well.

# SEE ALSO

[virt-install](/man/virt-install)(1), [virsh](/man/virsh)(1), [virt-manager](/man/virt-manager)(1)

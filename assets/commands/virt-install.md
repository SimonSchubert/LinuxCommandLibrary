# TAGLINE

Create and install libvirt virtual machines

# TLDR

**Create** a VM with 1GB RAM, 12GB storage, and start Debian installation

```virt-install -n [vm_name] --memory [1024] --disk path=[path/to/image.qcow2],size=[12] -c [path/to/debian.iso]```

**Create** a UEFI-based VM with Q35 chipset and 4GB RAM

```virt-install -n [vm_name] --arch x86_64 --virt-type kvm --machine q35 --boot uefi --memory [4096] --disk path=[path/to/image.raw],size=[16] -c [path/to/fedora.iso]```

**Create** a diskless live VM without sound or USB

```virt-install -n [vm_name] --memory [512] --disk none --controller type=usb,model=none --sound none --autoconsole none --install no_install=yes -c [path/to/live.iso]```

**Create** a VM with specific CPU topology and host-model CPU

```virt-install -n [vm_name] --cpu host-model,topology.sockets=1,topology.cores=4,topology.threads=2 --memory [16384] --disk path=[path/to/image.qcow2],size=[250] -c [path/to/os.iso]```

**Create** a VM with automated kickstart installation from remote resources

```virt-install -n [vm_name] --memory [2048] --disk path=[path/to/image.qcow2],size=[20] -l [https://download.fedoraproject.org/.../] -x "inst.ks=[https://path/to/kickstart]"```

# SYNOPSIS

**virt-install** [_options_]

# PARAMETERS

**-n, --name _name_**
> Name for the new virtual machine

**--memory _size_**
> Memory allocation in MB

**--disk _spec_**
> Disk specification (path, size, format)

**-c, --cdrom _path_**
> CD-ROM/ISO image for installation

**-l, --location _url_**
> Installation source URL

**--cpu _model_**
> CPU model and topology configuration

**--boot _options_**
> Boot configuration (uefi, bios, etc.)

**--virt-type _type_**
> Hypervisor type (kvm, qemu, xen)

**--machine _type_**
> Machine type (q35, pc, etc.)

**-x, --extra-args _args_**
> Additional kernel arguments

**--autoconsole _type_**
> Console auto-connect behavior

# DESCRIPTION

**virt-install** creates new virtual machines using libvirt. It provisions VM configuration, storage, and initiates OS installation from various sources including ISO images, network locations, or PXE boot.

The tool supports advanced configurations including UEFI boot, CPU pinning, NUMA topology, and various device passthrough options. It integrates with QEMU/KVM, Xen, and other libvirt-supported hypervisors.

# CAVEATS

Requires libvirt daemon running and appropriate virtualization backend. KVM requires hardware virtualization support. UEFI boot requires OVMF firmware package. Network installations require connectivity to installation sources.

# SEE ALSO

[virt-clone](/man/virt-clone)(1), [virsh](/man/virsh)(1), [virt-manager](/man/virt-manager)(1), [qemu-img](/man/qemu-img)(1)

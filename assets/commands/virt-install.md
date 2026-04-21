# TAGLINE

Create and install libvirt virtual machines

# TLDR

**Create** a VM with 1GB RAM, 12GB storage, and start Debian installation

```virt-install -n [vm_name] --memory [1024] --vcpus [2] --disk path=[path/to/image.qcow2],size=[12] --cdrom [path/to/debian.iso] --osinfo [debian12]```

**Create** a UEFI-based VM with Q35 chipset and 4GB RAM

```virt-install -n [vm_name] --arch x86_64 --virt-type kvm --machine q35 --boot uefi --memory [4096] --vcpus [4] --disk path=[path/to/image.raw],size=[16] --cdrom [path/to/fedora.iso] --osinfo [fedora40]```

**Import** an existing disk image as a VM (no installation)

```virt-install -n [vm_name] --memory [2048] --vcpus [2] --disk path=[path/to/image.qcow2] --import --osinfo [detect=on]```

**Create** a VM with specific CPU topology and host-model CPU

```virt-install -n [vm_name] --cpu host-model,topology.sockets=1,topology.cores=4,topology.threads=2 --memory [16384] --disk path=[path/to/image.qcow2],size=[250] --cdrom [path/to/os.iso]```

**Perform** an automated kickstart installation from a remote tree

```virt-install -n [vm_name] --memory [2048] --disk path=[path/to/image.qcow2],size=[20] --location [https://download.fedoraproject.org/...] --extra-args "inst.ks=[https://path/to/kickstart]"```

**Boot** a VM via PXE with a bridged network

```virt-install -n [vm_name] --memory [2048] --disk path=[path/to/image.qcow2],size=[20] --network bridge=[br0] --pxe --osinfo [linux2022]```

# SYNOPSIS

**virt-install** [_options_]

# PARAMETERS

**-n**, **--name** _NAME_
> Unique name for the new virtual machine.

**--memory** _SIZE_
> Guest memory in MiB (or use suboptions like memory=2048,currentMemory=1024).

**--vcpus** _N_
> Number of virtual CPUs; supports suboptions for sockets/cores/threads and hotplug limits.

**--cpu** _MODEL_
> CPU model and features (e.g. host-model, host-passthrough, topology.sockets=...).

**--disk** _SPEC_
> Storage specification (path=, size=, format=, bus=, cache=...). Use `--disk none` for diskless VMs.

**-c**, **--cdrom** _PATH_
> ISO file or CDROM device used as installation media.

**-l**, **--location** _URL_|_PATH_
> Installation tree location (HTTP/FTP/NFS URL or local directory) for network installs.

**--pxe**
> Boot from the network (PXE) for installation.

**--import**
> Skip OS installation and build the guest around an existing disk image.

**--boot** _OPTIONS_
> Post-install boot configuration (uefi, bios, boot order, loader paths).

**--osinfo** _ID_
> Optimize the guest for a specific OS (libosinfo short-id, e.g. fedora40, debian12, win11). Replaces legacy --os-variant.

**--network** _SPEC_
> Network interface (e.g. bridge=br0, network=default, type=direct). May be repeated.

**--graphics** _TYPE_
> Graphical display: vnc, spice, or none.

**--virt-type** _TYPE_
> Hypervisor type (kvm, qemu, xen).

**--machine** _TYPE_
> Machine type (q35, pc, etc.).

**-x**, **--extra-args** _ARGS_
> Extra kernel command-line arguments passed to --location installs.

**--unattended**
> Perform an automated installation using libosinfo install scripts.

**--autoconsole** _TYPE_
> Console auto-connect behavior (graphical, text, none). Replaces --noautoconsole.

**--noreboot**
> Do not reboot the guest automatically after the installer completes.

**--wait** _MINUTES_
> How long to wait for installation to complete (-1 = wait forever, 0 = don't wait).

**--dry-run**
> Validate options and show the generated XML without creating the VM.

# DESCRIPTION

**virt-install** creates new virtual machines using libvirt. It provisions VM configuration, storage, and initiates OS installation from various sources including ISO images, network locations, or PXE boot.

The tool supports advanced configurations including UEFI boot, CPU pinning, NUMA topology, and various device passthrough options. It integrates with QEMU/KVM, Xen, and other libvirt-supported hypervisors.

# CAVEATS

Requires libvirt daemon running and appropriate virtualization backend. KVM requires hardware virtualization support. UEFI boot requires OVMF firmware package. Network installations require connectivity to installation sources.

# SEE ALSO

[virt-clone](/man/virt-clone)(1), [virsh](/man/virsh)(1), [virt-manager](/man/virt-manager)(1), [qemu-img](/man/qemu-img)(1)
